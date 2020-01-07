package typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ProjectReference extends js.Object {
  /**
    * [Required] ID of the project. Can be either the numeric ID or the
    * assigned ID of the project.
    */
  var projectId: js.UndefOr[String] = js.native
}

object Schema$ProjectReference {
  @scala.inline
  def apply(projectId: String = null): Schema$ProjectReference = {
    val __obj = js.Dynamic.literal()
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ProjectReference]
  }
}

