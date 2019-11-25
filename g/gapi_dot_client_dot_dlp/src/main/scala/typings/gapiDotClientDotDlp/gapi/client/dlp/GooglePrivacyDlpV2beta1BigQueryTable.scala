package typings.gapiDotClientDotDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1BigQueryTable extends js.Object {
  /** Dataset ID of the table. */
  var datasetId: js.UndefOr[String] = js.undefined
  /**
    * The Google Cloud Platform project ID of the project containing the table.
    * If omitted, project ID is inferred from the API call.
    */
  var projectId: js.UndefOr[String] = js.undefined
  /** Name of the table. */
  var tableId: js.UndefOr[String] = js.undefined
}

object GooglePrivacyDlpV2beta1BigQueryTable {
  @scala.inline
  def apply(datasetId: String = null, projectId: String = null, tableId: String = null): GooglePrivacyDlpV2beta1BigQueryTable = {
    val __obj = js.Dynamic.literal()
    if (datasetId != null) __obj.updateDynamic("datasetId")(datasetId.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (tableId != null) __obj.updateDynamic("tableId")(tableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1BigQueryTable]
  }
}

