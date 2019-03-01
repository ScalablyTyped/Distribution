package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BannerImageUrl extends js.Object {
  var bannerImageUrl: js.UndefOr[java.lang.String] = js.undefined
  var imageUrl: js.UndefOr[java.lang.String] = js.undefined
  var seriesId: js.UndefOr[java.lang.String] = js.undefined
  var seriesType: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_BannerImageUrl {
  @scala.inline
  def apply(
    bannerImageUrl: java.lang.String = null,
    imageUrl: java.lang.String = null,
    seriesId: java.lang.String = null,
    seriesType: java.lang.String = null,
    title: java.lang.String = null
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

