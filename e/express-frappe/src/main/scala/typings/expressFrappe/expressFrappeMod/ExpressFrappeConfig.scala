package typings.expressFrappe.expressFrappeMod

import typings.cors.mod.CorsOptions
import typings.express.mod.ErrorRequestHandler
import typings.express.mod.RequestHandler
import typings.expressFrappe.anon.Json
import typings.expressFrappe.anon.Options
import typings.expressRouters.expressRoutersMod.RouteConfig
import typings.expressRouters.expressRoutersMod.RouteConfigAlternative
import typings.expressServeStaticCore.mod.NextFunction
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressFrappeConfig extends js.Object {
  var bodyParser: js.UndefOr[Boolean | Json] = js.undefined
  var cors: js.UndefOr[Boolean | CorsOptions] = js.undefined
  var errorHandler: js.UndefOr[ErrorRequestHandler[ParamsDictionary, _, _, Query]] = js.undefined
  var io: js.UndefOr[ExpressFrappeSocketIOConfig] = js.undefined
  var middleware: js.UndefOr[js.Array[RequestHandler[ParamsDictionary, _, _, Query]]] = js.undefined
  var morgan: js.UndefOr[Boolean] = js.undefined
  var routes: js.UndefOr[js.Array[RouteConfig] | RouteConfigAlternative] = js.undefined
  var static: js.UndefOr[String | Options] = js.undefined
}

object ExpressFrappeConfig {
  @scala.inline
  def apply(
    bodyParser: Boolean | Json = null,
    cors: Boolean | CorsOptions = null,
    errorHandler: (/* err */ js.Any, /* req */ Request[ParamsDictionary, _, _, Query], /* res */ Response[_], /* next */ NextFunction) => js.Any = null,
    io: ExpressFrappeSocketIOConfig = null,
    middleware: js.Array[RequestHandler[ParamsDictionary, _, _, Query]] = null,
    morgan: js.UndefOr[Boolean] = js.undefined,
    routes: js.Array[RouteConfig] | RouteConfigAlternative = null,
    static: String | Options = null
  ): ExpressFrappeConfig = {
    val __obj = js.Dynamic.literal()
    if (bodyParser != null) __obj.updateDynamic("bodyParser")(bodyParser.asInstanceOf[js.Any])
    if (cors != null) __obj.updateDynamic("cors")(cors.asInstanceOf[js.Any])
    if (errorHandler != null) __obj.updateDynamic("errorHandler")(js.Any.fromFunction4(errorHandler))
    if (io != null) __obj.updateDynamic("io")(io.asInstanceOf[js.Any])
    if (middleware != null) __obj.updateDynamic("middleware")(middleware.asInstanceOf[js.Any])
    if (!js.isUndefined(morgan)) __obj.updateDynamic("morgan")(morgan.get.asInstanceOf[js.Any])
    if (routes != null) __obj.updateDynamic("routes")(routes.asInstanceOf[js.Any])
    if (static != null) __obj.updateDynamic("static")(static.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressFrappeConfig]
  }
}

