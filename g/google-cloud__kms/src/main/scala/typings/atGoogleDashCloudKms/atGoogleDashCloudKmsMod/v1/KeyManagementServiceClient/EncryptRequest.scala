package typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.KeyManagementServiceClient

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptRequest extends js.Object {
  var additionalAuthenticatedData: js.UndefOr[String] = js.undefined
  var name: String
  var plaintext: Buffer
}

object EncryptRequest {
  @scala.inline
  def apply(name: String, plaintext: Buffer, additionalAuthenticatedData: String = null): EncryptRequest = {
    val __obj = js.Dynamic.literal(name = name, plaintext = plaintext)
    if (additionalAuthenticatedData != null) __obj.updateDynamic("additionalAuthenticatedData")(additionalAuthenticatedData)
    __obj.asInstanceOf[EncryptRequest]
  }
}

