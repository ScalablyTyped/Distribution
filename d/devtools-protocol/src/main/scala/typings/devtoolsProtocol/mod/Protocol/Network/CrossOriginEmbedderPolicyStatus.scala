package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CrossOriginEmbedderPolicyStatus extends StObject {
  
  var reportOnlyReportingEndpoint: js.UndefOr[String] = js.native
  
  var reportOnlyValue: CrossOriginEmbedderPolicyValue = js.native
  
  var reportingEndpoint: js.UndefOr[String] = js.native
  
  var value: CrossOriginEmbedderPolicyValue = js.native
}
object CrossOriginEmbedderPolicyStatus {
  
  @scala.inline
  def apply(reportOnlyValue: CrossOriginEmbedderPolicyValue, value: CrossOriginEmbedderPolicyValue): CrossOriginEmbedderPolicyStatus = {
    val __obj = js.Dynamic.literal(reportOnlyValue = reportOnlyValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrossOriginEmbedderPolicyStatus]
  }
  
  @scala.inline
  implicit class CrossOriginEmbedderPolicyStatusMutableBuilder[Self <: CrossOriginEmbedderPolicyStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReportOnlyReportingEndpoint(value: String): Self = StObject.set(x, "reportOnlyReportingEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportOnlyReportingEndpointUndefined: Self = StObject.set(x, "reportOnlyReportingEndpoint", js.undefined)
    
    @scala.inline
    def setReportOnlyValue(value: CrossOriginEmbedderPolicyValue): Self = StObject.set(x, "reportOnlyValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportingEndpoint(value: String): Self = StObject.set(x, "reportingEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportingEndpointUndefined: Self = StObject.set(x, "reportingEndpoint", js.undefined)
    
    @scala.inline
    def setValue(value: CrossOriginEmbedderPolicyValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
