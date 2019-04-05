package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatasetReference extends js.Object {
  var datasetId: js.UndefOr[java.lang.String] = js.undefined
  var projectId: js.UndefOr[java.lang.String] = js.undefined
}

object DatasetReference {
  @scala.inline
  def apply(datasetId: java.lang.String = null, projectId: java.lang.String = null): DatasetReference = {
    val __obj = js.Dynamic.literal()
    if (datasetId != null) __obj.updateDynamic("datasetId")(datasetId)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    __obj.asInstanceOf[DatasetReference]
  }
}

