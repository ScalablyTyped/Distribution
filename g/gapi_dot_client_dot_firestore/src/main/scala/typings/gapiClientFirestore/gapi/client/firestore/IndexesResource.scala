package typings.gapiClientFirestore.gapi.client.firestore

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientFirestore.AnonFilter
import typings.gapiClientFirestore.AnonKey
import typings.gapiClientFirestore.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexesResource extends js.Object {
  /**
    * Creates the specified index.
    * A newly created index's initial state is `CREATING`. On completion of the
    * returned google.longrunning.Operation, the state will be `READY`.
    * If the index already exists, the call will return an `ALREADY_EXISTS`
    * status.
    *
    * During creation, the process could result in an error, in which case the
    * index will move to the `ERROR` state. The process can be recovered by
    * fixing the data that caused the error, removing the index with
    * delete, then re-creating the index with
    * create.
    *
    * Indexes with a single field cannot be created.
    */
  def create(request: AnonKey): Request_[Operation]
  /** Deletes an index. */
  def delete(request: AnonName): Request_[js.Object]
  /** Gets an index. */
  def get(request: AnonName): Request_[Index]
  /** Lists the indexes that match the specified filters. */
  def list(request: AnonFilter): Request_[ListIndexesResponse]
}

object IndexesResource {
  @scala.inline
  def apply(
    create: AnonKey => Request_[Operation],
    delete: AnonName => Request_[js.Object],
    get: AnonName => Request_[Index],
    list: AnonFilter => Request_[ListIndexesResponse]
  ): IndexesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[IndexesResource]
  }
}

