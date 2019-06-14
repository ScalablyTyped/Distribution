package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Access extends js.Object

@JSGlobal("GoogleAppsScript.Drive.Access")
@js.native
object Access extends js.Object {
  @js.native
  sealed trait ANYONE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.Access
  
  @js.native
  sealed trait ANYONE_WITH_LINK
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.Access
  
  @js.native
  sealed trait DOMAIN
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.Access
  
  @js.native
  sealed trait DOMAIN_WITH_LINK
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.Access
  
  @js.native
  sealed trait PRIVATE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.Access
  
  /* 0 */ val ANYONE: ANYONE with scala.Double = js.native
  /* 1 */ val ANYONE_WITH_LINK: ANYONE_WITH_LINK with scala.Double = js.native
  /* 2 */ val DOMAIN: DOMAIN with scala.Double = js.native
  /* 3 */ val DOMAIN_WITH_LINK: DOMAIN_WITH_LINK with scala.Double = js.native
  /* 4 */ val PRIVATE: PRIVATE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.Access with scala.Double] = js.native
}

