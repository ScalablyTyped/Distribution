package typings.electron.ElectronNs

import typings.electron.electronStrings.`transactions-updated`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InAppPurchase extends EventEmitter {
  @JSName("addListener")
  def addListener_transactionsupdated(
    event: `transactions-updated`,
    listener: js.Function2[/* event */ Event, /* transactions */ js.Array[Transaction], Unit]
  ): this.type = js.native
  def canMakePayments(): Boolean = js.native
  /**
    * Completes all pending transactions.
    */
  def finishAllTransactions(): Unit = js.native
  /**
    * Completes the pending transactions corresponding to the date.
    */
  def finishTransactionByDate(date: String): Unit = js.native
  /**
    * Retrieves the product descriptions.
    */
  def getProducts(productIDs: js.Array[String]): js.Promise[js.Array[Product]] = js.native
  /**
    * Retrieves the product descriptions. Deprecated Soon
    */
  def getProducts(productIDs: js.Array[String], callback: js.Function1[/* products */ js.Array[Product], Unit]): Unit = js.native
  def getReceiptURL(): String = js.native
  // Docs: http://electronjs.org/docs/api/in-app-purchase
  /**
    * Emitted when one or more transactions have been updated.
    */
  @JSName("on")
  def on_transactionsupdated(
    event: `transactions-updated`,
    listener: js.Function2[/* event */ Event, /* transactions */ js.Array[Transaction], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_transactionsupdated(
    event: `transactions-updated`,
    listener: js.Function2[/* event */ Event, /* transactions */ js.Array[Transaction], Unit]
  ): this.type = js.native
  /**
    * You should listen for the transactions-updated event as soon as possible and
    * certainly before you call purchaseProduct.
    */
  def purchaseProduct(productID: String): js.Promise[Boolean] = js.native
  def purchaseProduct(productID: String, quantity: Double): js.Promise[Boolean] = js.native
  def purchaseProduct(productID: String, quantity: Double, callback: js.Function1[/* isProductValid */ Boolean, Unit]): Unit = js.native
  /**
    * You should listen for the transactions-updated event as soon as possible and
    * certainly before you call purchaseProduct. Deprecated Soon
    */
  @JSName("purchaseProduct")
  def purchaseProduct_Unit(productID: String): Unit = js.native
  @JSName("purchaseProduct")
  def purchaseProduct_Unit(productID: String, quantity: Double): Unit = js.native
  @JSName("removeListener")
  def removeListener_transactionsupdated(
    event: `transactions-updated`,
    listener: js.Function2[/* event */ Event, /* transactions */ js.Array[Transaction], Unit]
  ): this.type = js.native
}

