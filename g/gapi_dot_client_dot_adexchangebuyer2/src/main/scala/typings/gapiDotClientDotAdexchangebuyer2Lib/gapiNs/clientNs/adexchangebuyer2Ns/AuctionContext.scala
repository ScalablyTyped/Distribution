package typings
package gapiDotClientDotAdexchangebuyer2Lib.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuctionContext extends js.Object {
  /** The auction types this restriction applies to. */
  var auctionTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object AuctionContext {
  @scala.inline
  def apply(auctionTypes: js.Array[java.lang.String] = null): AuctionContext = {
    val __obj = js.Dynamic.literal()
    if (auctionTypes != null) __obj.updateDynamic("auctionTypes")(auctionTypes)
    __obj.asInstanceOf[AuctionContext]
  }
}

