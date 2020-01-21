package typings.gapiClientAdexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuctionType extends js.Object {
  /** Only set when contextType=AUCTION_TYPE. Represents the auction types this restriction applies to. */
  var auctionType: js.UndefOr[js.Array[String]] = js.undefined
  /** The type of context (e.g., location, platform, auction type, SSL-ness). */
  var contextType: js.UndefOr[String] = js.undefined
  /**
    * Only set when contextType=LOCATION. Represents the geo criterias this restriction applies to. Impressions are considered to match a context if either
    * the user location or publisher location matches a given geoCriteriaId.
    */
  var geoCriteriaId: js.UndefOr[js.Array[Double]] = js.undefined
  /** Only set when contextType=PLATFORM. Represents the platforms this restriction applies to. */
  var platform: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonAuctionType {
  @scala.inline
  def apply(
    auctionType: js.Array[String] = null,
    contextType: String = null,
    geoCriteriaId: js.Array[Double] = null,
    platform: js.Array[String] = null
  ): AnonAuctionType = {
    val __obj = js.Dynamic.literal()
    if (auctionType != null) __obj.updateDynamic("auctionType")(auctionType.asInstanceOf[js.Any])
    if (contextType != null) __obj.updateDynamic("contextType")(contextType.asInstanceOf[js.Any])
    if (geoCriteriaId != null) __obj.updateDynamic("geoCriteriaId")(geoCriteriaId.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuctionType]
  }
}

