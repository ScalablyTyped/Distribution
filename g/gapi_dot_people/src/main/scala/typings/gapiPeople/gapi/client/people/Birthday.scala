package typings.gapiPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Birthday extends StObject {
  
  var date: Date = js.native
  
  var metadata: FieldMetadata = js.native
  
  var text: String = js.native
}
object Birthday {
  
  @scala.inline
  def apply(date: Date, metadata: FieldMetadata, text: String): Birthday = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Birthday]
  }
  
  @scala.inline
  implicit class BirthdayMutableBuilder[Self <: Birthday] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
