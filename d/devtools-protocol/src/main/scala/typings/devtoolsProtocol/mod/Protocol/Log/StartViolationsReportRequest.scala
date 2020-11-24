package typings.devtoolsProtocol.mod.Protocol.Log

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartViolationsReportRequest extends js.Object {
  
  /**
    * Configuration for violations.
    */
  var config: js.Array[ViolationSetting] = js.native
}
object StartViolationsReportRequest {
  
  @scala.inline
  def apply(config: js.Array[ViolationSetting]): StartViolationsReportRequest = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartViolationsReportRequest]
  }
  
  @scala.inline
  implicit class StartViolationsReportRequestOps[Self <: StartViolationsReportRequest] (val x: Self) extends AnyVal {
    
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
    def setConfigVarargs(value: ViolationSetting*): Self = this.set("config", js.Array(value :_*))
    
    @scala.inline
    def setConfig(value: js.Array[ViolationSetting]): Self = this.set("config", value.asInstanceOf[js.Any])
  }
}
