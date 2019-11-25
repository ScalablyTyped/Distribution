package typings.gapiDotClientDotAndroidmanagement.gapi.client.androidmanagement

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAndroidmanagement.Anon_AccesstokenAlt
import typings.gapiDotClientDotAndroidmanagement.Anon_AccesstokenAltBearertokenCallbackEnterpriseToken
import typings.gapiDotClientDotAndroidmanagement.Anon_AccesstokenAltBearertokenCallbackFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnterprisesResource extends js.Object {
  var applications: ApplicationsResource
  var devices: DevicesResource
  var enrollmentTokens: EnrollmentTokensResource
  var policies: PoliciesResource
  var webTokens: WebTokensResource
  /** Creates an enterprise by completing the enterprise signup flow. */
  def create(request: Anon_AccesstokenAltBearertokenCallbackEnterpriseToken): Request[Enterprise]
  /** Gets an enterprise. */
  def get(request: Anon_AccesstokenAlt): Request[Enterprise]
  /** Updates an enterprise. */
  def patch(request: Anon_AccesstokenAltBearertokenCallbackFields): Request[Enterprise]
}

object EnterprisesResource {
  @scala.inline
  def apply(
    applications: ApplicationsResource,
    create: Anon_AccesstokenAltBearertokenCallbackEnterpriseToken => Request[Enterprise],
    devices: DevicesResource,
    enrollmentTokens: EnrollmentTokensResource,
    get: Anon_AccesstokenAlt => Request[Enterprise],
    patch: Anon_AccesstokenAltBearertokenCallbackFields => Request[Enterprise],
    policies: PoliciesResource,
    webTokens: WebTokensResource
  ): EnterprisesResource = {
    val __obj = js.Dynamic.literal(applications = applications.asInstanceOf[js.Any], create = js.Any.fromFunction1(create), devices = devices.asInstanceOf[js.Any], enrollmentTokens = enrollmentTokens.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch), policies = policies.asInstanceOf[js.Any], webTokens = webTokens.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EnterprisesResource]
  }
}

