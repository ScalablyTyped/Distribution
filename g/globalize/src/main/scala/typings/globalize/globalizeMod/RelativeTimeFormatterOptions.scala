package typings.globalize.globalizeMod

import typings.globalize.globalizeStrings.narrow
import typings.globalize.globalizeStrings.short
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelativeTimeFormatterOptions extends js.Object {
  /**
  		 * eg. "short" or "narrow". Or falsy for default long form
  		 */
  var form: js.UndefOr[short | narrow] = js.undefined
}

object RelativeTimeFormatterOptions {
  @scala.inline
  def apply(form: short | narrow = null): RelativeTimeFormatterOptions = {
    val __obj = js.Dynamic.literal()
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelativeTimeFormatterOptions]
  }
}

