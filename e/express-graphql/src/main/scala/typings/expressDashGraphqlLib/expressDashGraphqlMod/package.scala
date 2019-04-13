package typings
package expressDashGraphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressDashGraphqlMod {
  type Middleware = js.Function2[
    /* request */ expressLib.expressMod.Request, 
    /* response */ expressLib.expressMod.Response, 
    js.Promise[js.UndefOr[scala.Nothing]]
  ]
  type Options = (js.Function3[
    /* request */ expressLib.expressMod.Request, 
    /* response */ expressLib.expressMod.Response, 
    /* params */ js.UndefOr[GraphQLParams], 
    OptionsResult
  ]) | OptionsResult
  type OptionsResult = OptionsData | js.Promise[OptionsData]
}
