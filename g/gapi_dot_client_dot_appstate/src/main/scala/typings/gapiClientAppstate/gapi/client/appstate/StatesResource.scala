package typings.gapiClientAppstate.gapi.client.appstate

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAppstate.anon.Alt
import typings.gapiClientAppstate.anon.CurrentStateVersion
import typings.gapiClientAppstate.anon.Fields
import typings.gapiClientAppstate.anon.IncludeData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatesResource extends js.Object {
  /**
    * Clears (sets to empty) the data for the passed key if and only if the passed version matches the currently stored version. This method results in a
    * conflict error on version mismatch.
    */
  def clear(request: Alt): Request[WriteResult] = js.native
  /**
    * Deletes a key and the data associated with it. The key is removed and no longer counts against the key quota. Note that since this method is not safe
    * in the face of concurrent modifications, it should only be used for development and testing purposes. Invoking this method in shipping code can result
    * in data loss and data corruption.
    */
  def delete(request: Fields): Request[Unit] = js.native
  /** Retrieves the data corresponding to the passed key. If the key does not exist on the server, an HTTP 404 will be returned. */
  def get(request: Fields): Request[GetResponse] = js.native
  /** Lists all the states keys, and optionally the state data. */
  def list(request: IncludeData): Request[ListResponse] = js.native
  /**
    * Update the data associated with the input key if and only if the passed version matches the currently stored version. This method is safe in the face
    * of concurrent writes. Maximum per-key size is 128KB.
    */
  def update(request: CurrentStateVersion): Request[WriteResult] = js.native
}

object StatesResource {
  @scala.inline
  def apply(
    clear: Alt => Request[WriteResult],
    delete: Fields => Request[Unit],
    get: Fields => Request[GetResponse],
    list: IncludeData => Request[ListResponse],
    update: CurrentStateVersion => Request[WriteResult]
  ): StatesResource = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[StatesResource]
  }
  @scala.inline
  implicit class StatesResourceOps[Self <: StatesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClear(value: Alt => Request[WriteResult]): Self = this.set("clear", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: Fields => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Fields => Request[GetResponse]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: IncludeData => Request[ListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: CurrentStateVersion => Request[WriteResult]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

