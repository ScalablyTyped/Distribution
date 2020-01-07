package typings.googleapis.buildSrcApisDriveV2Mod.drive_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of revisions of a file.
  */
@js.native
trait Schema$RevisionList extends js.Object {
  /**
    * The ETag of the list.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The list of revisions. If nextPageToken is populated, then this list may
    * be incomplete and an additional page of results should be fetched.
    */
  var items: js.UndefOr[js.Array[Schema$Revision]] = js.native
  /**
    * This is always drive#revisionList.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The page token for the next page of revisions. This field will be absent
    * if the end of the revisions list has been reached. If the token is
    * rejected for any reason, it should be discarded and pagination should be
    * restarted from the first page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * A link back to this list.
    */
  var selfLink: js.UndefOr[String] = js.native
}

object Schema$RevisionList {
  @scala.inline
  def apply(
    etag: String = null,
    items: js.Array[Schema$Revision] = null,
    kind: String = null,
    nextPageToken: String = null,
    selfLink: String = null
  ): Schema$RevisionList = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RevisionList]
  }
}

