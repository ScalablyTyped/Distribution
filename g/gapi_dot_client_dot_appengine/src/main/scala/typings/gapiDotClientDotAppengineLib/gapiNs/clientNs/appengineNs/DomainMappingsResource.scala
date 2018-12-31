package typings
package gapiDotClientDotAppengineLib.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainMappingsResource extends js.Object {
  /**
    * Maps a domain to an application. A user must be authorized to administer a domain in order to map it to an application. For a list of available
    * authorized domains, see AuthorizedDomains.ListAuthorizedDomains.
    */
  def create(request: gapiDotClientDotAppengineLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Deletes the specified domain mapping. A user must be authorized to administer the associated domain in order to delete a DomainMapping resource. */
  def delete(request: gapiDotClientDotAppengineLib.Anon_AccesstokenAppsIdDomainMappingsId): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Gets the specified domain mapping. */
  def get(request: gapiDotClientDotAppengineLib.Anon_AccesstokenAppsIdDomainMappingsId): gapiDotClientLib.gapiNs.clientNs.Request[DomainMapping]
  /** Lists the domain mappings on an application. */
  def list(request: gapiDotClientDotAppengineLib.Anon_AccesstokenPageSizeAppsIdPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[ListDomainMappingsResponse]
  /**
    * Updates the specified domain mapping. To map an SSL certificate to a domain mapping, update certificate_id to point to an AuthorizedCertificate
    * resource. A user must be authorized to administer the associated domain in order to update a DomainMapping resource.
    */
  def patch(request: gapiDotClientDotAppengineLib.Anon_AccesstokenAppsIdDomainMappingsIdPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

