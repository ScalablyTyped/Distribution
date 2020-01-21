package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about the permissions required by a specific app and whether
  * they have been accepted by the enterprise.
  */
@js.native
trait SchemaProductPermissions extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#productPermissions&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The permissions required by the app.
    */
  var permission: js.UndefOr[js.Array[SchemaProductPermission]] = js.native
  /**
    * The ID of the app that the permissions relate to, e.g.
    * &quot;app:com.google.android.gm&quot;.
    */
  var productId: js.UndefOr[String] = js.native
}

object SchemaProductPermissions {
  @scala.inline
  def apply(
    kind: String = null,
    permission: js.Array[SchemaProductPermission] = null,
    productId: String = null
  ): SchemaProductPermissions = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (permission != null) __obj.updateDynamic("permission")(permission.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProductPermissions]
  }
}

