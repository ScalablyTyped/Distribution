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
  
  val COMMENT: COMMENT with java.lang.String = js.native
  val EDIT: EDIT with java.lang.String = js.native
  val NONE: NONE with java.lang.String = js.native
  val ORGANIZER: ORGANIZER with java.lang.String = js.native
  val OWNER: OWNER with java.lang.String = js.native
  val VIEW: VIEW with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.Permission with java.lang.String
  ] = js.native
}

