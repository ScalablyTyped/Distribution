package typings.googleAppsScript.GoogleAppsScript.Script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object used to determine whether the user needs to authorize this script to use one or more
  * services, and to provide the URL for an authorization dialog. If the script is published as an add-on that uses installable triggers, this information can be used
  * to control access to sections of code for which the user lacks the necessary authorization.
  * Alternately, the add-on can ask the user to open the URL for the authorization dialog to resolve
  * the problem.
  *
  * This object is returned by ScriptApp.getAuthorizationInfo(authMode). In almost
  * all cases, scripts should call ScriptApp.getAuthorizationInfo(ScriptApp.AuthMode.FULL),
  * since no other authorization mode requires that users grant authorization.
  */
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

