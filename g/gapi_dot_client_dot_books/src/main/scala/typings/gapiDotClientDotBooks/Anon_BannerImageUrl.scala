package typings.gapiDotClientDotBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BannerImageUrl extends js.Object {
  var bannerImageUrl: js.UndefOr[String] = js.undefined
  var imageUrl: js.UndefOr[String] = js.undefined
  var seriesId: js.UndefOr[String] = js.undefined
  var seriesType: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object Anon_BannerImageUrl {
  @scala.inline
  def apply(
    bannerImageUrl: String = null,
    imageUrl: String = null,
    seriesId: String = null,
    seriesType: String = null,
    title: String = null
  ): Anon_BannerImageUrl = {
    val __obj = js.Dynamic.literal()
    if (bannerImageUrl != null) __obj.updateDynamic("bannerImageUrl")(bannerImageUrl)
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    if (seriesId != null) __obj.updateDynamic("seriesId")(seriesId)
    if (seriesType != null) __obj.updateDynamic("seriesType")(seriesType)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_BannerImageUrl]
  }
}

