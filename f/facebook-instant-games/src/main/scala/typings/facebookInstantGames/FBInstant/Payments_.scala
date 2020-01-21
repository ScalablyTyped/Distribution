package typings.facebookInstantGames.FBInstant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Payments_ extends js.Object {
  /**
    * Consumes a specific purchase belonging to the current player. Before provisioning a product's effects to the player,
    * the game should request the consumption of the purchased product. Once the purchase is successfully consumed, the game
    * should immediately provide the player with the effects of their purchase.
    *
    * @param purchaseToken The purchase token of the purchase that should be consumed.
    * @throws CLIENT_UNSUPPORTED_OPERATION
    * @throws PAYMENTS_NOT_INITIALIZED
    * @throws INVALID_PARAM
    * @throws NETWORK_FAILURE
    */
  def consumePurchaseAsync(purchaseToken: String): js.Promise[Unit]
  /**
    * Fetches the game's product catalog.
    *
    * @returns The set of products that are registered to the game.
    * @throws CLIENT_UNSUPPORTED_OPERATION
    * @throws PAYMENTS_NOT_INITIALIZED
    * @throws NETWORK_FAILURE
    */
  def getCatalogAsync(): js.Promise[js.Array[Product]]
  /**
    * Fetches all of the player's unconsumed purchases. As a best practice, the game should fetch the current player's purchases
    * as soon as the client indicates that it is ready to perform payments-related operations. The game can then process and consume
    * any purchases that are waiting to be consumed.
    *
    * @returns The set of purchases that the player has made for the game.
    * @throws CLIENT_UNSUPPORTED_OPERATION
    * @throws PAYMENTS_NOT_INITIALIZED
    * @throws NETWORK_FAILURE
    */
  def getPurchasesAsync(): js.Promise[js.Array[Purchase]]
  /**
    * Sets a callback to be triggered when Payments operations are available.
    * @param callback The callback function to be executed when Payments are available.
    */
  def onReady(callback: js.Function0[Unit]): Unit
  /**
    * Begins the purchase flow for a specific product. Will immediately reject if called before FBInstant.startGameAsync() has resolved.
    *
    * @param purchaseConfig The purchase's configuration details.
    * @returns A Promise that resolves when the product is successfully purchased by the player. Otherwise, it rejects.
    * @throws CLIENT_UNSUPPORTED_OPERATION
    * @throws PAYMENTS_NOT_INITIALIZED
    * @throws INVALID_PARAM
    * @throws NETWORK_FAILURE
    * @throws INVALID_OPERATION
    */
  def purchaseAsync(purchaseConfig: PurchaseConfig): js.Promise[Purchase]
}

object Payments_ {
  @scala.inline
  def apply(
    consumePurchaseAsync: String => js.Promise[Unit],
    getCatalogAsync: () => js.Promise[js.Array[Product]],
    getPurchasesAsync: () => js.Promise[js.Array[Purchase]],
    onReady: js.Function0[Unit] => Unit,
    purchaseAsync: PurchaseConfig => js.Promise[Purchase]
  ): Payments_ = {
    val __obj = js.Dynamic.literal(consumePurchaseAsync = js.Any.fromFunction1(consumePurchaseAsync), getCatalogAsync = js.Any.fromFunction0(getCatalogAsync), getPurchasesAsync = js.Any.fromFunction0(getPurchasesAsync), onReady = js.Any.fromFunction1(onReady), purchaseAsync = js.Any.fromFunction1(purchaseAsync))
  
    __obj.asInstanceOf[Payments_]
  }
}

