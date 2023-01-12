package typings.expoVectorIcons

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCreateMultiStyleIconSetMod {
  
  @JSImport("@expo/vector-icons/build/createMultiStyleIconSet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(styles: FontStyles): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(styles.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def default(styles: FontStyles, optionsInput: js.Object): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(styles.asInstanceOf[js.Any], optionsInput.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  trait FontStyle extends StObject {
    
    var fontFamily: String
    
    var fontFile: Any
    
    var fontStyle: Any
    
    var glyphMap: Any
  }
  object FontStyle {
    
    inline def apply(fontFamily: String, fontFile: Any, fontStyle: Any, glyphMap: Any): FontStyle = {
      val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontFile = fontFile.asInstanceOf[js.Any], fontStyle = fontStyle.asInstanceOf[js.Any], glyphMap = glyphMap.asInstanceOf[js.Any])
      __obj.asInstanceOf[FontStyle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FontStyle] (val x: Self) extends AnyVal {
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFile(value: Any): Self = StObject.set(x, "fontFile", value.asInstanceOf[js.Any])
      
      inline def setFontStyle(value: Any): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setGlyphMap(value: Any): Self = StObject.set(x, "glyphMap", value.asInstanceOf[js.Any])
    }
  }
  
  type FontStyles = StringDictionary[FontStyle]
}
