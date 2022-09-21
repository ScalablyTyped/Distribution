package typings.devtoolsProtocol.mod.Protocol.Audits

import typings.devtoolsProtocol.mod.Protocol.DOM.BackendNodeId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributionReportingIssueDetails extends StObject {
  
  var invalidParameter: js.UndefOr[String] = js.undefined
  
  var request: js.UndefOr[AffectedRequest] = js.undefined
  
  var violatingNodeId: js.UndefOr[BackendNodeId] = js.undefined
  
  var violationType: AttributionReportingIssueType
}
object AttributionReportingIssueDetails {
  
  inline def apply(violationType: AttributionReportingIssueType): AttributionReportingIssueDetails = {
    val __obj = js.Dynamic.literal(violationType = violationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributionReportingIssueDetails]
  }
  
  extension [Self <: AttributionReportingIssueDetails](x: Self) {
    
    inline def setInvalidParameter(value: String): Self = StObject.set(x, "invalidParameter", value.asInstanceOf[js.Any])
    
    inline def setInvalidParameterUndefined: Self = StObject.set(x, "invalidParameter", js.undefined)
    
    inline def setRequest(value: AffectedRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setViolatingNodeId(value: BackendNodeId): Self = StObject.set(x, "violatingNodeId", value.asInstanceOf[js.Any])
    
    inline def setViolatingNodeIdUndefined: Self = StObject.set(x, "violatingNodeId", js.undefined)
    
    inline def setViolationType(value: AttributionReportingIssueType): Self = StObject.set(x, "violationType", value.asInstanceOf[js.Any])
  }
}
