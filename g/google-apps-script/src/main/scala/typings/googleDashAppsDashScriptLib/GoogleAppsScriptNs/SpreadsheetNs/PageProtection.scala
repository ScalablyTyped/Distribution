package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageProtection extends js.Object {
  def addUser(email: java.lang.String): scala.Unit
  def getUsers(): js.Array[java.lang.String]
  def isProtected(): scala.Boolean
  def removeUser(user: java.lang.String): scala.Unit
  def setProtected(protection: scala.Boolean): scala.Unit
}

