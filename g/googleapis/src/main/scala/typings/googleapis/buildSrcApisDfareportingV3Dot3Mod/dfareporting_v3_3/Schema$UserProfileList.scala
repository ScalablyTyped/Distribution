package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the list of user profiles.
  */
@js.native
trait Schema$UserProfileList extends js.Object {
  /**
    * The eTag of this response for caching purposes.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The user profiles returned in this response.
    */
  var items: js.UndefOr[js.Array[Schema$UserProfile]] = js.native
  /**
    * The kind of list this is, in this case dfareporting#userProfileList.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$UserProfileList {
  @scala.inline
  def apply(etag: String = null, items: js.Array[Schema$UserProfile] = null, kind: String = null): Schema$UserProfileList = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UserProfileList]
  }
}

