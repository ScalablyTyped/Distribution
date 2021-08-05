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
  
  inline def apply(safetyTipStatus: SafetyTipStatus): SafetyTipInfo = {
    val __obj = js.Dynamic.literal(safetyTipStatus = safetyTipStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafetyTipInfo]
  }
  
  extension [Self <: SafetyTipInfo](x: Self) {
    
    inline def setSafeUrl(value: String): Self = StObject.set(x, "safeUrl", value.asInstanceOf[js.Any])
    
    inline def setSafeUrlUndefined: Self = StObject.set(x, "safeUrl", js.undefined)
    
    inline def setSafetyTipStatus(value: SafetyTipStatus): Self = StObject.set(x, "safetyTipStatus", value.asInstanceOf[js.Any])
  }
}
