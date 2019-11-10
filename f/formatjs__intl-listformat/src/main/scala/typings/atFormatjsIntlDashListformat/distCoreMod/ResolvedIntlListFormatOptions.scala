package typings.atFormatjsIntlDashListformat.distCoreMod

import typings.atFormatjsIntlDashListformat.atFormatjsIntlDashListformatStrings.conjunction
import typings.atFormatjsIntlDashListformat.atFormatjsIntlDashListformatStrings.disjunction
import typings.atFormatjsIntlDashListformat.atFormatjsIntlDashListformatStrings.long
import typings.atFormatjsIntlDashListformat.atFormatjsIntlDashListformatStrings.narrow
import typings.atFormatjsIntlDashListformat.atFormatjsIntlDashListformatStrings.short
import typings.atFormatjsIntlDashListformat.atFormatjsIntlDashListformatStrings.unit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedIntlListFormatOptions extends js.Object {
  /**
    * The BCP 47 language tag for the locale actually used.
    * If any Unicode extension values were requested in the
    * input BCP 47 language tag that led to this locale,
    * the key-value pairs that were requested and are
    * supported for this locale are included in locale.
    */
  var locale: String
  /**
    * The length of the internationalized message. Possible values are:
    * - "long" (default, e.g., in 1 month)
    * - "short" (e.g., in 1 mo.),
    * - or "narrow" (e.g., in 1 mo.).
    * The narrow style could be similar to the short style for some locales.
    */
  var style: long | short | narrow
  /**
    * The format of output message. Possible values are:
    * - "always" (default, e.g., 1 day ago),
    * - or "auto" (e.g., yesterday).
    * The "auto" value allows to not always have to
    * use numeric values in the output.
    */
  var `type`: conjunction | disjunction | unit
}

object ResolvedIntlListFormatOptions {
  @scala.inline
  def apply(locale: String, style: long | short | narrow, `type`: conjunction | disjunction | unit): ResolvedIntlListFormatOptions = {
    val __obj = js.Dynamic.literal(locale = locale, style = style.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedIntlListFormatOptions]
  }
}

