package typings.googleCloudKms.mod.v1

import typings.googleProtobuf.timestampPbMod.Timestamp.AsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyRing extends js.Object {
  var createTime: AsObject = js.native
  var name: String = js.native
}

object KeyRing {
  @scala.inline
  def apply(createTime: AsObject, name: String): KeyRing = {
    val __obj = js.Dynamic.literal(createTime = createTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyRing]
  }
  @scala.inline
  implicit class KeyRingOps[Self <: KeyRing] (val x: Self) extends AnyVal {
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
    def setCreateTime(value: AsObject): Self = this.set("createTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

