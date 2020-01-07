package typings.googleapis.buildSrcApisServicecontrolV1Mod.servicecontrol_v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Authentication information for the operation.
  */
@js.native
trait Schema$AuthenticationInfo extends js.Object {
  /**
    * The authority selector specified by the requestor, if any. It is not
    * guaranteed that the principal was allowed to use this authority.
    */
  var authoritySelector: js.UndefOr[String] = js.native
  /**
    * The email address of the authenticated user (or service account on behalf
    * of third party principal) making the request. For privacy reasons, the
    * principal email address is redacted for all read-only operations that
    * fail with a &quot;permission denied&quot; error.
    */
  var principalEmail: js.UndefOr[String] = js.native
  /**
    * Identity delegation history of an authenticated service account that
    * makes the request. It contains information on the real authorities that
    * try to access GCP resources by delegating on a service account. When
    * multiple authorities present, they are guaranteed to be sorted based on
    * the original ordering of the identity delegation events.
    */
  var serviceAccountDelegationInfo: js.UndefOr[js.Array[Schema$ServiceAccountDelegationInfo]] = js.native
  /**
    * The name of the service account key used to create or exchange
    * credentials for authenticating the service account making the request.
    * This is a scheme-less URI full resource name. For example:
    * &quot;//iam.googleapis.com/projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}/keys/{key}&quot;
    */
  var serviceAccountKeyName: js.UndefOr[String] = js.native
  /**
    * The third party identification (if any) of the authenticated user making
    * the request. When the JSON object represented here has a proto
    * equivalent, the proto name will be indicated in the `@type` property.
    */
  var thirdPartyPrincipal: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object Schema$AuthenticationInfo {
  @scala.inline
  def apply(
    authoritySelector: String = null,
    principalEmail: String = null,
    serviceAccountDelegationInfo: js.Array[Schema$ServiceAccountDelegationInfo] = null,
    serviceAccountKeyName: String = null,
    thirdPartyPrincipal: StringDictionary[js.Any] = null
  ): Schema$AuthenticationInfo = {
    val __obj = js.Dynamic.literal()
    if (authoritySelector != null) __obj.updateDynamic("authoritySelector")(authoritySelector.asInstanceOf[js.Any])
    if (principalEmail != null) __obj.updateDynamic("principalEmail")(principalEmail.asInstanceOf[js.Any])
    if (serviceAccountDelegationInfo != null) __obj.updateDynamic("serviceAccountDelegationInfo")(serviceAccountDelegationInfo.asInstanceOf[js.Any])
    if (serviceAccountKeyName != null) __obj.updateDynamic("serviceAccountKeyName")(serviceAccountKeyName.asInstanceOf[js.Any])
    if (thirdPartyPrincipal != null) __obj.updateDynamic("thirdPartyPrincipal")(thirdPartyPrincipal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AuthenticationInfo]
  }
}

