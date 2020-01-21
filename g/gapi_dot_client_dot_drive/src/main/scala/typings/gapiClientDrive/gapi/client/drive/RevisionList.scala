package typings.gapiClientDrive.gapi.client.drive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevisionList extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "drive#revisionList". */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * The page token for the next page of revisions. This will be absent if the end of the revisions list has been reached. If the token is rejected for any
    * reason, it should be discarded, and pagination should be restarted from the first page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** The list of revisions. If nextPageToken is populated, then this list may be incomplete and an additional page of results should be fetched. */
  var revisions: js.UndefOr[js.Array[Revision]] = js.undefined
}

object RevisionList {
  @scala.inline
  def apply(kind: String = null, nextPageToken: String = null, revisions: js.Array[Revision] = null): RevisionList = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (revisions != null) __obj.updateDynamic("revisions")(revisions.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevisionList]
  }
}

