package typings.googleDashAppsDashScript.GoogleAppsScript.Script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AuthorizationStatus extends js.Object

@JSGlobal("GoogleAppsScript.Script.AuthorizationStatus")
@js.native
object AuthorizationStatus extends js.Object {
  @js.native
  sealed trait NOT_REQUIRED extends AuthorizationStatus
  
  @js.native
  sealed trait REQUIRED extends AuthorizationStatus
  
  /* 1 */ val NOT_REQUIRED: typings.googleDashAppsDashScript.GoogleAppsScript.Script.AuthorizationStatus.NOT_REQUIRED with Double = js.native
  /* 0 */ val REQUIRED: typings.googleDashAppsDashScript.GoogleAppsScript.Script.AuthorizationStatus.REQUIRED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AuthorizationStatus with Double] = js.native
}

