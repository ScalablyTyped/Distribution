package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AcceleratorType extends js.Object {
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The deprecation status associated with this accelerator type. */
  var deprecated: js.UndefOr[DeprecationStatus] = js.undefined
  /** [Output Only] An optional textual description of the resource. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The type of the resource. Always compute#acceleratorType for accelerator types. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Maximum accelerator cards allowed per instance. */
  var maximumCardsPerInstance: js.UndefOr[scala.Double] = js.undefined
  /** [Output Only] Name of the resource. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Server-defined fully-qualified URL for this resource. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The name of the zone where the accelerator type resides, such as us-central1-a. */
  var zone: js.UndefOr[java.lang.String] = js.undefined
}

