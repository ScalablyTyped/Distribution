package typings.forgeApis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonXAdsRegion extends js.Object {
  var xAdsRegion: js.UndefOr[String] = js.undefined
}

object AnonXAdsRegion {
  @scala.inline
  def apply(xAdsRegion: String = null): AnonXAdsRegion = {
    val __obj = js.Dynamic.literal()
    if (xAdsRegion != null) __obj.updateDynamic("xAdsRegion")(xAdsRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonXAdsRegion]
  }
}

