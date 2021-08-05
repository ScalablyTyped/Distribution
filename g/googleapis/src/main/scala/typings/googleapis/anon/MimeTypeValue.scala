package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MimeTypeValue extends StObject {
  
  var mimeType: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object MimeTypeValue {
  
  inline def apply(): MimeTypeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MimeTypeValue]
  }
  
  extension [Self <: MimeTypeValue](x: Self) {
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
