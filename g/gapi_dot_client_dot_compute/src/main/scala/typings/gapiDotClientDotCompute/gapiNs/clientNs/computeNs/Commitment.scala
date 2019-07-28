package typings.gapiDotClientDotCompute.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Commitment extends js.Object {
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.undefined
  /** [Output Only] Commitment end time in RFC3339 text format. */
  var endTimestamp: js.UndefOr[String] = js.undefined
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.undefined
  /** [Output Only] Type of the resource. Always compute#commitment for commitments. */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular expression [a-z]([-a-z0-9]&#42;[a-z0-9])? which means the first character must be
    * a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The plan for this commitment, which determines duration and discount rate. The currently supported plans are TWELVE_MONTH (1 year), and
    * THIRTY_SIX_MONTH (3 years).
    */
  var plan: js.UndefOr[String] = js.undefined
  /** [Output Only] URL of the region where this commitment may be used. */
  var region: js.UndefOr[String] = js.undefined
  /** List of commitment amounts for particular resources. Note that VCPU and MEMORY resource commitments must occur together. */
  var resources: js.UndefOr[js.Array[ResourceCommitment]] = js.undefined
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  /** [Output Only] Commitment start time in RFC3339 text format. */
  var startTimestamp: js.UndefOr[String] = js.undefined
  /**
    * [Output Only] Status of the commitment with regards to eventual expiration (each commitment has an end date defined). One of the following values:
    * NOT_YET_ACTIVE, ACTIVE, EXPIRED.
    */
  var status: js.UndefOr[String] = js.undefined
  /** [Output Only] An optional, human-readable explanation of the status. */
  var statusMessage: js.UndefOr[String] = js.undefined
}

object Commitment {
  @scala.inline
  def apply(
    creationTimestamp: String = null,
    description: String = null,
    endTimestamp: String = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    plan: String = null,
    region: String = null,
    resources: js.Array[ResourceCommitment] = null,
    selfLink: String = null,
    startTimestamp: String = null,
    status: String = null,
    statusMessage: String = null
  ): Commitment = {
    val __obj = js.Dynamic.literal()
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp)
    if (description != null) __obj.updateDynamic("description")(description)
    if (endTimestamp != null) __obj.updateDynamic("endTimestamp")(endTimestamp)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (plan != null) __obj.updateDynamic("plan")(plan)
    if (region != null) __obj.updateDynamic("region")(region)
    if (resources != null) __obj.updateDynamic("resources")(resources)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (startTimestamp != null) __obj.updateDynamic("startTimestamp")(startTimestamp)
    if (status != null) __obj.updateDynamic("status")(status)
    if (statusMessage != null) __obj.updateDynamic("statusMessage")(statusMessage)
    __obj.asInstanceOf[Commitment]
  }
}

