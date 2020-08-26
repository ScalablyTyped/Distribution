package typings.gapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthenticationRule extends js.Object {
  /**
    * Whether to allow requests without a credential. The credential can be
    * an OAuth token, Google cookies (first-party auth) or EndUserCreds.
    *
    * For requests without credentials, if the service control environment is
    * specified, each incoming request &#42;&#42;must&#42;&#42; be associated with a service
    * consumer. This can be done by passing an API key that belongs to a consumer
    * project.
    */
  var allowWithoutCredential: js.UndefOr[Boolean] = js.native
  /** Configuration for custom authentication. */
  var customAuth: js.UndefOr[CustomAuthRequirements] = js.native
  /** The requirements for OAuth credentials. */
  var oauth: js.UndefOr[OAuthRequirements] = js.native
  /** Requirements for additional authentication providers. */
  var requirements: js.UndefOr[js.Array[AuthRequirement]] = js.native
  /**
    * Selects the methods to which this rule applies.
    *
    * Refer to selector for syntax details.
    */
  var selector: js.UndefOr[String] = js.native
}

object AuthenticationRule {
  @scala.inline
  def apply(): AuthenticationRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationRule]
  }
  @scala.inline
  implicit class AuthenticationRuleOps[Self <: AuthenticationRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowWithoutCredential(value: Boolean): Self = this.set("allowWithoutCredential", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowWithoutCredential: Self = this.set("allowWithoutCredential", js.undefined)
    @scala.inline
    def setCustomAuth(value: CustomAuthRequirements): Self = this.set("customAuth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomAuth: Self = this.set("customAuth", js.undefined)
    @scala.inline
    def setOauth(value: OAuthRequirements): Self = this.set("oauth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOauth: Self = this.set("oauth", js.undefined)
    @scala.inline
    def setRequirementsVarargs(value: AuthRequirement*): Self = this.set("requirements", js.Array(value :_*))
    @scala.inline
    def setRequirements(value: js.Array[AuthRequirement]): Self = this.set("requirements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequirements: Self = this.set("requirements", js.undefined)
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
  }
  
}

