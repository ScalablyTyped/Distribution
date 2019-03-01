package typings
package atGoogleDashCloudStorageLib.buildSrcFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileOptions extends js.Object {
  var encryptionKey: js.UndefOr[java.lang.String | nodeLib.Buffer] = js.undefined
  var generation: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var kmsKeyName: js.UndefOr[java.lang.String] = js.undefined
  var userProject: js.UndefOr[java.lang.String] = js.undefined
}

object FileOptions {
  @scala.inline
  def apply(
    encryptionKey: java.lang.String | nodeLib.Buffer = null,
    generation: scala.Double | java.lang.String = null,
    kmsKeyName: java.lang.String = null,
    userProject: java.lang.String = null
  ): FileOptions = {
    val __obj = js.Dynamic.literal()
    if (encryptionKey != null) __obj.updateDynamic("encryptionKey")(encryptionKey.asInstanceOf[js.Any])
    if (generation != null) __obj.updateDynamic("generation")(generation.asInstanceOf[js.Any])
    if (kmsKeyName != null) __obj.updateDynamic("kmsKeyName")(kmsKeyName)
    if (userProject != null) __obj.updateDynamic("userProject")(userProject)
    __obj.asInstanceOf[FileOptions]
  }
}

