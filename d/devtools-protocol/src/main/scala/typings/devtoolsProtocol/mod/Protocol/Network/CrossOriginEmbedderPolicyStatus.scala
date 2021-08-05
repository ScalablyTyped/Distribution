package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrossOriginEmbedderPolicyStatus extends StObject {
  
  var reportOnlyReportingEndpoint: js.UndefOr[String] = js.undefined
  
  var reportOnlyValue: CrossOriginEmbedderPolicyValue
  
  var reportingEndpoint: js.UndefOr[String] = js.undefined
  
  var value: CrossOriginEmbedderPolicyValue
}
object CrossOriginEmbedderPolicyStatus {
  
  inline def apply(reportOnlyValue: CrossOriginEmbedderPolicyValue, value: CrossOriginEmbedderPolicyValue): CrossOriginEmbedderPolicyStatus = {
    val __obj = js.Dynamic.literal(reportOnlyValue = reportOnlyValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrossOriginEmbedderPolicyStatus]
  }
  
  extension [Self <: CrossOriginEmbedderPolicyStatus](x: Self) {
    
    inline def setReportOnlyReportingEndpoint(value: String): Self = StObject.set(x, "reportOnlyReportingEndpoint", value.asInstanceOf[js.Any])
    
    inline def setReportOnlyReportingEndpointUndefined: Self = StObject.set(x, "reportOnlyReportingEndpoint", js.undefined)
    
    inline def setReportOnlyValue(value: CrossOriginEmbedderPolicyValue): Self = StObject.set(x, "reportOnlyValue", value.asInstanceOf[js.Any])
    
    inline def setReportingEndpoint(value: String): Self = StObject.set(x, "reportingEndpoint", value.asInstanceOf[js.Any])
    
    inline def setReportingEndpointUndefined: Self = StObject.set(x, "reportingEndpoint", js.undefined)
    
    inline def setValue(value: CrossOriginEmbedderPolicyValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
