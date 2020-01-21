package typings.expo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo/build/Branch.web", JSImport.Namespace)
@js.native
object branchWebMod extends js.Object {
  @js.native
  object default extends js.Object {
    var AddToCartEvent: String = js.native
    var AddToWishlistEvent: String = js.native
    var PurchaseInitiatedEvent: String = js.native
    var PurchasedEvent: String = js.native
    var RegisterViewEvent: String = js.native
    var ShareCompletedEvent: String = js.native
    var ShareInitiatedEvent: String = js.native
    var VERSION: String = js.native
    def loadRewards(): Unit = js.native
    def openURL(): Unit = js.native
    def redeemRewards(): Unit = js.native
    def sendCommerceEvent(): Unit = js.native
    def setDebug(): Unit = js.native
    def setIdentity(): Unit = js.native
    def skipCachedEvents(): Unit = js.native
    def subscribe(): Unit = js.native
    def userCompletedAction(): Unit = js.native
  }
  
}

