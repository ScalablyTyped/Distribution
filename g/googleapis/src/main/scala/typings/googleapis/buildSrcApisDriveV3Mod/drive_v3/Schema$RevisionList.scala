package typings.googleapis.buildSrcApisDriveV3Mod.drive_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of revisions of a file.
  */
@js.native
trait Schema$RevisionList extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;drive#revisionList&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The page token for the next page of revisions. This will be absent if the
    * end of the revisions list has been reached. If the token is rejected for
    * any reason, it should be discarded, and pagination should be restarted
    * from the first page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of revisions. If nextPageToken is populated, then this list may
    * be incomplete and an additional page of results should be fetched.
    */
  var revisions: js.UndefOr[js.Array[Schema$Revision]] = js.native
}

object Schema$RevisionList {
  @scala.inline
  def apply(kind: String = null, nextPageToken: String = null, revisions: js.Array[Schema$Revision] = null): Schema$RevisionList = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (revisions != null) __obj.updateDynamic("revisions")(revisions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RevisionList]
  }
}

