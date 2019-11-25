package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LandingPagesListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#landingPagesListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** Landing page collection */
  var landingPages: js.UndefOr[js.Array[LandingPage]] = js.undefined
}

object LandingPagesListResponse {
  @scala.inline
  def apply(kind: String = null, landingPages: js.Array[LandingPage] = null): LandingPagesListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (landingPages != null) __obj.updateDynamic("landingPages")(landingPages.asInstanceOf[js.Any])
    __obj.asInstanceOf[LandingPagesListResponse]
  }
}

