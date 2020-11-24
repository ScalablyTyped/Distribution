package typings.express.mod

import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.serveStatic.mod.RequestHandlerConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("express", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Creates an Express application. The express() function is a top-level function exported by the express module.
    */
  def apply(): typings.expressServeStaticCore.mod.Express = js.native
  
  /**
    * These are the exposed prototypes.
    */
  var application: Application_ = js.native
  
  var request: Request_[ParamsDictionary, js.Any, js.Any, Query] = js.native
  
  var response: Response_[js.Any] = js.native
  
  /**
    * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
    */
  var static: RequestHandlerConstructor[Response_[js.Any]] = js.native
}
