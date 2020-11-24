package typings.easyXapiUtils

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("easy-xapi-utils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def hasRole(role: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  def isLoggedIn(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def isLoggedIn(role: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  def isLoggedOut(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}
