package typings.evernote.mod.Types

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BusinessInvitationStatus extends js.Object
@JSImport("evernote", "Types.BusinessInvitationStatus")
@js.native
object BusinessInvitationStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BusinessInvitationStatus with Double] = js.native
  
  @js.native
  sealed trait APPROVED extends BusinessInvitationStatus
  /* 0 */ @js.native
  object APPROVED extends TopLevel[APPROVED with Double]
  
  @js.native
  sealed trait REDEEMED extends BusinessInvitationStatus
  /* 2 */ @js.native
  object REDEEMED extends TopLevel[REDEEMED with Double]
  
  @js.native
  sealed trait REQUESTED extends BusinessInvitationStatus
  /* 1 */ @js.native
  object REQUESTED extends TopLevel[REQUESTED with Double]
}
