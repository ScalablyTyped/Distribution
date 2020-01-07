package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Landing Page List Response
  */
@js.native
trait Schema$AdvertiserLandingPagesListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#advertiserLandingPagesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Landing page collection
    */
  var landingPages: js.UndefOr[js.Array[Schema$LandingPage]] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$AdvertiserLandingPagesListResponse {
  @scala.inline
  def apply(
    kind: String = null,
    landingPages: js.Array[Schema$LandingPage] = null,
    nextPageToken: String = null
  ): Schema$AdvertiserLandingPagesListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (landingPages != null) __obj.updateDynamic("landingPages")(landingPages.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AdvertiserLandingPagesListResponse]
  }
}

