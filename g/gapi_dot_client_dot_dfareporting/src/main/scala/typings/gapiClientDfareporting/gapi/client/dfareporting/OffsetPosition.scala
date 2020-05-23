package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OffsetPosition extends js.Object {
  /** Offset distance from left side of an asset or a window. */
  var left: js.UndefOr[Double] = js.undefined
  /** Offset distance from top side of an asset or a window. */
  var top: js.UndefOr[Double] = js.undefined
}

object OffsetPosition {
  @scala.inline
  def apply(left: js.UndefOr[Double] = js.undefined, top: js.UndefOr[Double] = js.undefined): OffsetPosition = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetPosition]
  }
}

