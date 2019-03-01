package typings
package gapiDotClientDotPlusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LeftImageOffset extends js.Object {
  /** The difference between the left position of the cover image and the actual displayed cover image. Only valid for banner layout. */
  var leftImageOffset: js.UndefOr[scala.Double] = js.undefined
  /** The difference between the top position of the cover image and the actual displayed cover image. Only valid for banner layout. */
  var topImageOffset: js.UndefOr[scala.Double] = js.undefined
}

object Anon_LeftImageOffset {
  @scala.inline
  def apply(leftImageOffset: scala.Int | scala.Double = null, topImageOffset: scala.Int | scala.Double = null): Anon_LeftImageOffset = {
    val __obj = js.Dynamic.literal()
    if (leftImageOffset != null) __obj.updateDynamic("leftImageOffset")(leftImageOffset.asInstanceOf[js.Any])
    if (topImageOffset != null) __obj.updateDynamic("topImageOffset")(topImageOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_LeftImageOffset]
  }
}

