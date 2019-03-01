package typings
package gapiDotClientDotClouduseraccountsLib.gapiNs.clientNs.clouduseraccountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinuxGroupView extends js.Object {
  /** [Output Only] The Group ID. */
  var gid: js.UndefOr[scala.Double] = js.undefined
  /** [Output Only] Group name. */
  var groupName: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] List of user accounts that belong to the group. */
  var members: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object LinuxGroupView {
  @scala.inline
  def apply(
    gid: scala.Int | scala.Double = null,
    groupName: java.lang.String = null,
    members: js.Array[java.lang.String] = null
  ): LinuxGroupView = {
    val __obj = js.Dynamic.literal()
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (groupName != null) __obj.updateDynamic("groupName")(groupName)
    if (members != null) __obj.updateDynamic("members")(members)
    __obj.asInstanceOf[LinuxGroupView]
  }
}

