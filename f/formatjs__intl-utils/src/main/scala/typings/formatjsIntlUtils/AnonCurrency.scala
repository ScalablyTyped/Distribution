package typings.formatjsIntlUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurrency extends js.Object {
  var currency: AnonLongNarrowShortCurrencyCode
  /**
    * Maps language subtag like `zh-CN` to their display names.
    */
  var language: AnonLong
  var region: AnonLongNarrow
  var script: AnonLongNarrowShort
}

object AnonCurrency {
  @scala.inline
  def apply(
    currency: AnonLongNarrowShortCurrencyCode,
    language: AnonLong,
    region: AnonLongNarrow,
    script: AnonLongNarrowShort
  ): AnonCurrency = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCurrency]
  }
}

