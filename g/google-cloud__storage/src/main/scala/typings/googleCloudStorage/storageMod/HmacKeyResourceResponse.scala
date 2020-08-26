package typings.googleCloudStorage.storageMod

import typings.googleCloudStorage.hmacKeyMod.HmacKeyMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HmacKeyResourceResponse extends js.Object {
  var metadata: HmacKeyMetadata = js.native
  var secret: String = js.native
}

object HmacKeyResourceResponse {
  @scala.inline
  def apply(metadata: HmacKeyMetadata, secret: String): HmacKeyResourceResponse = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[HmacKeyResourceResponse]
  }
  @scala.inline
  implicit class HmacKeyResourceResponseOps[Self <: HmacKeyResourceResponse] (val x: Self) extends AnyVal {
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
    def setMetadata(value: HmacKeyMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecret(value: String): Self = this.set("secret", value.asInstanceOf[js.Any])
  }
  
}

