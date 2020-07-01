package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtraLarge extends js.Object {
  var extraLarge: js.UndefOr[String] = js.native
  var large: js.UndefOr[String] = js.native
  var medium: js.UndefOr[String] = js.native
  var small: js.UndefOr[String] = js.native
  var smallThumbnail: js.UndefOr[String] = js.native
  var thumbnail: js.UndefOr[String] = js.native
}

object ExtraLarge {
  @scala.inline
  def apply(
    extraLarge: String = null,
    large: String = null,
    medium: String = null,
    small: String = null,
    smallThumbnail: String = null,
    thumbnail: String = null
  ): ExtraLarge = {
    val __obj = js.Dynamic.literal()
    if (extraLarge != null) __obj.updateDynamic("extraLarge")(extraLarge.asInstanceOf[js.Any])
    if (large != null) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (medium != null) __obj.updateDynamic("medium")(medium.asInstanceOf[js.Any])
    if (small != null) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    if (smallThumbnail != null) __obj.updateDynamic("smallThumbnail")(smallThumbnail.asInstanceOf[js.Any])
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtraLarge]
  }
}

