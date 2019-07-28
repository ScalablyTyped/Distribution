package typings.gapiDotClientDotCompute.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Region extends js.Object {
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  /** [Output Only] The deprecation status associated with this region. */
  var deprecated: js.UndefOr[DeprecationStatus] = js.undefined
  /** [Output Only] Textual description of the resource. */
  var description: js.UndefOr[String] = js.undefined
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.undefined
  /** [Output Only] Type of the resource. Always compute#region for regions. */
  var kind: js.UndefOr[String] = js.undefined
  /** [Output Only] Name of the resource. */
  var name: js.UndefOr[String] = js.undefined
  /** [Output Only] Quotas assigned to this region. */
  var quotas: js.UndefOr[js.Array[Quota]] = js.undefined
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  /** [Output Only] Status of the region, either UP or DOWN. */
  var status: js.UndefOr[String] = js.undefined
  /** [Output Only] A list of zones available in this region, in the form of resource URLs. */
  var zones: js.UndefOr[js.Array[String]] = js.undefined
}

object Region {
  @scala.inline
  def apply(
    creationTimestamp: String = null,
    deprecated: DeprecationStatus = null,
    description: String = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    quotas: js.Array[Quota] = null,
    selfLink: String = null,
    status: String = null,
    zones: js.Array[String] = null
  ): Region = {
    val __obj = js.Dynamic.literal()
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp)
    if (deprecated != null) __obj.updateDynamic("deprecated")(deprecated)
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (quotas != null) __obj.updateDynamic("quotas")(quotas)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (status != null) __obj.updateDynamic("status")(status)
    if (zones != null) __obj.updateDynamic("zones")(zones)
    __obj.asInstanceOf[Region]
  }
}

