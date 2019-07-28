package typings.gapiDotClientDotAndroidpublisher.gapiNs.clientNs.androidpublisherNs

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
    if (expansionFile != null) __obj.updateDynamic("expansionFile")(expansionFile)
    __obj.asInstanceOf[ExpansionFilesUploadResponse]
  }
}

