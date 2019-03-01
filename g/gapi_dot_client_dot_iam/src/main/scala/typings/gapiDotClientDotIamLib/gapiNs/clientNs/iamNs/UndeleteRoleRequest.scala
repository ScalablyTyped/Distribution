package typings
package gapiDotClientDotIamLib.gapiNs.clientNs.iamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UndeleteRoleRequest extends js.Object {
  /** Used to perform a consistent read-modify-write. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
}

object UndeleteRoleRequest {
  @scala.inline
  def apply(etag: java.lang.String = null): UndeleteRoleRequest = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    __obj.asInstanceOf[UndeleteRoleRequest]
  }
}

