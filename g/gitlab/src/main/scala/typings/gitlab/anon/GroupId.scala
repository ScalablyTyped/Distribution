package typings.gitlab.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupId extends js.Object {
  var groupId: js.UndefOr[String | Double] = js.undefined
}

object GroupId {
  @scala.inline
  def apply(groupId: String | Double = null): GroupId = {
    val __obj = js.Dynamic.literal()
    if (groupId != null) __obj.updateDynamic("groupId")(groupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupId]
  }
}

