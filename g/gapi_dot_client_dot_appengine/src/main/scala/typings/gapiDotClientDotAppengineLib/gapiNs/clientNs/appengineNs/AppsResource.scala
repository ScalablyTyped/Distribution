package typings
package gapiDotClientDotAppengineLib.gapiNs.clientNs.appengineNs

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
  def create(request: gapiDotClientDotAppengineLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Gets information about an application. */
  def get(request: gapiDotClientDotAppengineLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Application]
  /**
    * Updates the specified Application resource. You can update the following fields:
    * auth_domain - Google authentication domain for controlling user access to the application.
    * default_cookie_expiration - Cookie expiration policy for the application.
    */
  def patch(
    request: gapiDotClientDotAppengineLib.Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKeyOauthtokenPpPrettyPrintQuotaUserUpdateMask
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /**
    * Recreates the required App Engine features for the specified App Engine application, for example a Cloud Storage bucket or App Engine service account.
    * Use this method if you receive an error message about a missing feature, for example, Error retrieving the App Engine service account.
    */
  def repair(request: gapiDotClientDotAppengineLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

object AppsResource {
  @scala.inline
  def apply(
    authorizedCertificates: AuthorizedCertificatesResource,
    authorizedDomains: AuthorizedDomainsResource,
    create: gapiDotClientDotAppengineLib.Anon_AccesstokenAltBearertoken => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    domainMappings: DomainMappingsResource,
    firewall: FirewallResource,
    get: gapiDotClientDotAppengineLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[Application],
    locations: LocationsResource,
    operations: OperationsResource,
    patch: gapiDotClientDotAppengineLib.Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKeyOauthtokenPpPrettyPrintQuotaUserUpdateMask => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    repair: gapiDotClientDotAppengineLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    services: ServicesResource
  ): AppsResource = {
    val __obj = js.Dynamic.literal(authorizedCertificates = authorizedCertificates, authorizedDomains = authorizedDomains, create = js.Any.fromFunction1(create), domainMappings = domainMappings, firewall = firewall, get = js.Any.fromFunction1(get), locations = locations, operations = operations, patch = js.Any.fromFunction1(patch), repair = js.Any.fromFunction1(repair), services = services)
  
    __obj.asInstanceOf[AppsResource]
  }
}

