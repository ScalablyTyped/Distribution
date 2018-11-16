package typings
package gapiDotClientDotFusiontablesLib.gapiNs.clientNs.fusiontablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TaskResource extends js.Object {
  /** Deletes a specific task by its ID, unless that task has already started running. */
  def delete(request: gapiDotClientDotFusiontablesLib.Anon_PrettyPrintQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Retrieves a specific task by its ID. */
  def get(request: gapiDotClientDotFusiontablesLib.Anon_PrettyPrintQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[Task]
  /** Retrieves a list of tasks. */
  def list(request: gapiDotClientDotFusiontablesLib.Anon_MaxResultsPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[TaskList]
}

