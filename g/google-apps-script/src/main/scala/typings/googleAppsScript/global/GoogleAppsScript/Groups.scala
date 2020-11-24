package typings.googleAppsScript.global.GoogleAppsScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("GoogleAppsScript.Groups")
@js.native
object Groups extends js.Object {
  
  /**
    * Possible roles of a user within a group, such as owner or ordinary member. Users subscribed to a
    * group have exactly one role within the context of that group.
    * See also
    *
    * Group.getRole(email)
    */
  @js.native
  object Role extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Groups.Role with Double] = js.native
    
    /* 3 */ val INVITED: typings.googleAppsScript.GoogleAppsScript.Groups.Role.INVITED with Double = js.native
    
    /* 1 */ val MANAGER: typings.googleAppsScript.GoogleAppsScript.Groups.Role.MANAGER with Double = js.native
    
    /* 2 */ val MEMBER: typings.googleAppsScript.GoogleAppsScript.Groups.Role.MEMBER with Double = js.native
    
    /* 0 */ val OWNER: typings.googleAppsScript.GoogleAppsScript.Groups.Role.OWNER with Double = js.native
    
    /* 4 */ val PENDING: typings.googleAppsScript.GoogleAppsScript.Groups.Role.PENDING with Double = js.native
  }
}
