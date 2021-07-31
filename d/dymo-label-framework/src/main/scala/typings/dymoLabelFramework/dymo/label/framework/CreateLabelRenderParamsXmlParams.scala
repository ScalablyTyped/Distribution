package typings.dymoLabelFramework.dymo.label.framework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLabelRenderParamsXmlParams extends StObject {
  
  /**  The direction of the label content on the label (left-to-right or right-to-left). Use the dymo.label.framework.FlowDirection enumeration to specify the value. */
  var flowDirection: js.UndefOr[FlowDirection] = js.undefined
  
  /** The color of the label. */
  var labelColor: js.UndefOr[Color] = js.undefined
  
  /**
    * If true, the PNG will be generated using the display resolution.
    * If false, the PNG will be generated using the printer resolution.
    * If the display resolution is used, the resulting PNG will be smaller.
    * Use the printer resolution if the resulting image will be zoomed. This will give the zoomed preview better quality.
    */
  var pngUseDisplayResolution: js.UndefOr[Boolean] = js.undefined
  
  /** The color of label shadow. */
  var shadowColor: js.UndefOr[Color] = js.undefined
  
  /** The shadow width in TWIPS. If '0' is specified, no shadow is rendered. */
  var shadowDepth: js.UndefOr[Double] = js.undefined
}
object CreateLabelRenderParamsXmlParams {
  
  @scala.inline
  def apply(): CreateLabelRenderParamsXmlParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLabelRenderParamsXmlParams]
  }
  
  @scala.inline
  implicit class CreateLabelRenderParamsXmlParamsMutableBuilder[Self <: CreateLabelRenderParamsXmlParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlowDirection(value: FlowDirection): Self = StObject.set(x, "flowDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowDirectionUndefined: Self = StObject.set(x, "flowDirection", js.undefined)
    
    @scala.inline
    def setLabelColor(value: Color): Self = StObject.set(x, "labelColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelColorUndefined: Self = StObject.set(x, "labelColor", js.undefined)
    
    @scala.inline
    def setPngUseDisplayResolution(value: Boolean): Self = StObject.set(x, "pngUseDisplayResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPngUseDisplayResolutionUndefined: Self = StObject.set(x, "pngUseDisplayResolution", js.undefined)
    
    @scala.inline
    def setShadowColor(value: Color): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowColorUndefined: Self = StObject.set(x, "shadowColor", js.undefined)
    
    @scala.inline
    def setShadowDepth(value: Double): Self = StObject.set(x, "shadowDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowDepthUndefined: Self = StObject.set(x, "shadowDepth", js.undefined)
  }
}
