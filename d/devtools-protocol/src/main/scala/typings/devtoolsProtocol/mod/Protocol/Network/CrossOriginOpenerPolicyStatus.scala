package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrossOriginOpenerPolicyStatus extends StObject {
  
  var reportOnlyReportingEndpoint: js.UndefOr[String] = js.undefined
  
  var reportOnlyValue: CrossOriginOpenerPolicyValue
  
  var reportingEndpoint: js.UndefOr[String] = js.undefined
  
  var value: CrossOriginOpenerPolicyValue
}
object CrossOriginOpenerPolicyStatus {
  
  inline def apply(reportOnlyValue: CrossOriginOpenerPolicyValue, value: CrossOriginOpenerPolicyValue): CrossOriginOpenerPolicyStatus = {
    val __obj = js.Dynamic.literal(reportOnlyValue = reportOnlyValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrossOriginOpenerPolicyStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CrossOriginOpenerPolicyStatus] (val x: Self) extends AnyVal {
    
    inline def setReportOnlyReportingEndpoint(value: String): Self = StObject.set(x, "reportOnlyReportingEndpoint", value.asInstanceOf[js.Any])
    
    inline def setReportOnlyReportingEndpointUndefined: Self = StObject.set(x, "reportOnlyReportingEndpoint", js.undefined)
    
    inline def setReportOnlyValue(value: CrossOriginOpenerPolicyValue): Self = StObject.set(x, "reportOnlyValue", value.asInstanceOf[js.Any])
    
    inline def setReportingEndpoint(value: String): Self = StObject.set(x, "reportingEndpoint", value.asInstanceOf[js.Any])
    
    inline def setReportingEndpointUndefined: Self = StObject.set(x, "reportingEndpoint", js.undefined)
    
    inline def setValue(value: CrossOriginOpenerPolicyValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
