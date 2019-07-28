package typings.atGoogleDashCloudStorage.buildSrcFileMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptionKeyOptions extends js.Object {
  var encryptionKey: js.UndefOr[String | Buffer] = js.undefined
  var kmsKeyName: js.UndefOr[String] = js.undefined
}

object EncryptionKeyOptions {
  @scala.inline
  def apply(encryptionKey: String | Buffer = null, kmsKeyName: String = null): EncryptionKeyOptions = {
    val __obj = js.Dynamic.literal()
    if (encryptionKey != null) __obj.updateDynamic("encryptionKey")(encryptionKey.asInstanceOf[js.Any])
    if (kmsKeyName != null) __obj.updateDynamic("kmsKeyName")(kmsKeyName)
    __obj.asInstanceOf[EncryptionKeyOptions]
  }
}

