package typings.firebaseAdmin.authMod.admin.auth

import typings.firebaseAdmin.anon.Enabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing a tenant configuration.
  *
  * Multi-tenancy support requires Google Cloud's Identity Platform
  * (GCIP). To learn more about GCIP, including pricing and features,
  * see the [GCIP documentation](https://cloud.google.com/identity-platform)
  *
  * Before multi-tenancy can be used on a Google Cloud Identity Platform project,
  * tenants must be allowed on that project via the Cloud Console UI.
  *
  * A tenant configuration provides information such as the display name, tenant
  * identifier and email authentication configuration.
  * For OIDC/SAML provider configuration management, `TenantAwareAuth` instances should
  * be used instead of a `Tenant` to retrieve the list of configured IdPs on a tenant.
  * When configuring these providers, note that tenants will inherit
  * whitelisted domains and authenticated redirect URIs of their parent project.
  *
  * All other settings of a tenant will also be inherited. These will need to be managed
  * from the Cloud Console UI.
  */
trait Tenant extends js.Object {
  /**
    * The tenant display name.
    */
  var displayName: js.UndefOr[String] = js.undefined
  /**
    * The email sign in provider configuration.
    */
  var emailSignInConfig: js.UndefOr[Enabled] = js.undefined
  /**
    * The tenant identifier.
    */
  var tenantId: String
  /**
    * @return A JSON-serializable representation of this object.
    */
  def toJSON(): js.Object
}

object Tenant {
  @scala.inline
  def apply(
    tenantId: String,
    toJSON: () => js.Object,
    displayName: String = null,
    emailSignInConfig: Enabled = null
  ): Tenant = {
    val __obj = js.Dynamic.literal(tenantId = tenantId.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (emailSignInConfig != null) __obj.updateDynamic("emailSignInConfig")(emailSignInConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tenant]
  }
}

