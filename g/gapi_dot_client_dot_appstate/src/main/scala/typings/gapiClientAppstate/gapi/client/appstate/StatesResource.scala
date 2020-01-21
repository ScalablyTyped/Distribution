package typings.gapiClientAppstate.gapi.client.appstate

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAppstate.AnonAlt
import typings.gapiClientAppstate.AnonAltCurrentStateVersion
import typings.gapiClientAppstate.AnonAltFields
import typings.gapiClientAppstate.AnonAltFieldsIncludeData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatesResource extends js.Object {
  /**
    * Clears (sets to empty) the data for the passed key if and only if the passed version matches the currently stored version. This method results in a
    * conflict error on version mismatch.
    */
  def clear(request: AnonAlt): Request_[WriteResult]
  /**
    * Deletes a key and the data associated with it. The key is removed and no longer counts against the key quota. Note that since this method is not safe
    * in the face of concurrent modifications, it should only be used for development and testing purposes. Invoking this method in shipping code can result
    * in data loss and data corruption.
    */
  def delete(request: AnonAltFields): Request_[Unit]
  /** Retrieves the data corresponding to the passed key. If the key does not exist on the server, an HTTP 404 will be returned. */
  def get(request: AnonAltFields): Request_[GetResponse]
  /** Lists all the states keys, and optionally the state data. */
  def list(request: AnonAltFieldsIncludeData): Request_[ListResponse]
  /**
    * Update the data associated with the input key if and only if the passed version matches the currently stored version. This method is safe in the face
    * of concurrent writes. Maximum per-key size is 128KB.
    */
  def update(request: AnonAltCurrentStateVersion): Request_[WriteResult]
}

object StatesResource {
  @scala.inline
  def apply(
    clear: AnonAlt => Request_[WriteResult],
    delete: AnonAltFields => Request_[Unit],
    get: AnonAltFields => Request_[GetResponse],
    list: AnonAltFieldsIncludeData => Request_[ListResponse],
    update: AnonAltCurrentStateVersion => Request_[WriteResult]
  ): StatesResource = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[StatesResource]
  }
}

