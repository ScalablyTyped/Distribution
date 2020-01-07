package typings.googleapis.buildSrcApisServicecontrolV1Mod.servicecontrol_v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This message defines attributes for a node that handles a network request.
  * The node can be either a service or an application that sends, forwards, or
  * receives the request. Service peers should fill in the `service`,
  * `principal`, and `labels` as appropriate.
  */
@js.native
trait Schema$Peer extends js.Object {
  /**
    * The IP address of the peer.
    */
  var ip: js.UndefOr[String] = js.native
  /**
    * The labels associated with the peer.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The network port of the peer.
    */
  var port: js.UndefOr[String] = js.native
  /**
    * The identity of this peer. Similar to `Request.auth.principal`, but
    * relative to the peer instead of the request. For example, the idenity
    * associated with a load balancer that forwared the request.
    */
  var principal: js.UndefOr[String] = js.native
  /**
    * The CLDR country/region code associated with the above IP address. If the
    * IP address is private, the `region_code` should reflect the physical
    * location where this peer is running.
    */
  var regionCode: js.UndefOr[String] = js.native
  /**
    * The canonical service name of the peer.  NOTE: different systems may have
    * different service naming schemes.
    */
  var service: js.UndefOr[String] = js.native
}

object Schema$Peer {
  @scala.inline
  def apply(
    ip: String = null,
    labels: StringDictionary[String] = null,
    port: String = null,
    principal: String = null,
    regionCode: String = null,
    service: String = null
  ): Schema$Peer = {
    val __obj = js.Dynamic.literal()
    if (ip != null) __obj.updateDynamic("ip")(ip.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (principal != null) __obj.updateDynamic("principal")(principal.asInstanceOf[js.Any])
    if (regionCode != null) __obj.updateDynamic("regionCode")(regionCode.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Peer]
  }
}

