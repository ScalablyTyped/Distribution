package typings.atGoogleDashCloudStorage.buildSrcFileMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileOptions extends js.Object {
  var encryptionKey: js.UndefOr[String | Buffer] = js.undefined
  var generation: js.UndefOr[Double | String] = js.undefined
  var kmsKeyName: js.UndefOr[String] = js.undefined
  var userProject: js.UndefOr[String] = js.undefined
}

object FileOptions {
  @scala.inline
  def apply(
    encryptionKey: String | Buffer = null,
    generation: Double | String = null,
    kmsKeyName: String = null,
    userProject: String = null
  ): FileOptions = {
    val __obj = js.Dynamic.literal()
    if (encryptionKey != null) __obj.updateDynamic("encryptionKey")(encryptionKey.asInstanceOf[js.Any])
    if (generation != null) __obj.updateDynamic("generation")(generation.asInstanceOf[js.Any])
    if (kmsKeyName != null) __obj.updateDynamic("kmsKeyName")(kmsKeyName)
    if (userProject != null) __obj.updateDynamic("userProject")(userProject)
    __obj.asInstanceOf[FileOptions]
  }
}

