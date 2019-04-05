package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tasks extends js.Object {
  var Tasklists: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.TasksNs.CollectionNs.TasklistsCollection
  ] = js.undefined
  var Tasks: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.TasksNs.CollectionNs.TasksCollection
  ] = js.undefined
  // Create a new instance of Task
  def newTask(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TasksNs.SchemaNs.Task
  // Create a new instance of TaskLinks
  def newTaskLinks(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TasksNs.SchemaNs.TaskLinks
  // Create a new instance of TaskList
  def newTaskList(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TasksNs.SchemaNs.TaskList
}

object Tasks {
  @scala.inline
  def apply(
    newTask: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.TasksNs.SchemaNs.Task,
    newTaskLinks: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.TasksNs.SchemaNs.TaskLinks,
    newTaskList: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.TasksNs.SchemaNs.TaskList,
    Tasklists: googleDashAppsDashScriptLib.GoogleAppsScriptNs.TasksNs.CollectionNs.TasklistsCollection = null,
    Tasks: googleDashAppsDashScriptLib.GoogleAppsScriptNs.TasksNs.CollectionNs.TasksCollection = null
  ): Tasks = {
    val __obj = js.Dynamic.literal(newTask = js.Any.fromFunction0(newTask), newTaskLinks = js.Any.fromFunction0(newTaskLinks), newTaskList = js.Any.fromFunction0(newTaskList))
    if (Tasklists != null) __obj.updateDynamic("Tasklists")(Tasklists)
    if (Tasks != null) __obj.updateDynamic("Tasks")(Tasks)
    __obj.asInstanceOf[Tasks]
  }
}

