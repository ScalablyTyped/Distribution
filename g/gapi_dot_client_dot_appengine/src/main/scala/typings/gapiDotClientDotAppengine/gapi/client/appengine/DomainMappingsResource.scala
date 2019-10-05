package typings.gapiDotClientDotAppengine.gapi.client.appengine

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAppengine.Anon_Accesstoken
import typings.gapiDotClientDotAppengine.Anon_AccesstokenAltAppsIdBearertokenCallback
import typings.gapiDotClientDotAppengine.Anon_AccesstokenAltAppsIdBearertokenCallbackDomainMappingsId
import typings.gapiDotClientDotAppengine.Anon_AccesstokenAltAppsIdBearertokenCallbackDomainMappingsIdFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainMappingsResource extends js.Object {
  /**
    * Maps a domain to an application. A user must be authorized to administer a domain in order to map it to an application. For a list of available
    * authorized domains, see AuthorizedDomains.ListAuthorizedDomains.
    */
  def create(request: Anon_Accesstoken): Request[Operation]
  /** Deletes the specified domain mapping. A user must be authorized to administer the associated domain in order to delete a DomainMapping resource. */
  def delete(request: Anon_AccesstokenAltAppsIdBearertokenCallbackDomainMappingsId): Request[Operation]
  /** Gets the specified domain mapping. */
  def get(request: Anon_AccesstokenAltAppsIdBearertokenCallbackDomainMappingsId): Request[DomainMapping]
  /** Lists the domain mappings on an application. */
  def list(request: Anon_AccesstokenAltAppsIdBearertokenCallback): Request[ListDomainMappingsResponse]
  /**
    * Updates the specified domain mapping. To map an SSL certificate to a domain mapping, update certificate_id to point to an AuthorizedCertificate
    * resource. A user must be authorized to administer the associated domain in order to update a DomainMapping resource.
    */
  def patch(request: Anon_AccesstokenAltAppsIdBearertokenCallbackDomainMappingsIdFields): Request[Operation]
}

object DomainMappingsResource {
  @scala.inline
  def apply(
    create: Anon_Accesstoken => Request[Operation],
    delete: Anon_AccesstokenAltAppsIdBearertokenCallbackDomainMappingsId => Request[Operation],
    get: Anon_AccesstokenAltAppsIdBearertokenCallbackDomainMappingsId => Request[DomainMapping],
    list: Anon_AccesstokenAltAppsIdBearertokenCallback => Request[ListDomainMappingsResponse],
    patch: Anon_AccesstokenAltAppsIdBearertokenCallbackDomainMappingsIdFields => Request[Operation]
  ): DomainMappingsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch))
  
    __obj.asInstanceOf[DomainMappingsResource]
  }
}

