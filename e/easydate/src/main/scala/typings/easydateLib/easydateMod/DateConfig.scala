package typings
package easydateLib.easydateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateConfig extends js.Object {
  var adjust: js.UndefOr[scala.Boolean] = js.undefined
  var setDate: js.UndefOr[java.lang.String] = js.undefined
  var timeZone: js.UndefOr[easydateLib.easydateLibStrings.utc | easydateLib.easydateLibStrings.local] = js.undefined
}

object DateConfig {
  @scala.inline
  def apply(
    adjust: js.UndefOr[scala.Boolean] = js.undefined,
    setDate: java.lang.String = null,
    timeZone: easydateLib.easydateLibStrings.utc | easydateLib.easydateLibStrings.local = null
  ): DateConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adjust)) __obj.updateDynamic("adjust")(adjust)
    if (setDate != null) __obj.updateDynamic("setDate")(setDate)
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateConfig]
  }
}

