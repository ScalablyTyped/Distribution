package typings.devtoolsProtocol.mod.Protocol.Audits

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockedByResponseIssueDetails extends StObject {
  
  var blockedFrame: js.UndefOr[AffectedFrame] = js.undefined
  
  var parentFrame: js.UndefOr[AffectedFrame] = js.undefined
  
  var reason: BlockedByResponseReason
  
  var request: AffectedRequest
}
object BlockedByResponseIssueDetails {
  
  inline def apply(reason: BlockedByResponseReason, request: AffectedRequest): BlockedByResponseIssueDetails = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockedByResponseIssueDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlockedByResponseIssueDetails] (val x: Self) extends AnyVal {
    
    inline def setBlockedFrame(value: AffectedFrame): Self = StObject.set(x, "blockedFrame", value.asInstanceOf[js.Any])
    
    inline def setBlockedFrameUndefined: Self = StObject.set(x, "blockedFrame", js.undefined)
    
    inline def setParentFrame(value: AffectedFrame): Self = StObject.set(x, "parentFrame", value.asInstanceOf[js.Any])
    
    inline def setParentFrameUndefined: Self = StObject.set(x, "parentFrame", js.undefined)
    
    inline def setReason(value: BlockedByResponseReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: AffectedRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
