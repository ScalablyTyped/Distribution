package typings
package echartsLib.echartsNs.EChartOptionNs.BasicComponentsNs.CartesianAxisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @todo describe
  */
trait Tick extends js.Object {
  var alignWithLabel: js.UndefOr[scala.Boolean] = js.undefined
  var inside: js.UndefOr[scala.Boolean] = js.undefined
  var interval: js.UndefOr[scala.Double | js.Function] = js.undefined
  var length: js.UndefOr[scala.Double] = js.undefined
  var lineStyle: js.UndefOr[echartsLib.Anon_Color] = js.undefined
  var show: js.UndefOr[scala.Boolean] = js.undefined
}

object Tick {
  @scala.inline
  def apply(
    alignWithLabel: js.UndefOr[scala.Boolean] = js.undefined,
    inside: js.UndefOr[scala.Boolean] = js.undefined,
    interval: scala.Double | js.Function = null,
    length: scala.Int | scala.Double = null,
    lineStyle: echartsLib.Anon_Color = null,
    show: js.UndefOr[scala.Boolean] = js.undefined
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

