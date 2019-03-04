package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Session extends js.Object {
  def getActiveUser(): User
  def getActiveUserLocale(): java.lang.String
  def getEffectiveUser(): User
  def getScriptTimeZone(): java.lang.String
  def getTemporaryActiveUserKey(): java.lang.String
  def getTimeZone(): java.lang.String
  def getUser(): User
}

object Session {
  @scala.inline
  def apply(
    getActiveUser: js.Function0[User],
    getActiveUserLocale: js.Function0[java.lang.String],
    getEffectiveUser: js.Function0[User],
    getScriptTimeZone: js.Function0[java.lang.String],
    getTemporaryActiveUserKey: js.Function0[java.lang.String],
    getTimeZone: js.Function0[java.lang.String],
    getUser: js.Function0[User]
  ): Session = {
    val __obj = js.Dynamic.literal(getActiveUser = getActiveUser, getActiveUserLocale = getActiveUserLocale, getEffectiveUser = getEffectiveUser, getScriptTimeZone = getScriptTimeZone, getTemporaryActiveUserKey = getTemporaryActiveUserKey, getTimeZone = getTimeZone, getUser = getUser)
  
    __obj.asInstanceOf[Session]
  }
}

