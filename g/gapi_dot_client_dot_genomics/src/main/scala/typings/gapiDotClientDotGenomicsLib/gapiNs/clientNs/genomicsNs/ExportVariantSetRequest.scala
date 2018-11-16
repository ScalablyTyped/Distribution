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

