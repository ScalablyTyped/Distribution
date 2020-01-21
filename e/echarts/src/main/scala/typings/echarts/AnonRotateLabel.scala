package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRotateLabel extends js.Object {
  /**
    * Whether to rotate the label automatically.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.circular.rotateLabel
    */
  var rotateLabel: js.UndefOr[Boolean] = js.undefined
}

object AnonRotateLabel {
  @scala.inline
  def apply(rotateLabel: js.UndefOr[Boolean] = js.undefined): AnonRotateLabel = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(rotateLabel)) __obj.updateDynamic("rotateLabel")(rotateLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRotateLabel]
  }
}

