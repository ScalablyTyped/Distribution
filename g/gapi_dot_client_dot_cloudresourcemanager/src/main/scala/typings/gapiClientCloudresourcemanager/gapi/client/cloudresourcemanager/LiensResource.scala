package typings.gapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCloudresourcemanager.AnonAccesstokenAlt
import typings.gapiClientCloudresourcemanager.AnonAccesstokenAltBearertoken
import typings.gapiClientCloudresourcemanager.AnonAccesstokenAltBearertokenCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiensResource extends js.Object {
  /**
    * Create a Lien which applies to the resource denoted by the `parent` field.
    *
    * Callers of this method will require permission on the `parent` resource.
    * For example, applying to `projects/1234` requires permission
    * `resourcemanager.projects.updateLiens`.
    *
    * NOTE: Some resources may limit the number of Liens which may be applied.
    */
  def create(request: AnonAccesstokenAlt): Request_[Lien]
  /**
    * Delete a Lien by `name`.
    *
    * Callers of this method will require permission on the `parent` resource.
    * For example, a Lien with a `parent` of `projects/1234` requires permission
    * `resourcemanager.projects.updateLiens`.
    */
  def delete(request: AnonAccesstokenAltBearertoken): Request_[js.Object]
  /**
    * List all Liens applied to the `parent` resource.
    *
    * Callers of this method will require permission on the `parent` resource.
    * For example, a Lien with a `parent` of `projects/1234` requires permission
    * `resourcemanager.projects.get`.
    */
  def list(request: AnonAccesstokenAltBearertokenCallback): Request_[ListLiensResponse]
}

object LiensResource {
  @scala.inline
  def apply(
    create: AnonAccesstokenAlt => Request_[Lien],
    delete: AnonAccesstokenAltBearertoken => Request_[js.Object],
    list: AnonAccesstokenAltBearertokenCallback => Request_[ListLiensResponse]
  ): LiensResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[LiensResource]
  }
}

