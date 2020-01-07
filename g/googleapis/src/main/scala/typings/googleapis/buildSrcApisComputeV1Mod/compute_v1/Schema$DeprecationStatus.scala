package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deprecation status for a public resource.
  */
@js.native
trait Schema$DeprecationStatus extends js.Object {
  /**
    * An optional RFC3339 timestamp on or after which the state of this
    * resource is intended to change to DELETED. This is only informational and
    * the status will not change unless the client explicitly changes it.
    */
  var deleted: js.UndefOr[String] = js.native
  /**
    * An optional RFC3339 timestamp on or after which the state of this
    * resource is intended to change to DEPRECATED. This is only informational
    * and the status will not change unless the client explicitly changes it.
    */
  var deprecated: js.UndefOr[String] = js.native
  /**
    * An optional RFC3339 timestamp on or after which the state of this
    * resource is intended to change to OBSOLETE. This is only informational
    * and the status will not change unless the client explicitly changes it.
    */
  var obsolete: js.UndefOr[String] = js.native
  /**
    * The URL of the suggested replacement for a deprecated resource. The
    * suggested replacement resource must be the same kind of resource as the
    * deprecated resource.
    */
  var replacement: js.UndefOr[String] = js.native
  /**
    * The deprecation state of this resource. This can be ACTIVE, DEPRECATED,
    * OBSOLETE, or DELETED. Operations which communicate the end of life date
    * for an image, can use ACTIVE. Operations which create a new resource
    * using a DEPRECATED resource will return successfully, but with a warning
    * indicating the deprecated resource and recommending its replacement.
    * Operations which use OBSOLETE or DELETED resources will be rejected and
    * result in an error.
    */
  var state: js.UndefOr[String] = js.native
}

object Schema$DeprecationStatus {
  @scala.inline
  def apply(
    deleted: String = null,
    deprecated: String = null,
    obsolete: String = null,
    replacement: String = null,
    state: String = null
  ): Schema$DeprecationStatus = {
    val __obj = js.Dynamic.literal()
    if (deleted != null) __obj.updateDynamic("deleted")(deleted.asInstanceOf[js.Any])
    if (deprecated != null) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (obsolete != null) __obj.updateDynamic("obsolete")(obsolete.asInstanceOf[js.Any])
    if (replacement != null) __obj.updateDynamic("replacement")(replacement.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DeprecationStatus]
  }
}

