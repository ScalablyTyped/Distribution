package typings.fridaGum.Java

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Field[Value, Holder /* <: Members[Holder] */] extends StObject {
  
  /**
    * Type of value.
    */
  var fieldReturnType: Type = js.native
  
  /**
    * What kind of field this is, i.e. static vs instance.
    */
  var fieldType: FieldType = js.native
  
  /**
    * Class that this field belongs to.
    */
  var holder: Wrapper[Holder] = js.native
  
  /**
    * Current value of this field. Assign to update the field's value.
    */
  var value: Value = js.native
}
object Field {
  
  @scala.inline
  def apply[Value, Holder /* <: Members[Holder] */](fieldReturnType: Type, fieldType: FieldType, holder: Wrapper[Holder], value: Value): Field[Value, Holder] = {
    val __obj = js.Dynamic.literal(fieldReturnType = fieldReturnType.asInstanceOf[js.Any], fieldType = fieldType.asInstanceOf[js.Any], holder = holder.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field[Value, Holder]]
  }
  
  @scala.inline
  implicit class FieldMutableBuilder[Self <: Field[_, _], Value, Holder /* <: Members[Holder] */] (val x: Self with (Field[Value, Holder])) extends AnyVal {
    
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
