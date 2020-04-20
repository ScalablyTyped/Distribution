package typings.formatjsIntlUtils.numberTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrencySignPattern extends js.Object {
  var accounting: SignDisplayPattern
  var standard: SignDisplayPattern
}

object CurrencySignPattern {
  @scala.inline
  def apply(accounting: SignDisplayPattern, standard: SignDisplayPattern): CurrencySignPattern = {
    val __obj = js.Dynamic.literal(accounting = accounting.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrencySignPattern]
  }
}

