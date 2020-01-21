package typings.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportVariantSetRequest extends js.Object {
  /**
    * Required. The BigQuery dataset to export data to. This dataset must already
    * exist. Note that this is distinct from the Genomics concept of "dataset".
    */
  var bigqueryDataset: js.UndefOr[String] = js.undefined
  /**
    * Required. The BigQuery table to export data to.
    * If the table doesn't exist, it will be created. If it already exists, it
    * will be overwritten.
    */
  var bigqueryTable: js.UndefOr[String] = js.undefined
  /**
    * If provided, only variant call information from the specified call sets
    * will be exported. By default all variant calls are exported.
    */
  var callSetIds: js.UndefOr[js.Array[String]] = js.undefined
  /** The format for the exported data. */
  var format: js.UndefOr[String] = js.undefined
  /**
    * Required. The Google Cloud project ID that owns the destination
    * BigQuery dataset. The caller must have WRITE access to this project.  This
    * project will also own the resulting export job.
    */
  var projectId: js.UndefOr[String] = js.undefined
}

object ExportVariantSetRequest {
  @scala.inline
  def apply(
    bigqueryDataset: String = null,
    bigqueryTable: String = null,
    callSetIds: js.Array[String] = null,
    format: String = null,
    projectId: String = null
  ): ExportVariantSetRequest = {
    val __obj = js.Dynamic.literal()
    if (bigqueryDataset != null) __obj.updateDynamic("bigqueryDataset")(bigqueryDataset.asInstanceOf[js.Any])
    if (bigqueryTable != null) __obj.updateDynamic("bigqueryTable")(bigqueryTable.asInstanceOf[js.Any])
    if (callSetIds != null) __obj.updateDynamic("callSetIds")(callSetIds.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportVariantSetRequest]
  }
}

