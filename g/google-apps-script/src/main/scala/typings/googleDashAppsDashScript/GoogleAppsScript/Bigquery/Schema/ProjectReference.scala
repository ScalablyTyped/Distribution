package typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectReference extends js.Object {
  var projectId: js.UndefOr[String] = js.undefined
}

object ProjectReference {
  @scala.inline
  def apply(projectId: String = null): ProjectReference = {
    val __obj = js.Dynamic.literal()
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    __obj.asInstanceOf[ProjectReference]
  }
}

