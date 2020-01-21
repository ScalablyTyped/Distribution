package typings.formatjsIntlUtils

import typings.formatjsIntlUtils.formatjsIntlUtilsStrings.`best fit`
import typings.formatjsIntlUtils.formatjsIntlUtilsStrings.lookup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBestfit extends js.Object {
  var localeMatcher: js.UndefOr[(`best fit`) | lookup] = js.undefined
}

object AnonBestfit {
  @scala.inline
  def apply(localeMatcher: (`best fit`) | lookup = null): AnonBestfit = {
    val __obj = js.Dynamic.literal()
    if (localeMatcher != null) __obj.updateDynamic("localeMatcher")(localeMatcher.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBestfit]
  }
}

