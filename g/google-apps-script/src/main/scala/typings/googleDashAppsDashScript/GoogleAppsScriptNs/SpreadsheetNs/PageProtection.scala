package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageProtection extends js.Object {
  def addUser(email: String): Unit
  def getUsers(): js.Array[String]
  def isProtected(): Boolean
  def removeUser(user: String): Unit
  def setProtected(protection: Boolean): Unit
}

object PageProtection {
  @scala.inline
  def apply(
    addUser: String => Unit,
    getUsers: () => js.Array[String],
    isProtected: () => Boolean,
    removeUser: String => Unit,
    setProtected: Boolean => Unit
  ): PageProtection = {
    val __obj = js.Dynamic.literal(addUser = js.Any.fromFunction1(addUser), getUsers = js.Any.fromFunction0(getUsers), isProtected = js.Any.fromFunction0(isProtected), removeUser = js.Any.fromFunction1(removeUser), setProtected = js.Any.fromFunction1(setProtected))
  
    __obj.asInstanceOf[PageProtection]
  }
}

