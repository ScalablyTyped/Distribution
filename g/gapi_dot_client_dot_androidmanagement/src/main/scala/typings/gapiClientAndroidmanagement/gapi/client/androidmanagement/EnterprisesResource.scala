package typings.gapiClientAndroidmanagement.gapi.client.androidmanagement

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAndroidmanagement.anon.Alt
import typings.gapiClientAndroidmanagement.anon.EnterpriseToken
import typings.gapiClientAndroidmanagement.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnterprisesResource extends js.Object {
  var applications: ApplicationsResource = js.native
  var devices: DevicesResource = js.native
  var enrollmentTokens: EnrollmentTokensResource = js.native
  var policies: PoliciesResource = js.native
  var webTokens: WebTokensResource = js.native
  /** Creates an enterprise by completing the enterprise signup flow. */
  def create(request: EnterpriseToken): Request[Enterprise] = js.native
  /** Gets an enterprise. */
  def get(request: Alt): Request[Enterprise] = js.native
  /** Updates an enterprise. */
  def patch(request: Fields): Request[Enterprise] = js.native
}

object EnterprisesResource {
  @scala.inline
  def apply(
    applications: ApplicationsResource,
    create: EnterpriseToken => Request[Enterprise],
    devices: DevicesResource,
    enrollmentTokens: EnrollmentTokensResource,
    get: Alt => Request[Enterprise],
    patch: Fields => Request[Enterprise],
    policies: PoliciesResource,
    webTokens: WebTokensResource
  ): EnterprisesResource = {
    val __obj = js.Dynamic.literal(applications = applications.asInstanceOf[js.Any], create = js.Any.fromFunction1(create), devices = devices.asInstanceOf[js.Any], enrollmentTokens = enrollmentTokens.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch), policies = policies.asInstanceOf[js.Any], webTokens = webTokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterprisesResource]
  }
  @scala.inline
  implicit class EnterprisesResourceOps[Self <: EnterprisesResource] (val x: Self) extends AnyVal {
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
    def setApplications(value: ApplicationsResource): Self = this.set("applications", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreate(value: EnterpriseToken => Request[Enterprise]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDevices(value: DevicesResource): Self = this.set("devices", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnrollmentTokens(value: EnrollmentTokensResource): Self = this.set("enrollmentTokens", value.asInstanceOf[js.Any])
    @scala.inline
    def setGet(value: Alt => Request[Enterprise]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Fields => Request[Enterprise]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setPolicies(value: PoliciesResource): Self = this.set("policies", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebTokens(value: WebTokensResource): Self = this.set("webTokens", value.asInstanceOf[js.Any])
  }
  
}

