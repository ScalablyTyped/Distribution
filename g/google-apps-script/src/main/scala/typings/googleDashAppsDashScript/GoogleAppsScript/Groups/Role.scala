package typings.googleDashAppsDashScript.GoogleAppsScript.Groups

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
  
  /* 3 */ val INVITED: typings.googleDashAppsDashScript.GoogleAppsScript.Groups.Role.INVITED with Double = js.native
  /* 1 */ val MANAGER: typings.googleDashAppsDashScript.GoogleAppsScript.Groups.Role.MANAGER with Double = js.native
  /* 2 */ val MEMBER: typings.googleDashAppsDashScript.GoogleAppsScript.Groups.Role.MEMBER with Double = js.native
  /* 0 */ val OWNER: typings.googleDashAppsDashScript.GoogleAppsScript.Groups.Role.OWNER with Double = js.native
  /* 4 */ val PENDING: typings.googleDashAppsDashScript.GoogleAppsScript.Groups.Role.PENDING with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Role with Double] = js.native
}

