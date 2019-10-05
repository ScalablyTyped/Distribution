package typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.KeyManagementServiceClient

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptResponse extends js.Object {
  var ciphertext: Buffer
  var name: String
}

object EncryptResponse {
  @scala.inline
  def apply(ciphertext: Buffer, name: String): EncryptResponse = {
    val __obj = js.Dynamic.literal(ciphertext = ciphertext, name = name)
  
    __obj.asInstanceOf[EncryptResponse]
  }
}

