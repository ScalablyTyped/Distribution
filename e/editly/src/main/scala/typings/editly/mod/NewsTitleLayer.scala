package typings.editly.mod

import typings.editly.editlyStrings.`news-title`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewsTitleLayer
  extends StObject
     with BaseLayer
     with Layer {
  
  /**
  		 * Background color.
  		 * Defaults to '#d02a42'.
  		 */
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  /**
  		 * Set font (`.ttf`).
  		 * Defaults to system font.
  		 */
  var fontPath: js.UndefOr[String] = js.undefined
  
  /**
  		 * Position.
  		 */
  var position: js.UndefOr[Position] = js.undefined
  
  /**
  		 * Title text to show, keep it short.
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
  var type_NewsTitleLayer: `news-title`
}
object NewsTitleLayer {
  
  inline def apply(text: String): NewsTitleLayer = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("news-title")
    __obj.asInstanceOf[NewsTitleLayer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NewsTitleLayer] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setFontPath(value: String): Self = StObject.set(x, "fontPath", value.asInstanceOf[js.Any])
    
    inline def setFontPathUndefined: Self = StObject.set(x, "fontPath", js.undefined)
    
    inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
    
    inline def setType(value: `news-title`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
