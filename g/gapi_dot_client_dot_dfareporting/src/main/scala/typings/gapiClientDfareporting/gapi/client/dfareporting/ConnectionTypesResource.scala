package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonAltFields
import typings.gapiClientDfareporting.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionTypesResource extends js.Object {
  /** Gets one connection type by ID. */
  def get(request: AnonAltFields): Request_[ConnectionType]
  /** Retrieves a list of connection types. */
  def list(request: AnonAltFieldsKey): Request_[ConnectionTypesListResponse]
}

object ConnectionTypesResource {
  @scala.inline
  def apply(
    get: AnonAltFields => Request_[ConnectionType],
    list: AnonAltFieldsKey => Request_[ConnectionTypesListResponse]
  ): ConnectionTypesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ConnectionTypesResource]
  }
}

