package typings.facebookDashInstantDashGames.FBInstant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration of a purchase request for a product registered to the game.
  */
trait PurchaseConfig extends js.Object {
  /**
    * An optional developer-specified payload, to be included in the returned purchase's signed request.
    */
  var developerPayload: js.UndefOr[String] = js.undefined
  /**
    * The identifier of the product to purchase
    */
  var productID: String
}

object PurchaseConfig {
  @scala.inline
  def apply(productID: String, developerPayload: String = null): PurchaseConfig = {
    val __obj = js.Dynamic.literal(productID = productID.asInstanceOf[js.Any])
    if (developerPayload != null) __obj.updateDynamic("developerPayload")(developerPayload.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseConfig]
  }
}

