package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetFontSizesRequest extends StObject {
  
  /**
    * Specifies font sizes to set. If a font size is not specified, it won't be changed.
    */
  var fontSizes: FontSizes
}
object SetFontSizesRequest {
  
  inline def apply(fontSizes: FontSizes): SetFontSizesRequest = {
    val __obj = js.Dynamic.literal(fontSizes = fontSizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetFontSizesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetFontSizesRequest] (val x: Self) extends AnyVal {
    
    inline def setFontSizes(value: FontSizes): Self = StObject.set(x, "fontSizes", value.asInstanceOf[js.Any])
  }
}
