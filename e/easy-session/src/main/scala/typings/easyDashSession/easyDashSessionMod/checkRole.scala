package typings.easyDashSession.easyDashSessionMod

import typings.express.expressMod.RequestHandler
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("easy-session", "checkRole")
@js.native
object checkRole extends js.Object {
  def apply(role: String): RequestHandler[ParamsDictionary] = js.native
  def apply(role: String, errorCallback: js.Function): RequestHandler[ParamsDictionary] = js.native
}

