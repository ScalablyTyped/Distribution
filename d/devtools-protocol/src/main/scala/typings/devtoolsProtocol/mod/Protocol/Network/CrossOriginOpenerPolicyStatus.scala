package typings.devtoolsProtocol.mod.Protocol.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CrossOriginOpenerPolicyStatus extends js.Object {
  
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
  implicit class CrossOriginOpenerPolicyStatusOps[Self <: CrossOriginOpenerPolicyStatus] (val x: Self) extends AnyVal {
    
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
    def setReportOnlyValue(value: CrossOriginOpenerPolicyValue): Self = this.set("reportOnlyValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: CrossOriginOpenerPolicyValue): Self = this.set("value", value.asInstanceOf[js.Any])
    
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
