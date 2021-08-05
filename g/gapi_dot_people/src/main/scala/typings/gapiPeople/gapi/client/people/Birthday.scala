package typings.gapiPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Birthday extends StObject {
  
  var date: Date
  
  var metadata: FieldMetadata
  
  var text: String
}
object Birthday {
  
  inline def apply(date: Date, metadata: FieldMetadata, text: String): Birthday = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Birthday]
  }
  
  extension [Self <: Birthday](x: Self) {
    
    inline def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
