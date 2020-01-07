package typings.googleapis.buildSrcApisCloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducer_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for `TestIamPermissions` method.
  */
@js.native
trait Schema$GoogleIamV1TestIamPermissionsResponse extends js.Object {
  /**
    * A subset of `TestPermissionsRequest.permissions` that the caller is
    * allowed.
    */
  var permissions: js.UndefOr[js.Array[String]] = js.native
}

object Schema$GoogleIamV1TestIamPermissionsResponse {
  @scala.inline
  def apply(permissions: js.Array[String] = null): Schema$GoogleIamV1TestIamPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleIamV1TestIamPermissionsResponse]
  }
}

