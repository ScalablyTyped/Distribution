package typings
package globalizeLib.distGlobalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelativeTimeFormatterOptions extends js.Object {
  /**
  		 * eg. "short" or "narrow". Or falsy for default long form
  		 */
  var form: js.UndefOr[globalizeLib.globalizeLibStrings.short | globalizeLib.globalizeLibStrings.narrow] = js.undefined
}

object RelativeTimeFormatterOptions {
  @scala.inline
  def apply(form: globalizeLib.globalizeLibStrings.short | globalizeLib.globalizeLibStrings.narrow = null): RelativeTimeFormatterOptions = {
    val __obj = js.Dynamic.literal()
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelativeTimeFormatterOptions]
  }
}

