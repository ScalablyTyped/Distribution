package typings
package gapiDotClientDotClouduseraccountsLib.gapiNs.clientNs.clouduseraccountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinuxAccountViews extends js.Object {
  /** [Output Only] A list of all groups within a project. */
  var groupViews: js.UndefOr[js.Array[LinuxGroupView]] = js.undefined
  /** [Output Only] Type of the resource. Always clouduseraccounts#linuxAccountViews for Linux resources. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] A list of all users within a project. */
  var userViews: js.UndefOr[js.Array[LinuxUserView]] = js.undefined
}

object LinuxAccountViews {
  @scala.inline
  def apply(
    groupViews: js.Array[LinuxGroupView] = null,
    kind: java.lang.String = null,
    userViews: js.Array[LinuxUserView] = null
  ): LinuxAccountViews = {
    val __obj = js.Dynamic.literal()
    if (groupViews != null) __obj.updateDynamic("groupViews")(groupViews)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (userViews != null) __obj.updateDynamic("userViews")(userViews)
    __obj.asInstanceOf[LinuxAccountViews]
  }
}

