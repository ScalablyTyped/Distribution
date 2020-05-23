package typings.formatjsIntlRelativetimeformat.anon

import typings.formatjsIntlRelativetimeformat.formatjsIntlRelativetimeformatStrings.`best fit`
import typings.formatjsIntlRelativetimeformat.formatjsIntlRelativetimeformatStrings.lookup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat/lib/core.IntlRelativeTimeFormatOptions, 'localeMatcher'> */
trait PickIntlRelativeTimeForma extends js.Object {
  var localeMatcher: js.UndefOr[(`best fit`) | lookup] = js.undefined
}

object PickIntlRelativeTimeForma {
  @scala.inline
  def apply(localeMatcher: (`best fit`) | lookup = null): PickIntlRelativeTimeForma = {
    val __obj = js.Dynamic.literal()
    if (localeMatcher != null) __obj.updateDynamic("localeMatcher")(localeMatcher.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickIntlRelativeTimeForma]
  }
}

