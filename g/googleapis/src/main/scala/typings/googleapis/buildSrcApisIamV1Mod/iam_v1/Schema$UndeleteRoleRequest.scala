package typings.googleapis.buildSrcApisIamV1Mod.iam_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request to undelete an existing role.
  */
@js.native
trait Schema$UndeleteRoleRequest extends js.Object {
  /**
    * Used to perform a consistent read-modify-write.
    */
  var etag: js.UndefOr[String] = js.native
}

object Schema$UndeleteRoleRequest {
  @scala.inline
  def apply(etag: String = null): Schema$UndeleteRoleRequest = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UndeleteRoleRequest]
  }
}

