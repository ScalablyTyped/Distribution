package typings.gapiClientPlusdomains

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLeftImageOffset extends js.Object {
  /** The difference between the left position of the cover image and the actual displayed cover image. Only valid for banner layout. */
  var leftImageOffset: js.UndefOr[Double] = js.undefined
  /** The difference between the top position of the cover image and the actual displayed cover image. Only valid for banner layout. */
  var topImageOffset: js.UndefOr[Double] = js.undefined
}

object AnonLeftImageOffset {
  @scala.inline
  def apply(leftImageOffset: Int | Double = null, topImageOffset: Int | Double = null): AnonLeftImageOffset = {
    val __obj = js.Dynamic.literal()
    if (leftImageOffset != null) __obj.updateDynamic("leftImageOffset")(leftImageOffset.asInstanceOf[js.Any])
    if (topImageOffset != null) __obj.updateDynamic("topImageOffset")(topImageOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLeftImageOffset]
  }
}

