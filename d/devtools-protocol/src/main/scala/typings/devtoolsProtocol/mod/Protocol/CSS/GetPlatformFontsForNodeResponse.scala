package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPlatformFontsForNodeResponse extends StObject {
  
  /**
    * Usage statistics for every employed platform font.
    */
  var fonts: js.Array[PlatformFontUsage]
}
object GetPlatformFontsForNodeResponse {
  
  inline def apply(fonts: js.Array[PlatformFontUsage]): GetPlatformFontsForNodeResponse = {
    val __obj = js.Dynamic.literal(fonts = fonts.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPlatformFontsForNodeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPlatformFontsForNodeResponse] (val x: Self) extends AnyVal {
    
    inline def setFonts(value: js.Array[PlatformFontUsage]): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
    
    inline def setFontsVarargs(value: PlatformFontUsage*): Self = StObject.set(x, "fonts", js.Array(value*))
  }
}
