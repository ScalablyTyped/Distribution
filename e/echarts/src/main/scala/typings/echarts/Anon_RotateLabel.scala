package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RotateLabel extends js.Object {
  /**
    * Whether to rotate the label automatically.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.circular.rotateLabel
    */
  var rotateLabel: js.UndefOr[Boolean] = js.undefined
}

object Anon_RotateLabel {
  @scala.inline
  def apply(rotateLabel: js.UndefOr[Boolean] = js.undefined): Anon_RotateLabel = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(rotateLabel)) __obj.updateDynamic("rotateLabel")(rotateLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_RotateLabel]
  }
}

