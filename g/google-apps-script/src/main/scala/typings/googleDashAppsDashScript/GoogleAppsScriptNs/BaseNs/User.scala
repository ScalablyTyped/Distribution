package typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  def getEmail(): String
  def getUserLoginId(): String
}

object User {
  @scala.inline
  def apply(getEmail: () => String, getUserLoginId: () => String): User = {
    val __obj = js.Dynamic.literal(getEmail = js.Any.fromFunction0(getEmail), getUserLoginId = js.Any.fromFunction0(getUserLoginId))
  
    __obj.asInstanceOf[User]
  }
}

