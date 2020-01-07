package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a collection of network endpoints.
  */
@js.native
trait Schema$NetworkEndpointGroup extends js.Object {
  /**
    * Metadata defined as annotations on the network endpoint group.
    */
  var annotations: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  /**
    * The default port used if the port number is not specified in the network
    * endpoint.
    */
  var defaultPort: js.UndefOr[Double] = js.native
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * [Output Only] Type of the resource. Always compute#networkEndpointGroup
    * for network endpoint group.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * This field is only valid when the network endpoint group is used for load
    * balancing. [Deprecated] This field is deprecated.
    */
  var loadBalancer: js.UndefOr[Schema$NetworkEndpointGroupLbNetworkEndpointGroup] = js.native
  /**
    * Name of the resource; provided by the client when the resource is
    * created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular
    * expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character
    * must be a lowercase letter, and all following characters must be a dash,
    * lowercase letter, or digit, except the last character, which cannot be a
    * dash.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The URL of the network to which all network endpoints in the NEG belong.
    * Uses &quot;default&quot; project network if unspecified.
    */
  var network: js.UndefOr[String] = js.native
  /**
    * Type of network endpoints in this network endpoint group. Currently the
    * only supported value is GCE_VM_IP_PORT.
    */
  var networkEndpointType: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for this resource with the resource id.
    */
  var selfLinkWithId: js.UndefOr[String] = js.native
  /**
    * [Output only] Number of network endpoints in the network endpoint group.
    */
  var size: js.UndefOr[Double] = js.native
  /**
    * Optional URL of the subnetwork to which all network endpoints in the NEG
    * belong.
    */
  var subnetwork: js.UndefOr[String] = js.native
  /**
    * Specify the type of this network endpoint group. Only LOAD_BALANCING is
    * valid for now.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * [Output Only] The URL of the zone where the network endpoint group is
    * located.
    */
  var zone: js.UndefOr[String] = js.native
}

object Schema$NetworkEndpointGroup {
  @scala.inline
  def apply(
    annotations: StringDictionary[String] = null,
    creationTimestamp: String = null,
    defaultPort: Int | Double = null,
    description: String = null,
    id: String = null,
    kind: String = null,
    loadBalancer: Schema$NetworkEndpointGroupLbNetworkEndpointGroup = null,
    name: String = null,
    network: String = null,
    networkEndpointType: String = null,
    selfLink: String = null,
    selfLinkWithId: String = null,
    size: Int | Double = null,
    subnetwork: String = null,
    `type`: String = null,
    zone: String = null
  ): Schema$NetworkEndpointGroup = {
    val __obj = js.Dynamic.literal()
    if (annotations != null) __obj.updateDynamic("annotations")(annotations.asInstanceOf[js.Any])
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (defaultPort != null) __obj.updateDynamic("defaultPort")(defaultPort.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (loadBalancer != null) __obj.updateDynamic("loadBalancer")(loadBalancer.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    if (networkEndpointType != null) __obj.updateDynamic("networkEndpointType")(networkEndpointType.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (selfLinkWithId != null) __obj.updateDynamic("selfLinkWithId")(selfLinkWithId.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (subnetwork != null) __obj.updateDynamic("subnetwork")(subnetwork.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (zone != null) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$NetworkEndpointGroup]
  }
}

