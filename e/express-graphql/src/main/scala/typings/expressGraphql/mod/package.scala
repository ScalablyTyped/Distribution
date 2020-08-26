package typings.expressGraphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type MaybePromise[T] = js.Promise[T] | T
  type Middleware = js.Function2[
    /* request */ typings.expressGraphql.mod.Request, 
    /* response */ typings.expressGraphql.mod.Response, 
    js.Promise[scala.Unit]
  ]
  type Options = (js.Function3[
    /* request */ typings.expressGraphql.mod.Request, 
    /* response */ typings.expressGraphql.mod.Response, 
    /* params */ js.UndefOr[typings.expressGraphql.mod.GraphQLParams], 
    typings.expressGraphql.mod.MaybePromise[typings.expressGraphql.mod.OptionsData]
  ]) | typings.expressGraphql.mod.MaybePromise[typings.expressGraphql.mod.OptionsData]
  type Request = typings.node.httpMod.IncomingMessage
}
