package typings.editly.mod

import typings.editly.editlyStrings.`title-background`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * Title with background.
	 */
trait TitleBackgroundLayer
  extends StObject
     with BaseLayer
     with Layer {
  
  /**
  		 * Background layer.
  		 * Defaults to random background.
  		 */
  var background: js.UndefOr[BackgroundLayer] = js.undefined
  
  /**
  		 * Set font (`.ttf`).
  		 * Defaults to system font.
  		 */
  var fontPath: js.UndefOr[String] = js.undefined
  
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
  var type_TitleBackgroundLayer: `title-background`
}
object TitleBackgroundLayer {
  
  inline def apply(text: String): TitleBackgroundLayer = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("title-background")
    __obj.asInstanceOf[TitleBackgroundLayer]
  }
  
  extension [Self <: TitleBackgroundLayer](x: Self) {
    
    inline def setBackground(value: BackgroundLayer): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setFontPath(value: String): Self = StObject.set(x, "fontPath", value.asInstanceOf[js.Any])
    
    inline def setFontPathUndefined: Self = StObject.set(x, "fontPath", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
    
    inline def setType(value: `title-background`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
