package typings.formatjsIntlUtils.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Currency extends js.Object {
  var currency: LongNarrow
  /**
    * Maps language subtag like `zh-CN` to their display names.
    */
  var language: Long
  var region: Narrow
  var script: Short
}

object Currency {
  @scala.inline
  def apply(currency: LongNarrow, language: Long, region: Narrow, script: Short): Currency = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[Currency]
  }
}

