package typings
package gapiDotClientDotCloudresourcemanagerLib.gapiNs.clientNs.cloudresourcemanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClearOrgPolicyRequest extends js.Object {
  /** Name of the `Constraint` of the `Policy` to clear. */
  var constraint: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The current version, for concurrency control. Not sending an `etag`
    * will cause the `Policy` to be cleared blindly.
    */
  var etag: js.UndefOr[java.lang.String] = js.undefined
}

