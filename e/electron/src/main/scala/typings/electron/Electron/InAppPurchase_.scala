package typings.electron.Electron

import typings.electron.electronStrings.`transactions-updated`
import typings.node.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InAppPurchase_ extends EventEmitter {
  @JSName("addListener")
  def addListener_transactionsupdated(event: `transactions-updated`, listener: js.Function): this.type = js.native
  /**
    * whether a user can make a payment.
    */
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
    * Resolves with an array of `Product` objects.
    * 
  Retrieves the product descriptions.
    */
  def getProducts(productIDs: js.Array[String]): js.Promise[js.Array[Product]] = js.native
  /**
    * the path to the receipt.
    */
  def getReceiptURL(): String = js.native
  // Docs: http://electronjs.org/docs/api/in-app-purchase
  @JSName("on")
  def on_transactionsupdated(event: `transactions-updated`, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_transactionsupdated(event: `transactions-updated`, listener: js.Function): this.type = js.native
  /**
    * Returns `true` if the product is valid and added to the payment queue.
    *
    * You should listen for the `transactions-updated` event as soon as possible and
    * certainly before you call `purchaseProduct`.
    */
  def purchaseProduct(productID: String): js.Promise[Boolean] = js.native
  def purchaseProduct(productID: String, quantity: Double): js.Promise[Boolean] = js.native
  @JSName("removeListener")
  def removeListener_transactionsupdated(event: `transactions-updated`, listener: js.Function): this.type = js.native
}

