package typings
package atGoogleDashCloudStorageLib.buildSrcFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptionKeyOptions extends js.Object {
  var encryptionKey: js.UndefOr[java.lang.String | nodeLib.Buffer] = js.undefined
  var kmsKeyName: js.UndefOr[java.lang.String] = js.undefined
}

object EncryptionKeyOptions {
  @scala.inline
  def apply(encryptionKey: java.lang.String | nodeLib.Buffer = null, kmsKeyName: java.lang.String = null): EncryptionKeyOptions = {
    val __obj = js.Dynamic.literal()
    if (encryptionKey != null) __obj.updateDynamic("encryptionKey")(encryptionKey.asInstanceOf[js.Any])
    if (kmsKeyName != null) __obj.updateDynamic("kmsKeyName")(kmsKeyName)
    __obj.asInstanceOf[EncryptionKeyOptions]
  }
}

