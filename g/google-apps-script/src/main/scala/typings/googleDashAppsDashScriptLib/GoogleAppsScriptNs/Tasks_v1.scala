package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tasks_v1 extends js.Object {
  var Tasklists: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.TasksUnderscoreV1Ns.CollectionNs.TasklistsCollection
  ] = js.undefined
  var Tasks: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.TasksUnderscoreV1Ns.CollectionNs.TasksCollection
  ] = js.undefined
  // Create a new instance of Task
  def newTask(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TasksUnderscoreV1Ns.SchemaNs.Task
  // Create a new instance of TaskLinks
  def newTaskLinks(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TasksUnderscoreV1Ns.SchemaNs.TaskLinks
  // Create a new instance of TaskList
  def newTaskList(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TasksUnderscoreV1Ns.SchemaNs.TaskList
}

object Tasks_v1 {
  @scala.inline
  def apply(
    newTask: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.TasksUnderscoreV1Ns.SchemaNs.Task,
    newTaskLinks: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.TasksUnderscoreV1Ns.SchemaNs.TaskLinks,
    newTaskList: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.TasksUnderscoreV1Ns.SchemaNs.TaskList,
    Tasklists: googleDashAppsDashScriptLib.GoogleAppsScriptNs.TasksUnderscoreV1Ns.CollectionNs.TasklistsCollection = null,
    Tasks: googleDashAppsDashScriptLib.GoogleAppsScriptNs.TasksUnderscoreV1Ns.CollectionNs.TasksCollection = null
  ): Tasks_v1 = {
    val __obj = js.Dynamic.literal(newTask = js.Any.fromFunction0(newTask), newTaskLinks = js.Any.fromFunction0(newTaskLinks), newTaskList = js.Any.fromFunction0(newTaskList))
    if (Tasklists != null) __obj.updateDynamic("Tasklists")(Tasklists)
    if (Tasks != null) __obj.updateDynamic("Tasks")(Tasks)
    __obj.asInstanceOf[Tasks_v1]
  }
}

