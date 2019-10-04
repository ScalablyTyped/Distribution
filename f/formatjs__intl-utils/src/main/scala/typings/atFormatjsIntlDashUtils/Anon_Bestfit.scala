package typings.atFormatjsIntlDashUtils

import typings.atFormatjsIntlDashUtils.atFormatjsIntlDashUtilsStrings.`best fit`
import typings.atFormatjsIntlDashUtils.atFormatjsIntlDashUtilsStrings.lookup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bestfit extends js.Object {
  var localeMatcher: js.UndefOr[(`best fit`) | lookup] = js.undefined
}

object Anon_Bestfit {
  @scala.inline
  def apply(localeMatcher: (`best fit`) | lookup = null): Anon_Bestfit = {
    val __obj = js.Dynamic.literal()
    if (localeMatcher != null) __obj.updateDynamic("localeMatcher")(localeMatcher.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Bestfit]
  }
}

