package typings.gapiDotClientDotClouduseraccounts.gapiNs.clientNs.clouduseraccountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupList extends js.Object {
  /** [Output Only] Unique identifier for the resource; defined by the server. */
  var id: js.UndefOr[String] = js.undefined
  /** [Output Only] A list of Group resources. */
  var items: js.UndefOr[js.Array[Group]] = js.undefined
  /** [Output Only] Type of resource. Always clouduseraccounts#groupList for lists of groups. */
  var kind: js.UndefOr[String] = js.undefined
  /** [Output Only] A token used to continue a truncated list request. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** [Output Only] Server defined URL for this resource. */
  var selfLink: js.UndefOr[String] = js.undefined
}

object GroupList {
  @scala.inline
  def apply(
    id: String = null,
    items: js.Array[Group] = null,
    kind: String = null,
    nextPageToken: String = null,
    selfLink: String = null
  ): GroupList = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    __obj.asInstanceOf[GroupList]
  }
}

