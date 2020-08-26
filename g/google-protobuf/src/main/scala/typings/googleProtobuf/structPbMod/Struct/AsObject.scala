package typings.googleProtobuf.structPbMod.Struct

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var fieldsMap: js.Array[js.Tuple2[String, typings.googleProtobuf.structPbMod.Value.AsObject]] = js.native
}

object AsObject {
  @scala.inline
  def apply(fieldsMap: js.Array[js.Tuple2[String, typings.googleProtobuf.structPbMod.Value.AsObject]]): AsObject = {
    val __obj = js.Dynamic.literal(fieldsMap = fieldsMap.asInstanceOf[js.Any])
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
    def setFieldsMapVarargs(value: (js.Tuple2[String, typings.googleProtobuf.structPbMod.Value.AsObject])*): Self = this.set("fieldsMap", js.Array(value :_*))
    @scala.inline
    def setFieldsMap(value: js.Array[js.Tuple2[String, typings.googleProtobuf.structPbMod.Value.AsObject]]): Self = this.set("fieldsMap", value.asInstanceOf[js.Any])
  }
  
}

