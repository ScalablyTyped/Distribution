package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.Blur
import typings.devextreme.anon.CornerRadius
import typings.devextreme.anon.Url
import typings.devextreme.mod.DevExpress.common.charts.AnnotationType
import typings.devextreme.mod.DevExpress.common.charts.TextOverflow
import typings.devextreme.mod.DevExpress.common.charts.WordWrap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseWidgetAnnotationConfig extends StObject {
  
  /**
    * Specifies whether users can drag and drop the annotation.
    */
  var allowDragging: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the length of the annotation&apos;s arrow in pixels.
    */
  var arrowLength: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the width of the annotation&apos;s arrow at its junction with the annotation rectangle.
    */
  var arrowWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Configures the appearance of the annotation&apos;s border.
    */
  var border: js.UndefOr[CornerRadius] = js.undefined
  
  /**
    * Specifies the color that fills the annotation.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * A container for custom data.
    */
  var data: js.UndefOr[Any] = js.undefined
  
  /**
    * Specifies the annotation&apos;s description in the tooltip.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the annotation&apos;s font properties. Applies to text annotations only.
    */
  var font: js.UndefOr[Font] = js.undefined
  
  /**
    * Specifies the annotation&apos;s height in pixels.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Configures the image to be displayed in the annotation. Applies only if the type is &apos;image&apos;.
    */
  var image: js.UndefOr[String | Url] = js.undefined
  
  /**
    * Moves the annotation horizontally.
    */
  var offsetX: js.UndefOr[Double] = js.undefined
  
  /**
    * Moves the annotation vertically.
    */
  var offsetY: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the annotation&apos;s opacity.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
    * Used with paddingTopBottom to generate an empty space around the annotation&apos;s text or image (specified in pixels).
    */
  var paddingLeftRight: js.UndefOr[Double] = js.undefined
  
  /**
    * Along with paddingLeftRight, generates an empty space around the annotation&apos;s text or image; specified in pixels.
    */
  var paddingTopBottom: js.UndefOr[Double] = js.undefined
  
  /**
    * Configures the annotation&apos;s shadows.
    */
  var shadow: js.UndefOr[Blur] = js.undefined
  
  /**
    * Specifies the annotation&apos;s text. Applies only if the type is &apos;text&apos;.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies what to do with the annotation&apos;s text when it overflows the allocated space after applying wordWrap: hide, truncate it and display an ellipsis, or do nothing.
    */
  var textOverflow: js.UndefOr[TextOverflow] = js.undefined
  
  /**
    * Specifies whether the annotation tooltip is enabled.
    */
  var tooltipEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the annotation displays text, an image, or a template. This is a required setting.
    */
  var `type`: js.UndefOr[AnnotationType] = js.undefined
  
  /**
    * Specifies the annotation&apos;s width in pixels.
    */
  var width: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies how to wrap the annotation&apos;s text if it does not fit into a single line.
    */
  var wordWrap: js.UndefOr[WordWrap] = js.undefined
  
  /**
    * Used with y to position the annotation&apos;s center at a specific pixel coordinate. (0, 0) is the upper left corner of the UI component.
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * Used with x to position the annotation&apos;s center at a specific pixel coordinate. (0, 0) is the upper left corner of the UI component.
    */
  var y: js.UndefOr[Double] = js.undefined
}
object BaseWidgetAnnotationConfig {
  
  inline def apply(): BaseWidgetAnnotationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseWidgetAnnotationConfig]
  }
  
  extension [Self <: BaseWidgetAnnotationConfig](x: Self) {
    
    inline def setAllowDragging(value: Boolean): Self = StObject.set(x, "allowDragging", value.asInstanceOf[js.Any])
    
    inline def setAllowDraggingUndefined: Self = StObject.set(x, "allowDragging", js.undefined)
    
    inline def setArrowLength(value: Double): Self = StObject.set(x, "arrowLength", value.asInstanceOf[js.Any])
    
    inline def setArrowLengthUndefined: Self = StObject.set(x, "arrowLength", js.undefined)
    
    inline def setArrowWidth(value: Double): Self = StObject.set(x, "arrowWidth", value.asInstanceOf[js.Any])
    
    inline def setArrowWidthUndefined: Self = StObject.set(x, "arrowWidth", js.undefined)
    
    inline def setBorder(value: CornerRadius): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFont(value: Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setImage(value: String | Url): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setPaddingLeftRight(value: Double): Self = StObject.set(x, "paddingLeftRight", value.asInstanceOf[js.Any])
    
    inline def setPaddingLeftRightUndefined: Self = StObject.set(x, "paddingLeftRight", js.undefined)
    
    inline def setPaddingTopBottom(value: Double): Self = StObject.set(x, "paddingTopBottom", value.asInstanceOf[js.Any])
    
    inline def setPaddingTopBottomUndefined: Self = StObject.set(x, "paddingTopBottom", js.undefined)
    
    inline def setShadow(value: Blur): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextOverflow(value: TextOverflow): Self = StObject.set(x, "textOverflow", value.asInstanceOf[js.Any])
    
    inline def setTextOverflowUndefined: Self = StObject.set(x, "textOverflow", js.undefined)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTooltipEnabled(value: Boolean): Self = StObject.set(x, "tooltipEnabled", value.asInstanceOf[js.Any])
    
    inline def setTooltipEnabledUndefined: Self = StObject.set(x, "tooltipEnabled", js.undefined)
    
    inline def setType(value: AnnotationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWordWrap(value: WordWrap): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
    
    inline def setWordWrapUndefined: Self = StObject.set(x, "wordWrap", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
