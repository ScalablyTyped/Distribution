package typings.gapiDotClientDotResourceviews.gapiNs.clientNs.resourceviewsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceView extends js.Object {
  /** The creation time of the resource view. */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  /** The detailed description of the resource view. */
  var description: js.UndefOr[String] = js.undefined
  /** Services endpoint information. */
  var endpoints: js.UndefOr[js.Array[ServiceEndpoint]] = js.undefined
  /** The fingerprint of the service endpoint information. */
  var fingerprint: js.UndefOr[String] = js.undefined
  /** [Output Only] The ID of the resource view. */
  var id: js.UndefOr[String] = js.undefined
  /** Type of the resource. */
  var kind: js.UndefOr[String] = js.undefined
  /** The labels for events. */
  var labels: js.UndefOr[js.Array[Label]] = js.undefined
  /** The name of the resource view. */
  var name: js.UndefOr[String] = js.undefined
  /** The URL of a Compute Engine network to which the resources in the view belong. */
  var network: js.UndefOr[String] = js.undefined
  /** A list of all resources in the resource view. */
  var resources: js.UndefOr[js.Array[String]] = js.undefined
  /** [Output Only] A self-link to the resource view. */
  var selfLink: js.UndefOr[String] = js.undefined
  /** The total number of resources in the resource view. */
  var size: js.UndefOr[Double] = js.undefined
}

object ResourceView {
  @scala.inline
  def apply(
    creationTimestamp: String = null,
    description: String = null,
    endpoints: js.Array[ServiceEndpoint] = null,
    fingerprint: String = null,
    id: String = null,
    kind: String = null,
    labels: js.Array[Label] = null,
    name: String = null,
    network: String = null,
    resources: js.Array[String] = null,
    selfLink: String = null,
    size: Int | Double = null
  ): ResourceView = {
    val __obj = js.Dynamic.literal()
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp)
    if (description != null) __obj.updateDynamic("description")(description)
    if (endpoints != null) __obj.updateDynamic("endpoints")(endpoints)
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (name != null) __obj.updateDynamic("name")(name)
    if (network != null) __obj.updateDynamic("network")(network)
    if (resources != null) __obj.updateDynamic("resources")(resources)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceView]
  }
}

