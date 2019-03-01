package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizationInfo extends js.Object {
  def getAuthorizationStatus(): AuthorizationStatus
  def getAuthorizationUrl(): java.lang.String
}

object AuthorizationInfo {
  @scala.inline
  def apply(
    getAuthorizationStatus: js.Function0[AuthorizationStatus],
    getAuthorizationUrl: js.Function0[java.lang.String]
  ): AuthorizationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAuthorizationStatus")(getAuthorizationStatus)
    __obj.updateDynamic("getAuthorizationUrl")(getAuthorizationUrl)
    __obj.asInstanceOf[AuthorizationInfo]
  }
}

