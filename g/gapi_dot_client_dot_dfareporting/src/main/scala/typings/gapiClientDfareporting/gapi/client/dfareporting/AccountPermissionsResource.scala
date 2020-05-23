package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Fields
import typings.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountPermissionsResource extends js.Object {
  /** Gets one account permission by ID. */
  def get(request: Fields): Request[AccountPermission]
  /** Retrieves the list of account permissions. */
  def list(request: Key): Request[AccountPermissionsListResponse]
}

object AccountPermissionsResource {
  @scala.inline
  def apply(get: Fields => Request[AccountPermission], list: Key => Request[AccountPermissionsListResponse]): AccountPermissionsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[AccountPermissionsResource]
  }
}

