package typings.googleDotVisualization.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Candlestick extends js.Object {
  var fallingColor: js.UndefOr[ChartStroke] = js.undefined
  var hollowIsRising: js.UndefOr[Boolean] = js.undefined
  var risingColor: js.UndefOr[ChartStroke] = js.undefined
}

object Candlestick {
  @scala.inline
  def apply(
    fallingColor: ChartStroke = null,
    hollowIsRising: js.UndefOr[Boolean] = js.undefined,
    risingColor: ChartStroke = null
  ): Candlestick = {
    val __obj = js.Dynamic.literal()
    if (fallingColor != null) __obj.updateDynamic("fallingColor")(fallingColor)
    if (!js.isUndefined(hollowIsRising)) __obj.updateDynamic("hollowIsRising")(hollowIsRising)
    if (risingColor != null) __obj.updateDynamic("risingColor")(risingColor)
    __obj.asInstanceOf[Candlestick]
  }
}

