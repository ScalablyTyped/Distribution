package typings.evernote.mod.Evernote

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrivilegeLevel extends js.Object

/**
  * This enumeration defines the possible permission levels for a user.
  * Free accounts will have a level of NORMAL and paid Premium accounts
  * will have a level of PREMIUM.
  */
@JSImport("evernote", "Evernote.PrivilegeLevel")
@js.native
object PrivilegeLevel extends js.Object {
  @js.native
  sealed trait ADMIN extends PrivilegeLevel
  
  @js.native
  sealed trait MANAGER extends PrivilegeLevel
  
  @js.native
  sealed trait NORMAL extends PrivilegeLevel
  
  @js.native
  sealed trait PREMIUM extends PrivilegeLevel
  
  @js.native
  sealed trait SUPPORT extends PrivilegeLevel
  
  @js.native
  sealed trait VIP extends PrivilegeLevel
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrivilegeLevel with Double] = js.native
  /* 9 */ @js.native
  object ADMIN extends TopLevel[ADMIN with Double]
  
  /* 7 */ @js.native
  object MANAGER extends TopLevel[MANAGER with Double]
  
  /* 1 */ @js.native
  object NORMAL extends TopLevel[NORMAL with Double]
  
  /* 3 */ @js.native
  object PREMIUM extends TopLevel[PREMIUM with Double]
  
  /* 8 */ @js.native
  object SUPPORT extends TopLevel[SUPPORT with Double]
  
  /* 5 */ @js.native
  object VIP extends TopLevel[VIP with Double]
  
}

