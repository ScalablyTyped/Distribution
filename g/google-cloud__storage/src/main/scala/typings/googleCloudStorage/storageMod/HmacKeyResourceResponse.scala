package typings.googleCloudStorage.storageMod

import typings.googleCloudStorage.hmacKeyMod.HmacKeyMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HmacKeyResourceResponse extends js.Object {
  var metadata: HmacKeyMetadata
  var secret: String
}

object HmacKeyResourceResponse {
  @scala.inline
  def apply(metadata: HmacKeyMetadata, secret: String): HmacKeyResourceResponse = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[HmacKeyResourceResponse]
  }
}

