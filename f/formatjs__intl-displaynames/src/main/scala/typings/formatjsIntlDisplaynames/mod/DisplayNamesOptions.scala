package typings.formatjsIntlDisplaynames.mod

import typings.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.`best fit`
import typings.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.code
import typings.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.currency
import typings.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.language
import typings.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.long
import typings.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.lookup
import typings.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.narrow
import typings.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.none
import typings.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.region
import typings.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.script
import typings.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.short
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplayNamesOptions extends js.Object {
  var fallback: js.UndefOr[code | none] = js.undefined
  var localeMatcher: js.UndefOr[lookup | (`best fit`)] = js.undefined
  var style: js.UndefOr[narrow | short | long] = js.undefined
  var `type`: js.UndefOr[language | region | script | currency] = js.undefined
}

object DisplayNamesOptions {
  @scala.inline
  def apply(
    fallback: code | none = null,
    localeMatcher: lookup | (`best fit`) = null,
    style: narrow | short | long = null,
    `type`: language | region | script | currency = null
  ): DisplayNamesOptions = {
    val __obj = js.Dynamic.literal()
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    if (localeMatcher != null) __obj.updateDynamic("localeMatcher")(localeMatcher.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayNamesOptions]
  }
}

