package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkPeering extends js.Object {
  /**
    * Whether full mesh connectivity is created and managed automatically. When it is set to true, Google Compute Engine will automatically create and manage
    * the routes between two networks when the state is ACTIVE. Otherwise, user needs to create routes manually to route packets to peer network.
    */
  var autoCreateRoutes: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Name of this peering. Provided by the client when the peering is created. The name must comply with RFC1035. Specifically, the name must be 1-63
    * characters long and match regular expression [a-z]([-a-z0-9]&#42;[a-z0-9])? which means the first character must be a lowercase letter, and all the
    * following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The URL of the peer network. It can be either full URL or partial URL. The peer network may belong to a different project. If the partial URL does not
    * contain project, it is assumed that the peer network is in the same project as the current network.
    */
  var network: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] State for the peering. */
  var state: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Details about the current state of the peering. */
  var stateDetails: js.UndefOr[java.lang.String] = js.undefined
}

object NetworkPeering {
  @scala.inline
  def apply(
    autoCreateRoutes: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    network: java.lang.String = null,
    state: java.lang.String = null,
    stateDetails: java.lang.String = null
  ): NetworkPeering = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoCreateRoutes)) __obj.updateDynamic("autoCreateRoutes")(autoCreateRoutes)
    if (name != null) __obj.updateDynamic("name")(name)
    if (network != null) __obj.updateDynamic("network")(network)
    if (state != null) __obj.updateDynamic("state")(state)
    if (stateDetails != null) __obj.updateDynamic("stateDetails")(stateDetails)
    __obj.asInstanceOf[NetworkPeering]
  }
}

