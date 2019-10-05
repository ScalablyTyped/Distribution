package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDfareporting.Anon_AltFields
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountPermissionGroupsResource extends js.Object {
  /** Gets one account permission group by ID. */
  def get(request: Anon_AltFields): Request[AccountPermissionGroup]
  /** Retrieves the list of account permission groups. */
  def list(request: Anon_AltFieldsKey): Request[AccountPermissionGroupsListResponse]
}

object AccountPermissionGroupsResource {
  @scala.inline
  def apply(
    get: Anon_AltFields => Request[AccountPermissionGroup],
    list: Anon_AltFieldsKey => Request[AccountPermissionGroupsListResponse]
  ): AccountPermissionGroupsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[AccountPermissionGroupsResource]
  }
}

