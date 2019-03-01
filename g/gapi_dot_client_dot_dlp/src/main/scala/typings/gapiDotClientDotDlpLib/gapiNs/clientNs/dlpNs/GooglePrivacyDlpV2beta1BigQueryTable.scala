package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1BigQueryTable extends js.Object {
  /** Dataset ID of the table. */
  var datasetId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The Google Cloud Platform project ID of the project containing the table.
    * If omitted, project ID is inferred from the API call.
    */
  var projectId: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the table. */
  var tableId: js.UndefOr[java.lang.String] = js.undefined
}

object GooglePrivacyDlpV2beta1BigQueryTable {
  @scala.inline
  def apply(
    datasetId: java.lang.String = null,
    projectId: java.lang.String = null,
    tableId: java.lang.String = null
  ): GooglePrivacyDlpV2beta1BigQueryTable = {
    val __obj = js.Dynamic.literal()
    if (datasetId != null) __obj.updateDynamic("datasetId")(datasetId)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    if (tableId != null) __obj.updateDynamic("tableId")(tableId)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1BigQueryTable]
  }
}

