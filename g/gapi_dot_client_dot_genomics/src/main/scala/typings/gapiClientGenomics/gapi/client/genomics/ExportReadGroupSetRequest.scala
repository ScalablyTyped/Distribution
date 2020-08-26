package typings.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportReadGroupSetRequest extends js.Object {
  /**
    * Required. A Google Cloud Storage URI for the exported BAM file.
    * The currently authenticated user must have write access to the new file.
    * An error will be returned if the URI already contains data.
    */
  var exportUri: js.UndefOr[String] = js.native
  /**
    * Required. The Google Cloud project ID that owns this
    * export. The caller must have WRITE access to this project.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * The reference names to export. If this is not specified, all reference
    * sequences, including unmapped reads, are exported.
    * Use `&#42;` to export only unmapped reads.
    */
  var referenceNames: js.UndefOr[js.Array[String]] = js.native
}

object ExportReadGroupSetRequest {
  @scala.inline
  def apply(): ExportReadGroupSetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportReadGroupSetRequest]
  }
  @scala.inline
  implicit class ExportReadGroupSetRequestOps[Self <: ExportReadGroupSetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExportUri(value: String): Self = this.set("exportUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportUri: Self = this.set("exportUri", js.undefined)
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    @scala.inline
    def setReferenceNamesVarargs(value: String*): Self = this.set("referenceNames", js.Array(value :_*))
    @scala.inline
    def setReferenceNames(value: js.Array[String]): Self = this.set("referenceNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceNames: Self = this.set("referenceNames", js.undefined)
  }
  
}

