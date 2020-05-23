package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RotateLabel extends js.Object {
  /**
    * Whether to rotate the label automatically.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.circular.rotateLabel
    */
  var rotateLabel: js.UndefOr[Boolean] = js.undefined
}

object RotateLabel {
  @scala.inline
  def apply(rotateLabel: js.UndefOr[Boolean] = js.undefined): RotateLabel = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(rotateLabel)) __obj.updateDynamic("rotateLabel")(rotateLabel.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotateLabel]
  }
}

