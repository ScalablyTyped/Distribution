package typings.devtoolsProtocol.mod.Protocol.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CrossOriginEmbedderPolicyStatus extends js.Object {
  
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
  implicit class CrossOriginEmbedderPolicyStatusOps[Self <: CrossOriginEmbedderPolicyStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setReportOnlyValue(value: CrossOriginEmbedderPolicyValue): Self = this.set("reportOnlyValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: CrossOriginEmbedderPolicyValue): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportOnlyReportingEndpoint(value: String): Self = this.set("reportOnlyReportingEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportOnlyReportingEndpoint: Self = this.set("reportOnlyReportingEndpoint", js.undefined)
    
    @scala.inline
    def setReportingEndpoint(value: String): Self = this.set("reportingEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportingEndpoint: Self = this.set("reportingEndpoint", js.undefined)
  }
}
