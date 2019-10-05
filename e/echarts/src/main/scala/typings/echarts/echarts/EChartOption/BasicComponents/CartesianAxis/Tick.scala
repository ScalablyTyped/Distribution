package typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis

import typings.echarts.echarts.EChartOption.LineStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @todo describe
  */
trait Tick extends js.Object {
  var alignWithLabel: js.UndefOr[Boolean] = js.undefined
  var inside: js.UndefOr[Boolean] = js.undefined
  var interval: js.UndefOr[Double | js.Function] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
  var lineStyle: js.UndefOr[LineStyle] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
}

object Tick {
  @scala.inline
  def apply(
    alignWithLabel: js.UndefOr[Boolean] = js.undefined,
    inside: js.UndefOr[Boolean] = js.undefined,
    interval: Double | js.Function = null,
    length: Int | Double = null,
    lineStyle: LineStyle = null,
    show: js.UndefOr[Boolean] = js.undefined
  ): Tick = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alignWithLabel)) __obj.updateDynamic("alignWithLabel")(alignWithLabel)
    if (!js.isUndefined(inside)) __obj.updateDynamic("inside")(inside)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[Tick]
  }
}

