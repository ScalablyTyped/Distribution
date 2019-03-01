package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConcatPosition extends js.Object {
  /** Index of the inner source. */
  var index: js.UndefOr[scala.Double] = js.undefined
  /** Position within the inner source. */
  var position: js.UndefOr[Position] = js.undefined
}

object ConcatPosition {
  @scala.inline
  def apply(index: scala.Int | scala.Double = null, position: Position = null): ConcatPosition = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[ConcatPosition]
  }
}

