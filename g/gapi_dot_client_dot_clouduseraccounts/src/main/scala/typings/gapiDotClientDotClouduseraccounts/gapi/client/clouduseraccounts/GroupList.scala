package typings.gapiDotClientDotClouduseraccounts.gapi.client.clouduseraccounts

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
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupList]
  }
}

