package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserProfileList extends js.Object {
  /** The eTag of this response for caching purposes. */
  var etag: js.UndefOr[String] = js.undefined
  /** The user profiles returned in this response. */
  var items: js.UndefOr[js.Array[UserProfile]] = js.undefined
  /** The kind of list this is, in this case dfareporting#userProfileList. */
  var kind: js.UndefOr[String] = js.undefined
}

object UserProfileList {
  @scala.inline
  def apply(etag: String = null, items: js.Array[UserProfile] = null, kind: String = null): UserProfileList = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserProfileList]
  }
}

