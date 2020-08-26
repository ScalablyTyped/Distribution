package typings.googleCloudKms.mod.v1.KeyManagementServiceClient

import typings.googleCloudKms.anon.PartialKeyRing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateKeyRingRequest extends js.Object {
  var keyRing: js.UndefOr[PartialKeyRing] = js.native
  var keyRingId: String = js.native
  var parent: String = js.native
}

object CreateKeyRingRequest {
  @scala.inline
  def apply(keyRingId: String, parent: String): CreateKeyRingRequest = {
    val __obj = js.Dynamic.literal(keyRingId = keyRingId.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateKeyRingRequest]
  }
  @scala.inline
  implicit class CreateKeyRingRequestOps[Self <: CreateKeyRingRequest] (val x: Self) extends AnyVal {
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
    def setKeyRingId(value: String): Self = this.set("keyRingId", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyRing(value: PartialKeyRing): Self = this.set("keyRing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyRing: Self = this.set("keyRing", js.undefined)
  }
  
}

