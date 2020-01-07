package typings.googleapis.buildSrcApisSpannerV1Mod.spanner_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for `TestIamPermissions` method.
  */
@js.native
trait Schema$TestIamPermissionsRequest extends js.Object {
  /**
    * REQUIRED: The set of permissions to check for &#39;resource&#39;.
    * Permissions with wildcards (such as &#39;*&#39;, &#39;spanner.*&#39;,
    * &#39;spanner.instances.*&#39;) are not allowed.
    */
  var permissions: js.UndefOr[js.Array[String]] = js.native
}

object Schema$TestIamPermissionsRequest {
  @scala.inline
  def apply(permissions: js.Array[String] = null): Schema$TestIamPermissionsRequest = {
    val __obj = js.Dynamic.literal()
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TestIamPermissionsRequest]
  }
}

