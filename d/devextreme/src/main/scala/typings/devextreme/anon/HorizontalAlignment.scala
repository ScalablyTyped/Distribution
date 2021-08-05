package typings.devextreme.anon

import typings.devextreme.devextremeStrings.bottom
import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HorizontalAlignment extends StObject {
  
  var font: js.UndefOr[typings.devextreme.mod.DevExpress.viz.Font] = js.undefined
  
  var horizontalAlignment: js.UndefOr[center | left | right] = js.undefined
  
  var margin: js.UndefOr[Bottom] = js.undefined
  
  var placeholderSize: js.UndefOr[Double] = js.undefined
  
  var subtitle: js.UndefOr[Font | String] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var verticalAlignment: js.UndefOr[bottom | top] = js.undefined
}
object HorizontalAlignment {
  
  inline def apply(): HorizontalAlignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HorizontalAlignment]
  }
  
  extension [Self <: HorizontalAlignment](x: Self) {
    
    inline def setFont(value: typings.devextreme.mod.DevExpress.viz.Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setHorizontalAlignment(value: center | left | right): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    inline def setMargin(value: Bottom): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setPlaceholderSize(value: Double): Self = StObject.set(x, "placeholderSize", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderSizeUndefined: Self = StObject.set(x, "placeholderSize", js.undefined)
    
    inline def setSubtitle(value: Font | String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setVerticalAlignment(value: bottom | top): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
  }
}
