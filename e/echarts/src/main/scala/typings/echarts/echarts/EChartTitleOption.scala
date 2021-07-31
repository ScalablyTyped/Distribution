package typings.echarts.echarts

import typings.echarts.echarts.EChartOption.TextStyleWithRich
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EChartTitleOption extends StObject {
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var borderColor: js.UndefOr[String] = js.undefined
  
  var borderRadius: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  var borderWidth: js.UndefOr[Double] = js.undefined
  
  var bottom: js.UndefOr[String | Double] = js.undefined
  
  var itemGap: js.UndefOr[Double] = js.undefined
  
  var left: js.UndefOr[String | Double] = js.undefined
  
  var link: js.UndefOr[String] = js.undefined
  
  /**
    * Title space around content. The unit is `px`.
    * Default values for each position are 5.
    * And they can be set to different values with left, right, top, and bottom.
    */
  var padding: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  var right: js.UndefOr[String | Double] = js.undefined
  
  var shadowBlur: js.UndefOr[Double] = js.undefined
  
  var shadowColor: js.UndefOr[Double] = js.undefined
  
  var shadowOffsetX: js.UndefOr[Double] = js.undefined
  
  var shadowOffsetY: js.UndefOr[Double] = js.undefined
  
  var show: js.UndefOr[Boolean] = js.undefined
  
  var sublink: js.UndefOr[String] = js.undefined
  
  var subtarget: js.UndefOr[String] = js.undefined
  
  var subtext: js.UndefOr[String] = js.undefined
  
  var subtextStyle: js.UndefOr[TextStyleWithRich] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var textAlign: js.UndefOr[String] = js.undefined
  
  var textStyle: js.UndefOr[TextStyleWithRich] = js.undefined
  
  var textVerticalAlign: js.UndefOr[String] = js.undefined
  
  var top: js.UndefOr[String | Double] = js.undefined
  
  var triggerEvent: js.UndefOr[Boolean] = js.undefined
  
  var z: js.UndefOr[Double] = js.undefined
  
  var zlevel: js.UndefOr[Double] = js.undefined
}
object EChartTitleOption {
  
  @scala.inline
  def apply(): EChartTitleOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EChartTitleOption]
  }
  
  @scala.inline
  implicit class EChartTitleOptionMutableBuilder[Self <: EChartTitleOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    @scala.inline
    def setBorderRadius(value: Double | js.Array[Double]): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    @scala.inline
    def setBorderRadiusVarargs(value: Double*): Self = StObject.set(x, "borderRadius", js.Array(value :_*))
    
    @scala.inline
    def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    @scala.inline
    def setBottom(value: String | Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def setItemGap(value: Double): Self = StObject.set(x, "itemGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemGapUndefined: Self = StObject.set(x, "itemGap", js.undefined)
    
    @scala.inline
    def setLeft(value: String | Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    @scala.inline
    def setPadding(value: Double | js.Array[Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value :_*))
    
    @scala.inline
    def setRight(value: String | Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    @scala.inline
    def setShadowBlur(value: Double): Self = StObject.set(x, "shadowBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowBlurUndefined: Self = StObject.set(x, "shadowBlur", js.undefined)
    
    @scala.inline
    def setShadowColor(value: Double): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowColorUndefined: Self = StObject.set(x, "shadowColor", js.undefined)
    
    @scala.inline
    def setShadowOffsetX(value: Double): Self = StObject.set(x, "shadowOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowOffsetXUndefined: Self = StObject.set(x, "shadowOffsetX", js.undefined)
    
    @scala.inline
    def setShadowOffsetY(value: Double): Self = StObject.set(x, "shadowOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowOffsetYUndefined: Self = StObject.set(x, "shadowOffsetY", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setSublink(value: String): Self = StObject.set(x, "sublink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSublinkUndefined: Self = StObject.set(x, "sublink", js.undefined)
    
    @scala.inline
    def setSubtarget(value: String): Self = StObject.set(x, "subtarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtargetUndefined: Self = StObject.set(x, "subtarget", js.undefined)
    
    @scala.inline
    def setSubtext(value: String): Self = StObject.set(x, "subtext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtextStyle(value: TextStyleWithRich): Self = StObject.set(x, "subtextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtextStyleUndefined: Self = StObject.set(x, "subtextStyle", js.undefined)
    
    @scala.inline
    def setSubtextUndefined: Self = StObject.set(x, "subtext", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    @scala.inline
    def setTextStyle(value: TextStyleWithRich): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTextVerticalAlign(value: String): Self = StObject.set(x, "textVerticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextVerticalAlignUndefined: Self = StObject.set(x, "textVerticalAlign", js.undefined)
    
    @scala.inline
    def setTop(value: String | Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    @scala.inline
    def setTriggerEvent(value: Boolean): Self = StObject.set(x, "triggerEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerEventUndefined: Self = StObject.set(x, "triggerEvent", js.undefined)
    
    @scala.inline
    def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZUndefined: Self = StObject.set(x, "z", js.undefined)
    
    @scala.inline
    def setZlevel(value: Double): Self = StObject.set(x, "zlevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZlevelUndefined: Self = StObject.set(x, "zlevel", js.undefined)
  }
}
