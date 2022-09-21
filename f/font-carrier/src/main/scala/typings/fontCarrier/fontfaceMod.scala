package typings.fontCarrier

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fontfaceMod {
  
  /** fontface 对象包含了字体的一些特殊相关信息 */
  @JSImport("font-carrier/class/fontface", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends typings.fontCarrier.baseMod.^[FontFaceOptions]
  
  /** fontface 对象包含了字体的一些特殊相关信息 */
  type FontFace = typings.fontCarrier.baseMod.^[FontFaceOptions]
  
  trait FontFaceOptions extends StObject {
    
    /** 字体的上偏移量，默认是 812 */
    var ascent: String
    
    /** 字体的下偏移量，默认是 -212 */
    var descent: String
    
    /** 字体的 fontfamily */
    var fontFamily: String
    
    /** 字体定义一个正常或经过伸缩变形的字体外观, 默认是 normal */
    var fontStretch: String
    
    /** 字体的粗细程度，默认是 400 */
    var fontWeight: String
    
    /** 字体的 unitsPerEm 默认是 1024 */
    var unitsPerEm: String
  }
  object FontFaceOptions {
    
    inline def apply(
      ascent: String,
      descent: String,
      fontFamily: String,
      fontStretch: String,
      fontWeight: String,
      unitsPerEm: String
    ): FontFaceOptions = {
      val __obj = js.Dynamic.literal(ascent = ascent.asInstanceOf[js.Any], descent = descent.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontStretch = fontStretch.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], unitsPerEm = unitsPerEm.asInstanceOf[js.Any])
      __obj.asInstanceOf[FontFaceOptions]
    }
    
    extension [Self <: FontFaceOptions](x: Self) {
      
      inline def setAscent(value: String): Self = StObject.set(x, "ascent", value.asInstanceOf[js.Any])
      
      inline def setDescent(value: String): Self = StObject.set(x, "descent", value.asInstanceOf[js.Any])
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontStretch(value: String): Self = StObject.set(x, "fontStretch", value.asInstanceOf[js.Any])
      
      inline def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setUnitsPerEm(value: String): Self = StObject.set(x, "unitsPerEm", value.asInstanceOf[js.Any])
    }
  }
}
