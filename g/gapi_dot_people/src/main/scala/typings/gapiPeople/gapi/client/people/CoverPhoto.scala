package typings.gapiPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverPhoto extends StObject {
  
  var default: Boolean
  
  var metadata: FieldMetadata
  
  var url: String
}
object CoverPhoto {
  
  inline def apply(default: Boolean, metadata: FieldMetadata, url: String): CoverPhoto = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverPhoto]
  }
  
  extension [Self <: CoverPhoto](x: Self) {
    
    inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
