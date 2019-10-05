package typings.fridaDashGum.Java

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Field extends js.Object {
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
  var holder: Wrapper
  /**
    * Current value of this field. Assign to update the field's value.
    */
  var value: js.Any
}

object Field {
  @scala.inline
  def apply(fieldReturnType: Type, fieldType: FieldType, holder: Wrapper, value: js.Any): Field = {
    val __obj = js.Dynamic.literal(fieldReturnType = fieldReturnType, fieldType = fieldType, holder = holder, value = value)
  
    __obj.asInstanceOf[Field]
  }
}

