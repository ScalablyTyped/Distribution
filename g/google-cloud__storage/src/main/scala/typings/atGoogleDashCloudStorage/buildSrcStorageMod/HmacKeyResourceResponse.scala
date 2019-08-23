package typings.atGoogleDashCloudStorage.buildSrcStorageMod

import typings.atGoogleDashCloudStorage.buildSrcHmacKeyMod.HmacKeyMetadata
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
    val __obj = js.Dynamic.literal(metadata = metadata, secret = secret)
  
    __obj.asInstanceOf[HmacKeyResourceResponse]
  }
}

