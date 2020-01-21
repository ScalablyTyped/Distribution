package typings.gapiClientFusiontables.gapi.client.fusiontables

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientFusiontables.AnonAltFieldsKeyMaxResultsOauthtoken
import typings.gapiClientFusiontables.AnonAltFieldsKeyOauthtokenPrettyPrintQuotaUserTableId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskResource extends js.Object {
  /** Deletes a specific task by its ID, unless that task has already started running. */
  def delete(request: AnonAltFieldsKeyOauthtokenPrettyPrintQuotaUserTableId): Request_[Unit]
  /** Retrieves a specific task by its ID. */
  def get(request: AnonAltFieldsKeyOauthtokenPrettyPrintQuotaUserTableId): Request_[Task]
  /** Retrieves a list of tasks. */
  def list(request: AnonAltFieldsKeyMaxResultsOauthtoken): Request_[TaskList]
}

object TaskResource {
  @scala.inline
  def apply(
    delete: AnonAltFieldsKeyOauthtokenPrettyPrintQuotaUserTableId => Request_[Unit],
    get: AnonAltFieldsKeyOauthtokenPrettyPrintQuotaUserTableId => Request_[Task],
    list: AnonAltFieldsKeyMaxResultsOauthtoken => Request_[TaskList]
  ): TaskResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[TaskResource]
  }
}

