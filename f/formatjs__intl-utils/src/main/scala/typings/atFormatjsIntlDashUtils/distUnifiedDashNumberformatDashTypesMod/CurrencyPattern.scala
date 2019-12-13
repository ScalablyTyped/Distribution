package typings.atFormatjsIntlDashUtils.distUnifiedDashNumberformatDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrencyPattern extends js.Object {
  var one: js.UndefOr[String] = js.undefined
  var other: String
}

object CurrencyPattern {
  @scala.inline
  def apply(other: String, one: String = null): CurrencyPattern = {
    val __obj = js.Dynamic.literal(other = other.asInstanceOf[js.Any])
    if (one != null) __obj.updateDynamic("one")(one.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrencyPattern]
  }
}

