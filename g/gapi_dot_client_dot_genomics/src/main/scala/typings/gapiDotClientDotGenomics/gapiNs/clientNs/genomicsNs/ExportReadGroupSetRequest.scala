package typings.gapiDotClientDotGenomics.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportReadGroupSetRequest extends js.Object {
  /**
    * Required. A Google Cloud Storage URI for the exported BAM file.
    * The currently authenticated user must have write access to the new file.
    * An error will be returned if the URI already contains data.
    */
  var exportUri: js.UndefOr[String] = js.undefined
  /**
    * Required. The Google Cloud project ID that owns this
    * export. The caller must have WRITE access to this project.
    */
  var projectId: js.UndefOr[String] = js.undefined
  /**
    * The reference names to export. If this is not specified, all reference
    * sequences, including unmapped reads, are exported.
    * Use `&#42;` to export only unmapped reads.
    */
  var referenceNames: js.UndefOr[js.Array[String]] = js.undefined
}

object ExportReadGroupSetRequest {
  @scala.inline
  def apply(exportUri: String = null, projectId: String = null, referenceNames: js.Array[String] = null): ExportReadGroupSetRequest = {
    val __obj = js.Dynamic.literal()
    if (exportUri != null) __obj.updateDynamic("exportUri")(exportUri)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    if (referenceNames != null) __obj.updateDynamic("referenceNames")(referenceNames)
    __obj.asInstanceOf[ExportReadGroupSetRequest]
  }
}

