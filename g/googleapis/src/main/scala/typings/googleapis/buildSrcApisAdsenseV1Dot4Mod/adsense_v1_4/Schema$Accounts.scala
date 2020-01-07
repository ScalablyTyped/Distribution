package typings.googleapis.buildSrcApisAdsenseV1Dot4Mod.adsense_v1_4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Accounts extends js.Object {
  /**
    * ETag of this response for caching purposes.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The accounts returned in this list response.
    */
  var items: js.UndefOr[js.Array[Schema$Account]] = js.native
  /**
    * Kind of list this is, in this case adsense#accounts.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Continuation token used to page through accounts. To retrieve the next
    * page of results, set the next request&#39;s &quot;pageToken&quot; value
    * to this.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$Accounts {
  @scala.inline
  def apply(
    etag: String = null,
    items: js.Array[Schema$Account] = null,
    kind: String = null,
    nextPageToken: String = null
  ): Schema$Accounts = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Accounts]
  }
}

