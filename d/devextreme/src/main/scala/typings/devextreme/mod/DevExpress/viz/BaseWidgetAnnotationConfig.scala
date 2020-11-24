package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.Blur
import typings.devextreme.anon.CornerRadius
import typings.devextreme.anon.Url
import typings.devextreme.devextremeStrings.breakWord
import typings.devextreme.devextremeStrings.custom
import typings.devextreme.devextremeStrings.ellipsis
import typings.devextreme.devextremeStrings.hide
import typings.devextreme.devextremeStrings.image
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.normal
import typings.devextreme.devextremeStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseWidgetAnnotationConfig extends js.Object {
  
  /**
    * [descr:BaseWidgetAnnotationConfig.allowDragging]
    */
  var allowDragging: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:BaseWidgetAnnotationConfig.arrowLength]
    */
  var arrowLength: js.UndefOr[Double] = js.native
  
  /**
    * [descr:BaseWidgetAnnotationConfig.arrowWidth]
    */
  var arrowWidth: js.UndefOr[Double] = js.native
  
  /**
    * [descr:BaseWidgetAnnotationConfig.border]
    */
  var border: js.UndefOr[CornerRadius] = js.native
  
  /**
    * [descr:BaseWidgetAnnotationConfig.color]
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    * [descr:BaseWidgetAnnotationConfig.data]
    */
  var data: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:BaseWidgetAnnotationConfig.description]
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * [descr:BaseWidgetAnnotationConfig.font]
    */
  var font: js.UndefOr[Font] = js.native
  
  /**
    * [descr:BaseWidgetAnnotationConfig.height]
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * [descr:BaseWidgetAnnotationConfig.image]
    */
  var image: js.UndefOr[String | Url] = js.native
  
  /**
    * [descr:BaseWidgetAnnotationConfig.offsetX]
    */
  var offsetX: js.UndefOr[Double] = js.native
  
  /**
    * [descr:BaseWidgetAnnotationConfig.offsetY]
    */
  var offsetY: js.UndefOr[Double] = js.native
  
  /**
    * [descr:BaseWidgetAnnotationConfig.opacity]
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /**
    * [descr:BaseWidgetAnnotationConfig.paddingLeftRight]
    */
  var paddingLeftRight: js.UndefOr[Double] = js.native
  
  /**
    * [descr:BaseWidgetAnnotationConfig.paddingTopBottom]
    */
  var paddingTopBottom: js.UndefOr[Double] = js.native
  
  /**
    * [descr:BaseWidgetAnnotationConfig.shadow]
    */
  var shadow: js.UndefOr[Blur] = js.native
  
  /**
    * [descr:BaseWidgetAnnotationConfig.text]
    */
  var text: js.UndefOr[String] = js.native
  
  /**
    * [descr:BaseWidgetAnnotationConfig.textOverflow]
    */
  var textOverflow: js.UndefOr[ellipsis | hide | none] = js.native
  
  /**
    * [descr:BaseWidgetAnnotationConfig.tooltipEnabled]
    */
  var tooltipEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:BaseWidgetAnnotationConfig.type]
    */
  var `type`: js.UndefOr[text | image | custom] = js.native
  
  /**
    * [descr:BaseWidgetAnnotationConfig.width]
    */
  var width: js.UndefOr[Double] = js.native
  
  /**
    * [descr:BaseWidgetAnnotationConfig.wordWrap]
    */
  var wordWrap: js.UndefOr[normal | breakWord | none] = js.native
  
  /**
    * [descr:BaseWidgetAnnotationConfig.x]
    */
  var x: js.UndefOr[Double] = js.native
  
  /**
    * [descr:BaseWidgetAnnotationConfig.y]
    */
  var y: js.UndefOr[Double] = js.native
}
object BaseWidgetAnnotationConfig {
  
  @scala.inline
  def apply(): BaseWidgetAnnotationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseWidgetAnnotationConfig]
  }
  
  @scala.inline
  implicit class BaseWidgetAnnotationConfigOps[Self <: BaseWidgetAnnotationConfig] (val x: Self) extends AnyVal {
    
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
    def setAllowDragging(value: Boolean): Self = this.set("allowDragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDragging: Self = this.set("allowDragging", js.undefined)
    
    @scala.inline
    def setArrowLength(value: Double): Self = this.set("arrowLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowLength: Self = this.set("arrowLength", js.undefined)
    
    @scala.inline
    def setArrowWidth(value: Double): Self = this.set("arrowWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowWidth: Self = this.set("arrowWidth", js.undefined)
    
    @scala.inline
    def setBorder(value: CornerRadius): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setFont(value: Font): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setImage(value: String | Url): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetX: Self = this.set("offsetX", js.undefined)
    
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetY: Self = this.set("offsetY", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setPaddingLeftRight(value: Double): Self = this.set("paddingLeftRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingLeftRight: Self = this.set("paddingLeftRight", js.undefined)
    
    @scala.inline
    def setPaddingTopBottom(value: Double): Self = this.set("paddingTopBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingTopBottom: Self = this.set("paddingTopBottom", js.undefined)
    
    @scala.inline
    def setShadow(value: Blur): Self = this.set("shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadow: Self = this.set("shadow", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTextOverflow(value: ellipsis | hide | none): Self = this.set("textOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextOverflow: Self = this.set("textOverflow", js.undefined)
    
    @scala.inline
    def setTooltipEnabled(value: Boolean): Self = this.set("tooltipEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipEnabled: Self = this.set("tooltipEnabled", js.undefined)
    
    @scala.inline
    def setType(value: text | image | custom): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setWordWrap(value: normal | breakWord | none): Self = this.set("wordWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWordWrap: Self = this.set("wordWrap", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}
