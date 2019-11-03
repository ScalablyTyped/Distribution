package typings.easyDashXapiDashUtils

import typings.express.expressMod.RequestHandler
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("easy-xapi-utils", JSImport.Namespace)
@js.native
object easyDashXapiDashUtilsMod extends js.Object {
  def hasRole(role: String): RequestHandler[ParamsDictionary] = js.native
  def isLoggedIn(): RequestHandler[ParamsDictionary] = js.native
  def isLoggedIn(role: String): RequestHandler[ParamsDictionary] = js.native
  def isLoggedOut(): RequestHandler[ParamsDictionary] = js.native
}

