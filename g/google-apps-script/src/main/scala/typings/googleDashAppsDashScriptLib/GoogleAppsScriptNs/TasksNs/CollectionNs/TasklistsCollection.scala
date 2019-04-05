package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.TasksNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TasklistsCollection extends js.Object {
  // Returns the authenticated user's specified task list.
  def get(tasklist: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TasksNs.SchemaNs.TaskList = js.native
  // Creates a new task list and adds it to the authenticated user's task lists.
  def insert(resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.TasksNs.SchemaNs.TaskList): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TasksNs.SchemaNs.TaskList = js.native
  // Returns all the authenticated user's task lists.
  def list(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TasksNs.SchemaNs.TaskLists = js.native
  // Returns all the authenticated user's task lists.
  def list(optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TasksNs.SchemaNs.TaskLists = js.native
  // Updates the authenticated user's specified task list. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.TasksNs.SchemaNs.TaskList,
    tasklist: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TasksNs.SchemaNs.TaskList = js.native
  // Deletes the authenticated user's specified task list.
  def remove(tasklist: java.lang.String): scala.Unit = js.native
  // Updates the authenticated user's specified task list.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.TasksNs.SchemaNs.TaskList,
    tasklist: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TasksNs.SchemaNs.TaskList = js.native
}

