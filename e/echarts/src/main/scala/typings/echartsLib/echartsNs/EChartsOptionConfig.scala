package typings
package echartsLib.echartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EChartsOptionConfig extends js.Object {
  var lazyUpdate: js.UndefOr[scala.Boolean] = js.undefined
  var notMerge: js.UndefOr[scala.Boolean] = js.undefined
  var silent: js.UndefOr[scala.Boolean] = js.undefined
}

object EChartsOptionConfig {
  @scala.inline
  def apply(
    lazyUpdate: js.UndefOr[scala.Boolean] = js.undefined,
    notMerge: js.UndefOr[scala.Boolean] = js.undefined,
    silent: js.UndefOr[scala.Boolean] = js.undefined
  ): EChartsOptionConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(lazyUpdate)) __obj.updateDynamic("lazyUpdate")(lazyUpdate)
    if (!js.isUndefined(notMerge)) __obj.updateDynamic("notMerge")(notMerge)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    __obj.asInstanceOf[EChartsOptionConfig]
  }
}

