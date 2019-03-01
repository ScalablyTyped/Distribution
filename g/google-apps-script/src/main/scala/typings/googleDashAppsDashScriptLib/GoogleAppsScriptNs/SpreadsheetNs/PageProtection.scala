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
    addUser: js.Function1[java.lang.String, scala.Unit],
    getUsers: js.Function0[js.Array[java.lang.String]],
    isProtected: js.Function0[scala.Boolean],
    removeUser: js.Function1[java.lang.String, scala.Unit],
    setProtected: js.Function1[scala.Boolean, scala.Unit]
  ): PageProtection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addUser")(addUser)
    __obj.updateDynamic("getUsers")(getUsers)
    __obj.updateDynamic("isProtected")(isProtected)
    __obj.updateDynamic("removeUser")(removeUser)
    __obj.updateDynamic("setProtected")(setProtected)
    __obj.asInstanceOf[PageProtection]
  }
}

