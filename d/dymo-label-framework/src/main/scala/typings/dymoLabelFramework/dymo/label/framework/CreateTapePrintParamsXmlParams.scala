package typings.dymoLabelFramework.dymo.label.framework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTapePrintParamsXmlParams extends StObject {
  
  /** The label alignment on the tape. Use the dymo.label.framework.TapeAlignment enumeration to specify the value. */
  var alignment: js.UndefOr[TapeAlignment] = js.undefined
  
  /** The number of copies to print. */
  var copies: js.UndefOr[Double] = js.undefined
  
  /** The cut mode (if auto-cut is supported by the printer). Use the dymo.label.framework.TapeCutMode enumeration to specify the value. */
  var cutMode: js.UndefOr[TapeCutMode] = js.undefined
  
  /** The direction of the label content on the label (left-to-right or right-to-left). Use the dymo.label.framework.FlowDirection enumeration to specify the value. */
  var flowDirection: js.UndefOr[FlowDirection] = js.undefined
  
  /** The print job title/description. */
  var jobTitle: js.UndefOr[String] = js.undefined
}
object CreateTapePrintParamsXmlParams {
  
  inline def apply(): CreateTapePrintParamsXmlParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTapePrintParamsXmlParams]
  }
  
  extension [Self <: CreateTapePrintParamsXmlParams](x: Self) {
    
    inline def setAlignment(value: TapeAlignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setCopies(value: Double): Self = StObject.set(x, "copies", value.asInstanceOf[js.Any])
    
    inline def setCopiesUndefined: Self = StObject.set(x, "copies", js.undefined)
    
    inline def setCutMode(value: TapeCutMode): Self = StObject.set(x, "cutMode", value.asInstanceOf[js.Any])
    
    inline def setCutModeUndefined: Self = StObject.set(x, "cutMode", js.undefined)
    
    inline def setFlowDirection(value: FlowDirection): Self = StObject.set(x, "flowDirection", value.asInstanceOf[js.Any])
    
    inline def setFlowDirectionUndefined: Self = StObject.set(x, "flowDirection", js.undefined)
    
    inline def setJobTitle(value: String): Self = StObject.set(x, "jobTitle", value.asInstanceOf[js.Any])
    
    inline def setJobTitleUndefined: Self = StObject.set(x, "jobTitle", js.undefined)
  }
}
