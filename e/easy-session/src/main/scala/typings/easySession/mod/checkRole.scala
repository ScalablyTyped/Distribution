package typings.easySession.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("easy-session", "checkRole")
@js.native
object checkRole extends js.Object {
  
  def apply(role: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(role: String, errorCallback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}
