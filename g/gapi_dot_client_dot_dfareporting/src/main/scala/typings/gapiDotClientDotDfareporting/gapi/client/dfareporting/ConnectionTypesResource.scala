package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDfareporting.Anon_AltFields
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionTypesResource extends js.Object {
  /** Gets one connection type by ID. */
  def get(request: Anon_AltFields): Request[ConnectionType]
  /** Retrieves a list of connection types. */
  def list(request: Anon_AltFieldsKey): Request[ConnectionTypesListResponse]
}

object ConnectionTypesResource {
  @scala.inline
  def apply(
    get: Anon_AltFields => Request[ConnectionType],
    list: Anon_AltFieldsKey => Request[ConnectionTypesListResponse]
  ): ConnectionTypesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ConnectionTypesResource]
  }
}

