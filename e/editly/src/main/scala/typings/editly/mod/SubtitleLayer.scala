package typings.editly.mod

import typings.editly.editlyStrings.subtitle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubtitleLayer
  extends StObject
     with BaseLayer
     with Layer {
  
  /**
  		 * WARNING: Undocumented feature!
  		 */
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  /**
  		 * Set font (`.ttf`).
  		 * Defaults to system font.
  		 */
  var fontPath: js.UndefOr[String] = js.undefined
  
  /**
  		 * Subtitle text to show.
  		 */
  var text: String
  
  /**
  		 * Text color.
  		 * Defaults to '#ffffff'.
  		 */
  var textColor: js.UndefOr[String] = js.undefined
  
  /**
  		 * Layer type.
  		 */
  @JSName("type")
  var type_SubtitleLayer: subtitle
}
object SubtitleLayer {
  
  inline def apply(text: String): SubtitleLayer = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("subtitle")
    __obj.asInstanceOf[SubtitleLayer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubtitleLayer] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setFontPath(value: String): Self = StObject.set(x, "fontPath", value.asInstanceOf[js.Any])
    
    inline def setFontPathUndefined: Self = StObject.set(x, "fontPath", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
    
    inline def setType(value: subtitle): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
