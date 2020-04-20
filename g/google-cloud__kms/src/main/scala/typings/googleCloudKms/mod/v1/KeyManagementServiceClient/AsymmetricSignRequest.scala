package typings.googleCloudKms.mod.v1.KeyManagementServiceClient

import typings.googleCloudKms.mod.v1.Digest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsymmetricSignRequest extends js.Object {
  var digest: Digest
  var name: String
}

object AsymmetricSignRequest {
  @scala.inline
  def apply(digest: Digest, name: String): AsymmetricSignRequest = {
    val __obj = js.Dynamic.literal(digest = digest.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsymmetricSignRequest]
  }
}

