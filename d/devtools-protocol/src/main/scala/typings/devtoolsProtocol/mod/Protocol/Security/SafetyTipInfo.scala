package typings.devtoolsProtocol.mod.Protocol.Security

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SafetyTipInfo extends StObject {
  
  /**
    * The URL the safety tip suggested ("Did you mean?"). Only filled in for lookalike matches.
    */
  var safeUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Describes whether the page triggers any safety tips or reputation warnings. Default is unknown.
    */
  var safetyTipStatus: SafetyTipStatus
}
object SafetyTipInfo {
  
  @scala.inline
  def apply(safetyTipStatus: SafetyTipStatus): SafetyTipInfo = {
    val __obj = js.Dynamic.literal(safetyTipStatus = safetyTipStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafetyTipInfo]
  }
  
  @scala.inline
  implicit class SafetyTipInfoMutableBuilder[Self <: SafetyTipInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSafeUrl(value: String): Self = StObject.set(x, "safeUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafeUrlUndefined: Self = StObject.set(x, "safeUrl", js.undefined)
    
    @scala.inline
    def setSafetyTipStatus(value: SafetyTipStatus): Self = StObject.set(x, "safetyTipStatus", value.asInstanceOf[js.Any])
  }
}
