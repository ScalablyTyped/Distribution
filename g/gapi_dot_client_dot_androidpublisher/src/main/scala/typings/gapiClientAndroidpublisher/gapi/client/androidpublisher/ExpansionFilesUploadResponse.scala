package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpansionFilesUploadResponse extends js.Object {
  var expansionFile: js.UndefOr[ExpansionFile] = js.undefined
}

object ExpansionFilesUploadResponse {
  @scala.inline
  def apply(expansionFile: ExpansionFile = null): ExpansionFilesUploadResponse = {
    val __obj = js.Dynamic.literal()
    if (expansionFile != null) __obj.updateDynamic("expansionFile")(expansionFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpansionFilesUploadResponse]
  }
}

