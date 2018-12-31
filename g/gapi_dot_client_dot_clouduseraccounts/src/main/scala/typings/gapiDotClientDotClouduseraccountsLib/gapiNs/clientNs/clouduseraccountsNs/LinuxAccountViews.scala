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

