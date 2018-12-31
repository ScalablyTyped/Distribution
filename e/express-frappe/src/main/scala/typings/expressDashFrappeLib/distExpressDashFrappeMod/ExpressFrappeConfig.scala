package typings
package expressDashFrappeLib.distExpressDashFrappeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressFrappeConfig extends js.Object {
  var bodyParser: js.UndefOr[scala.Boolean | expressDashFrappeLib.Anon_Urlencoded] = js.undefined
  var cors: js.UndefOr[scala.Boolean | corsLib.corsMod.eNs.CorsOptions] = js.undefined
  var errorHandler: js.UndefOr[expressLib.expressMod.eNs.ErrorRequestHandler] = js.undefined
  var io: js.UndefOr[ExpressFrappeSocketIOConfig] = js.undefined
  var middleware: js.UndefOr[js.Array[expressLib.expressMod.eNs.RequestHandler]] = js.undefined
  var morgan: js.UndefOr[scala.Boolean] = js.undefined
  var routes: js.UndefOr[
    js.Array[expressDashRoutersLib.distExpressDashRoutersMod.RouteConfig] | expressDashRoutersLib.distExpressDashRoutersMod.RouteConfigAlternative
  ] = js.undefined
  var static: js.UndefOr[java.lang.String | expressDashFrappeLib.Anon_Root] = js.undefined
}

