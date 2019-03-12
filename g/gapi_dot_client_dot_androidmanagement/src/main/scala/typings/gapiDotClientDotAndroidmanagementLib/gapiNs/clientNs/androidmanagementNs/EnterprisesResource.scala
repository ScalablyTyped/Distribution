package typings
package gapiDotClientDotAndroidmanagementLib.gapiNs.clientNs.androidmanagementNs

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
  def create(
    request: gapiDotClientDotAndroidmanagementLib.Anon_AccesstokenAltBearertokenCallbackEnterpriseToken
  ): gapiDotClientLib.gapiNs.clientNs.Request[Enterprise]
  /** Gets an enterprise. */
  def get(request: gapiDotClientDotAndroidmanagementLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Enterprise]
  /** Updates an enterprise. */
  def patch(request: gapiDotClientDotAndroidmanagementLib.Anon_AccesstokenAltBearertokenCallbackFields): gapiDotClientLib.gapiNs.clientNs.Request[Enterprise]
}

object EnterprisesResource {
  @scala.inline
  def apply(
    applications: ApplicationsResource,
    create: gapiDotClientDotAndroidmanagementLib.Anon_AccesstokenAltBearertokenCallbackEnterpriseToken => gapiDotClientLib.gapiNs.clientNs.Request[Enterprise],
    devices: DevicesResource,
    enrollmentTokens: EnrollmentTokensResource,
    get: gapiDotClientDotAndroidmanagementLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[Enterprise],
    patch: gapiDotClientDotAndroidmanagementLib.Anon_AccesstokenAltBearertokenCallbackFields => gapiDotClientLib.gapiNs.clientNs.Request[Enterprise],
    policies: PoliciesResource,
    webTokens: WebTokensResource
  ): EnterprisesResource = {
    val __obj = js.Dynamic.literal(applications = applications, create = js.Any.fromFunction1(create), devices = devices, enrollmentTokens = enrollmentTokens, get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch), policies = policies, webTokens = webTokens)
  
    __obj.asInstanceOf[EnterprisesResource]
  }
}

