package typings.gapiClientAdexchangebuyer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BidProtocol extends js.Object {
  /**
    * The protocol that the bidder endpoint is using. OpenRTB protocols with prefix PROTOCOL_OPENRTB_PROTOBUF use proto buffer, otherwise use JSON.  Allowed
    * values:
    * - PROTOCOL_ADX
    * - PROTOCOL_OPENRTB_2_2
    * - PROTOCOL_OPENRTB_2_3
    * - PROTOCOL_OPENRTB_2_4
    * - PROTOCOL_OPENRTB_2_5
    * - PROTOCOL_OPENRTB_PROTOBUF_2_3
    * - PROTOCOL_OPENRTB_PROTOBUF_2_4
    * - PROTOCOL_OPENRTB_PROTOBUF_2_5
    */
  var bidProtocol: js.UndefOr[String] = js.undefined
  /** The maximum queries per second the Ad Exchange will send. */
  var maximumQps: js.UndefOr[Double] = js.undefined
  /**
    * The geographical region the Ad Exchange should send requests from. Only used by some quota systems, but always setting the value is recommended.
    * Allowed values:
    * - ASIA
    * - EUROPE
    * - US_EAST
    * - US_WEST
    */
  var region: js.UndefOr[String] = js.undefined
  /** The URL to which the Ad Exchange will send bid requests. */
  var url: js.UndefOr[String] = js.undefined
}

object BidProtocol {
  @scala.inline
  def apply(
    bidProtocol: String = null,
    maximumQps: js.UndefOr[Double] = js.undefined,
    region: String = null,
    url: String = null
  ): BidProtocol = {
    val __obj = js.Dynamic.literal()
    if (bidProtocol != null) __obj.updateDynamic("bidProtocol")(bidProtocol.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumQps)) __obj.updateDynamic("maximumQps")(maximumQps.get.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BidProtocol]
  }
}

