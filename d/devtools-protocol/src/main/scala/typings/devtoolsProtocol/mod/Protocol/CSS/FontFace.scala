package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontFace extends StObject {
  
  /**
    * The font-display.
    */
  var fontDisplay: String
  
  /**
    * The font-family.
    */
  var fontFamily: String
  
  /**
    * The font-stretch.
    */
  var fontStretch: String
  
  /**
    * The font-style.
    */
  var fontStyle: String
  
  /**
    * The font-variant.
    */
  var fontVariant: String
  
  /**
    * Available variation settings (a.k.a. "axes").
    */
  var fontVariationAxes: js.UndefOr[js.Array[FontVariationAxis]] = js.undefined
  
  /**
    * The font-weight.
    */
  var fontWeight: String
  
  /**
    * The resolved platform font family
    */
  var platformFontFamily: String
  
  /**
    * The src.
    */
  var src: String
  
  /**
    * The unicode-range.
    */
  var unicodeRange: String
}
object FontFace {
  
  inline def apply(
    fontDisplay: String,
    fontFamily: String,
    fontStretch: String,
    fontStyle: String,
    fontVariant: String,
    fontWeight: String,
    platformFontFamily: String,
    src: String,
    unicodeRange: String
  ): FontFace = {
    val __obj = js.Dynamic.literal(fontDisplay = fontDisplay.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontStretch = fontStretch.asInstanceOf[js.Any], fontStyle = fontStyle.asInstanceOf[js.Any], fontVariant = fontVariant.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], platformFontFamily = platformFontFamily.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], unicodeRange = unicodeRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontFace]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FontFace] (val x: Self) extends AnyVal {
    
    inline def setFontDisplay(value: String): Self = StObject.set(x, "fontDisplay", value.asInstanceOf[js.Any])
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontStretch(value: String): Self = StObject.set(x, "fontStretch", value.asInstanceOf[js.Any])
    
    inline def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    inline def setFontVariant(value: String): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
    
    inline def setFontVariationAxes(value: js.Array[FontVariationAxis]): Self = StObject.set(x, "fontVariationAxes", value.asInstanceOf[js.Any])
    
    inline def setFontVariationAxesUndefined: Self = StObject.set(x, "fontVariationAxes", js.undefined)
    
    inline def setFontVariationAxesVarargs(value: FontVariationAxis*): Self = StObject.set(x, "fontVariationAxes", js.Array(value*))
    
    inline def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setPlatformFontFamily(value: String): Self = StObject.set(x, "platformFontFamily", value.asInstanceOf[js.Any])
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setUnicodeRange(value: String): Self = StObject.set(x, "unicodeRange", value.asInstanceOf[js.Any])
  }
}
