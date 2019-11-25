package typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.KeyManagementServiceClient

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecryptRequest extends js.Object {
  var additionalAuthenticatedData: js.UndefOr[String] = js.undefined
  var ciphertext: Buffer
  var name: String
}

object DecryptRequest {
  @scala.inline
  def apply(ciphertext: Buffer, name: String, additionalAuthenticatedData: String = null): DecryptRequest = {
    val __obj = js.Dynamic.literal(ciphertext = ciphertext.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (additionalAuthenticatedData != null) __obj.updateDynamic("additionalAuthenticatedData")(additionalAuthenticatedData.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecryptRequest]
  }
}

