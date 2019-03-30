package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableReference extends js.Object {
  var datasetId: js.UndefOr[java.lang.String] = js.undefined
  var projectId: js.UndefOr[java.lang.String] = js.undefined
  var tableId: js.UndefOr[java.lang.String] = js.undefined
}

object TableReference {
  @scala.inline
  def apply(
    datasetId: java.lang.String = null,
    projectId: java.lang.String = null,
    tableId: java.lang.String = null
  ): TableReference = {
    val __obj = js.Dynamic.literal()
    if (datasetId != null) __obj.updateDynamic("datasetId")(datasetId)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    if (tableId != null) __obj.updateDynamic("tableId")(tableId)
    __obj.asInstanceOf[TableReference]
  }
}

