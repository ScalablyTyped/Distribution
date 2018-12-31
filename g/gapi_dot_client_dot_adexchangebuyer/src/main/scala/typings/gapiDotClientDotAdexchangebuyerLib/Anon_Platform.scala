package typings
package gapiDotClientDotAdexchangebuyerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Platform extends js.Object {
  /** Only set when contextType=AUCTION_TYPE. Represents the auction types this correction applies to. */
  var auctionType: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The type of context (e.g., location, platform, auction type, SSL-ness). */
  var contextType: js.UndefOr[java.lang.String] = js.undefined
  /** Only set when contextType=LOCATION. Represents the geo criterias this correction applies to. */
  var geoCriteriaId: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /** Only set when contextType=PLATFORM. Represents the platforms this correction applies to. */
  var platform: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

