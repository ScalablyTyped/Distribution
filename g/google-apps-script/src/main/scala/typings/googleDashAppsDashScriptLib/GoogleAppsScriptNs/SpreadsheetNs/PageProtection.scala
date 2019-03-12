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

object PageProtection {
  @scala.inline
  def apply(
    addUser: java.lang.String => scala.Unit,
    getUsers: () => js.Array[java.lang.String],
    isProtected: () => scala.Boolean,
    removeUser: java.lang.String => scala.Unit,
    setProtected: scala.Boolean => scala.Unit
  ): PageProtection = {
    val __obj = js.Dynamic.literal(addUser = js.Any.fromFunction1(addUser), getUsers = js.Any.fromFunction0(getUsers), isProtected = js.Any.fromFunction0(isProtected), removeUser = js.Any.fromFunction1(removeUser), setProtected = js.Any.fromFunction1(setProtected))
  
    __obj.asInstanceOf[PageProtection]
  }
}

