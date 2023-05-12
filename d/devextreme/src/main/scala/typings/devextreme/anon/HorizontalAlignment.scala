package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.common.VerticalEdge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HorizontalAlignment extends StObject {
  
  /**
    * Specifies the legend title&apos;s font properties.
    */
  var font: js.UndefOr[typings.devextreme.mod.DevExpress.viz.Font] = js.undefined
  
  /**
    * Along with verticalAlignment, specifies the legend title&apos;s position.
    */
  var horizontalAlignment: js.UndefOr[typings.devextreme.mod.DevExpress.common.HorizontalAlignment] = js.undefined
  
  /**
    * Generates space around the legend title.
    */
  var margin: js.UndefOr[Bottom] = js.undefined
  
  /**
    * Reserves a pixel-measured space for the legend title.
    */
  var placeholderSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Configures the legend subtitle. The subtitle appears only if the title is specified.
    */
  var subtitle: js.UndefOr[Font | String] = js.undefined
  
  /**
    * Specifies the legend title&apos;s text.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the legend title&apos;s vertical alignment.
    */
  var verticalAlignment: js.UndefOr[VerticalEdge] = js.undefined
}
object HorizontalAlignment {
  
  inline def apply(): HorizontalAlignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HorizontalAlignment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HorizontalAlignment] (val x: Self) extends AnyVal {
    
    inline def setFont(value: typings.devextreme.mod.DevExpress.viz.Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setHorizontalAlignment(value: typings.devextreme.mod.DevExpress.common.HorizontalAlignment): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    inline def setMargin(value: Bottom): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setPlaceholderSize(value: Double): Self = StObject.set(x, "placeholderSize", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderSizeUndefined: Self = StObject.set(x, "placeholderSize", js.undefined)
    
    inline def setSubtitle(value: Font | String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setVerticalAlignment(value: VerticalEdge): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
  }
}
