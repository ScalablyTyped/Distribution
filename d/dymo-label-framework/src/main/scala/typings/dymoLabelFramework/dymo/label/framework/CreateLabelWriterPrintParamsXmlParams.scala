package typings.dymoLabelFramework.dymo.label.framework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLabelWriterPrintParamsXmlParams extends StObject {
  
  /** The number of copies to print. */
  var copies: js.UndefOr[Double] = js.undefined
  
  /** The direction of the label content on the label (left-to-right or right-to-left). Use the dymo.label.framework.FlowDirection enumeration to specify the value. */
  var flowDirection: js.UndefOr[FlowDirection] = js.undefined
  
  /** The print job title/description. */
  var jobTitle: js.UndefOr[String] = js.undefined
  
  /** The print quality. Use the dymo.label.framework.LabelWriterPrintQuality enumeration to specify the value. */
  var printQuality: js.UndefOr[LabelWriterPrintQuality] = js.undefined
  
  /** The roll to print to if the printer is a TwinTurbo printer. Use the dymo.label.framework.TwinTurboRoll enumeration to specify the value. */
  var twinTurboRoll: js.UndefOr[TwinTurboRoll] = js.undefined
}
object CreateLabelWriterPrintParamsXmlParams {
  
  @scala.inline
  def apply(): CreateLabelWriterPrintParamsXmlParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLabelWriterPrintParamsXmlParams]
  }
  
  @scala.inline
  implicit class CreateLabelWriterPrintParamsXmlParamsMutableBuilder[Self <: CreateLabelWriterPrintParamsXmlParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopies(value: Double): Self = StObject.set(x, "copies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopiesUndefined: Self = StObject.set(x, "copies", js.undefined)
    
    @scala.inline
    def setFlowDirection(value: FlowDirection): Self = StObject.set(x, "flowDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowDirectionUndefined: Self = StObject.set(x, "flowDirection", js.undefined)
    
    @scala.inline
    def setJobTitle(value: String): Self = StObject.set(x, "jobTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobTitleUndefined: Self = StObject.set(x, "jobTitle", js.undefined)
    
    @scala.inline
    def setPrintQuality(value: LabelWriterPrintQuality): Self = StObject.set(x, "printQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintQualityUndefined: Self = StObject.set(x, "printQuality", js.undefined)
    
    @scala.inline
    def setTwinTurboRoll(value: TwinTurboRoll): Self = StObject.set(x, "twinTurboRoll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwinTurboRollUndefined: Self = StObject.set(x, "twinTurboRoll", js.undefined)
  }
}
