package typings.formatjsIntlListformat.mod

import typings.formatjsIntlListformat.formatjsIntlListformatStrings.`best fit`
import typings.formatjsIntlListformat.formatjsIntlListformatStrings.conjunction
import typings.formatjsIntlListformat.formatjsIntlListformatStrings.disjunction
import typings.formatjsIntlListformat.formatjsIntlListformatStrings.long
import typings.formatjsIntlListformat.formatjsIntlListformatStrings.lookup
import typings.formatjsIntlListformat.formatjsIntlListformatStrings.narrow
import typings.formatjsIntlListformat.formatjsIntlListformatStrings.short
import typings.formatjsIntlListformat.formatjsIntlListformatStrings.unit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntlListFormatOptions extends js.Object {
  /**
    * The locale matching algorithm to use.
    * Possible values are "lookup" and "best fit"; the default is "best fit".
    * For information about this option, see
    * https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl#Locale_negotiation.
    */
  var localeMatcher: js.UndefOr[(`best fit`) | lookup] = js.undefined
  /**
    * The length of the internationalized message. Possible values are:
    * - "long" (default, e.g., in 1 month)
    * - "short" (e.g., in 1 mo.),
    * - or "narrow" (e.g., in 1 mo.).
    * The narrow style could be similar to the short style for some locales.
    */
  var style: js.UndefOr[long | short | narrow] = js.undefined
  /**
    * The format of output message. Possible values are:
    * - "always" (default, e.g., 1 day ago),
    * - or "auto" (e.g., yesterday).
    * The "auto" value allows to not always have to
    * use numeric values in the output.
    */
  var `type`: js.UndefOr[conjunction | disjunction | unit] = js.undefined
}

object IntlListFormatOptions {
  @scala.inline
  def apply(
    localeMatcher: (`best fit`) | lookup = null,
    style: long | short | narrow = null,
    `type`: conjunction | disjunction | unit = null
  ): IntlListFormatOptions = {
    val __obj = js.Dynamic.literal()
    if (localeMatcher != null) __obj.updateDynamic("localeMatcher")(localeMatcher.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntlListFormatOptions]
  }
}

