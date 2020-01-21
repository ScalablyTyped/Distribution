package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuctionContext extends js.Object {
  /** The auction types this restriction applies to. */
  var auctionTypes: js.UndefOr[js.Array[String]] = js.undefined
}

object AuctionContext {
  @scala.inline
  def apply(auctionTypes: js.Array[String] = null): AuctionContext = {
    val __obj = js.Dynamic.literal()
    if (auctionTypes != null) __obj.updateDynamic("auctionTypes")(auctionTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuctionContext]
  }
}

