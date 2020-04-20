package typings.googleCloudKms.mod.v1.KeyManagementServiceClient

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecryptResponse extends js.Object {
  var plaintext: Buffer
}

object DecryptResponse {
  @scala.inline
  def apply(plaintext: Buffer): DecryptResponse = {
    val __obj = js.Dynamic.literal(plaintext = plaintext.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecryptResponse]
  }
}

