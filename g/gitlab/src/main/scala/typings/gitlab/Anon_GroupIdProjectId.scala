package typings.gitlab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GroupIdProjectId extends js.Object {
  var groupId: js.UndefOr[String | Double] = js.undefined
  var projectId: js.UndefOr[String | Double] = js.undefined
}

object Anon_GroupIdProjectId {
  @scala.inline
  def apply(groupId: String | Double = null, projectId: String | Double = null): Anon_GroupIdProjectId = {
    val __obj = js.Dynamic.literal()
    if (groupId != null) __obj.updateDynamic("groupId")(groupId.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_GroupIdProjectId]
  }
}

