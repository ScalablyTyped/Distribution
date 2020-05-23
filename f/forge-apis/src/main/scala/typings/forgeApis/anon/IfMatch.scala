package typings.forgeApis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IfMatch extends js.Object {
  var contentDisposition: js.UndefOr[String] = js.undefined
  var ifMatch: js.UndefOr[String] = js.undefined
  var xAdsRegion: js.UndefOr[String] = js.undefined
}

object IfMatch {
  @scala.inline
  def apply(contentDisposition: String = null, ifMatch: String = null, xAdsRegion: String = null): IfMatch = {
    val __obj = js.Dynamic.literal()
    if (contentDisposition != null) __obj.updateDynamic("contentDisposition")(contentDisposition.asInstanceOf[js.Any])
    if (ifMatch != null) __obj.updateDynamic("ifMatch")(ifMatch.asInstanceOf[js.Any])
    if (xAdsRegion != null) __obj.updateDynamic("xAdsRegion")(xAdsRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[IfMatch]
  }
}

