package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDfareporting.Anon_AltFields
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountPermissionsResource extends js.Object {
  /** Gets one account permission by ID. */
  def get(request: Anon_AltFields): Request[AccountPermission]
  /** Retrieves the list of account permissions. */
  def list(request: Anon_AltFieldsKey): Request[AccountPermissionsListResponse]
}

object AccountPermissionsResource {
  @scala.inline
  def apply(
    get: Anon_AltFields => Request[AccountPermission],
    list: Anon_AltFieldsKey => Request[AccountPermissionsListResponse]
  ): AccountPermissionsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[AccountPermissionsResource]
  }
}

