package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Permission extends js.Object

@JSGlobal("GoogleAppsScript.Drive.Permission")
@js.native
object Permission extends js.Object {
  @js.native
  sealed trait COMMENT extends Permission
  
  @js.native
  sealed trait EDIT extends Permission
  
  @js.native
  sealed trait NONE extends Permission
  
  @js.native
  sealed trait ORGANIZER extends Permission
  
  @js.native
  sealed trait OWNER extends Permission
  
  @js.native
  sealed trait VIEW extends Permission
  
  /* 2 */ val COMMENT: typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.Permission.COMMENT with Double = js.native
  /* 1 */ val EDIT: typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.Permission.EDIT with Double = js.native
  /* 5 */ val NONE: typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.Permission.NONE with Double = js.native
  /* 4 */ val ORGANIZER: typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.Permission.ORGANIZER with Double = js.native
  /* 3 */ val OWNER: typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.Permission.OWNER with Double = js.native
  /* 0 */ val VIEW: typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.Permission.VIEW with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Permission with Double] = js.native
}

