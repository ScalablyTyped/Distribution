package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Payment extends js.Object {
  /**
    * The identifier of the purchased product.
    */
  var productIdentifier: String
  /**
    * The quantity purchased.
    */
  var quantity: Double
}

object Payment {
  @scala.inline
  def apply(productIdentifier: String, quantity: Double): Payment = {
    val __obj = js.Dynamic.literal(productIdentifier = productIdentifier, quantity = quantity)
  
    __obj.asInstanceOf[Payment]
  }
}

