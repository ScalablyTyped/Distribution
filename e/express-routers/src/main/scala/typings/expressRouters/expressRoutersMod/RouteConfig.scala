package typings.expressRouters.expressRoutersMod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.NextFunction
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteConfig extends js.Object {
  var handler: (RequestHandler[ParamsDictionary, _, _, Query]) | (js.Array[RequestHandler[ParamsDictionary, _, _, Query]]) = js.native
  var method: RouteConfigMethod = js.native
  var path: String = js.native
}

object RouteConfig {
  @scala.inline
  def apply(
    handler: (RequestHandler[ParamsDictionary, _, _, Query]) | (js.Array[RequestHandler[ParamsDictionary, _, _, Query]]),
    method: RouteConfigMethod,
    path: String
  ): RouteConfig = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteConfig]
  }
  @scala.inline
  implicit class RouteConfigOps[Self <: RouteConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHandlerVarargs(value: (RequestHandler[ParamsDictionary, js.Any, js.Any, Query])*): Self = this.set("handler", js.Array(value :_*))
    @scala.inline
    def setHandlerFunction3(
      value: (/* req */ Request[ParamsDictionary, _, _, Query], /* res */ Response[_], /* next */ NextFunction) => js.Any
    ): Self = this.set("handler", js.Any.fromFunction3(value))
    @scala.inline
    def setHandler(
      value: (RequestHandler[ParamsDictionary, _, _, Query]) | (js.Array[RequestHandler[ParamsDictionary, _, _, Query]])
    ): Self = this.set("handler", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: RouteConfigMethod): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
  }
  
}

