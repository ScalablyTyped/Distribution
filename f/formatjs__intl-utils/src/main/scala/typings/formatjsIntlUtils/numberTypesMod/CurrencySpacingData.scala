package typings.formatjsIntlUtils.numberTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrencySpacingData extends js.Object {
  var afterInsertBetween: String
  var beforeInsertBetween: String
}

object CurrencySpacingData {
  @scala.inline
  def apply(afterInsertBetween: String, beforeInsertBetween: String): CurrencySpacingData = {
    val __obj = js.Dynamic.literal(afterInsertBetween = afterInsertBetween.asInstanceOf[js.Any], beforeInsertBetween = beforeInsertBetween.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrencySpacingData]
  }
}

