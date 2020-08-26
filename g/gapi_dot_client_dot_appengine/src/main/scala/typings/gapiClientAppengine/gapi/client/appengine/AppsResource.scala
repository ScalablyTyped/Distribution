package typings.gapiClientAppengine.gapi.client.appengine

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAppengine.anon.Accesstoken
import typings.gapiClientAppengine.anon.UpdateMask
import typings.gapiClientAppengine.anon.UploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppsResource extends js.Object {
  var authorizedCertificates: AuthorizedCertificatesResource = js.native
  var authorizedDomains: AuthorizedDomainsResource = js.native
  var domainMappings: DomainMappingsResource = js.native
  var firewall: FirewallResource = js.native
  var locations: LocationsResource = js.native
  var operations: OperationsResource = js.native
  var services: ServicesResource = js.native
  /**
    * Creates an App Engine application for a Google Cloud Platform project. Required fields:
    * id - The ID of the target Cloud Platform project.
    * location - The region (https://cloud.google.com/appengine/docs/locations) where you want the App Engine application located.For more information about
    * App Engine applications, see Managing Projects, Applications, and Billing (https://cloud.google.com/appengine/docs/python/console/).
    */
  def create(request: UploadType): Request[Operation] = js.native
  /** Gets information about an application. */
  def get(request: Accesstoken): Request[Application] = js.native
  /**
    * Updates the specified Application resource. You can update the following fields:
    * auth_domain - Google authentication domain for controlling user access to the application.
    * default_cookie_expiration - Cookie expiration policy for the application.
    */
  def patch(request: UpdateMask): Request[Operation] = js.native
  /**
    * Recreates the required App Engine features for the specified App Engine application, for example a Cloud Storage bucket or App Engine service account.
    * Use this method if you receive an error message about a missing feature, for example, Error retrieving the App Engine service account.
    */
  def repair(request: Accesstoken): Request[Operation] = js.native
}

object AppsResource {
  @scala.inline
  def apply(
    authorizedCertificates: AuthorizedCertificatesResource,
    authorizedDomains: AuthorizedDomainsResource,
    create: UploadType => Request[Operation],
    domainMappings: DomainMappingsResource,
    firewall: FirewallResource,
    get: Accesstoken => Request[Application],
    locations: LocationsResource,
    operations: OperationsResource,
    patch: UpdateMask => Request[Operation],
    repair: Accesstoken => Request[Operation],
    services: ServicesResource
  ): AppsResource = {
    val __obj = js.Dynamic.literal(authorizedCertificates = authorizedCertificates.asInstanceOf[js.Any], authorizedDomains = authorizedDomains.asInstanceOf[js.Any], create = js.Any.fromFunction1(create), domainMappings = domainMappings.asInstanceOf[js.Any], firewall = firewall.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), locations = locations.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], patch = js.Any.fromFunction1(patch), repair = js.Any.fromFunction1(repair), services = services.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsResource]
  }
  @scala.inline
  implicit class AppsResourceOps[Self <: AppsResource] (val x: Self) extends AnyVal {
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
    def setAuthorizedCertificates(value: AuthorizedCertificatesResource): Self = this.set("authorizedCertificates", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthorizedDomains(value: AuthorizedDomainsResource): Self = this.set("authorizedDomains", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreate(value: UploadType => Request[Operation]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDomainMappings(value: DomainMappingsResource): Self = this.set("domainMappings", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirewall(value: FirewallResource): Self = this.set("firewall", value.asInstanceOf[js.Any])
    @scala.inline
    def setGet(value: Accesstoken => Request[Application]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setLocations(value: LocationsResource): Self = this.set("locations", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperations(value: OperationsResource): Self = this.set("operations", value.asInstanceOf[js.Any])
    @scala.inline
    def setPatch(value: UpdateMask => Request[Operation]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setRepair(value: Accesstoken => Request[Operation]): Self = this.set("repair", js.Any.fromFunction1(value))
    @scala.inline
    def setServices(value: ServicesResource): Self = this.set("services", value.asInstanceOf[js.Any])
  }
  
}

