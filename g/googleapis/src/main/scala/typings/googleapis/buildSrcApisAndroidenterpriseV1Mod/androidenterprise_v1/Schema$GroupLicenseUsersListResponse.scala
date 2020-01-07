package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The user resources for the group license.
  */
@js.native
trait Schema$GroupLicenseUsersListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#groupLicenseUsersListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A user of an enterprise.
    */
  var user: js.UndefOr[js.Array[Schema$User]] = js.native
}

object Schema$GroupLicenseUsersListResponse {
  @scala.inline
  def apply(kind: String = null, user: js.Array[Schema$User] = null): Schema$GroupLicenseUsersListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GroupLicenseUsersListResponse]
  }
}

