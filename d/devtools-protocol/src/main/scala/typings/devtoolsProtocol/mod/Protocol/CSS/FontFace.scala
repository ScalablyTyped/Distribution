package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontFace extends StObject {
  
  /**
    * The font-family.
    */
  var fontFamily: String = js.native
  
  /**
    * The font-stretch.
    */
  var fontStretch: String = js.native
  
  /**
    * The font-style.
    */
  var fontStyle: String = js.native
  
  /**
    * The font-variant.
    */
  var fontVariant: String = js.native
  
  /**
    * Available variation settings (a.k.a. "axes").
    */
  var fontVariationAxes: js.UndefOr[js.Array[FontVariationAxis]] = js.native
  
  /**
    * The font-weight.
    */
  var fontWeight: String = js.native
  
  /**
    * The resolved platform font family
    */
  var platformFontFamily: String = js.native
  
  /**
    * The src.
    */
  var src: String = js.native
  
  /**
    * The unicode-range.
    */
  var unicodeRange: String = js.native
}
object FontFace {
  
  @scala.inline
  def apply(
    fontFamily: String,
    fontStretch: String,
    fontStyle: String,
    fontVariant: String,
    fontWeight: String,
    platformFontFamily: String,
    src: String,
    unicodeRange: String
  ): FontFace = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontStretch = fontStretch.asInstanceOf[js.Any], fontStyle = fontStyle.asInstanceOf[js.Any], fontVariant = fontVariant.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], platformFontFamily = platformFontFamily.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], unicodeRange = unicodeRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontFace]
  }
  
  @scala.inline
  implicit class FontFaceMutableBuilder[Self <: FontFace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStretch(value: String): Self = StObject.set(x, "fontStretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontVariant(value: String): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontVariationAxes(value: js.Array[FontVariationAxis]): Self = StObject.set(x, "fontVariationAxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontVariationAxesUndefined: Self = StObject.set(x, "fontVariationAxes", js.undefined)
    
    @scala.inline
    def setFontVariationAxesVarargs(value: FontVariationAxis*): Self = StObject.set(x, "fontVariationAxes", js.Array(value :_*))
    
    @scala.inline
    def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformFontFamily(value: String): Self = StObject.set(x, "platformFontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnicodeRange(value: String): Self = StObject.set(x, "unicodeRange", value.asInstanceOf[js.Any])
  }
}
