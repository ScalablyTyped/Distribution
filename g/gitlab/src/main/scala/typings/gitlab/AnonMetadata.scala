package typings.gitlab

import typings.gitlab.projectImportExportMod.UploadMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMetadata extends js.Object {
  var metadata: js.UndefOr[UploadMetadata] = js.undefined
}

object AnonMetadata {
  @scala.inline
  def apply(metadata: UploadMetadata = null): AnonMetadata = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMetadata]
  }
}

