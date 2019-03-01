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
    create: js.Function1[
      gapiDotClientDotAndroidmanagementLib.Anon_AccesstokenAltBearertokenCallbackEnterpriseToken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Enterprise]
    ],
    devices: DevicesResource,
    enrollmentTokens: EnrollmentTokensResource,
    get: js.Function1[
      gapiDotClientDotAndroidmanagementLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Enterprise]
    ],
    patch: js.Function1[
      gapiDotClientDotAndroidmanagementLib.Anon_AccesstokenAltBearertokenCallbackFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Enterprise]
    ],
    policies: PoliciesResource,
    webTokens: WebTokensResource
  ): EnterprisesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("applications")(applications)
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("devices")(devices)
    __obj.updateDynamic("enrollmentTokens")(enrollmentTokens)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("patch")(patch)
    __obj.updateDynamic("policies")(policies)
    __obj.updateDynamic("webTokens")(webTokens)
    __obj.asInstanceOf[EnterprisesResource]
  }
}

