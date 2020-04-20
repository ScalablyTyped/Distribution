package typings.googleCloudKms.mod.v1.KeyManagementServiceClient

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsymmetricSignResponse extends js.Object {
  var signature: Buffer
}

object AsymmetricSignResponse {
  @scala.inline
  def apply(signature: Buffer): AsymmetricSignResponse = {
    val __obj = js.Dynamic.literal(signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsymmetricSignResponse]
  }
}

