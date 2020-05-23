package typings.fridaGum.Java

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Field[Value, Holder /* <: Members[Holder] */] extends js.Object {
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
  def apply[Value, Holder](fieldReturnType: Type, fieldType: FieldType, holder: Wrapper[Holder], value: Value): Field[Value, Holder] = {
    val __obj = js.Dynamic.literal(fieldReturnType = fieldReturnType.asInstanceOf[js.Any], fieldType = fieldType.asInstanceOf[js.Any], holder = holder.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field[Value, Holder]]
  }
}

