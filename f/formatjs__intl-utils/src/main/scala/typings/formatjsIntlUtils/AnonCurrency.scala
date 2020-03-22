package typings.formatjsIntlUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurrency extends js.Object {
  var currency: AnonLongNarrow
  /**
    * Maps language subtag like `zh-CN` to their display names.
    */
  var language: AnonLong
  var region: AnonNarrow
  var script: AnonShort
}

object AnonCurrency {
  @scala.inline
  def apply(currency: AnonLongNarrow, language: AnonLong, region: AnonNarrow, script: AnonShort): AnonCurrency = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCurrency]
  }
}

