package typings
package echartsLib.echartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EChartsResponsiveOption extends js.Object {
  var baseOption: js.UndefOr[EChartOption[echartsLib.echartsNs.EChartOptionNs.Series]] = js.undefined
  var media: js.UndefOr[js.Array[EChartsMediaOption]] = js.undefined
}

object EChartsResponsiveOption {
  @scala.inline
  def apply(
    baseOption: EChartOption[echartsLib.echartsNs.EChartOptionNs.Series] = null,
    media: js.Array[EChartsMediaOption] = null
  ): EChartsResponsiveOption = {
    val __obj = js.Dynamic.literal()
    if (baseOption != null) __obj.updateDynamic("baseOption")(baseOption)
    if (media != null) __obj.updateDynamic("media")(media)
    __obj.asInstanceOf[EChartsResponsiveOption]
  }
}

