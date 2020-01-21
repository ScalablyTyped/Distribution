package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonAltFields
import typings.gapiClientDfareporting.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountPermissionsResource extends js.Object {
  /** Gets one account permission by ID. */
  def get(request: AnonAltFields): Request_[AccountPermission]
  /** Retrieves the list of account permissions. */
  def list(request: AnonAltFieldsKey): Request_[AccountPermissionsListResponse]
}

object AccountPermissionsResource {
  @scala.inline
  def apply(
    get: AnonAltFields => Request_[AccountPermission],
    list: AnonAltFieldsKey => Request_[AccountPermissionsListResponse]
  ): AccountPermissionsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[AccountPermissionsResource]
  }
}

