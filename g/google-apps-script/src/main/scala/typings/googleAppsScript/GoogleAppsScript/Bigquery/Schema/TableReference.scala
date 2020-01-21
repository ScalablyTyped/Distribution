package typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableReference extends js.Object {
  var datasetId: js.UndefOr[String] = js.undefined
  var projectId: js.UndefOr[String] = js.undefined
  var tableId: js.UndefOr[String] = js.undefined
}

object TableReference {
  @scala.inline
  def apply(datasetId: String = null, projectId: String = null, tableId: String = null): TableReference = {
    val __obj = js.Dynamic.literal()
    if (datasetId != null) __obj.updateDynamic("datasetId")(datasetId.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (tableId != null) __obj.updateDynamic("tableId")(tableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableReference]
  }
}

