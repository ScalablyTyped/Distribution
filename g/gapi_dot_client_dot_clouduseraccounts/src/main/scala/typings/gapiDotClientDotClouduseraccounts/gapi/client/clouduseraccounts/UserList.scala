package typings.gapiDotClientDotClouduseraccounts.gapi.client.clouduseraccounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserList extends js.Object {
  /** [Output Only] Unique identifier for the resource; defined by the server. */
  var id: js.UndefOr[String] = js.undefined
  /** [Output Only] A list of User resources. */
  var items: js.UndefOr[js.Array[User]] = js.undefined
  /** [Output Only] Type of resource. Always clouduseraccounts#userList for lists of users. */
  var kind: js.UndefOr[String] = js.undefined
  /** [Output Only] A token used to continue a truncated list request. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** [Output Only] Server defined URL for this resource. */
  var selfLink: js.UndefOr[String] = js.undefined
}

object UserList {
  @scala.inline
  def apply(
    id: String = null,
    items: js.Array[User] = null,
    kind: String = null,
    nextPageToken: String = null,
    selfLink: String = null
  ): UserList = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    __obj.asInstanceOf[UserList]
  }
}

