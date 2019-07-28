package typings.easyDashSession.easyDashSessionMod

import typings.express.expressMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("easy-session", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def checkRole(role: String): RequestHandler = js.native
  def checkRole(role: String, errorCallback: js.Function): RequestHandler = js.native
  def isFresh(): RequestHandler = js.native
  def isFresh(errorCallback: js.Function): RequestHandler = js.native
  def isLoggedIn(): RequestHandler = js.native
  def isLoggedIn(errorCallback: js.Function): RequestHandler = js.native
  def main(session: js.Any): RequestHandler = js.native
  def main(session: js.Any, options: SessionOptions): RequestHandler = js.native
}

