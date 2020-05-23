package typings.forgeApis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XAdsRegion extends js.Object {
  var xAdsRegion: js.UndefOr[String] = js.undefined
}

object XAdsRegion {
  @scala.inline
  def apply(xAdsRegion: String = null): XAdsRegion = {
    val __obj = js.Dynamic.literal()
    if (xAdsRegion != null) __obj.updateDynamic("xAdsRegion")(xAdsRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[XAdsRegion]
  }
}

