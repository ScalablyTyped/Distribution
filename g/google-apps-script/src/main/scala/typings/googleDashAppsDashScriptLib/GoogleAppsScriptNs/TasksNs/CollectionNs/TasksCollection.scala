package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.TasksNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TasksCollection extends js.Object {
  // Clears all completed tasks from the specified task list. The affected tasks will be marked as 'hidden' and no longer be returned by default when retrieving all tasks for a task list.
  def clear(tasklist: java.lang.String): scala.Unit = js.native
  // Returns the specified task.
  def get(tasklist: java.lang.String, task: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TasksNs.SchemaNs.Task = js.native
  // Creates a new task on the specified task list.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.TasksNs.SchemaNs.Task,
    tasklist: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TasksNs.SchemaNs.Task = js.native
  // Creates a new task on the specified task list.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.TasksNs.SchemaNs.Task,
    tasklist: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TasksNs.SchemaNs.Task = js.native
  // Returns all tasks in the specified task list.
  def list(tasklist: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TasksNs.SchemaNs.Tasks = js.native
  // Returns all tasks in the specified task list.
  def list(tasklist: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TasksNs.SchemaNs.Tasks = js.native
  // Moves the specified task to another position in the task list. This can include putting it as a child task under a new parent and/or move it to a different position among its sibling tasks.
  def move(tasklist: java.lang.String, task: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TasksNs.SchemaNs.Task = js.native
  // Moves the specified task to another position in the task list. This can include putting it as a child task under a new parent and/or move it to a different position among its sibling tasks.
  def move(tasklist: java.lang.String, task: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TasksNs.SchemaNs.Task = js.native
  // Updates the specified task. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.TasksNs.SchemaNs.Task,
    tasklist: java.lang.String,
    task: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TasksNs.SchemaNs.Task = js.native
  // Deletes the specified task from the task list.
  def remove(tasklist: java.lang.String, task: java.lang.String): scala.Unit = js.native
  // Updates the specified task.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.TasksNs.SchemaNs.Task,
    tasklist: java.lang.String,
    task: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TasksNs.SchemaNs.Task = js.native
}

