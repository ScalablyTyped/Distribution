package typings.fridaGum.Java

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Field[Value, Holder /* <: Members[Holder] */] extends js.Object {
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
  def apply[Value, /* <: typings.fridaGum.Java.Members[Holder] */ Holder](fieldReturnType: Type, fieldType: FieldType, holder: Wrapper[Holder], value: Value): Field[Value, Holder] = {
    val __obj = js.Dynamic.literal(fieldReturnType = fieldReturnType.asInstanceOf[js.Any], fieldType = fieldType.asInstanceOf[js.Any], holder = holder.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field[Value, Holder]]
  }
  @scala.inline
  implicit class FieldOps[Self <: Field[_, _], Value, /* <: typings.fridaGum.Java.Members[Holder] */ Holder] (val x: Self with (Field[Value, Holder])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFieldReturnType(value: Type): Self = this.set("fieldReturnType", value.asInstanceOf[js.Any])
    @scala.inline
    def setFieldType(value: FieldType): Self = this.set("fieldType", value.asInstanceOf[js.Any])
    @scala.inline
    def setHolder(value: Wrapper[Holder]): Self = this.set("holder", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Value): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

