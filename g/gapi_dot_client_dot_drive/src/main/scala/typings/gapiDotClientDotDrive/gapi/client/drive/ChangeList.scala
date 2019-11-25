package typings.gapiDotClientDotDrive.gapi.client.drive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeList extends js.Object {
  /** The list of changes. If nextPageToken is populated, then this list may be incomplete and an additional page of results should be fetched. */
  var changes: js.UndefOr[js.Array[Change]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "drive#changeList". */
  var kind: js.UndefOr[String] = js.undefined
  /** The starting page token for future changes. This will be present only if the end of the current changes list has been reached. */
  var newStartPageToken: js.UndefOr[String] = js.undefined
  /**
    * The page token for the next page of changes. This will be absent if the end of the changes list has been reached. If the token is rejected for any
    * reason, it should be discarded, and pagination should be restarted from the first page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ChangeList {
  @scala.inline
  def apply(
    changes: js.Array[Change] = null,
    kind: String = null,
    newStartPageToken: String = null,
    nextPageToken: String = null
  ): ChangeList = {
    val __obj = js.Dynamic.literal()
    if (changes != null) __obj.updateDynamic("changes")(changes.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (newStartPageToken != null) __obj.updateDynamic("newStartPageToken")(newStartPageToken.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeList]
  }
}

