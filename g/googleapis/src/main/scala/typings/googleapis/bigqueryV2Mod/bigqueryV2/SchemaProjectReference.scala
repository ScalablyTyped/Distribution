package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaProjectReference extends js.Object {
  /**
    * [Required] ID of the project. Can be either the numeric ID or the
    * assigned ID of the project.
    */
  var projectId: js.UndefOr[String] = js.native
}

object SchemaProjectReference {
  @scala.inline
  def apply(projectId: String = null): SchemaProjectReference = {
    val __obj = js.Dynamic.literal()
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProjectReference]
  }
}

