package typings.googleapis.buildSrcApisAndroidpublisherV3Mod.androidpublisher_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$DeobfuscationFilesUploadResponse extends js.Object {
  var deobfuscationFile: js.UndefOr[Schema$DeobfuscationFile] = js.native
}

object Schema$DeobfuscationFilesUploadResponse {
  @scala.inline
  def apply(deobfuscationFile: Schema$DeobfuscationFile = null): Schema$DeobfuscationFilesUploadResponse = {
    val __obj = js.Dynamic.literal()
    if (deobfuscationFile != null) __obj.updateDynamic("deobfuscationFile")(deobfuscationFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DeobfuscationFilesUploadResponse]
  }
}

