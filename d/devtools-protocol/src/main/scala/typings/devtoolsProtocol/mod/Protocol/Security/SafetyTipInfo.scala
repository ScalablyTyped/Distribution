package typings.devtoolsProtocol.mod.Protocol.Security

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SafetyTipInfo extends js.Object {
  
  /**
    * The URL the safety tip suggested ("Did you mean?"). Only filled in for lookalike matches.
    */
  var safeUrl: js.UndefOr[String] = js.native
  
  /**
    * Describes whether the page triggers any safety tips or reputation warnings. Default is unknown.
    */
  var safetyTipStatus: SafetyTipStatus = js.native
}
object SafetyTipInfo {
  
  @scala.inline
  def apply(safetyTipStatus: SafetyTipStatus): SafetyTipInfo = {
    val __obj = js.Dynamic.literal(safetyTipStatus = safetyTipStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafetyTipInfo]
  }
  
  @scala.inline
  implicit class SafetyTipInfoOps[Self <: SafetyTipInfo] (val x: Self) extends AnyVal {
    
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
    def setSafetyTipStatus(value: SafetyTipStatus): Self = this.set("safetyTipStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafeUrl(value: String): Self = this.set("safeUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSafeUrl: Self = this.set("safeUrl", js.undefined)
  }
}
