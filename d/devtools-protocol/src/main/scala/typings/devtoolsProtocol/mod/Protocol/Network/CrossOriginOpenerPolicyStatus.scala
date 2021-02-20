package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CrossOriginOpenerPolicyStatus extends StObject {
  
  var reportOnlyReportingEndpoint: js.UndefOr[String] = js.native
  
  var reportOnlyValue: CrossOriginOpenerPolicyValue = js.native
  
  var reportingEndpoint: js.UndefOr[String] = js.native
  
  var value: CrossOriginOpenerPolicyValue = js.native
}
object CrossOriginOpenerPolicyStatus {
  
  @scala.inline
  def apply(reportOnlyValue: CrossOriginOpenerPolicyValue, value: CrossOriginOpenerPolicyValue): CrossOriginOpenerPolicyStatus = {
    val __obj = js.Dynamic.literal(reportOnlyValue = reportOnlyValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrossOriginOpenerPolicyStatus]
  }
  
  @scala.inline
  implicit class CrossOriginOpenerPolicyStatusMutableBuilder[Self <: CrossOriginOpenerPolicyStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReportOnlyReportingEndpoint(value: String): Self = StObject.set(x, "reportOnlyReportingEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportOnlyReportingEndpointUndefined: Self = StObject.set(x, "reportOnlyReportingEndpoint", js.undefined)
    
    @scala.inline
    def setReportOnlyValue(value: CrossOriginOpenerPolicyValue): Self = StObject.set(x, "reportOnlyValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportingEndpoint(value: String): Self = StObject.set(x, "reportingEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportingEndpointUndefined: Self = StObject.set(x, "reportingEndpoint", js.undefined)
    
    @scala.inline
    def setValue(value: CrossOriginOpenerPolicyValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
