package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SitesListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#sitesListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** Site collection. */
  var sites: js.UndefOr[js.Array[Site]] = js.undefined
}

object SitesListResponse {
  @scala.inline
  def apply(kind: String = null, nextPageToken: String = null, sites: js.Array[Site] = null): SitesListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (sites != null) __obj.updateDynamic("sites")(sites.asInstanceOf[js.Any])
    __obj.asInstanceOf[SitesListResponse]
  }
}

