package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExtraLarge extends js.Object {
  /** Image link for extra large size (width of ~1280 pixels). (In LITE projection) */
  var extraLarge: js.UndefOr[java.lang.String] = js.undefined
  /** Image link for large size (width of ~800 pixels). (In LITE projection) */
  var large: js.UndefOr[java.lang.String] = js.undefined
  /** Image link for medium size (width of ~575 pixels). (In LITE projection) */
  var medium: js.UndefOr[java.lang.String] = js.undefined
  /** Image link for small size (width of ~300 pixels). (In LITE projection) */
  var small: js.UndefOr[java.lang.String] = js.undefined
  /** Image link for small thumbnail size (width of ~80 pixels). (In LITE projection) */
  var smallThumbnail: js.UndefOr[java.lang.String] = js.undefined
  /** Image link for thumbnail size (width of ~128 pixels). (In LITE projection) */
  var thumbnail: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ExtraLarge {
  @scala.inline
  def apply(
    extraLarge: java.lang.String = null,
    large: java.lang.String = null,
    medium: java.lang.String = null,
    small: java.lang.String = null,
    smallThumbnail: java.lang.String = null,
    thumbnail: java.lang.String = null
  ): Anon_ExtraLarge = {
    val __obj = js.Dynamic.literal()
    if (extraLarge != null) __obj.updateDynamic("extraLarge")(extraLarge)
    if (large != null) __obj.updateDynamic("large")(large)
    if (medium != null) __obj.updateDynamic("medium")(medium)
    if (small != null) __obj.updateDynamic("small")(small)
    if (smallThumbnail != null) __obj.updateDynamic("smallThumbnail")(smallThumbnail)
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(thumbnail)
    __obj.asInstanceOf[Anon_ExtraLarge]
  }
}

