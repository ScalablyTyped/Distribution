package typings.googleProtobuf.structPbMod.Value

import typings.googleProtobuf.structPbMod.NullValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var boolValue: Boolean = js.native
  var listValue: js.UndefOr[typings.googleProtobuf.structPbMod.ListValue.AsObject] = js.native
  var nullValue: NullValue = js.native
  var numberValue: Double = js.native
  var stringValue: String = js.native
  var structValue: js.UndefOr[typings.googleProtobuf.structPbMod.Struct.AsObject] = js.native
}

object AsObject {
  @scala.inline
  def apply(boolValue: Boolean, nullValue: NullValue, numberValue: Double, stringValue: String): AsObject = {
    val __obj = js.Dynamic.literal(boolValue = boolValue.asInstanceOf[js.Any], nullValue = nullValue.asInstanceOf[js.Any], numberValue = numberValue.asInstanceOf[js.Any], stringValue = stringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
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
    def setBoolValue(value: Boolean): Self = this.set("boolValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setNullValue(value: NullValue): Self = this.set("nullValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberValue(value: Double): Self = this.set("numberValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setStringValue(value: String): Self = this.set("stringValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setListValue(value: typings.googleProtobuf.structPbMod.ListValue.AsObject): Self = this.set("listValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListValue: Self = this.set("listValue", js.undefined)
    @scala.inline
    def setStructValue(value: typings.googleProtobuf.structPbMod.Struct.AsObject): Self = this.set("structValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStructValue: Self = this.set("structValue", js.undefined)
  }
  
}

