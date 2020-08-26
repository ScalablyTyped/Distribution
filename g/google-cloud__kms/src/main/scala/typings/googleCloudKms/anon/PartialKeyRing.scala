package typings.googleCloudKms.anon

import typings.googleProtobuf.timestampPbMod.Timestamp.AsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@google-cloud/kms.@google-cloud/kms.v1.KeyRing> */
@js.native
trait PartialKeyRing extends js.Object {
  var createTime: js.UndefOr[AsObject] = js.native
  var name: js.UndefOr[String] = js.native
}

object PartialKeyRing {
  @scala.inline
  def apply(): PartialKeyRing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialKeyRing]
  }
  @scala.inline
  implicit class PartialKeyRingOps[Self <: PartialKeyRing] (val x: Self) extends AnyVal {
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
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

