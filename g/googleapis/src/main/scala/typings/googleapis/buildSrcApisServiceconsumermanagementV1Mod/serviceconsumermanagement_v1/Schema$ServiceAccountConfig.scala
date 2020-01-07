package typings.googleapis.buildSrcApisServiceconsumermanagementV1Mod.serviceconsumermanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the service account configuration for the tenant project.
  */
@js.native
trait Schema$ServiceAccountConfig extends js.Object {
  /**
    * ID of the IAM service account to be created in tenant project. The email
    * format of the service account is
    * &quot;&lt;account-id&gt;@&lt;tenant-project-id&gt;.iam.gserviceaccount.com&quot;.
    * This account ID must be unique within tenant project and service
    * producers have to guarantee it. The ID must be 6-30 characters long, and
    * match the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])`.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Roles for the associated service account for the tenant project.
    */
  var tenantProjectRoles: js.UndefOr[js.Array[String]] = js.native
}

object Schema$ServiceAccountConfig {
  @scala.inline
  def apply(accountId: String = null, tenantProjectRoles: js.Array[String] = null): Schema$ServiceAccountConfig = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (tenantProjectRoles != null) __obj.updateDynamic("tenantProjectRoles")(tenantProjectRoles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ServiceAccountConfig]
  }
}

