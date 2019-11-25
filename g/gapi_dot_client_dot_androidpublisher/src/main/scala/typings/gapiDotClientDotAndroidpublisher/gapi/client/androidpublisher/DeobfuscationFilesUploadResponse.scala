package typings.gapiDotClientDotAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeobfuscationFilesUploadResponse extends js.Object {
  var deobfuscationFile: js.UndefOr[DeobfuscationFile] = js.undefined
}

object DeobfuscationFilesUploadResponse {
  @scala.inline
  def apply(deobfuscationFile: DeobfuscationFile = null): DeobfuscationFilesUploadResponse = {
    val __obj = js.Dynamic.literal()
    if (deobfuscationFile != null) __obj.updateDynamic("deobfuscationFile")(deobfuscationFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeobfuscationFilesUploadResponse]
  }
}

