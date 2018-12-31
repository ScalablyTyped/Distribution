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

