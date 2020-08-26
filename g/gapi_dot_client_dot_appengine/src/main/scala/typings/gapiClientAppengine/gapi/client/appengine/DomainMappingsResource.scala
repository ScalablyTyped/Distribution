package typings.gapiClientAppengine.gapi.client.appengine

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAppengine.anon.Accesstoken
import typings.gapiClientAppengine.anon.Callback
import typings.gapiClientAppengine.anon.DomainMappingsId
import typings.gapiClientAppengine.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainMappingsResource extends js.Object {
  /**
    * Maps a domain to an application. A user must be authorized to administer a domain in order to map it to an application. For a list of available
    * authorized domains, see AuthorizedDomains.ListAuthorizedDomains.
    */
  def create(request: Accesstoken): Request[Operation] = js.native
  /** Deletes the specified domain mapping. A user must be authorized to administer the associated domain in order to delete a DomainMapping resource. */
  def delete(request: DomainMappingsId): Request[Operation] = js.native
  /** Gets the specified domain mapping. */
  def get(request: DomainMappingsId): Request[DomainMapping] = js.native
  /** Lists the domain mappings on an application. */
  def list(request: Callback): Request[ListDomainMappingsResponse] = js.native
  /**
    * Updates the specified domain mapping. To map an SSL certificate to a domain mapping, update certificate_id to point to an AuthorizedCertificate
    * resource. A user must be authorized to administer the associated domain in order to update a DomainMapping resource.
    */
  def patch(request: Fields): Request[Operation] = js.native
}

object DomainMappingsResource {
  @scala.inline
  def apply(
    create: Accesstoken => Request[Operation],
    delete: DomainMappingsId => Request[Operation],
    get: DomainMappingsId => Request[DomainMapping],
    list: Callback => Request[ListDomainMappingsResponse],
    patch: Fields => Request[Operation]
  ): DomainMappingsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch))
    __obj.asInstanceOf[DomainMappingsResource]
  }
  @scala.inline
  implicit class DomainMappingsResourceOps[Self <: DomainMappingsResource] (val x: Self) extends AnyVal {
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
    def setCreate(value: Accesstoken => Request[Operation]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: DomainMappingsId => Request[Operation]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: DomainMappingsId => Request[DomainMapping]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Callback => Request[ListDomainMappingsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Fields => Request[Operation]): Self = this.set("patch", js.Any.fromFunction1(value))
  }
  
}

