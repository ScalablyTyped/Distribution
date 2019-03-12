package typings
package gapiDotClientDotToolresultsLib.gapiNs.clientNs.toolresultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoriesResource extends js.Object {
  var executions: ExecutionsResource
  /**
    * Creates a History.
    *
    * The returned History will have the id set.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to write to project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the
    * containing project does not exist
    */
  def create(request: gapiDotClientDotToolresultsLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[History]
  /**
    * Gets a History.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to read project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the History does
    * not exist
    */
  def get(request: gapiDotClientDotToolresultsLib.Anon_AltFieldsHistoryIdKey): gapiDotClientLib.gapiNs.clientNs.Request[History]
  /**
    * Lists Histories for a given Project.
    *
    * The histories are sorted by modification time in descending order. The history_id key will be used to order the history with the same modification
    * time.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to read project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the History does
    * not exist
    */
  def list(request: gapiDotClientDotToolresultsLib.Anon_AltFieldsFilterByName): gapiDotClientLib.gapiNs.clientNs.Request[ListHistoriesResponse]
}

object HistoriesResource {
  @scala.inline
  def apply(
    create: gapiDotClientDotToolresultsLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[History],
    executions: ExecutionsResource,
    get: gapiDotClientDotToolresultsLib.Anon_AltFieldsHistoryIdKey => gapiDotClientLib.gapiNs.clientNs.Request[History],
    list: gapiDotClientDotToolresultsLib.Anon_AltFieldsFilterByName => gapiDotClientLib.gapiNs.clientNs.Request[ListHistoriesResponse]
  ): HistoriesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), executions = executions, get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[HistoriesResource]
  }
}

