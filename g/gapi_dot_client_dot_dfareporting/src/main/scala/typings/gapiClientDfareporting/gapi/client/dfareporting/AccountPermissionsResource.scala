package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonFields
import typings.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountPermissionsResource extends js.Object {
  /** Gets one account permission by ID. */
  def get(request: AnonFields): Request_[AccountPermission]
  /** Retrieves the list of account permissions. */
  def list(request: AnonKey): Request_[AccountPermissionsListResponse]
}

object AccountPermissionsResource {
  @scala.inline
  def apply(
    get: AnonFields => Request_[AccountPermission],
    list: AnonKey => Request_[AccountPermissionsListResponse]
  ): AccountPermissionsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[AccountPermissionsResource]
  }
}

