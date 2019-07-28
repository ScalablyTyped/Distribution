package typings.gapiDotClientDotFusiontables.gapiNs.clientNs.fusiontablesNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotFusiontables.Anon_AltFieldsKeyMaxResultsOauthtoken
import typings.gapiDotClientDotFusiontables.Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserTableId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskResource extends js.Object {
  /** Deletes a specific task by its ID, unless that task has already started running. */
  def delete(request: Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserTableId): Request[Unit]
  /** Retrieves a specific task by its ID. */
  def get(request: Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserTableId): Request[Task]
  /** Retrieves a list of tasks. */
  def list(request: Anon_AltFieldsKeyMaxResultsOauthtoken): Request[TaskList]
}

object TaskResource {
  @scala.inline
  def apply(
    delete: Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserTableId => Request[Unit],
    get: Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserTableId => Request[Task],
    list: Anon_AltFieldsKeyMaxResultsOauthtoken => Request[TaskList]
  ): TaskResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[TaskResource]
  }
}

