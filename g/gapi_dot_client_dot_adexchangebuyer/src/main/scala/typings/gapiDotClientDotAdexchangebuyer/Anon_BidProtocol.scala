package typings.gapiDotClientDotAdexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BidProtocol extends js.Object {
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

object Anon_BidProtocol {
  @scala.inline
  def apply(
    bidProtocol: String = null,
    maximumQps: Int | Double = null,
    region: String = null,
    url: String = null
  ): Anon_BidProtocol = {
    val __obj = js.Dynamic.literal()
    if (bidProtocol != null) __obj.updateDynamic("bidProtocol")(bidProtocol)
    if (maximumQps != null) __obj.updateDynamic("maximumQps")(maximumQps.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_BidProtocol]
  }
}

