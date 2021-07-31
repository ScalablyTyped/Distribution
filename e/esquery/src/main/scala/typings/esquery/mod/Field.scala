package typings.esquery.mod

import typings.esquery.esqueryStrings.field
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
// Atoms
//
trait Field
  extends StObject
     with Atom
     with Selector {
  
  var name: String
  
  @JSName("type")
  var type_Field: field
}
object Field {
  
  @scala.inline
  def apply(name: String): Field = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("field")
    __obj.asInstanceOf[Field]
  }
  
  @scala.inline
  implicit class FieldMutableBuilder[Self <: Field] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: field): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
