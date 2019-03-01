package typings
package gapiDotClientDotAdexchangebuyerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuctionType extends js.Object {
  /** Only set when contextType=AUCTION_TYPE. Represents the auction types this restriction applies to. */
  var auctionType: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The type of context (e.g., location, platform, auction type, SSL-ness). */
  var contextType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Only set when contextType=LOCATION. Represents the geo criterias this restriction applies to. Impressions are considered to match a context if either
    * the user location or publisher location matches a given geoCriteriaId.
    */
  var geoCriteriaId: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /** Only set when contextType=PLATFORM. Represents the platforms this restriction applies to. */
  var platform: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_AuctionType {
  @scala.inline
  def apply(
    auctionType: js.Array[java.lang.String] = null,
    contextType: java.lang.String = null,
    geoCriteriaId: js.Array[scala.Double] = null,
    platform: js.Array[java.lang.String] = null
  ): Anon_AuctionType = {
    val __obj = js.Dynamic.literal()
    if (auctionType != null) __obj.updateDynamic("auctionType")(auctionType)
    if (contextType != null) __obj.updateDynamic("contextType")(contextType)
    if (geoCriteriaId != null) __obj.updateDynamic("geoCriteriaId")(geoCriteriaId)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    __obj.asInstanceOf[Anon_AuctionType]
  }
}

