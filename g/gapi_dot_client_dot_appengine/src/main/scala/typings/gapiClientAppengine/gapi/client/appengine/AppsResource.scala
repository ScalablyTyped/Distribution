package typings.gapiClientAppengine.gapi.client.appengine

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAppengine.anon.Accesstoken
import typings.gapiClientAppengine.anon.UpdateMask
import typings.gapiClientAppengine.anon.UploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsResource extends js.Object {
  var authorizedCertificates: AuthorizedCertificatesResource
  var authorizedDomains: AuthorizedDomainsResource
  var domainMappings: DomainMappingsResource
  var firewall: FirewallResource
  var locations: LocationsResource
  var operations: OperationsResource
  var services: ServicesResource
  /**
    * Creates an App Engine application for a Google Cloud Platform project. Required fields:
    * id - The ID of the target Cloud Platform project.
    * location - The region (https://cloud.google.com/appengine/docs/locations) where you want the App Engine application located.For more information about
    * App Engine applications, see Managing Projects, Applications, and Billing (https://cloud.google.com/appengine/docs/python/console/).
    */
  def create(request: UploadType): Request[Operation]
  /** Gets information about an application. */
  def get(request: Accesstoken): Request[Application]
  /**
    * Updates the specified Application resource. You can update the following fields:
    * auth_domain - Google authentication domain for controlling user access to the application.
    * default_cookie_expiration - Cookie expiration policy for the application.
    */
  def patch(request: UpdateMask): Request[Operation]
  /**
    * Recreates the required App Engine features for the specified App Engine application, for example a Cloud Storage bucket or App Engine service account.
    * Use this method if you receive an error message about a missing feature, for example, Error retrieving the App Engine service account.
    */
  def repair(request: Accesstoken): Request[Operation]
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
}

