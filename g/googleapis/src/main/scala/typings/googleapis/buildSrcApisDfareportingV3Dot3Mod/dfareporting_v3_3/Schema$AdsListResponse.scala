package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Ad List Response
  */
@js.native
trait Schema$AdsListResponse extends js.Object {
  /**
    * Ad collection.
    */
  var ads: js.UndefOr[js.Array[Schema$Ad]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#adsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$AdsListResponse {
  @scala.inline
  def apply(ads: js.Array[Schema$Ad] = null, kind: String = null, nextPageToken: String = null): Schema$AdsListResponse = {
    val __obj = js.Dynamic.literal()
    if (ads != null) __obj.updateDynamic("ads")(ads.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AdsListResponse]
  }
}

