package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @OutputOnly The auction type the restriction applies to.
  */
@js.native
trait Schema$AuctionContext extends js.Object {
  /**
    * The auction types this restriction applies to.
    */
  var auctionTypes: js.UndefOr[js.Array[String]] = js.native
}

object Schema$AuctionContext {
  @scala.inline
  def apply(auctionTypes: js.Array[String] = null): Schema$AuctionContext = {
    val __obj = js.Dynamic.literal()
    if (auctionTypes != null) __obj.updateDynamic("auctionTypes")(auctionTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AuctionContext]
  }
}

