package typings
package expressDashGraphqlLib.expressDashGraphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object graphqlHTTPNs {
  type Middleware = js.Function2[
    /* request */ expressLib.expressMod.eNs.Request, 
    /* response */ expressLib.expressMod.eNs.Response, 
    stdLib.Promise[js.UndefOr[scala.Nothing]]
  ]
  type Options = (js.Function3[
    /* request */ expressLib.expressMod.eNs.Request, 
    /* response */ expressLib.expressMod.eNs.Response, 
    /* params */ js.UndefOr[GraphQLParams], 
    OptionsResult
  ]) | OptionsResult
  type OptionsResult = OptionsData | stdLib.Promise[OptionsData]
}
