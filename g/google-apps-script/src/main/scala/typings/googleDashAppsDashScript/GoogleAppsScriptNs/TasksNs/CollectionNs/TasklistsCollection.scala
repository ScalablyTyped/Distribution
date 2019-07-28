package typings.googleDashAppsDashScript.GoogleAppsScriptNs.TasksNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TasksNs.SchemaNs.TaskList
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TasksNs.SchemaNs.TaskLists
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TasklistsCollection extends js.Object {
  // Returns the authenticated user's specified task list.
  def get(tasklist: String): TaskList = js.native
  // Creates a new task list and adds it to the authenticated user's task lists.
  def insert(resource: TaskList): TaskList = js.native
  // Returns all the authenticated user's task lists.
  def list(): TaskLists = js.native
  // Returns all the authenticated user's task lists.
  def list(optionalArgs: js.Object): TaskLists = js.native
  // Updates the authenticated user's specified task list. This method supports patch semantics.
  def patch(resource: TaskList, tasklist: String): TaskList = js.native
  // Deletes the authenticated user's specified task list.
  def remove(tasklist: String): Unit = js.native
  // Updates the authenticated user's specified task list.
  def update(resource: TaskList, tasklist: String): TaskList = js.native
}

