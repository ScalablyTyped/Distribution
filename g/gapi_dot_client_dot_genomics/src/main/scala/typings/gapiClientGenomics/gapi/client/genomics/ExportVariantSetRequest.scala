package typings.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportVariantSetRequest extends js.Object {
  /**
    * Required. The BigQuery dataset to export data to. This dataset must already
    * exist. Note that this is distinct from the Genomics concept of "dataset".
    */
  var bigqueryDataset: js.UndefOr[String] = js.native
  /**
    * Required. The BigQuery table to export data to.
    * If the table doesn't exist, it will be created. If it already exists, it
    * will be overwritten.
    */
  var bigqueryTable: js.UndefOr[String] = js.native
  /**
    * If provided, only variant call information from the specified call sets
    * will be exported. By default all variant calls are exported.
    */
  var callSetIds: js.UndefOr[js.Array[String]] = js.native
  /** The format for the exported data. */
  var format: js.UndefOr[String] = js.native
  /**
    * Required. The Google Cloud project ID that owns the destination
    * BigQuery dataset. The caller must have WRITE access to this project.  This
    * project will also own the resulting export job.
    */
  var projectId: js.UndefOr[String] = js.native
}

object ExportVariantSetRequest {
  @scala.inline
  def apply(): ExportVariantSetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportVariantSetRequest]
  }
  @scala.inline
  implicit class ExportVariantSetRequestOps[Self <: ExportVariantSetRequest] (val x: Self) extends AnyVal {
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
    def setBigqueryDataset(value: String): Self = this.set("bigqueryDataset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBigqueryDataset: Self = this.set("bigqueryDataset", js.undefined)
    @scala.inline
    def setBigqueryTable(value: String): Self = this.set("bigqueryTable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBigqueryTable: Self = this.set("bigqueryTable", js.undefined)
    @scala.inline
    def setCallSetIdsVarargs(value: String*): Self = this.set("callSetIds", js.Array(value :_*))
    @scala.inline
    def setCallSetIds(value: js.Array[String]): Self = this.set("callSetIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallSetIds: Self = this.set("callSetIds", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
  }
  
}

