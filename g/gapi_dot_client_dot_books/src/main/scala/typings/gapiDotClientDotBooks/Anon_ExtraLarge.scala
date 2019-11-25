package typings.gapiDotClientDotBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExtraLarge extends js.Object {
  /** Image link for extra large size (width of ~1280 pixels). (In LITE projection) */
  var extraLarge: js.UndefOr[String] = js.undefined
  /** Image link for large size (width of ~800 pixels). (In LITE projection) */
  var large: js.UndefOr[String] = js.undefined
  /** Image link for medium size (width of ~575 pixels). (In LITE projection) */
  var medium: js.UndefOr[String] = js.undefined
  /** Image link for small size (width of ~300 pixels). (In LITE projection) */
  var small: js.UndefOr[String] = js.undefined
  /** Image link for small thumbnail size (width of ~80 pixels). (In LITE projection) */
  var smallThumbnail: js.UndefOr[String] = js.undefined
  /** Image link for thumbnail size (width of ~128 pixels). (In LITE projection) */
  var thumbnail: js.UndefOr[String] = js.undefined
}

object Anon_ExtraLarge {
  @scala.inline
  def apply(
    extraLarge: String = null,
    large: String = null,
    medium: String = null,
    small: String = null,
    smallThumbnail: String = null,
    thumbnail: String = null
  ): Anon_ExtraLarge = {
    val __obj = js.Dynamic.literal()
    if (extraLarge != null) __obj.updateDynamic("extraLarge")(extraLarge.asInstanceOf[js.Any])
    if (large != null) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (medium != null) __obj.updateDynamic("medium")(medium.asInstanceOf[js.Any])
    if (small != null) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    if (smallThumbnail != null) __obj.updateDynamic("smallThumbnail")(smallThumbnail.asInstanceOf[js.Any])
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ExtraLarge]
  }
}

