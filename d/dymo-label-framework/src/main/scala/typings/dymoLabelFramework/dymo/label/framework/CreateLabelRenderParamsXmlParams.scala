package typings.dymoLabelFramework.dymo.label.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateLabelRenderParamsXmlParams extends js.Object {
  
  /**  The direction of the label content on the label (left-to-right or right-to-left). Use the dymo.label.framework.FlowDirection enumeration to specify the value. */
  var flowDirection: js.UndefOr[FlowDirection] = js.native
  
  /** The color of the label. */
  var labelColor: js.UndefOr[Color] = js.native
  
  /**
    * If true, the PNG will be generated using the display resolution.
    * If false, the PNG will be generated using the printer resolution.
    * If the display resolution is used, the resulting PNG will be smaller.
    * Use the printer resolution if the resulting image will be zoomed. This will give the zoomed preview better quality.
    */
  var pngUseDisplayResolution: js.UndefOr[Boolean] = js.native
  
  /** The color of label shadow. */
  var shadowColor: js.UndefOr[Color] = js.native
  
  /** The shadow width in TWIPS. If '0' is specified, no shadow is rendered. */
  var shadowDepth: js.UndefOr[Double] = js.native
}
object CreateLabelRenderParamsXmlParams {
  
  @scala.inline
  def apply(): CreateLabelRenderParamsXmlParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLabelRenderParamsXmlParams]
  }
  
  @scala.inline
  implicit class CreateLabelRenderParamsXmlParamsOps[Self <: CreateLabelRenderParamsXmlParams] (val x: Self) extends AnyVal {
    
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
    def setFlowDirection(value: FlowDirection): Self = this.set("flowDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlowDirection: Self = this.set("flowDirection", js.undefined)
    
    @scala.inline
    def setLabelColor(value: Color): Self = this.set("labelColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelColor: Self = this.set("labelColor", js.undefined)
    
    @scala.inline
    def setPngUseDisplayResolution(value: Boolean): Self = this.set("pngUseDisplayResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePngUseDisplayResolution: Self = this.set("pngUseDisplayResolution", js.undefined)
    
    @scala.inline
    def setShadowColor(value: Color): Self = this.set("shadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowColor: Self = this.set("shadowColor", js.undefined)
    
    @scala.inline
    def setShadowDepth(value: Double): Self = this.set("shadowDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowDepth: Self = this.set("shadowDepth", js.undefined)
  }
}
