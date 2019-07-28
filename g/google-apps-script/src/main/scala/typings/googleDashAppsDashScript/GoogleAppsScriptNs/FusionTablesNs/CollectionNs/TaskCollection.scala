package typings.googleDashAppsDashScript.GoogleAppsScriptNs.FusionTablesNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.Task
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.TaskList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskCollection extends js.Object {
  // Retrieves a specific task by its ID.
  def get(tableId: String, taskId: String): Task = js.native
  // Retrieves a list of tasks.
  def list(tableId: String): TaskList = js.native
  // Retrieves a list of tasks.
  def list(tableId: String, optionalArgs: js.Object): TaskList = js.native
  // Deletes a specific task by its ID, unless that task has already started running.
  def remove(tableId: String, taskId: String): Unit = js.native
}

