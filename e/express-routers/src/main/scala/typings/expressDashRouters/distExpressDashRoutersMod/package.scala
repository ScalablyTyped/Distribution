package typings.expressDashRouters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distExpressDashRoutersMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.express.expressMod.RequestHandler
  import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary

  type RouteConfigAlternative = StringDictionary[RequestHandler[ParamsDictionary] | js.Array[RequestHandler[ParamsDictionary]]]
}
