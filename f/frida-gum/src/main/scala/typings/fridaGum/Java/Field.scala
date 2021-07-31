package typings.fridaGum.Java

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Field[Value, Holder /* <: Members[Holder] */] extends StObject {
  
  /**
    * Type of value.
    */
  var fieldReturnType: Type
  
  /**
    * What kind of field this is, i.e. static vs instance.
    */
  var fieldType: FieldType
  
  /**
    * Class that this field belongs to.
    */
  var holder: Wrapper[Holder]
  
  /**
    * Current value of this field. Assign to update the field's value.
    */
  var value: Value
}
object Field {
  
  @scala.inline
  def apply[Value, Holder /* <: Members[Holder] */](fieldReturnType: Type, fieldType: FieldType, holder: Wrapper[Holder], value: Value): Field[Value, Holder] = {
    val __obj = js.Dynamic.literal(fieldReturnType = fieldReturnType.asInstanceOf[js.Any], fieldType = fieldType.asInstanceOf[js.Any], holder = holder.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field[Value, Holder]]
  }
  
  @scala.inline
  implicit class FieldMutableBuilder[Self <: Field[?, ?], Value, Holder /* <: Members[Holder] */] (val x: Self & (Field[Value, Holder])) extends AnyVal {
    
    @scala.inline
    def setFieldReturnType(value: Type): Self = StObject.set(x, "fieldReturnType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldType(value: FieldType): Self = StObject.set(x, "fieldType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHolder(value: Wrapper[Holder]): Self = StObject.set(x, "holder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
