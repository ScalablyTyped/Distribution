package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$RouterBgpPeerBfd extends js.Object {
  /**
    * The minimum interval, in milliseconds, between BFD packets received from
    * the peer router. The actual value is negotiated between the two routers
    * and is equal to the greater of this value and the transmit interval of
    * the other router. If BFD echo mode is enabled on this router and the peer
    * router, this value is used to negotiate the interval between BFD echo
    * packets transmitted by the peer router. Otherwise, it will be used to
    * determine the interval between BFD control packets. If set, this value
    * must be between 33 and 30000. The default is 300.
    */
  var minReceiveInterval: js.UndefOr[Double] = js.native
  /**
    * The minimum interval, in milliseconds, between BFD packets transmitted to
    * the peer router. The actual value is negotiated between the two routers
    * and is equal to the greater of this value and the corresponding receive
    * interval of the other router. If BFD echo mode is enabled on this router
    * and the peer router, this value is used to negotiate the interval between
    * BFD echo packets transmitted by this router. Otherwise, it will be used
    * to determine the interval between BFD control packets. If set, this value
    * must be between 33 and 30000. The default is 300.
    */
  var minTransmitInterval: js.UndefOr[Double] = js.native
  /**
    * The BFD session initiation mode for this BGP peer. If set to ACTIVE, the
    * Cloud Router will initiate the BFD session for this BGP peer. If set to
    * PASSIVE, the Cloud Router will wait for the peer router to initiate the
    * BFD session for this BGP peer. If set to DISABLED, BFD is disabled for
    * this BGP peer. The default is PASSIVE.
    */
  var mode: js.UndefOr[String] = js.native
  /**
    * The number of consecutive BFD packets that must be missed before BFD
    * declares that a peer is unavailable. If set, the value must be a value
    * between 2 and 16. The default is 3.
    */
  var multiplier: js.UndefOr[Double] = js.native
  /**
    * The BFD packet mode for this BGP peer. If set to CONTROL_AND_ECHO, BFD
    * echo mode is enabled for this BGP peer. In this mode, if the peer router
    * also has BFD echo mode enabled, BFD echo packets will be sent to the
    * other router. If the peer router does not have BFD echo mode enabled,
    * only control packets will be sent. If set to CONTROL_ONLY, BFD echo mode
    * is disabled for this BGP peer. If this router and the peer router have a
    * multihop connection, this should be set to CONTROL_ONLY as BFD echo mode
    * is only supported on singlehop connections. The default is
    * CONTROL_AND_ECHO.
    */
  var packetMode: js.UndefOr[String] = js.native
  /**
    * The minimum interval, in milliseconds, between BFD control packets
    * transmitted to and received from the peer router when BFD echo mode is
    * enabled on both routers. The actual transmit and receive intervals are
    * negotiated between the two routers and are equal to the greater of this
    * value and the corresponding interval on the other router. If set, this
    * value must be between 1000 and 30000. The default is 5000.
    */
  var slowTimerInterval: js.UndefOr[Double] = js.native
}

object Schema$RouterBgpPeerBfd {
  @scala.inline
  def apply(
    minReceiveInterval: Int | Double = null,
    minTransmitInterval: Int | Double = null,
    mode: String = null,
    multiplier: Int | Double = null,
    packetMode: String = null,
    slowTimerInterval: Int | Double = null
  ): Schema$RouterBgpPeerBfd = {
    val __obj = js.Dynamic.literal()
    if (minReceiveInterval != null) __obj.updateDynamic("minReceiveInterval")(minReceiveInterval.asInstanceOf[js.Any])
    if (minTransmitInterval != null) __obj.updateDynamic("minTransmitInterval")(minTransmitInterval.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (multiplier != null) __obj.updateDynamic("multiplier")(multiplier.asInstanceOf[js.Any])
    if (packetMode != null) __obj.updateDynamic("packetMode")(packetMode.asInstanceOf[js.Any])
    if (slowTimerInterval != null) __obj.updateDynamic("slowTimerInterval")(slowTimerInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RouterBgpPeerBfd]
  }
}

