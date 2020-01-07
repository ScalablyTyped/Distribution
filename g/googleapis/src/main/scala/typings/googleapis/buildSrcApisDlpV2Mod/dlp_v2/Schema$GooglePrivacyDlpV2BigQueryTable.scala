package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message defining the location of a BigQuery table. A table is uniquely
  * identified  by its project_id, dataset_id, and table_name. Within a query a
  * table is often referenced with a string in the format of:
  * `&lt;project_id&gt;:&lt;dataset_id&gt;.&lt;table_id&gt;` or
  * `&lt;project_id&gt;.&lt;dataset_id&gt;.&lt;table_id&gt;`.
  */
@js.native
trait Schema$GooglePrivacyDlpV2BigQueryTable extends js.Object {
  /**
    * Dataset ID of the table.
    */
  var datasetId: js.UndefOr[String] = js.native
  /**
    * The Google Cloud Platform project ID of the project containing the table.
    * If omitted, project ID is inferred from the API call.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Name of the table.
    */
  var tableId: js.UndefOr[String] = js.native
}

object Schema$GooglePrivacyDlpV2BigQueryTable {
  @scala.inline
  def apply(datasetId: String = null, projectId: String = null, tableId: String = null): Schema$GooglePrivacyDlpV2BigQueryTable = {
    val __obj = js.Dynamic.literal()
    if (datasetId != null) __obj.updateDynamic("datasetId")(datasetId.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (tableId != null) __obj.updateDynamic("tableId")(tableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2BigQueryTable]
  }
}

