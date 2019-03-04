package typings
package gapiDotClientDotFusiontablesLib.gapiNs.clientNs.fusiontablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskResource extends js.Object {
  /** Deletes a specific task by its ID, unless that task has already started running. */
  def delete(request: gapiDotClientDotFusiontablesLib.Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserTableId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Retrieves a specific task by its ID. */
  def get(request: gapiDotClientDotFusiontablesLib.Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserTableId): gapiDotClientLib.gapiNs.clientNs.Request[Task]
  /** Retrieves a list of tasks. */
  def list(request: gapiDotClientDotFusiontablesLib.Anon_AltFieldsKeyMaxResultsOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[TaskList]
}

object TaskResource {
  @scala.inline
  def apply(
    delete: js.Function1[
      gapiDotClientDotFusiontablesLib.Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserTableId, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotFusiontablesLib.Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserTableId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Task]
    ],
    list: js.Function1[
      gapiDotClientDotFusiontablesLib.Anon_AltFieldsKeyMaxResultsOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[TaskList]
    ]
  ): TaskResource = {
    val __obj = js.Dynamic.literal(delete = delete, get = get, list = list)
  
    __obj.asInstanceOf[TaskResource]
  }
}

