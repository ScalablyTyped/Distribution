package typings.evernote.evernoteMod.Evernote

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
  
  /* 9 */ val ADMIN: typings.evernote.evernoteMod.Evernote.PrivilegeLevel.ADMIN with Double = js.native
  /* 7 */ val MANAGER: typings.evernote.evernoteMod.Evernote.PrivilegeLevel.MANAGER with Double = js.native
  /* 1 */ val NORMAL: typings.evernote.evernoteMod.Evernote.PrivilegeLevel.NORMAL with Double = js.native
  /* 3 */ val PREMIUM: typings.evernote.evernoteMod.Evernote.PrivilegeLevel.PREMIUM with Double = js.native
  /* 8 */ val SUPPORT: typings.evernote.evernoteMod.Evernote.PrivilegeLevel.SUPPORT with Double = js.native
  /* 5 */ val VIP: typings.evernote.evernoteMod.Evernote.PrivilegeLevel.VIP with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrivilegeLevel with Double] = js.native
}

