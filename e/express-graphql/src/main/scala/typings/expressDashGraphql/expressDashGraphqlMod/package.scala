package typings.expressDashGraphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressDashGraphqlMod {
  import typings.express.expressMod.Request
  import typings.express.expressMod.Response

  type Middleware = js.Function2[
    /* request */ Request, 
    /* response */ Response, 
    js.Promise[js.UndefOr[scala.Nothing]]
  ]
  type Options = (js.Function3[
    /* request */ Request, 
    /* response */ Response, 
    /* params */ js.UndefOr[GraphQLParams], 
    OptionsResult
  ]) | OptionsResult
  type OptionsResult = OptionsData | js.Promise[OptionsData]
}
