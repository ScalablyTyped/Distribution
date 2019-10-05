package typings.gapiDotClientDotAppstate.gapi.client.appstate

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAppstate.Anon_Alt
import typings.gapiDotClientDotAppstate.Anon_AltCurrentStateVersion
import typings.gapiDotClientDotAppstate.Anon_AltFields
import typings.gapiDotClientDotAppstate.Anon_AltFieldsIncludeData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatesResource extends js.Object {
  /**
    * Clears (sets to empty) the data for the passed key if and only if the passed version matches the currently stored version. This method results in a
    * conflict error on version mismatch.
    */
  def clear(request: Anon_Alt): Request[WriteResult]
  /**
    * Deletes a key and the data associated with it. The key is removed and no longer counts against the key quota. Note that since this method is not safe
    * in the face of concurrent modifications, it should only be used for development and testing purposes. Invoking this method in shipping code can result
    * in data loss and data corruption.
    */
  def delete(request: Anon_AltFields): Request[Unit]
  /** Retrieves the data corresponding to the passed key. If the key does not exist on the server, an HTTP 404 will be returned. */
  def get(request: Anon_AltFields): Request[GetResponse]
  /** Lists all the states keys, and optionally the state data. */
  def list(request: Anon_AltFieldsIncludeData): Request[ListResponse]
  /**
    * Update the data associated with the input key if and only if the passed version matches the currently stored version. This method is safe in the face
    * of concurrent writes. Maximum per-key size is 128KB.
    */
  def update(request: Anon_AltCurrentStateVersion): Request[WriteResult]
}

object StatesResource {
  @scala.inline
  def apply(
    clear: Anon_Alt => Request[WriteResult],
    delete: Anon_AltFields => Request[Unit],
    get: Anon_AltFields => Request[GetResponse],
    list: Anon_AltFieldsIncludeData => Request[ListResponse],
    update: Anon_AltCurrentStateVersion => Request[WriteResult]
  ): StatesResource = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[StatesResource]
  }
}

