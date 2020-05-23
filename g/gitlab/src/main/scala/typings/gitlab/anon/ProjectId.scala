package typings.gitlab.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectId extends js.Object {
  var projectId: js.UndefOr[String | Double] = js.undefined
}

object ProjectId {
  @scala.inline
  def apply(projectId: String | Double = null): ProjectId = {
    val __obj = js.Dynamic.literal()
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectId]
  }
}

