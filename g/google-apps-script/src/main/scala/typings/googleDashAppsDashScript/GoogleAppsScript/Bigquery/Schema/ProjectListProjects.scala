package typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectListProjects extends js.Object {
  var friendlyName: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var numericId: js.UndefOr[String] = js.undefined
  var projectReference: js.UndefOr[ProjectReference] = js.undefined
}

object ProjectListProjects {
  @scala.inline
  def apply(
    friendlyName: String = null,
    id: String = null,
    kind: String = null,
    numericId: String = null,
    projectReference: ProjectReference = null
  ): ProjectListProjects = {
    val __obj = js.Dynamic.literal()
    if (friendlyName != null) __obj.updateDynamic("friendlyName")(friendlyName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (numericId != null) __obj.updateDynamic("numericId")(numericId.asInstanceOf[js.Any])
    if (projectReference != null) __obj.updateDynamic("projectReference")(projectReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectListProjects]
  }
}

