package typings.gapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var allowWithoutCredential: js.UndefOr[Boolean] = js.undefined
  /** Configuration for custom authentication. */
  var customAuth: js.UndefOr[CustomAuthRequirements] = js.undefined
  /** The requirements for OAuth credentials. */
  var oauth: js.UndefOr[OAuthRequirements] = js.undefined
  /** Requirements for additional authentication providers. */
  var requirements: js.UndefOr[js.Array[AuthRequirement]] = js.undefined
  /**
    * Selects the methods to which this rule applies.
    *
    * Refer to selector for syntax details.
    */
  var selector: js.UndefOr[String] = js.undefined
}

object AuthenticationRule {
  @scala.inline
  def apply(
    allowWithoutCredential: js.UndefOr[Boolean] = js.undefined,
    customAuth: CustomAuthRequirements = null,
    oauth: OAuthRequirements = null,
    requirements: js.Array[AuthRequirement] = null,
    selector: String = null
  ): AuthenticationRule = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowWithoutCredential)) __obj.updateDynamic("allowWithoutCredential")(allowWithoutCredential.get.asInstanceOf[js.Any])
    if (customAuth != null) __obj.updateDynamic("customAuth")(customAuth.asInstanceOf[js.Any])
    if (oauth != null) __obj.updateDynamic("oauth")(oauth.asInstanceOf[js.Any])
    if (requirements != null) __obj.updateDynamic("requirements")(requirements.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationRule]
  }
}

