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

object AcceleratorType {
  @scala.inline
  def apply(
    creationTimestamp: java.lang.String = null,
    deprecated: DeprecationStatus = null,
    description: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    maximumCardsPerInstance: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    selfLink: java.lang.String = null,
    zone: java.lang.String = null
  ): AcceleratorType = {
    val __obj = js.Dynamic.literal()
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp)
    if (deprecated != null) __obj.updateDynamic("deprecated")(deprecated)
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (maximumCardsPerInstance != null) __obj.updateDynamic("maximumCardsPerInstance")(maximumCardsPerInstance.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (zone != null) __obj.updateDynamic("zone")(zone)
    __obj.asInstanceOf[AcceleratorType]
  }
}

