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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpressFrappeConfig extends js.Object {
  
  var bodyParser: js.UndefOr[Boolean | Json] = js.native
  
  var cors: js.UndefOr[Boolean | CorsOptions] = js.native
  
  var errorHandler: js.UndefOr[ErrorRequestHandler[ParamsDictionary, _, _, Query]] = js.native
  
  var io: js.UndefOr[ExpressFrappeSocketIOConfig] = js.native
  
  var middleware: js.UndefOr[js.Array[RequestHandler[ParamsDictionary, _, _, Query]]] = js.native
  
  var morgan: js.UndefOr[Boolean] = js.native
  
  var routes: js.UndefOr[js.Array[RouteConfig] | RouteConfigAlternative] = js.native
  
  var static: js.UndefOr[String | Options] = js.native
}
object ExpressFrappeConfig {
  
  @scala.inline
  def apply(): ExpressFrappeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpressFrappeConfig]
  }
  
  @scala.inline
  implicit class ExpressFrappeConfigOps[Self <: ExpressFrappeConfig] (val x: Self) extends AnyVal {
    
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
    def setBodyParser(value: Boolean | Json): Self = this.set("bodyParser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyParser: Self = this.set("bodyParser", js.undefined)
    
    @scala.inline
    def setCors(value: Boolean | CorsOptions): Self = this.set("cors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCors: Self = this.set("cors", js.undefined)
    
    @scala.inline
    def setErrorHandler(
      value: (/* err */ js.Any, /* req */ Request[ParamsDictionary, _, _, Query], /* res */ Response[_, Double], /* next */ NextFunction) => js.Any
    ): Self = this.set("errorHandler", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteErrorHandler: Self = this.set("errorHandler", js.undefined)
    
    @scala.inline
    def setIo(value: ExpressFrappeSocketIOConfig): Self = this.set("io", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIo: Self = this.set("io", js.undefined)
    
    @scala.inline
    def setMiddlewareVarargs(value: (RequestHandler[ParamsDictionary, js.Any, js.Any, Query])*): Self = this.set("middleware", js.Array(value :_*))
    
    @scala.inline
    def setMiddleware(value: js.Array[RequestHandler[ParamsDictionary, _, _, Query]]): Self = this.set("middleware", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMiddleware: Self = this.set("middleware", js.undefined)
    
    @scala.inline
    def setMorgan(value: Boolean): Self = this.set("morgan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMorgan: Self = this.set("morgan", js.undefined)
    
    @scala.inline
    def setRoutesVarargs(value: RouteConfig*): Self = this.set("routes", js.Array(value :_*))
    
    @scala.inline
    def setRoutes(value: js.Array[RouteConfig] | RouteConfigAlternative): Self = this.set("routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoutes: Self = this.set("routes", js.undefined)
    
    @scala.inline
    def setStatic(value: String | Options): Self = this.set("static", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatic: Self = this.set("static", js.undefined)
  }
}
