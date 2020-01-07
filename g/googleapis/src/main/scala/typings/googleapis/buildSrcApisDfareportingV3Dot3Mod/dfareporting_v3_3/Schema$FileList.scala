package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the list of File resources.
  */
@js.native
trait Schema$FileList extends js.Object {
  /**
    * The eTag of this response for caching purposes.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The files returned in this response.
    */
  var items: js.UndefOr[js.Array[Schema$File]] = js.native
  /**
    * The kind of list this is, in this case dfareporting#fileList.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Continuation token used to page through files. To retrieve the next page
    * of results, set the next request&#39;s &quot;pageToken&quot; to the value
    * of this field. The page token is only valid for a limited amount of time
    * and should not be persisted.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$FileList {
  @scala.inline
  def apply(
    etag: String = null,
    items: js.Array[Schema$File] = null,
    kind: String = null,
    nextPageToken: String = null
  ): Schema$FileList = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FileList]
  }
}

