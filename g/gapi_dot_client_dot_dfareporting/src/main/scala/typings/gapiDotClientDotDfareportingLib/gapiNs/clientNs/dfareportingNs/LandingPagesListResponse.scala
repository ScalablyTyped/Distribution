package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LandingPagesListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#landingPagesListResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Landing page collection */
  var landingPages: js.UndefOr[js.Array[LandingPage]] = js.undefined
}

object LandingPagesListResponse {
  @scala.inline
  def apply(kind: java.lang.String = null, landingPages: js.Array[LandingPage] = null): LandingPagesListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (landingPages != null) __obj.updateDynamic("landingPages")(landingPages)
    __obj.asInstanceOf[LandingPagesListResponse]
  }
}

