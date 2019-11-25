package typings.gapiDotClientDotBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectReference extends js.Object {
  /** [Required] ID of the project. Can be either the numeric ID or the assigned ID of the project. */
  var projectId: js.UndefOr[String] = js.undefined
}

object ProjectReference {
  @scala.inline
  def apply(projectId: String = null): ProjectReference = {
    val __obj = js.Dynamic.literal()
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectReference]
  }
}

