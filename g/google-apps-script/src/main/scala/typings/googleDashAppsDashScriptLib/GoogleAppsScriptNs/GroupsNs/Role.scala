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
  
  val INVITED: INVITED with java.lang.String = js.native
  val MANAGER: MANAGER with java.lang.String = js.native
  val MEMBER: MEMBER with java.lang.String = js.native
  val OWNER: OWNER with java.lang.String = js.native
  val PENDING: PENDING with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.GroupsNs.Role with java.lang.String
  ] = js.native
}

