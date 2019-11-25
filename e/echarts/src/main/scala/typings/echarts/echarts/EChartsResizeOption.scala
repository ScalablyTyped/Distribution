package typings.echarts.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EChartsResizeOption extends js.Object {
  /**
    * Chart height.
    */
  var height: js.UndefOr[Double | String] = js.undefined
  /**
    * Specify whether or not to prevent triggering events.
    */
  var silent: js.UndefOr[Boolean] = js.undefined
  /**
    * Chart width.
    */
  var width: js.UndefOr[Double | String] = js.undefined
}

object EChartsResizeOption {
  @scala.inline
  def apply(
    height: Double | String = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    width: Double | String = null
  ): EChartsResizeOption = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[EChartsResizeOption]
  }
}

