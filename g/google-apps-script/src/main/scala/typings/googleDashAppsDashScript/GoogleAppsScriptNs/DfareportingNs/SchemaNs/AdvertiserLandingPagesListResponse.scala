package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdvertiserLandingPagesListResponse extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var landingPages: js.UndefOr[js.Array[LandingPage]] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object AdvertiserLandingPagesListResponse {
  @scala.inline
  def apply(kind: String = null, landingPages: js.Array[LandingPage] = null, nextPageToken: String = null): AdvertiserLandingPagesListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (landingPages != null) __obj.updateDynamic("landingPages")(landingPages)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[AdvertiserLandingPagesListResponse]
  }
}

