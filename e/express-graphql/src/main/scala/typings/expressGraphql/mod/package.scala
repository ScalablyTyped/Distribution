package typings.expressGraphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Middleware = js.Function2[
    /* request */ typings.expressGraphql.mod.Request, 
    /* response */ typings.expressGraphql.mod.Response, 
    js.Promise[js.UndefOr[scala.Nothing]]
  ]
  /**
    * Used to configure the graphqlHTTP middleware by providing a schema
    * and other configuration options.
    *
    * Options can be provided as an Object, a Promise for an Object, or a Function
    * that returns an Object or a Promise for an Object.
    */
  type Options = (js.Function3[
    /* request */ typings.expressGraphql.mod.Request, 
    /* response */ typings.expressGraphql.mod.Response, 
    /* params */ js.UndefOr[typings.expressGraphql.mod.GraphQLParams], 
    typings.expressGraphql.mod.OptionsResult
  ]) | typings.expressGraphql.mod.OptionsResult
  type OptionsResult = typings.expressGraphql.mod.OptionsData | js.Promise[typings.expressGraphql.mod.OptionsData]
  type Request = typings.node.httpMod.IncomingMessage
  type Response = typings.node.httpMod.ServerResponse
}
