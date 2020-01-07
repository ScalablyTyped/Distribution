package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A network peering attached to a network resource. The message includes the
  * peering name, peer network, peering state, and a flag indicating whether
  * Google Compute Engine should automatically create routes for the peering.
  */
@js.native
trait Schema$NetworkPeering extends js.Object {
  /**
    * This field will be deprecated soon. Prefer using exchange_subnet_routes
    * instead. Indicates whether full mesh connectivity is created and managed
    * automatically. When it is set to true, Google Compute Engine will
    * automatically create and manage the routes between two networks when the
    * state is ACTIVE. Otherwise, user needs to create routes manually to route
    * packets to peer network.
    */
  var autoCreateRoutes: js.UndefOr[Boolean] = js.native
  /**
    * Whether full mesh connectivity is created and managed automatically. When
    * it is set to true, Google Compute Engine will automatically create and
    * manage the routes between two networks when the peering state is ACTIVE.
    * Otherwise, user needs to create routes manually to route packets to peer
    * network.
    */
  var exchangeSubnetRoutes: js.UndefOr[Boolean] = js.native
  /**
    * Name of this peering. Provided by the client when the peering is created.
    * The name must comply with RFC1035. Specifically, the name must be 1-63
    * characters long and match regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`
    * which means the first character must be a lowercase letter, and all the
    * following characters must be a dash, lowercase letter, or digit, except
    * the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The URL of the peer network. It can be either full URL or partial URL.
    * The peer network may belong to a different project. If the partial URL
    * does not contain project, it is assumed that the peer network is in the
    * same project as the current network.
    */
  var network: js.UndefOr[String] = js.native
  /**
    * [Output Only] State for the peering.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * [Output Only] Details about the current state of the peering.
    */
  var stateDetails: js.UndefOr[String] = js.native
}

object Schema$NetworkPeering {
  @scala.inline
  def apply(
    autoCreateRoutes: js.UndefOr[Boolean] = js.undefined,
    exchangeSubnetRoutes: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    network: String = null,
    state: String = null,
    stateDetails: String = null
  ): Schema$NetworkPeering = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoCreateRoutes)) __obj.updateDynamic("autoCreateRoutes")(autoCreateRoutes.asInstanceOf[js.Any])
    if (!js.isUndefined(exchangeSubnetRoutes)) __obj.updateDynamic("exchangeSubnetRoutes")(exchangeSubnetRoutes.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (stateDetails != null) __obj.updateDynamic("stateDetails")(stateDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$NetworkPeering]
  }
}

