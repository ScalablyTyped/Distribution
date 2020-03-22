package typings.evernote.mod.Types

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BusinessInvitationStatus extends js.Object

@JSImport("evernote", "Types.BusinessInvitationStatus")
@js.native
object BusinessInvitationStatus extends js.Object {
  @js.native
  sealed trait APPROVED extends BusinessInvitationStatus
  
  @js.native
  sealed trait REDEEMED extends BusinessInvitationStatus
  
  @js.native
  sealed trait REQUESTED extends BusinessInvitationStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BusinessInvitationStatus with Double] = js.native
  /* 0 */ @js.native
  object APPROVED extends TopLevel[APPROVED with Double]
  
  /* 2 */ @js.native
  object REDEEMED extends TopLevel[REDEEMED with Double]
  
  /* 1 */ @js.native
  object REQUESTED extends TopLevel[REQUESTED with Double]
  
}

