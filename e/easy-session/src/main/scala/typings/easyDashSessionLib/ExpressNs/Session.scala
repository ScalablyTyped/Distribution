package typings
package easyDashSessionLib.ExpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Session extends js.Object {
  def getRole(): java.lang.String = js.native
  def hasRole(role: java.lang.String): scala.Boolean = js.native
  def isFresh(): scala.Boolean = js.native
  def isGuest(): scala.Boolean = js.native
  def isLoggedIn(): scala.Boolean = js.native
  def isLoggedIn(role: java.lang.String): scala.Boolean = js.native
  def login(callback: js.Function): scala.Unit = js.native
  def login(extend: js.Object, callback: ErrorCallback): scala.Unit = js.native
  def login(role: java.lang.String, callback: ErrorCallback): scala.Unit = js.native
  def login(role: java.lang.String, extend: js.Object, callback: ErrorCallback): scala.Unit = js.native
  def logout(callback: ErrorCallback): scala.Unit = js.native
  def setRole(role: java.lang.String): Session = js.native
}

