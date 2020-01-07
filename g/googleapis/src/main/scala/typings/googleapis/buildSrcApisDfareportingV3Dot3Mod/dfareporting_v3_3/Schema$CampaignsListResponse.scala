package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Campaign List Response
  */
@js.native
trait Schema$CampaignsListResponse extends js.Object {
  /**
    * Campaign collection.
    */
  var campaigns: js.UndefOr[js.Array[Schema$Campaign]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#campaignsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$CampaignsListResponse {
  @scala.inline
  def apply(campaigns: js.Array[Schema$Campaign] = null, kind: String = null, nextPageToken: String = null): Schema$CampaignsListResponse = {
    val __obj = js.Dynamic.literal()
    if (campaigns != null) __obj.updateDynamic("campaigns")(campaigns.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CampaignsListResponse]
  }
}

