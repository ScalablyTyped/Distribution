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
  def apply(getEmail: () => java.lang.String, getUserLoginId: () => java.lang.String): User = {
    val __obj = js.Dynamic.literal(getEmail = js.Any.fromFunction0(getEmail), getUserLoginId = js.Any.fromFunction0(getUserLoginId))
  
    __obj.asInstanceOf[User]
  }
}

