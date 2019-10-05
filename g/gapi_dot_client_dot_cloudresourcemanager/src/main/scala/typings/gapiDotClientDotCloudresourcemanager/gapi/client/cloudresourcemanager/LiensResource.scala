package typings.gapiDotClientDotCloudresourcemanager.gapi.client.cloudresourcemanager

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotCloudresourcemanager.Anon_AccesstokenAlt
import typings.gapiDotClientDotCloudresourcemanager.Anon_AccesstokenAltBearertoken
import typings.gapiDotClientDotCloudresourcemanager.Anon_AccesstokenAltBearertokenCallback
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
  def create(request: Anon_AccesstokenAlt): Request[Lien]
  /**
    * Delete a Lien by `name`.
    *
    * Callers of this method will require permission on the `parent` resource.
    * For example, a Lien with a `parent` of `projects/1234` requires permission
    * `resourcemanager.projects.updateLiens`.
    */
  def delete(request: Anon_AccesstokenAltBearertoken): Request[js.Object]
  /**
    * List all Liens applied to the `parent` resource.
    *
    * Callers of this method will require permission on the `parent` resource.
    * For example, a Lien with a `parent` of `projects/1234` requires permission
    * `resourcemanager.projects.get`.
    */
  def list(request: Anon_AccesstokenAltBearertokenCallback): Request[ListLiensResponse]
}

object LiensResource {
  @scala.inline
  def apply(
    create: Anon_AccesstokenAlt => Request[Lien],
    delete: Anon_AccesstokenAltBearertoken => Request[js.Object],
    list: Anon_AccesstokenAltBearertokenCallback => Request[ListLiensResponse]
  ): LiensResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[LiensResource]
  }
}

