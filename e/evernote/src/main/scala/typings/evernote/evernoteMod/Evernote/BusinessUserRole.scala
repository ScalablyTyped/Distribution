package typings.evernote.evernoteMod.Evernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BusinessUserRole extends js.Object

/**
  * Enumeration of the roles that a User can have within an Evernote Business account.
  *
  * ADMIN: The user is an administrator of the Evernote Business account.
  *
  * NORMAL: The user is a regular user within the Evernote Business account.
  */
@JSImport("evernote", "Evernote.BusinessUserRole")
@js.native
object BusinessUserRole extends js.Object {
  @js.native
  sealed trait ADMIN extends BusinessUserRole
  
  @js.native
  sealed trait NORMAL extends BusinessUserRole
  
  /* 1 */ val ADMIN: typings.evernote.evernoteMod.Evernote.BusinessUserRole.ADMIN with Double = js.native
  /* 2 */ val NORMAL: typings.evernote.evernoteMod.Evernote.BusinessUserRole.NORMAL with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BusinessUserRole with Double] = js.native
}

