package typings.googleMaps.google.maps.localContext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PinOptions extends StObject {
  
  /**
    * The color of the icon&#39;s shape, can be any valid CSS color.
    */
  var background: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The color of the icon&#39;s glyph, can be any valid CSS color.
    */
  var glyphColor: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The scale of the icon. The value is absolute, not relative to the default
    * sizes in each state.
    */
  var scale: js.UndefOr[Double | Null] = js.undefined
}
object PinOptions {
  
  inline def apply(): PinOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PinOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PinOptions] (val x: Self) extends AnyVal {
    
    inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundNull: Self = StObject.set(x, "background", null)
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setGlyphColor(value: String): Self = StObject.set(x, "glyphColor", value.asInstanceOf[js.Any])
    
    inline def setGlyphColorNull: Self = StObject.set(x, "glyphColor", null)
    
    inline def setGlyphColorUndefined: Self = StObject.set(x, "glyphColor", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleNull: Self = StObject.set(x, "scale", null)
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}
