package typings.gitlab

import typings.gitlab.projectImportExportMod.UploadMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  metadata ? :gitlab.gitlab/dist/types/core/services/ProjectImportExport.UploadMetadata} & gitlab.gitlab/dist/types/core/infrastructure.Sudo */
trait metadataUploadMetadataSud extends js.Object {
  var metadata: js.UndefOr[UploadMetadata] = js.undefined
  var sudo: js.UndefOr[String | Double] = js.undefined
}

object metadataUploadMetadataSud {
  @scala.inline
  def apply(metadata: UploadMetadata = null, sudo: String | Double = null): metadataUploadMetadataSud = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (sudo != null) __obj.updateDynamic("sudo")(sudo.asInstanceOf[js.Any])
    __obj.asInstanceOf[metadataUploadMetadataSud]
  }
}

