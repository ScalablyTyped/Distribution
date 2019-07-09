package typings
package gitlabLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GroupId extends js.Object {
  var groupId: js.UndefOr[gitlabLib.distServicesMod.GroupId] = js.undefined
}

object Anon_GroupId {
  @scala.inline
  def apply(groupId: gitlabLib.distServicesMod.GroupId = null): Anon_GroupId = {
    val __obj = js.Dynamic.literal()
    if (groupId != null) __obj.updateDynamic("groupId")(groupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_GroupId]
  }
}

