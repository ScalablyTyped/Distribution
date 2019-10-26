package typings.forgeDashApis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentDispositionIfMatch extends js.Object {
  var contentDisposition: js.UndefOr[String] = js.undefined
  var ifMatch: js.UndefOr[String] = js.undefined
  var xAdsRegion: js.UndefOr[String] = js.undefined
}

object Anon_ContentDispositionIfMatch {
  @scala.inline
  def apply(contentDisposition: String = null, ifMatch: String = null, xAdsRegion: String = null): Anon_ContentDispositionIfMatch = {
    val __obj = js.Dynamic.literal()
    if (contentDisposition != null) __obj.updateDynamic("contentDisposition")(contentDisposition)
    if (ifMatch != null) __obj.updateDynamic("ifMatch")(ifMatch)
    if (xAdsRegion != null) __obj.updateDynamic("xAdsRegion")(xAdsRegion)
    __obj.asInstanceOf[Anon_ContentDispositionIfMatch]
  }
}

