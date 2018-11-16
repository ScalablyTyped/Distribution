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
  
  val ANYONE: ANYONE with java.lang.String = js.native
  val ANYONE_WITH_LINK: ANYONE_WITH_LINK with java.lang.String = js.native
  val DOMAIN: DOMAIN with java.lang.String = js.native
  val DOMAIN_WITH_LINK: DOMAIN_WITH_LINK with java.lang.String = js.native
  val PRIVATE: PRIVATE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.Access with java.lang.String
  ] = js.native
}

