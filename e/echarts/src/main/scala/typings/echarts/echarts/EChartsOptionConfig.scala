package typings.echarts.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EChartsOptionConfig extends js.Object {
  var lazyUpdate: js.UndefOr[Boolean] = js.undefined
  var notMerge: js.UndefOr[Boolean] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
}

object EChartsOptionConfig {
  @scala.inline
  def apply(
    lazyUpdate: js.UndefOr[Boolean] = js.undefined,
    notMerge: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined
  ): EChartsOptionConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(lazyUpdate)) __obj.updateDynamic("lazyUpdate")(lazyUpdate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(notMerge)) __obj.updateDynamic("notMerge")(notMerge.get.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EChartsOptionConfig]
  }
}

