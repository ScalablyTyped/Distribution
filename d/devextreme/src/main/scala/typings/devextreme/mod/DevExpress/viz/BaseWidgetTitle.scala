package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.BottomLeft
import typings.devextreme.anon.Offset
import typings.devextreme.mod.DevExpress.common.HorizontalAlignment
import typings.devextreme.mod.DevExpress.common.VerticalEdge
import typings.devextreme.mod.DevExpress.common.charts.TextOverflow
import typings.devextreme.mod.DevExpress.common.charts.WordWrap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseWidgetTitle extends StObject {
  
  /**
    * Specifies font properties for the title.
    */
  var font: js.UndefOr[Font] = js.undefined
  
  /**
    * Specifies the title&apos;s alignment in a horizontal direction.
    */
  var horizontalAlignment: js.UndefOr[HorizontalAlignment] = js.undefined
  
  /**
    * Generates space around the title.
    */
  var margin: js.UndefOr[Double | BottomLeft] = js.undefined
  
  /**
    * Reserves a pixel-measured space for the title.
    */
  var placeholderSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Configures the UI component&apos;s subtitle.
    */
  var subtitle: js.UndefOr[Offset | String] = js.undefined
  
  /**
    * Specifies the title&apos;s text.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies what to do with the title when it overflows the allocated space after applying wordWrap: hide, truncate it and display an ellipsis, or do nothing.
    */
  var textOverflow: js.UndefOr[TextOverflow] = js.undefined
  
  /**
    * Specifies the title&apos;s alignment in a vertical direction.
    */
  var verticalAlignment: js.UndefOr[VerticalEdge] = js.undefined
  
  /**
    * Specifies how to wrap the title if it does not fit into a single line.
    */
  var wordWrap: js.UndefOr[WordWrap] = js.undefined
}
object BaseWidgetTitle {
  
  inline def apply(): BaseWidgetTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseWidgetTitle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseWidgetTitle] (val x: Self) extends AnyVal {
    
    inline def setFont(value: Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setHorizontalAlignment(value: HorizontalAlignment): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    inline def setMargin(value: Double | BottomLeft): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setPlaceholderSize(value: Double): Self = StObject.set(x, "placeholderSize", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderSizeUndefined: Self = StObject.set(x, "placeholderSize", js.undefined)
    
    inline def setSubtitle(value: Offset | String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextOverflow(value: TextOverflow): Self = StObject.set(x, "textOverflow", value.asInstanceOf[js.Any])
    
    inline def setTextOverflowUndefined: Self = StObject.set(x, "textOverflow", js.undefined)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setVerticalAlignment(value: VerticalEdge): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
    
    inline def setWordWrap(value: WordWrap): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
    
    inline def setWordWrapUndefined: Self = StObject.set(x, "wordWrap", js.undefined)
  }
}
