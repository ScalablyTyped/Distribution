package typings.easyDashXapiDashUtils

import typings.express.expressMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("easy-xapi-utils", JSImport.Namespace)
@js.native
object easyDashXapiDashUtilsMod extends js.Object {
  def hasRole(role: String): RequestHandler = js.native
  def isLoggedIn(): RequestHandler = js.native
  def isLoggedIn(role: String): RequestHandler = js.native
  def isLoggedOut(): RequestHandler = js.native
}

