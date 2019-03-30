package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskCollection extends js.Object {
  // Retrieves a specific task by its ID.
  def get(tableId: java.lang.String, taskId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.SchemaNs.Task = js.native
  // Retrieves a list of tasks.
  def list(tableId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.SchemaNs.TaskList = js.native
  // Retrieves a list of tasks.
  def list(tableId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.SchemaNs.TaskList = js.native
  // Deletes a specific task by its ID, unless that task has already started running.
  def remove(tableId: java.lang.String, taskId: java.lang.String): scala.Unit = js.native
}

