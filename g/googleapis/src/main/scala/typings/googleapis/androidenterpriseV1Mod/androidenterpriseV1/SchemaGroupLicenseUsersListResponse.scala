package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The user resources for the group license.
  */
@js.native
trait SchemaGroupLicenseUsersListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#groupLicenseUsersListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A user of an enterprise.
    */
  var user: js.UndefOr[js.Array[SchemaUser]] = js.native
}

object SchemaGroupLicenseUsersListResponse {
  @scala.inline
  def apply(kind: String = null, user: js.Array[SchemaUser] = null): SchemaGroupLicenseUsersListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGroupLicenseUsersListResponse]
  }
}

