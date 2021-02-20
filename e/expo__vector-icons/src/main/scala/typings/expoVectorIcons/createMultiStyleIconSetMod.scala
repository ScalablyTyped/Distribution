package typings.expoVectorIcons

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createMultiStyleIconSetMod {
  
  @JSImport("@expo/vector-icons/build/createMultiStyleIconSet", JSImport.Default)
  @js.native
  def default(styles: FontStyles): js.Any = js.native
  @JSImport("@expo/vector-icons/build/createMultiStyleIconSet", JSImport.Default)
  @js.native
  def default(styles: FontStyles, optionsInput: js.Object): js.Any = js.native
  
  @js.native
  trait FontStyle extends StObject {
    
    var fontFamily: String = js.native
    
    var fontFile: js.Any = js.native
    
    var fontStyle: js.Any = js.native
    
    var glyphMap: js.Any = js.native
  }
  object FontStyle {
    
    @scala.inline
    def apply(fontFamily: String, fontFile: js.Any, fontStyle: js.Any, glyphMap: js.Any): FontStyle = {
      val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontFile = fontFile.asInstanceOf[js.Any], fontStyle = fontStyle.asInstanceOf[js.Any], glyphMap = glyphMap.asInstanceOf[js.Any])
      __obj.asInstanceOf[FontStyle]
    }
    
    @scala.inline
    implicit class FontStyleMutableBuilder[Self <: FontStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFile(value: js.Any): Self = StObject.set(x, "fontFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyle(value: js.Any): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlyphMap(value: js.Any): Self = StObject.set(x, "glyphMap", value.asInstanceOf[js.Any])
    }
  }
  
  type FontStyles = StringDictionary[FontStyle]
}
