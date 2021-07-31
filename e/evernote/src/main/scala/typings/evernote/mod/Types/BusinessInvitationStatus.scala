package typings.evernote.mod.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BusinessInvitationStatus extends StObject
@JSImport("evernote", "Types.BusinessInvitationStatus")
@js.native
object BusinessInvitationStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BusinessInvitationStatus & Double] = js.native
  
  @js.native
  sealed trait APPROVED
    extends StObject
       with BusinessInvitationStatus
  /* 0 */ val APPROVED: typings.evernote.mod.Types.BusinessInvitationStatus.APPROVED & Double = js.native
  
  @js.native
  sealed trait REDEEMED
    extends StObject
       with BusinessInvitationStatus
  /* 2 */ val REDEEMED: typings.evernote.mod.Types.BusinessInvitationStatus.REDEEMED & Double = js.native
  
  @js.native
  sealed trait REQUESTED
    extends StObject
       with BusinessInvitationStatus
  /* 1 */ val REQUESTED: typings.evernote.mod.Types.BusinessInvitationStatus.REQUESTED & Double = js.native
}
