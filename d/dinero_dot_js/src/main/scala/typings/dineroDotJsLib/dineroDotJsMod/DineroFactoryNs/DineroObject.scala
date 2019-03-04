package typings
package dineroDotJsLib.dineroDotJsMod.DineroFactoryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DineroObject extends js.Object {
  var amount: scala.Double
  var currency: java.lang.String
  var precision: scala.Double
}

object DineroObject {
  @scala.inline
  def apply(amount: scala.Double, currency: java.lang.String, precision: scala.Double): DineroObject = {
    val __obj = js.Dynamic.literal(amount = amount, currency = currency, precision = precision)
  
    __obj.asInstanceOf[DineroObject]
  }
}

