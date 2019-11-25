package typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoutineReference extends js.Object {
  var datasetId: js.UndefOr[String] = js.undefined
  var projectId: js.UndefOr[String] = js.undefined
  var routineId: js.UndefOr[String] = js.undefined
}

object RoutineReference {
  @scala.inline
  def apply(datasetId: String = null, projectId: String = null, routineId: String = null): RoutineReference = {
    val __obj = js.Dynamic.literal()
    if (datasetId != null) __obj.updateDynamic("datasetId")(datasetId.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (routineId != null) __obj.updateDynamic("routineId")(routineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoutineReference]
  }
}

