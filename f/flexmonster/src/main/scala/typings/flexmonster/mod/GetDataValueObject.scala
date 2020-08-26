package typings.flexmonster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDataValueObject extends js.Object {
  var data: js.Array[js.Object] = js.native
  var meta: js.Object = js.native
}

object GetDataValueObject {
  @scala.inline
  def apply(data: js.Array[js.Object], meta: js.Object): GetDataValueObject = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataValueObject]
  }
  @scala.inline
  implicit class GetDataValueObjectOps[Self <: GetDataValueObject] (val x: Self) extends AnyVal {
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
    def setDataVarargs(value: js.Object*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[js.Object]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeta(value: js.Object): Self = this.set("meta", value.asInstanceOf[js.Any])
  }
  
}

