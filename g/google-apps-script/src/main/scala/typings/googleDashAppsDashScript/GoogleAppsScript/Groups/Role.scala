package typings.googleDashAppsDashScript.GoogleAppsScript.Groups

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Role extends js.Object

/**
  * Possible roles of a user within a group, such as owner or ordinary member. Users subscribed to a
  * group have exactly one role within the context of that group.
  * See also
  *
  * Group.getRole(email)
  */
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Role with Double] = js.native
  /* 3 */ @js.native
  object INVITED extends TopLevel[INVITED with Double]
  
  /* 1 */ @js.native
  object MANAGER extends TopLevel[MANAGER with Double]
  
  /* 2 */ @js.native
  object MEMBER extends TopLevel[MEMBER with Double]
  
  /* 0 */ @js.native
  object OWNER extends TopLevel[OWNER with Double]
  
  /* 4 */ @js.native
  object PENDING extends TopLevel[PENDING with Double]
  
}

