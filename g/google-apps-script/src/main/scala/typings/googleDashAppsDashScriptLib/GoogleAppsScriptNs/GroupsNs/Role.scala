package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GroupsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Role extends js.Object

@JSGlobal("GoogleAppsScript.Groups.Role")
@js.native
object Role extends js.Object {
  @js.native
  sealed trait INVITED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.GroupsNs.Role
  
  @js.native
  sealed trait MANAGER
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.GroupsNs.Role
  
  @js.native
  sealed trait MEMBER
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.GroupsNs.Role
  
  @js.native
  sealed trait OWNER
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.GroupsNs.Role
  
  @js.native
  sealed trait PENDING
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.GroupsNs.Role
  
  /* 3 */ val INVITED: INVITED with scala.Double = js.native
  /* 1 */ val MANAGER: MANAGER with scala.Double = js.native
  /* 2 */ val MEMBER: MEMBER with scala.Double = js.native
  /* 0 */ val OWNER: OWNER with scala.Double = js.native
  /* 4 */ val PENDING: PENDING with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[googleDashAppsDashScriptLib.GoogleAppsScriptNs.GroupsNs.Role with scala.Double] = js.native
}

