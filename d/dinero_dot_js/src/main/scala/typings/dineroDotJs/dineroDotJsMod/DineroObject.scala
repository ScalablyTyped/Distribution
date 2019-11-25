package typings.dineroDotJs.dineroDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DineroObject extends js.Object {
  var amount: Double
  var currency: Currency
  var precision: Double
}

object DineroObject {
  @scala.inline
  def apply(amount: Double, currency: Currency, precision: Double): DineroObject = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], precision = precision.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DineroObject]
  }
}

