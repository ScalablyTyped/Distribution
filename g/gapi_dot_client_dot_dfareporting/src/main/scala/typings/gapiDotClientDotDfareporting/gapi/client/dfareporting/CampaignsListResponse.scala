package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CampaignsListResponse extends js.Object {
  /** Campaign collection. */
  var campaigns: js.UndefOr[js.Array[Campaign]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#campaignsListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object CampaignsListResponse {
  @scala.inline
  def apply(campaigns: js.Array[Campaign] = null, kind: String = null, nextPageToken: String = null): CampaignsListResponse = {
    val __obj = js.Dynamic.literal()
    if (campaigns != null) __obj.updateDynamic("campaigns")(campaigns)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[CampaignsListResponse]
  }
}

