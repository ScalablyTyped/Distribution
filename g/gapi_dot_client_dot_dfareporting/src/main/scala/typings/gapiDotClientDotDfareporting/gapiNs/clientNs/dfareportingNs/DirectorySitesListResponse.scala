package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectorySitesListResponse extends js.Object {
  /** Directory site collection. */
  var directorySites: js.UndefOr[js.Array[DirectorySite]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#directorySitesListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object DirectorySitesListResponse {
  @scala.inline
  def apply(directorySites: js.Array[DirectorySite] = null, kind: String = null, nextPageToken: String = null): DirectorySitesListResponse = {
    val __obj = js.Dynamic.literal()
    if (directorySites != null) __obj.updateDynamic("directorySites")(directorySites)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[DirectorySitesListResponse]
  }
}

