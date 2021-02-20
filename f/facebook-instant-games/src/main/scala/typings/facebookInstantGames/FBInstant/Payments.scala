package typings.facebookInstantGames.FBInstant

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Payments extends StObject {
  
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
  def consumePurchaseAsync(purchaseToken: String): js.Promise[Unit] = js.native
  
  /**
    * Fetches the game's product catalog.
    *
    * @returns The set of products that are registered to the game.
    * @throws CLIENT_UNSUPPORTED_OPERATION
    * @throws PAYMENTS_NOT_INITIALIZED
    * @throws NETWORK_FAILURE
    */
  def getCatalogAsync(): js.Promise[js.Array[Product]] = js.native
  
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
  def getPurchasesAsync(): js.Promise[js.Array[Purchase]] = js.native
  
  /**
    * Sets a callback to be triggered when Payments operations are available.
    * @param callback The callback function to be executed when Payments are available.
    */
  def onReady(callback: js.Function0[Unit]): Unit = js.native
  
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
  def purchaseAsync(purchaseConfig: PurchaseConfig): js.Promise[Purchase] = js.native
}
object Payments {
  
  @scala.inline
  def apply(
    consumePurchaseAsync: String => js.Promise[Unit],
    getCatalogAsync: () => js.Promise[js.Array[Product]],
    getPurchasesAsync: () => js.Promise[js.Array[Purchase]],
    onReady: js.Function0[Unit] => Unit,
    purchaseAsync: PurchaseConfig => js.Promise[Purchase]
  ): Payments = {
    val __obj = js.Dynamic.literal(consumePurchaseAsync = js.Any.fromFunction1(consumePurchaseAsync), getCatalogAsync = js.Any.fromFunction0(getCatalogAsync), getPurchasesAsync = js.Any.fromFunction0(getPurchasesAsync), onReady = js.Any.fromFunction1(onReady), purchaseAsync = js.Any.fromFunction1(purchaseAsync))
    __obj.asInstanceOf[Payments]
  }
  
  @scala.inline
  implicit class PaymentsMutableBuilder[Self <: Payments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsumePurchaseAsync(value: String => js.Promise[Unit]): Self = StObject.set(x, "consumePurchaseAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCatalogAsync(value: () => js.Promise[js.Array[Product]]): Self = StObject.set(x, "getCatalogAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPurchasesAsync(value: () => js.Promise[js.Array[Purchase]]): Self = StObject.set(x, "getPurchasesAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnReady(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "onReady", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPurchaseAsync(value: PurchaseConfig => js.Promise[Purchase]): Self = StObject.set(x, "purchaseAsync", js.Any.fromFunction1(value))
  }
}
