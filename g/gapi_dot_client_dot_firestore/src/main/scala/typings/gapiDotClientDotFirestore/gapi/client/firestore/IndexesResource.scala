package typings.gapiDotClientDotFirestore.gapi.client.firestore

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotFirestore.Anon_AccesstokenAltBearertokenCallbackFieldsFilter
import typings.gapiDotClientDotFirestore.Anon_AccesstokenAltBearertokenCallbackFieldsKey
import typings.gapiDotClientDotFirestore.Anon_AccesstokenAltBearertokenCallbackFieldsKeyName
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
  def create(request: Anon_AccesstokenAltBearertokenCallbackFieldsKey): Request[Operation]
  /** Deletes an index. */
  def delete(request: Anon_AccesstokenAltBearertokenCallbackFieldsKeyName): Request[js.Object]
  /** Gets an index. */
  def get(request: Anon_AccesstokenAltBearertokenCallbackFieldsKeyName): Request[Index]
  /** Lists the indexes that match the specified filters. */
  def list(request: Anon_AccesstokenAltBearertokenCallbackFieldsFilter): Request[ListIndexesResponse]
}

object IndexesResource {
  @scala.inline
  def apply(
    create: Anon_AccesstokenAltBearertokenCallbackFieldsKey => Request[Operation],
    delete: Anon_AccesstokenAltBearertokenCallbackFieldsKeyName => Request[js.Object],
    get: Anon_AccesstokenAltBearertokenCallbackFieldsKeyName => Request[Index],
    list: Anon_AccesstokenAltBearertokenCallbackFieldsFilter => Request[ListIndexesResponse]
  ): IndexesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[IndexesResource]
  }
}

