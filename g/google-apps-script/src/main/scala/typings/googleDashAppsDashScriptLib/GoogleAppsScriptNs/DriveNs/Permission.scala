package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Permission extends js.Object

@JSGlobal("GoogleAppsScript.Drive.Permission")
@js.native
object Permission extends js.Object {
  @js.native
  sealed trait COMMENT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.Permission
  
  @js.native
  sealed trait EDIT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.Permission
  
  @js.native
  sealed trait NONE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.Permission
  
  @js.native
  sealed trait ORGANIZER
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.Permission
  
  @js.native
  sealed trait OWNER
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.Permission
  
  @js.native
  sealed trait VIEW
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.Permission
  
  /* 2 */ val COMMENT: COMMENT with scala.Double = js.native
  /* 1 */ val EDIT: EDIT with scala.Double = js.native
  /* 5 */ val NONE: NONE with scala.Double = js.native
  /* 4 */ val ORGANIZER: ORGANIZER with scala.Double = js.native
  /* 3 */ val OWNER: OWNER with scala.Double = js.native
  /* 0 */ val VIEW: VIEW with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.Permission with scala.Double
  ] = js.native
}

