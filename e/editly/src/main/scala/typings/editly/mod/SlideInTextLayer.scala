package typings.editly.mod

import typings.editly.editlyStrings.`slide-in-text`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlideInTextLayer
  extends StObject
     with BaseLayer
     with Layer {
  
  /**
  		 * Char spacing.
  		 */
  var charSpacing: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Color.
  		 */
  var color: js.UndefOr[String] = js.undefined
  
  /**
  		 * Set font (`.ttf`).
  		 * Defaults to system font.
  		 */
  var fontPath: js.UndefOr[String] = js.undefined
  
  /**
  		 * Font size.
  		 */
  var fontSize: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Position.
  		 */
  var position: js.UndefOr[Position] = js.undefined
  
  /**
  		 * Title text to show, keep it short.
  		 */
  var text: String
  
  /**
  		 * Layer type.
  		 */
  @JSName("type")
  var type_SlideInTextLayer: `slide-in-text`
}
object SlideInTextLayer {
  
  inline def apply(text: String): SlideInTextLayer = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("slide-in-text")
    __obj.asInstanceOf[SlideInTextLayer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlideInTextLayer] (val x: Self) extends AnyVal {
    
    inline def setCharSpacing(value: Double): Self = StObject.set(x, "charSpacing", value.asInstanceOf[js.Any])
    
    inline def setCharSpacingUndefined: Self = StObject.set(x, "charSpacing", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFontPath(value: String): Self = StObject.set(x, "fontPath", value.asInstanceOf[js.Any])
    
    inline def setFontPathUndefined: Self = StObject.set(x, "fontPath", js.undefined)
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setType(value: `slide-in-text`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
