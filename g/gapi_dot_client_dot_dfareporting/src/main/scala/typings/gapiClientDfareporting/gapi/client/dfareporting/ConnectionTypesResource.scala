package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Fields
import typings.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionTypesResource extends js.Object {
  /** Gets one connection type by ID. */
  def get(request: Fields): Request[ConnectionType]
  /** Retrieves a list of connection types. */
  def list(request: Key): Request[ConnectionTypesListResponse]
}

object ConnectionTypesResource {
  @scala.inline
  def apply(get: Fields => Request[ConnectionType], list: Key => Request[ConnectionTypesListResponse]): ConnectionTypesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ConnectionTypesResource]
  }
}

