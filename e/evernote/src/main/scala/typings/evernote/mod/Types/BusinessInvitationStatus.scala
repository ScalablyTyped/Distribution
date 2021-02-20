package typings.evernote.mod.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BusinessInvitationStatus extends StObject
@JSImport("evernote", "Types.BusinessInvitationStatus")
@js.native
object BusinessInvitationStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BusinessInvitationStatus with Double] = js.native
  
  @js.native
  sealed trait APPROVED extends BusinessInvitationStatus
  /* 0 */ val APPROVED: typings.evernote.mod.Types.BusinessInvitationStatus.APPROVED with Double = js.native
  
  @js.native
  sealed trait REDEEMED extends BusinessInvitationStatus
  /* 2 */ val REDEEMED: typings.evernote.mod.Types.BusinessInvitationStatus.REDEEMED with Double = js.native
  
  @js.native
  sealed trait REQUESTED extends BusinessInvitationStatus
  /* 1 */ val REQUESTED: typings.evernote.mod.Types.BusinessInvitationStatus.REQUESTED with Double = js.native
}
