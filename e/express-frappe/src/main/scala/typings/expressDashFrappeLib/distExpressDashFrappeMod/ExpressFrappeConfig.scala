package typings
package expressDashFrappeLib.distExpressDashFrappeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressFrappeConfig extends js.Object {
  var bodyParser: js.UndefOr[scala.Boolean | expressDashFrappeLib.Anon_Json] = js.undefined
  var cors: js.UndefOr[scala.Boolean | corsLib.corsMod.eNs.CorsOptions] = js.undefined
  var errorHandler: js.UndefOr[expressLib.expressMod.eNs.ErrorRequestHandler] = js.undefined
  var io: js.UndefOr[ExpressFrappeSocketIOConfig] = js.undefined
  var middleware: js.UndefOr[js.Array[expressLib.expressMod.eNs.RequestHandler]] = js.undefined
  var morgan: js.UndefOr[scala.Boolean] = js.undefined
  var routes: js.UndefOr[
    js.Array[expressDashRoutersLib.distExpressDashRoutersMod.RouteConfig] | expressDashRoutersLib.distExpressDashRoutersMod.RouteConfigAlternative
  ] = js.undefined
  var static: js.UndefOr[java.lang.String | expressDashFrappeLib.Anon_Options] = js.undefined
}

object ExpressFrappeConfig {
  @scala.inline
  def apply(
    bodyParser: scala.Boolean | expressDashFrappeLib.Anon_Json = null,
    cors: scala.Boolean | corsLib.corsMod.eNs.CorsOptions = null,
    errorHandler: expressLib.expressMod.eNs.ErrorRequestHandler = null,
    io: ExpressFrappeSocketIOConfig = null,
    middleware: js.Array[expressLib.expressMod.eNs.RequestHandler] = null,
    morgan: js.UndefOr[scala.Boolean] = js.undefined,
    routes: js.Array[expressDashRoutersLib.distExpressDashRoutersMod.RouteConfig] | expressDashRoutersLib.distExpressDashRoutersMod.RouteConfigAlternative = null,
    static: java.lang.String | expressDashFrappeLib.Anon_Options = null
  ): ExpressFrappeConfig = {
    val __obj = js.Dynamic.literal()
    if (bodyParser != null) __obj.updateDynamic("bodyParser")(bodyParser.asInstanceOf[js.Any])
    if (cors != null) __obj.updateDynamic("cors")(cors.asInstanceOf[js.Any])
    if (errorHandler != null) __obj.updateDynamic("errorHandler")(errorHandler)
    if (io != null) __obj.updateDynamic("io")(io)
    if (middleware != null) __obj.updateDynamic("middleware")(middleware)
    if (!js.isUndefined(morgan)) __obj.updateDynamic("morgan")(morgan)
    if (routes != null) __obj.updateDynamic("routes")(routes.asInstanceOf[js.Any])
    if (static != null) __obj.updateDynamic("static")(static.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressFrappeConfig]
  }
}

