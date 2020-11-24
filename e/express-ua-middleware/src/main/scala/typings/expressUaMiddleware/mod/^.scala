package typings.expressUaMiddleware.mod

import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.RequestHandler
import typings.qs.mod.ParsedQs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("express-ua-middleware", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Express middleware to parse user-agent header
    */
  def apply(): RequestHandler[ParamsDictionary, _, _, ParsedQs] = js.native
}
