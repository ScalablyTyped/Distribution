package typings.devtoolsProtocol.mod.Protocol.Audits

import typings.devtoolsProtocol.mod.Protocol.Network.ClientSecurityState
import typings.devtoolsProtocol.mod.Protocol.Network.CorsErrorStatus
import typings.devtoolsProtocol.mod.Protocol.Network.IPAddressSpace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CorsIssueDetails extends StObject {
  
  var clientSecurityState: js.UndefOr[ClientSecurityState] = js.undefined
  
  var corsErrorStatus: CorsErrorStatus
  
  var initiatorOrigin: js.UndefOr[String] = js.undefined
  
  var isWarning: Boolean
  
  var location: js.UndefOr[SourceCodeLocation] = js.undefined
  
  var request: AffectedRequest
  
  var resourceIPAddressSpace: js.UndefOr[IPAddressSpace] = js.undefined
}
object CorsIssueDetails {
  
  inline def apply(corsErrorStatus: CorsErrorStatus, isWarning: Boolean, request: AffectedRequest): CorsIssueDetails = {
    val __obj = js.Dynamic.literal(corsErrorStatus = corsErrorStatus.asInstanceOf[js.Any], isWarning = isWarning.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[CorsIssueDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CorsIssueDetails] (val x: Self) extends AnyVal {
    
    inline def setClientSecurityState(value: ClientSecurityState): Self = StObject.set(x, "clientSecurityState", value.asInstanceOf[js.Any])
    
    inline def setClientSecurityStateUndefined: Self = StObject.set(x, "clientSecurityState", js.undefined)
    
    inline def setCorsErrorStatus(value: CorsErrorStatus): Self = StObject.set(x, "corsErrorStatus", value.asInstanceOf[js.Any])
    
    inline def setInitiatorOrigin(value: String): Self = StObject.set(x, "initiatorOrigin", value.asInstanceOf[js.Any])
    
    inline def setInitiatorOriginUndefined: Self = StObject.set(x, "initiatorOrigin", js.undefined)
    
    inline def setIsWarning(value: Boolean): Self = StObject.set(x, "isWarning", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: SourceCodeLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setRequest(value: AffectedRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResourceIPAddressSpace(value: IPAddressSpace): Self = StObject.set(x, "resourceIPAddressSpace", value.asInstanceOf[js.Any])
    
    inline def setResourceIPAddressSpaceUndefined: Self = StObject.set(x, "resourceIPAddressSpace", js.undefined)
  }
}
