package typings.gapiClientIam.gapi.client.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UndeleteRoleRequest extends js.Object {
  /** Used to perform a consistent read-modify-write. */
  var etag: js.UndefOr[String] = js.undefined
}

object UndeleteRoleRequest {
  @scala.inline
  def apply(etag: String = null): UndeleteRoleRequest = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    __obj.asInstanceOf[UndeleteRoleRequest]
  }
}

