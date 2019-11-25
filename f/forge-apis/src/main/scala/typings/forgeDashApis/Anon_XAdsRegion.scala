package typings.forgeDashApis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_XAdsRegion extends js.Object {
  var xAdsRegion: js.UndefOr[String] = js.undefined
}

object Anon_XAdsRegion {
  @scala.inline
  def apply(xAdsRegion: String = null): Anon_XAdsRegion = {
    val __obj = js.Dynamic.literal()
    if (xAdsRegion != null) __obj.updateDynamic("xAdsRegion")(xAdsRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_XAdsRegion]
  }
}

