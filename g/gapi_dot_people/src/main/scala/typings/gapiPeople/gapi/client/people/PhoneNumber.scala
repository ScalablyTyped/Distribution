package typings.gapiPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhoneNumber extends StObject {
  
  var canonicalForm: String
  
  var formattedType: String
  
  var metadata: FieldMetadata
  
  var `type`: String
  
  var value: String
}
object PhoneNumber {
  
  @scala.inline
  def apply(
    canonicalForm: String,
    formattedType: String,
    metadata: FieldMetadata,
    `type`: String,
    value: String
  ): PhoneNumber = {
    val __obj = js.Dynamic.literal(canonicalForm = canonicalForm.asInstanceOf[js.Any], formattedType = formattedType.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneNumber]
  }
  
  @scala.inline
  implicit class PhoneNumberMutableBuilder[Self <: PhoneNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanonicalForm(value: String): Self = StObject.set(x, "canonicalForm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedType(value: String): Self = StObject.set(x, "formattedType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
