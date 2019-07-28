package typings.googleDashAppsDashScript.GoogleAppsScriptNs.TasksNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TasksNs.SchemaNs.Task
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TasksCollection extends js.Object {
  // Clears all completed tasks from the specified task list. The affected tasks will be marked as 'hidden' and no longer be returned by default when retrieving all tasks for a task list.
  def clear(tasklist: String): Unit = js.native
  // Returns the specified task.
  def get(tasklist: String, task: String): Task = js.native
  // Creates a new task on the specified task list.
  def insert(resource: Task, tasklist: String): Task = js.native
  // Creates a new task on the specified task list.
  def insert(resource: Task, tasklist: String, optionalArgs: js.Object): Task = js.native
  // Returns all tasks in the specified task list.
  def list(tasklist: String): typings.googleDashAppsDashScript.GoogleAppsScriptNs.TasksNs.SchemaNs.Tasks = js.native
  // Returns all tasks in the specified task list.
  def list(tasklist: String, optionalArgs: js.Object): typings.googleDashAppsDashScript.GoogleAppsScriptNs.TasksNs.SchemaNs.Tasks = js.native
  // Moves the specified task to another position in the task list. This can include putting it as a child task under a new parent and/or move it to a different position among its sibling tasks.
  def move(tasklist: String, task: String): Task = js.native
  // Moves the specified task to another position in the task list. This can include putting it as a child task under a new parent and/or move it to a different position among its sibling tasks.
  def move(tasklist: String, task: String, optionalArgs: js.Object): Task = js.native
  // Updates the specified task. This method supports patch semantics.
  def patch(resource: Task, tasklist: String, task: String): Task = js.native
  // Deletes the specified task from the task list.
  def remove(tasklist: String, task: String): Unit = js.native
  // Updates the specified task.
  def update(resource: Task, tasklist: String, task: String): Task = js.native
}

