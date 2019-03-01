package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Payment extends js.Object {
  /**
    * The identifier of the purchased product.
    */
  var productIdentifier: java.lang.String
  /**
    * The quantity purchased.
    */
  var quantity: scala.Double
}

object Payment {
  @scala.inline
  def apply(productIdentifier: java.lang.String, quantity: scala.Double): Payment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("productIdentifier")(productIdentifier)
    __obj.updateDynamic("quantity")(quantity)
    __obj.asInstanceOf[Payment]
  }
}

