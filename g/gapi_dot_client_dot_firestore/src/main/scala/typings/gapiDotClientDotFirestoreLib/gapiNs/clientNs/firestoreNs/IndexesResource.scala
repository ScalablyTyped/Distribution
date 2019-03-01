package typings
package gapiDotClientDotFirestoreLib.gapiNs.clientNs.firestoreNs

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
  def create(request: gapiDotClientDotFirestoreLib.Anon_AccesstokenAltBearertokenCallbackFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Deletes an index. */
  def delete(request: gapiDotClientDotFirestoreLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyName): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Gets an index. */
  def get(request: gapiDotClientDotFirestoreLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyName): gapiDotClientLib.gapiNs.clientNs.Request[Index]
  /** Lists the indexes that match the specified filters. */
  def list(request: gapiDotClientDotFirestoreLib.Anon_AccesstokenAltBearertokenCallbackFieldsFilter): gapiDotClientLib.gapiNs.clientNs.Request[ListIndexesResponse]
}

object IndexesResource {
  @scala.inline
  def apply(
    create: js.Function1[
      gapiDotClientDotFirestoreLib.Anon_AccesstokenAltBearertokenCallbackFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    delete: js.Function1[
      gapiDotClientDotFirestoreLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyName, 
      gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
    ],
    get: js.Function1[
      gapiDotClientDotFirestoreLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyName, 
      gapiDotClientLib.gapiNs.clientNs.Request[Index]
    ],
    list: js.Function1[
      gapiDotClientDotFirestoreLib.Anon_AccesstokenAltBearertokenCallbackFieldsFilter, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListIndexesResponse]
    ]
  ): IndexesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[IndexesResource]
  }
}

