package typings.devtoolsProtocol.mod.Protocol.Audits

import typings.devtoolsProtocol.mod.Protocol.DOM.BackendNodeId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LowTextContrastIssueDetails extends StObject {
  
  var contrastRatio: Double
  
  var fontSize: String
  
  var fontWeight: String
  
  var thresholdAA: Double
  
  var thresholdAAA: Double
  
  var violatingNodeId: BackendNodeId
  
  var violatingNodeSelector: String
}
object LowTextContrastIssueDetails {
  
  inline def apply(
    contrastRatio: Double,
    fontSize: String,
    fontWeight: String,
    thresholdAA: Double,
    thresholdAAA: Double,
    violatingNodeId: BackendNodeId,
    violatingNodeSelector: String
  ): LowTextContrastIssueDetails = {
    val __obj = js.Dynamic.literal(contrastRatio = contrastRatio.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], thresholdAA = thresholdAA.asInstanceOf[js.Any], thresholdAAA = thresholdAAA.asInstanceOf[js.Any], violatingNodeId = violatingNodeId.asInstanceOf[js.Any], violatingNodeSelector = violatingNodeSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[LowTextContrastIssueDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LowTextContrastIssueDetails] (val x: Self) extends AnyVal {
    
    inline def setContrastRatio(value: Double): Self = StObject.set(x, "contrastRatio", value.asInstanceOf[js.Any])
    
    inline def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setThresholdAA(value: Double): Self = StObject.set(x, "thresholdAA", value.asInstanceOf[js.Any])
    
    inline def setThresholdAAA(value: Double): Self = StObject.set(x, "thresholdAAA", value.asInstanceOf[js.Any])
    
    inline def setViolatingNodeId(value: BackendNodeId): Self = StObject.set(x, "violatingNodeId", value.asInstanceOf[js.Any])
    
    inline def setViolatingNodeSelector(value: String): Self = StObject.set(x, "violatingNodeSelector", value.asInstanceOf[js.Any])
  }
}
