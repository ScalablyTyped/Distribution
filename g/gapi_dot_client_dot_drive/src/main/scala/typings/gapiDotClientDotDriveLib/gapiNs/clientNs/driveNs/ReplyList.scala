package typings
package gapiDotClientDotDriveLib.gapiNs.clientNs.driveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplyList extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "drive#replyList". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The page token for the next page of replies. This will be absent if the end of the replies list has been reached. If the token is rejected for any
    * reason, it should be discarded, and pagination should be restarted from the first page of results.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** The list of replies. If nextPageToken is populated, then this list may be incomplete and an additional page of results should be fetched. */
  var replies: js.UndefOr[js.Array[Reply]] = js.undefined
}

