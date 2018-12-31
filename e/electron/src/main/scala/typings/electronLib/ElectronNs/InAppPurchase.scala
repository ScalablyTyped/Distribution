package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InAppPurchase extends EventEmitter {
  @JSName("addListener")
  def `addListener_transactions-updated`(
    event: electronLib.electronLibStrings.`transactions-updated`,
    listener: js.Function2[/* event */ Event, /* transactions */ js.Array[Transaction], scala.Unit]
  ): this.type = js.native
  def canMakePayments(): scala.Boolean = js.native
  /**
    * Completes all pending transactions.
    */
  def finishAllTransactions(): scala.Unit = js.native
  /**
    * Completes the pending transactions corresponding to the date.
    */
  def finishTransactionByDate(date: java.lang.String): scala.Unit = js.native
  /**
    * Retrieves the product descriptions.
    */
  def getProducts(
    productIDs: js.Array[java.lang.String],
    callback: js.Function1[/* products */ js.Array[Product], scala.Unit]
  ): scala.Unit = js.native
  def getReceiptURL(): java.lang.String = js.native
  // Docs: http://electronjs.org/docs/api/in-app-purchase
  /**
    * Emitted when one or more transactions have been updated.
    */
  @JSName("on")
  def `on_transactions-updated`(
    event: electronLib.electronLibStrings.`transactions-updated`,
    listener: js.Function2[/* event */ Event, /* transactions */ js.Array[Transaction], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def `once_transactions-updated`(
    event: electronLib.electronLibStrings.`transactions-updated`,
    listener: js.Function2[/* event */ Event, /* transactions */ js.Array[Transaction], scala.Unit]
  ): this.type = js.native
  /**
    * You should listen for the transactions-updated event as soon as possible and
    * certainly before you call purchaseProduct.
    */
  def purchaseProduct(productID: java.lang.String): scala.Unit = js.native
  def purchaseProduct(productID: java.lang.String, quantity: scala.Double): scala.Unit = js.native
  def purchaseProduct(
    productID: java.lang.String,
    quantity: scala.Double,
    callback: js.Function1[/* isProductValid */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  @JSName("removeListener")
  def `removeListener_transactions-updated`(
    event: electronLib.electronLibStrings.`transactions-updated`,
    listener: js.Function2[/* event */ Event, /* transactions */ js.Array[Transaction], scala.Unit]
  ): this.type = js.native
}

