package typings
package gapiDotClientDotResourceviewsLib.gapiNs.clientNs.resourceviewsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceView extends js.Object {
  /** The creation time of the resource view. */
  var creationTimestamp: js.UndefOr[java.lang.String] = js.undefined
  /** The detailed description of the resource view. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Services endpoint information. */
  var endpoints: js.UndefOr[js.Array[ServiceEndpoint]] = js.undefined
  /** The fingerprint of the service endpoint information. */
  var fingerprint: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The ID of the resource view. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Type of the resource. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The labels for events. */
  var labels: js.UndefOr[js.Array[Label]] = js.undefined
  /** The name of the resource view. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The URL of a Compute Engine network to which the resources in the view belong. */
  var network: js.UndefOr[java.lang.String] = js.undefined
  /** A list of all resources in the resource view. */
  var resources: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** [Output Only] A self-link to the resource view. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** The total number of resources in the resource view. */
  var size: js.UndefOr[scala.Double] = js.undefined
}

