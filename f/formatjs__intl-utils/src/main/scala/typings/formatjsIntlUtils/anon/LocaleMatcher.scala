package typings.formatjsIntlUtils.anon

import typings.formatjsIntlUtils.formatjsIntlUtilsStrings.`best fit`
import typings.formatjsIntlUtils.formatjsIntlUtilsStrings.lookup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleMatcher extends js.Object {
  var localeMatcher: js.UndefOr[(`best fit`) | lookup] = js.undefined
}

object LocaleMatcher {
  @scala.inline
  def apply(localeMatcher: (`best fit`) | lookup = null): LocaleMatcher = {
    val __obj = js.Dynamic.literal()
    if (localeMatcher != null) __obj.updateDynamic("localeMatcher")(localeMatcher.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleMatcher]
  }
}

