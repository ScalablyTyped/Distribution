package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPlatformFontsForNodeResponse extends StObject {
  
  /**
    * Usage statistics for every employed platform font.
    */
  var fonts: js.Array[PlatformFontUsage] = js.native
}
object GetPlatformFontsForNodeResponse {
  
  @scala.inline
  def apply(fonts: js.Array[PlatformFontUsage]): GetPlatformFontsForNodeResponse = {
    val __obj = js.Dynamic.literal(fonts = fonts.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPlatformFontsForNodeResponse]
  }
  
  @scala.inline
  implicit class GetPlatformFontsForNodeResponseMutableBuilder[Self <: GetPlatformFontsForNodeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFonts(value: js.Array[PlatformFontUsage]): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontsVarargs(value: PlatformFontUsage*): Self = StObject.set(x, "fonts", js.Array(value :_*))
  }
}
