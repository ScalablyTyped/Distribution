package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConcatPosition extends js.Object {
  /** Index of the inner source. */
  var index: js.UndefOr[Double] = js.undefined
  /** Position within the inner source. */
  var position: js.UndefOr[Position] = js.undefined
}

object ConcatPosition {
  @scala.inline
  def apply(index: js.UndefOr[Double] = js.undefined, position: Position = null): ConcatPosition = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConcatPosition]
  }
}

