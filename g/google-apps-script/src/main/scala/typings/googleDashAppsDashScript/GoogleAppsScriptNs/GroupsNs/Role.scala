package typings.googleDashAppsDashScript.GoogleAppsScriptNs.GroupsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Role extends js.Object

@JSGlobal("GoogleAppsScript.Groups.Role")
@js.native
object Role extends js.Object {
  @js.native
  sealed trait INVITED extends Role
  
  @js.native
  sealed trait MANAGER extends Role
  
  @js.native
  sealed trait MEMBER extends Role
  
  @js.native
  sealed trait OWNER extends Role
  
  @js.native
  sealed trait PENDING extends Role
  
  /* 3 */ val INVITED: typings.googleDashAppsDashScript.GoogleAppsScriptNs.GroupsNs.Role.INVITED with Double = js.native
  /* 1 */ val MANAGER: typings.googleDashAppsDashScript.GoogleAppsScriptNs.GroupsNs.Role.MANAGER with Double = js.native
  /* 2 */ val MEMBER: typings.googleDashAppsDashScript.GoogleAppsScriptNs.GroupsNs.Role.MEMBER with Double = js.native
  /* 0 */ val OWNER: typings.googleDashAppsDashScript.GoogleAppsScriptNs.GroupsNs.Role.OWNER with Double = js.native
  /* 4 */ val PENDING: typings.googleDashAppsDashScript.GoogleAppsScriptNs.GroupsNs.Role.PENDING with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Role with Double] = js.native
}

