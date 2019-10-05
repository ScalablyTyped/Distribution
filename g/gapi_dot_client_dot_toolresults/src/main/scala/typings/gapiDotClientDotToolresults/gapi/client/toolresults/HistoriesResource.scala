package typings.gapiDotClientDotToolresults.gapi.client.toolresults

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotToolresults.Anon_AltFieldsFilterByName
import typings.gapiDotClientDotToolresults.Anon_AltFieldsHistoryIdKey
import typings.gapiDotClientDotToolresults.Anon_AltFieldsKey
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
  def create(request: Anon_AltFieldsKey): Request[History]
  /**
    * Gets a History.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to read project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the History does
    * not exist
    */
  def get(request: Anon_AltFieldsHistoryIdKey): Request[History]
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
  def list(request: Anon_AltFieldsFilterByName): Request[ListHistoriesResponse]
}

object HistoriesResource {
  @scala.inline
  def apply(
    create: Anon_AltFieldsKey => Request[History],
    executions: ExecutionsResource,
    get: Anon_AltFieldsHistoryIdKey => Request[History],
    list: Anon_AltFieldsFilterByName => Request[ListHistoriesResponse]
  ): HistoriesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), executions = executions, get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[HistoriesResource]
  }
}

