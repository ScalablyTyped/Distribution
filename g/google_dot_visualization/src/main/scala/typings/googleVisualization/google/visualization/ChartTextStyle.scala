package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartTextStyle extends StObject {
  
  var auraColor: js.UndefOr[String] = js.undefined
  
  var bold: js.UndefOr[Boolean] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var fontName: js.UndefOr[String] = js.undefined
  
  var fontSize: js.UndefOr[Double] = js.undefined
  
  var italic: js.UndefOr[Boolean] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
}
object ChartTextStyle {
  
  @scala.inline
  def apply(): ChartTextStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartTextStyle]
  }
  
  @scala.inline
  implicit class ChartTextStyleMutableBuilder[Self <: ChartTextStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuraColor(value: String): Self = StObject.set(x, "auraColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuraColorUndefined: Self = StObject.set(x, "auraColor", js.undefined)
    
    @scala.inline
    def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setFontName(value: String): Self = StObject.set(x, "fontName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontNameUndefined: Self = StObject.set(x, "fontName", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
  }
}
