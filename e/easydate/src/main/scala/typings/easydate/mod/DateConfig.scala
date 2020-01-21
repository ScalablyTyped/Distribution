package typings.easydate.mod

import typings.easydate.easydateStrings.local
import typings.easydate.easydateStrings.utc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateConfig extends js.Object {
  var adjust: js.UndefOr[Boolean] = js.undefined
  var setDate: js.UndefOr[String] = js.undefined
  var timeZone: js.UndefOr[utc | local] = js.undefined
}

object DateConfig {
  @scala.inline
  def apply(adjust: js.UndefOr[Boolean] = js.undefined, setDate: String = null, timeZone: utc | local = null): DateConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adjust)) __obj.updateDynamic("adjust")(adjust.asInstanceOf[js.Any])
    if (setDate != null) __obj.updateDynamic("setDate")(setDate.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateConfig]
  }
}

