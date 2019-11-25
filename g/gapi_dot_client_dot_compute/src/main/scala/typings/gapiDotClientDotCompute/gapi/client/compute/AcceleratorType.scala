package typings.gapiDotClientDotCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcceleratorType extends js.Object {
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  /** [Output Only] The deprecation status associated with this accelerator type. */
  var deprecated: js.UndefOr[DeprecationStatus] = js.undefined
  /** [Output Only] An optional textual description of the resource. */
  var description: js.UndefOr[String] = js.undefined
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.undefined
  /** [Output Only] The type of the resource. Always compute#acceleratorType for accelerator types. */
  var kind: js.UndefOr[String] = js.undefined
  /** [Output Only] Maximum accelerator cards allowed per instance. */
  var maximumCardsPerInstance: js.UndefOr[Double] = js.undefined
  /** [Output Only] Name of the resource. */
  var name: js.UndefOr[String] = js.undefined
  /** [Output Only] Server-defined fully-qualified URL for this resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  /** [Output Only] The name of the zone where the accelerator type resides, such as us-central1-a. */
  var zone: js.UndefOr[String] = js.undefined
}

object AcceleratorType {
  @scala.inline
  def apply(
    creationTimestamp: String = null,
    deprecated: DeprecationStatus = null,
    description: String = null,
    id: String = null,
    kind: String = null,
    maximumCardsPerInstance: Int | Double = null,
    name: String = null,
    selfLink: String = null,
    zone: String = null
  ): AcceleratorType = {
    val __obj = js.Dynamic.literal()
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (deprecated != null) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (maximumCardsPerInstance != null) __obj.updateDynamic("maximumCardsPerInstance")(maximumCardsPerInstance.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (zone != null) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceleratorType]
  }
}

