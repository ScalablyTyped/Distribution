package typings.easySession.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("easy-session", "checkRole")
@js.native
object checkRole extends js.Object {
  def apply(role: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(role: String, errorCallback: js.Function): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

