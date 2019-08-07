package typings.atFormatjsIntlDashRelativetimeformat.distCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in 'style' | 'numeric' ]: @formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat/dist/core.IntlRelativeTimeFormatOptions[P]} */ trait ResolvedIntlRelativeTimeFormatOptions extends js.Object {
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
}

object ResolvedIntlRelativeTimeFormatOptions {
  @scala.inline
  def apply(locale: String, numberingSystem: String): ResolvedIntlRelativeTimeFormatOptions = {
    val __obj = js.Dynamic.literal(locale = locale, numberingSystem = numberingSystem)
  
    __obj.asInstanceOf[ResolvedIntlRelativeTimeFormatOptions]
  }
}

