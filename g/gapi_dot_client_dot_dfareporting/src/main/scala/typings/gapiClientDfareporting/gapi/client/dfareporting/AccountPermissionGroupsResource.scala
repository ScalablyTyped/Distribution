package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonFields
import typings.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountPermissionGroupsResource extends js.Object {
  /** Gets one account permission group by ID. */
  def get(request: AnonFields): Request_[AccountPermissionGroup]
  /** Retrieves the list of account permission groups. */
  def list(request: AnonKey): Request_[AccountPermissionGroupsListResponse]
}

object AccountPermissionGroupsResource {
  @scala.inline
  def apply(
    get: AnonFields => Request_[AccountPermissionGroup],
    list: AnonKey => Request_[AccountPermissionGroupsListResponse]
  ): AccountPermissionGroupsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[AccountPermissionGroupsResource]
  }
}

