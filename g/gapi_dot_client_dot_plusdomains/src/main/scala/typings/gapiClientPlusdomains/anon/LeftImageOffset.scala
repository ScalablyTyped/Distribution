package typings.gapiClientPlusdomains.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeftImageOffset extends js.Object {
  /** The difference between the left position of the cover image and the actual displayed cover image. Only valid for banner layout. */
  var leftImageOffset: js.UndefOr[Double] = js.undefined
  /** The difference between the top position of the cover image and the actual displayed cover image. Only valid for banner layout. */
  var topImageOffset: js.UndefOr[Double] = js.undefined
}

object LeftImageOffset {
  @scala.inline
  def apply(
    leftImageOffset: js.UndefOr[Double] = js.undefined,
    topImageOffset: js.UndefOr[Double] = js.undefined
  ): LeftImageOffset = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(leftImageOffset)) __obj.updateDynamic("leftImageOffset")(leftImageOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(topImageOffset)) __obj.updateDynamic("topImageOffset")(topImageOffset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeftImageOffset]
  }
}

