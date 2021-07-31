package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetFontFamiliesRequest extends StObject {
  
  /**
    * Specifies font families to set. If a font family is not specified, it won't be changed.
    */
  var fontFamilies: FontFamilies
}
object SetFontFamiliesRequest {
  
  @scala.inline
  def apply(fontFamilies: FontFamilies): SetFontFamiliesRequest = {
    val __obj = js.Dynamic.literal(fontFamilies = fontFamilies.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetFontFamiliesRequest]
  }
  
  @scala.inline
  implicit class SetFontFamiliesRequestMutableBuilder[Self <: SetFontFamiliesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFontFamilies(value: FontFamilies): Self = StObject.set(x, "fontFamilies", value.asInstanceOf[js.Any])
  }
}
