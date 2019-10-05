package typings.googleDashAppsDashScript.GoogleAppsScript.Script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizationInfo extends js.Object {
  def getAuthorizationStatus(): AuthorizationStatus
  def getAuthorizationUrl(): String
}

object AuthorizationInfo {
  @scala.inline
  def apply(getAuthorizationStatus: () => AuthorizationStatus, getAuthorizationUrl: () => String): AuthorizationInfo = {
    val __obj = js.Dynamic.literal(getAuthorizationStatus = js.Any.fromFunction0(getAuthorizationStatus), getAuthorizationUrl = js.Any.fromFunction0(getAuthorizationUrl))
  
    __obj.asInstanceOf[AuthorizationInfo]
  }
}

