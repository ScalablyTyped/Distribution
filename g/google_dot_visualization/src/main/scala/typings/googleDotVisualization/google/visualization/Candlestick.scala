package typings.googleDotVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Candlestick extends js.Object {
  var fallingColor: js.UndefOr[ChartStrokeFill] = js.undefined
  var hollowIsRising: js.UndefOr[Boolean] = js.undefined
  var risingColor: js.UndefOr[ChartStrokeFill] = js.undefined
}

object Candlestick {
  @scala.inline
  def apply(
    fallingColor: ChartStrokeFill = null,
    hollowIsRising: js.UndefOr[Boolean] = js.undefined,
    risingColor: ChartStrokeFill = null
  ): Candlestick = {
    val __obj = js.Dynamic.literal()
    if (fallingColor != null) __obj.updateDynamic("fallingColor")(fallingColor.asInstanceOf[js.Any])
    if (!js.isUndefined(hollowIsRising)) __obj.updateDynamic("hollowIsRising")(hollowIsRising.asInstanceOf[js.Any])
    if (risingColor != null) __obj.updateDynamic("risingColor")(risingColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Candlestick]
  }
}

