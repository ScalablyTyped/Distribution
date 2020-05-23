package typings.formatjsIntlListformat.anon

import typings.formatjsIntlListformat.formatjsIntlListformatStrings.`best fit`
import typings.formatjsIntlListformat.formatjsIntlListformatStrings.lookup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@formatjs/intl-listformat.@formatjs/intl-listformat/lib/core.IntlListFormatOptions, 'localeMatcher'> */
trait PickIntlListFormatOptions extends js.Object {
  var localeMatcher: js.UndefOr[(`best fit`) | lookup] = js.undefined
}

object PickIntlListFormatOptions {
  @scala.inline
  def apply(localeMatcher: (`best fit`) | lookup = null): PickIntlListFormatOptions = {
    val __obj = js.Dynamic.literal()
    if (localeMatcher != null) __obj.updateDynamic("localeMatcher")(localeMatcher.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickIntlListFormatOptions]
  }
}

