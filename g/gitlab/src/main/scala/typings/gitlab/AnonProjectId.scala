package typings.gitlab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProjectId extends js.Object {
  var projectId: js.UndefOr[String | Double] = js.undefined
}

object AnonProjectId {
  @scala.inline
  def apply(projectId: String | Double = null): AnonProjectId = {
    val __obj = js.Dynamic.literal()
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProjectId]
  }
}

