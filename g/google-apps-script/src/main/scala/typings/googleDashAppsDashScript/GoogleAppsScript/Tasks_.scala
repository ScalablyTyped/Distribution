package typings.googleDashAppsDashScript.GoogleAppsScript

import typings.googleDashAppsDashScript.GoogleAppsScript.Tasks.Collection.TasklistsCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Tasks.Collection.TasksCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Tasks.Schema.Task
import typings.googleDashAppsDashScript.GoogleAppsScript.Tasks.Schema.TaskLinks
import typings.googleDashAppsDashScript.GoogleAppsScript.Tasks.Schema.TaskList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("Tasks")
trait Tasks_ extends js.Object {
  var Tasklists: js.UndefOr[TasklistsCollection] = js.undefined
  var Tasks: js.UndefOr[TasksCollection] = js.undefined
  // Create a new instance of Task
  def newTask(): Task
  // Create a new instance of TaskLinks
  def newTaskLinks(): TaskLinks
  // Create a new instance of TaskList
  def newTaskList(): TaskList
}

object Tasks_ {
  @scala.inline
  def apply(
    newTask: () => Task,
    newTaskLinks: () => TaskLinks,
    newTaskList: () => TaskList,
    Tasklists: TasklistsCollection = null,
    Tasks: TasksCollection = null
  ): Tasks_ = {
    val __obj = js.Dynamic.literal(newTask = js.Any.fromFunction0(newTask), newTaskLinks = js.Any.fromFunction0(newTaskLinks), newTaskList = js.Any.fromFunction0(newTaskList))
    if (Tasklists != null) __obj.updateDynamic("Tasklists")(Tasklists)
    if (Tasks != null) __obj.updateDynamic("Tasks")(Tasks)
    __obj.asInstanceOf[Tasks_]
  }
}

