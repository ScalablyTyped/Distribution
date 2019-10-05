package typings.evernote.evernoteMod.Evernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SponsoredGroupRole extends js.Object

/**
  * Enumeration of the roles that a User can have within a sponsored group.
  *
  * GROUP_MEMBER: The user is a member of the group with no special privileges.
  *
  * GROUP_ADMIN: The user is an administrator within the group.
  *
  * GROUP_OWNER: The user is the owner of the group.
  */
@JSImport("evernote", "Evernote.SponsoredGroupRole")
@js.native
object SponsoredGroupRole extends js.Object {
  @js.native
  sealed trait GROUP_ADMIN extends SponsoredGroupRole
  
  @js.native
  sealed trait GROUP_MEMBER extends SponsoredGroupRole
  
  @js.native
  sealed trait GROUP_OWNER extends SponsoredGroupRole
  
  /* 2 */ val GROUP_ADMIN: typings.evernote.evernoteMod.Evernote.SponsoredGroupRole.GROUP_ADMIN with Double = js.native
  /* 1 */ val GROUP_MEMBER: typings.evernote.evernoteMod.Evernote.SponsoredGroupRole.GROUP_MEMBER with Double = js.native
  /* 3 */ val GROUP_OWNER: typings.evernote.evernoteMod.Evernote.SponsoredGroupRole.GROUP_OWNER with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SponsoredGroupRole with Double] = js.native
}

