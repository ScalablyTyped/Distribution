package typings.formatjsIntlRelativetimeformat.mod

import typings.formatjsIntlRelativetimeformat.formatjsIntlRelativetimeformatStrings.always
import typings.formatjsIntlRelativetimeformat.formatjsIntlRelativetimeformatStrings.auto
import typings.formatjsIntlRelativetimeformat.formatjsIntlRelativetimeformatStrings.long
import typings.formatjsIntlRelativetimeformat.formatjsIntlRelativetimeformatStrings.narrow
import typings.formatjsIntlRelativetimeformat.formatjsIntlRelativetimeformatStrings.short
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.IntlRelativeTimeFormatOptions, 'style' | 'numeric'> */
trait ResolvedIntlRelativeTimeFormatOptions extends js.Object {
  /**
    * The BCP 47 language tag for the locale actually used.
    * If any Unicode extension values were requested in the
    * input BCP 47 language tag that led to this locale,
    * the key-value pairs that were requested and are
    * supported for this locale are included in locale.
    */
  var locale: String
  /**
    * The value requested using the Unicode
    * extension key "nu" or filled in as a default.
    */
  var numberingSystem: String
  var numeric: js.UndefOr[always | auto] = js.undefined
  var style: js.UndefOr[long | short | narrow] = js.undefined
}

object ResolvedIntlRelativeTimeFormatOptions {
  @scala.inline
  def apply(
    locale: String,
    numberingSystem: String,
    numeric: always | auto = null,
    style: long | short | narrow = null
  ): ResolvedIntlRelativeTimeFormatOptions = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], numberingSystem = numberingSystem.asInstanceOf[js.Any])
    if (numeric != null) __obj.updateDynamic("numeric")(numeric.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedIntlRelativeTimeFormatOptions]
  }
}

