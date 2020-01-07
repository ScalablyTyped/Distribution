package typings.googleapis.buildSrcApisAndroidpublisherV2Mod.androidpublisher_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ExpansionFilesUploadResponse extends js.Object {
  var expansionFile: js.UndefOr[Schema$ExpansionFile] = js.native
}

object Schema$ExpansionFilesUploadResponse {
  @scala.inline
  def apply(expansionFile: Schema$ExpansionFile = null): Schema$ExpansionFilesUploadResponse = {
    val __obj = js.Dynamic.literal()
    if (expansionFile != null) __obj.updateDynamic("expansionFile")(expansionFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ExpansionFilesUploadResponse]
  }
}

