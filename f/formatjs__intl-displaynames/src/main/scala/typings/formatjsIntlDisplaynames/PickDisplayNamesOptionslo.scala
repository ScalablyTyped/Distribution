package typings.formatjsIntlDisplaynames

import typings.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.`best fit`
import typings.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.lookup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@formatjs/intl-displaynames.@formatjs/intl-displaynames/lib/intl-displaynames.DisplayNamesOptions, 'localeMatcher'> */
trait PickDisplayNamesOptionslo extends js.Object {
  var localeMatcher: js.UndefOr[lookup | (`best fit`)] = js.undefined
}

object PickDisplayNamesOptionslo {
  @scala.inline
  def apply(localeMatcher: lookup | (`best fit`) = null): PickDisplayNamesOptionslo = {
    val __obj = js.Dynamic.literal()
    if (localeMatcher != null) __obj.updateDynamic("localeMatcher")(localeMatcher.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickDisplayNamesOptionslo]
  }
}

