package typings.gapiDotClientDotAdexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuctionType extends js.Object {
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

object Anon_AuctionType {
  @scala.inline
  def apply(
    auctionType: js.Array[String] = null,
    contextType: String = null,
    geoCriteriaId: js.Array[Double] = null,
    platform: js.Array[String] = null
  ): Anon_AuctionType = {
    val __obj = js.Dynamic.literal()
    if (auctionType != null) __obj.updateDynamic("auctionType")(auctionType)
    if (contextType != null) __obj.updateDynamic("contextType")(contextType)
    if (geoCriteriaId != null) __obj.updateDynamic("geoCriteriaId")(geoCriteriaId)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    __obj.asInstanceOf[Anon_AuctionType]
  }
}

