package typings.draftjsDashToDashHtml.draftjsDashToDashHtmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HashtagConfig extends js.Object {
  var separator: js.UndefOr[String] = js.undefined
  var trigger: js.UndefOr[String] = js.undefined
}

object HashtagConfig {
  @scala.inline
  def apply(separator: String = null, trigger: String = null): HashtagConfig = {
    val __obj = js.Dynamic.literal()
    if (separator != null) __obj.updateDynamic("separator")(separator)
    if (trigger != null) __obj.updateDynamic("trigger")(trigger)
    __obj.asInstanceOf[HashtagConfig]
  }
}

