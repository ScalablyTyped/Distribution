package typings.googleapis.cloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for `TestIamPermissions` method.
  */
@js.native
trait SchemaGoogleIamV1TestIamPermissionsResponse extends js.Object {
  /**
    * A subset of `TestPermissionsRequest.permissions` that the caller is
    * allowed.
    */
  var permissions: js.UndefOr[js.Array[String]] = js.native
}

object SchemaGoogleIamV1TestIamPermissionsResponse {
  @scala.inline
  def apply(permissions: js.Array[String] = null): SchemaGoogleIamV1TestIamPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleIamV1TestIamPermissionsResponse]
  }
}

