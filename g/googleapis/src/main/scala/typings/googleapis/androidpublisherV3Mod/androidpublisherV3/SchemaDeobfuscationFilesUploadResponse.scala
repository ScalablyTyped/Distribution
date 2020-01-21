package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDeobfuscationFilesUploadResponse extends js.Object {
  var deobfuscationFile: js.UndefOr[SchemaDeobfuscationFile] = js.native
}

object SchemaDeobfuscationFilesUploadResponse {
  @scala.inline
  def apply(deobfuscationFile: SchemaDeobfuscationFile = null): SchemaDeobfuscationFilesUploadResponse = {
    val __obj = js.Dynamic.literal()
    if (deobfuscationFile != null) __obj.updateDynamic("deobfuscationFile")(deobfuscationFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeobfuscationFilesUploadResponse]
  }
}

