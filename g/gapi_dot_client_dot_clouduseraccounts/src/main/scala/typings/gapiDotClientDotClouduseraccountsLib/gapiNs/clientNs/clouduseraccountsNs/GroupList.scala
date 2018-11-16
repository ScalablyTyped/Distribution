package typings
package gapiDotClientDotClouduseraccountsLib.gapiNs.clientNs.clouduseraccountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GroupList extends js.Object {
  /** [Output Only] Unique identifier for the resource; defined by the server. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] A list of Group resources. */
  var items: js.UndefOr[js.Array[Group]] = js.undefined
  /** [Output Only] Type of resource. Always clouduseraccounts#groupList for lists of groups. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] A token used to continue a truncated list request. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Server defined URL for this resource. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
}

