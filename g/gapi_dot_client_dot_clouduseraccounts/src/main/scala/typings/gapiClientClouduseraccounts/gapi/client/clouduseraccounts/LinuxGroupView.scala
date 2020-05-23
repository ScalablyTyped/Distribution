package typings.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinuxGroupView extends js.Object {
  /** [Output Only] The Group ID. */
  var gid: js.UndefOr[Double] = js.undefined
  /** [Output Only] Group name. */
  var groupName: js.UndefOr[String] = js.undefined
  /** [Output Only] List of user accounts that belong to the group. */
  var members: js.UndefOr[js.Array[String]] = js.undefined
}

object LinuxGroupView {
  @scala.inline
  def apply(gid: js.UndefOr[Double] = js.undefined, groupName: String = null, members: js.Array[String] = null): LinuxGroupView = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(gid)) __obj.updateDynamic("gid")(gid.get.asInstanceOf[js.Any])
    if (groupName != null) __obj.updateDynamic("groupName")(groupName.asInstanceOf[js.Any])
    if (members != null) __obj.updateDynamic("members")(members.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinuxGroupView]
  }
}

