package typings.echarts.echarts

import typings.echarts.echarts.EChartOption.TextStyleWithRich
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EChartTitleOption extends js.Object {
  
  var backgroundColor: js.UndefOr[String] = js.native
  
  var borderColor: js.UndefOr[String] = js.native
  
  var borderRadius: js.UndefOr[Double | js.Array[Double]] = js.native
  
  var borderWidth: js.UndefOr[Double] = js.native
  
  var bottom: js.UndefOr[String | Double] = js.native
  
  var itemGap: js.UndefOr[Double] = js.native
  
  var left: js.UndefOr[String | Double] = js.native
  
  var link: js.UndefOr[String] = js.native
  
  /**
    * Title space around content. The unit is `px`.
    * Default values for each position are 5.
    * And they can be set to different values with left, right, top, and bottom.
    */
  var padding: js.UndefOr[Double | js.Array[Double]] = js.native
  
  var right: js.UndefOr[String | Double] = js.native
  
  var shadowBlur: js.UndefOr[Double] = js.native
  
  var shadowColor: js.UndefOr[Double] = js.native
  
  var shadowOffsetX: js.UndefOr[Double] = js.native
  
  var shadowOffsetY: js.UndefOr[Double] = js.native
  
  var show: js.UndefOr[Boolean] = js.native
  
  var sublink: js.UndefOr[String] = js.native
  
  var subtarget: js.UndefOr[String] = js.native
  
  var subtext: js.UndefOr[String] = js.native
  
  var subtextStyle: js.UndefOr[TextStyleWithRich] = js.native
  
  var target: js.UndefOr[String] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var textAlign: js.UndefOr[String] = js.native
  
  var textStyle: js.UndefOr[TextStyleWithRich] = js.native
  
  var textVerticalAlign: js.UndefOr[String] = js.native
  
  var top: js.UndefOr[String | Double] = js.native
  
  var triggerEvent: js.UndefOr[Boolean] = js.native
  
  var z: js.UndefOr[Double] = js.native
  
  var zlevel: js.UndefOr[Double] = js.native
}
object EChartTitleOption {
  
  @scala.inline
  def apply(): EChartTitleOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EChartTitleOption]
  }
  
  @scala.inline
  implicit class EChartTitleOptionOps[Self <: EChartTitleOption] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    
    @scala.inline
    def setBorderRadiusVarargs(value: Double*): Self = this.set("borderRadius", js.Array(value :_*))
    
    @scala.inline
    def setBorderRadius(value: Double | js.Array[Double]): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderRadius: Self = this.set("borderRadius", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    
    @scala.inline
    def setBottom(value: String | Double): Self = this.set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    
    @scala.inline
    def setItemGap(value: Double): Self = this.set("itemGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemGap: Self = this.set("itemGap", js.undefined)
    
    @scala.inline
    def setLeft(value: String | Double): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    
    @scala.inline
    def setPaddingVarargs(value: Double*): Self = this.set("padding", js.Array(value :_*))
    
    @scala.inline
    def setPadding(value: Double | js.Array[Double]): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setRight(value: String | Double): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    
    @scala.inline
    def setShadowBlur(value: Double): Self = this.set("shadowBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowBlur: Self = this.set("shadowBlur", js.undefined)
    
    @scala.inline
    def setShadowColor(value: Double): Self = this.set("shadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowColor: Self = this.set("shadowColor", js.undefined)
    
    @scala.inline
    def setShadowOffsetX(value: Double): Self = this.set("shadowOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowOffsetX: Self = this.set("shadowOffsetX", js.undefined)
    
    @scala.inline
    def setShadowOffsetY(value: Double): Self = this.set("shadowOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowOffsetY: Self = this.set("shadowOffsetY", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setSublink(value: String): Self = this.set("sublink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSublink: Self = this.set("sublink", js.undefined)
    
    @scala.inline
    def setSubtarget(value: String): Self = this.set("subtarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtarget: Self = this.set("subtarget", js.undefined)
    
    @scala.inline
    def setSubtext(value: String): Self = this.set("subtext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtext: Self = this.set("subtext", js.undefined)
    
    @scala.inline
    def setSubtextStyle(value: TextStyleWithRich): Self = this.set("subtextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtextStyle: Self = this.set("subtextStyle", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTextAlign(value: String): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    
    @scala.inline
    def setTextStyle(value: TextStyleWithRich): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
    
    @scala.inline
    def setTextVerticalAlign(value: String): Self = this.set("textVerticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextVerticalAlign: Self = this.set("textVerticalAlign", js.undefined)
    
    @scala.inline
    def setTop(value: String | Double): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    
    @scala.inline
    def setTriggerEvent(value: Boolean): Self = this.set("triggerEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerEvent: Self = this.set("triggerEvent", js.undefined)
    
    @scala.inline
    def setZ(value: Double): Self = this.set("z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZ: Self = this.set("z", js.undefined)
    
    @scala.inline
    def setZlevel(value: Double): Self = this.set("zlevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZlevel: Self = this.set("zlevel", js.undefined)
  }
}
