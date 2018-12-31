package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeprecationStatus extends js.Object {
  /**
    * An optional RFC3339 timestamp on or after which the state of this resource is intended to change to DELETED. This is only informational and the status
    * will not change unless the client explicitly changes it.
    */
  var deleted: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An optional RFC3339 timestamp on or after which the state of this resource is intended to change to DEPRECATED. This is only informational and the
    * status will not change unless the client explicitly changes it.
    */
  var deprecated: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An optional RFC3339 timestamp on or after which the state of this resource is intended to change to OBSOLETE. This is only informational and the status
    * will not change unless the client explicitly changes it.
    */
  var obsolete: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The URL of the suggested replacement for a deprecated resource. The suggested replacement resource must be the same kind of resource as the deprecated
    * resource.
    */
  var replacement: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The deprecation state of this resource. This can be DEPRECATED, OBSOLETE, or DELETED. Operations which create a new resource using a DEPRECATED
    * resource will return successfully, but with a warning indicating the deprecated resource and recommending its replacement. Operations which use
    * OBSOLETE or DELETED resources will be rejected and result in an error.
    */
  var state: js.UndefOr[java.lang.String] = js.undefined
}

