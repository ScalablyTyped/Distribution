package typings.firebaseStorage.distStorageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringData extends StObject {
  
  var contentType: String | Null
  
  var data: js.typedarray.Uint8Array
}
object StringData {
  
  inline def apply(data: js.typedarray.Uint8Array): StringData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], contentType = null)
    __obj.asInstanceOf[StringData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StringData] (val x: Self) extends AnyVal {
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeNull: Self = StObject.set(x, "contentType", null)
    
    inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
