package typings.googleapis.buildSrcApisBloggerV3Mod.blogger_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$PageList extends js.Object {
  /**
    * Etag of the response.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The list of Pages for a Blog.
    */
  var items: js.UndefOr[js.Array[Schema$Page]] = js.native
  /**
    * The kind of this entity. Always blogger#pageList
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to fetch the next page, if one exists.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$PageList {
  @scala.inline
  def apply(
    etag: String = null,
    items: js.Array[Schema$Page] = null,
    kind: String = null,
    nextPageToken: String = null
  ): Schema$PageList = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PageList]
  }
}

