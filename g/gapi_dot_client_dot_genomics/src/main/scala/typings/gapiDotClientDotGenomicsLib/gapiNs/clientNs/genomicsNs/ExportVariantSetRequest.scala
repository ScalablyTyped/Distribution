package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportVariantSetRequest extends js.Object {
  /**
    * Required. The BigQuery dataset to export data to. This dataset must already
    * exist. Note that this is distinct from the Genomics concept of "dataset".
    */
  var bigqueryDataset: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Required. The BigQuery table to export data to.
    * If the table doesn't exist, it will be created. If it already exists, it
    * will be overwritten.
    */
  var bigqueryTable: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If provided, only variant call information from the specified call sets
    * will be exported. By default all variant calls are exported.
    */
  var callSetIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The format for the exported data. */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Required. The Google Cloud project ID that owns the destination
    * BigQuery dataset. The caller must have WRITE access to this project.  This
    * project will also own the resulting export job.
    */
  var projectId: js.UndefOr[java.lang.String] = js.undefined
}

object ExportVariantSetRequest {
  @scala.inline
  def apply(
    bigqueryDataset: java.lang.String = null,
    bigqueryTable: java.lang.String = null,
    callSetIds: js.Array[java.lang.String] = null,
    format: java.lang.String = null,
    projectId: java.lang.String = null
  ): ExportVariantSetRequest = {
    val __obj = js.Dynamic.literal()
    if (bigqueryDataset != null) __obj.updateDynamic("bigqueryDataset")(bigqueryDataset)
    if (bigqueryTable != null) __obj.updateDynamic("bigqueryTable")(bigqueryTable)
    if (callSetIds != null) __obj.updateDynamic("callSetIds")(callSetIds)
    if (format != null) __obj.updateDynamic("format")(format)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    __obj.asInstanceOf[ExportVariantSetRequest]
  }
}

