package typings.easySession.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("easy-session", "checkRole")
@js.native
object checkRole extends js.Object {
  def apply(role: String): RequestHandler[ParamsDictionary] = js.native
  def apply(role: String, errorCallback: js.Function): RequestHandler[ParamsDictionary] = js.native
}

