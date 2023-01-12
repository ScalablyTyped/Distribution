package typings.editly.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultLayerOptions
  extends StObject
     with /**
		 * Set any layer parameter that all layers will inherit.
		 */
/* key */ StringDictionary[Any] {
  
  /**
  		 * Set default font (`.ttf`).
  		 * Defaults to system font.
  		 */
  var fontPath: js.UndefOr[String] = js.undefined
}
object DefaultLayerOptions {
  
  inline def apply(): DefaultLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultLayerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultLayerOptions] (val x: Self) extends AnyVal {
    
    inline def setFontPath(value: String): Self = StObject.set(x, "fontPath", value.asInstanceOf[js.Any])
    
    inline def setFontPathUndefined: Self = StObject.set(x, "fontPath", js.undefined)
  }
}
