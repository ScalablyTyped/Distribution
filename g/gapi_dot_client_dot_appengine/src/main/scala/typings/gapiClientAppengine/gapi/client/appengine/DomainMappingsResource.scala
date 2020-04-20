package typings.gapiClientAppengine.gapi.client.appengine

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAppengine.AnonAccesstoken
import typings.gapiClientAppengine.AnonCallback
import typings.gapiClientAppengine.AnonDomainMappingsId
import typings.gapiClientAppengine.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainMappingsResource extends js.Object {
  /**
    * Maps a domain to an application. A user must be authorized to administer a domain in order to map it to an application. For a list of available
    * authorized domains, see AuthorizedDomains.ListAuthorizedDomains.
    */
  def create(request: AnonAccesstoken): Request_[Operation]
  /** Deletes the specified domain mapping. A user must be authorized to administer the associated domain in order to delete a DomainMapping resource. */
  def delete(request: AnonDomainMappingsId): Request_[Operation]
  /** Gets the specified domain mapping. */
  def get(request: AnonDomainMappingsId): Request_[DomainMapping]
  /** Lists the domain mappings on an application. */
  def list(request: AnonCallback): Request_[ListDomainMappingsResponse]
  /**
    * Updates the specified domain mapping. To map an SSL certificate to a domain mapping, update certificate_id to point to an AuthorizedCertificate
    * resource. A user must be authorized to administer the associated domain in order to update a DomainMapping resource.
    */
  def patch(request: AnonFields): Request_[Operation]
}

object DomainMappingsResource {
  @scala.inline
  def apply(
    create: AnonAccesstoken => Request_[Operation],
    delete: AnonDomainMappingsId => Request_[Operation],
    get: AnonDomainMappingsId => Request_[DomainMapping],
    list: AnonCallback => Request_[ListDomainMappingsResponse],
    patch: AnonFields => Request_[Operation]
  ): DomainMappingsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch))
    __obj.asInstanceOf[DomainMappingsResource]
  }
}

