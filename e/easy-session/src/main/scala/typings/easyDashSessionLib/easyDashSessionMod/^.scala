package typings
package easyDashSessionLib.easyDashSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("easy-session", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def checkRole(role: java.lang.String): expressLib.expressMod.eNs.RequestHandler = js.native
  def checkRole(role: java.lang.String, errorCallback: js.Function): expressLib.expressMod.eNs.RequestHandler = js.native
  def isFresh(): expressLib.expressMod.eNs.RequestHandler = js.native
  def isFresh(errorCallback: js.Function): expressLib.expressMod.eNs.RequestHandler = js.native
  def isLoggedIn(): expressLib.expressMod.eNs.RequestHandler = js.native
  def isLoggedIn(errorCallback: js.Function): expressLib.expressMod.eNs.RequestHandler = js.native
  def main(session: js.Any): expressLib.expressMod.eNs.RequestHandler = js.native
  def main(session: js.Any, options: SessionOptions): expressLib.expressMod.eNs.RequestHandler = js.native
}

