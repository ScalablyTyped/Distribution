package typings.dymoLabelFramework.dymo.label.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateLabelWriterPrintParamsXmlParams extends js.Object {
  
  /** The number of copies to print. */
  var copies: js.UndefOr[Double] = js.native
  
  /** The direction of the label content on the label (left-to-right or right-to-left). Use the dymo.label.framework.FlowDirection enumeration to specify the value. */
  var flowDirection: js.UndefOr[FlowDirection] = js.native
  
  /** The print job title/description. */
  var jobTitle: js.UndefOr[String] = js.native
  
  /** The print quality. Use the dymo.label.framework.LabelWriterPrintQuality enumeration to specify the value. */
  var printQuality: js.UndefOr[LabelWriterPrintQuality] = js.native
  
  /** The roll to print to if the printer is a TwinTurbo printer. Use the dymo.label.framework.TwinTurboRoll enumeration to specify the value. */
  var twinTurboRoll: js.UndefOr[TwinTurboRoll] = js.native
}
object CreateLabelWriterPrintParamsXmlParams {
  
  @scala.inline
  def apply(): CreateLabelWriterPrintParamsXmlParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLabelWriterPrintParamsXmlParams]
  }
  
  @scala.inline
  implicit class CreateLabelWriterPrintParamsXmlParamsOps[Self <: CreateLabelWriterPrintParamsXmlParams] (val x: Self) extends AnyVal {
    
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
    def setCopies(value: Double): Self = this.set("copies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopies: Self = this.set("copies", js.undefined)
    
    @scala.inline
    def setFlowDirection(value: FlowDirection): Self = this.set("flowDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlowDirection: Self = this.set("flowDirection", js.undefined)
    
    @scala.inline
    def setJobTitle(value: String): Self = this.set("jobTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobTitle: Self = this.set("jobTitle", js.undefined)
    
    @scala.inline
    def setPrintQuality(value: LabelWriterPrintQuality): Self = this.set("printQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrintQuality: Self = this.set("printQuality", js.undefined)
    
    @scala.inline
    def setTwinTurboRoll(value: TwinTurboRoll): Self = this.set("twinTurboRoll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTwinTurboRoll: Self = this.set("twinTurboRoll", js.undefined)
  }
}
