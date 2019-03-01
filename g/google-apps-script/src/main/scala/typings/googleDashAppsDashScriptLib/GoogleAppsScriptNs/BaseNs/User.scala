package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  def getEmail(): java.lang.String
  def getUserLoginId(): java.lang.String
}

object User {
  @scala.inline
  def apply(getEmail: js.Function0[java.lang.String], getUserLoginId: js.Function0[java.lang.String]): User = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getEmail")(getEmail)
    __obj.updateDynamic("getUserLoginId")(getUserLoginId)
    __obj.asInstanceOf[User]
  }
}

