package typings.googleAppsScript.GoogleAppsScript

import typings.googleAppsScript.GoogleAppsScript.Tasks.Collection.TasklistsCollection
import typings.googleAppsScript.GoogleAppsScript.Tasks.Collection.TasksCollection
import typings.googleAppsScript.GoogleAppsScript.Tasks.Schema.Task
import typings.googleAppsScript.GoogleAppsScript.Tasks.Schema.TaskLinks
import typings.googleAppsScript.GoogleAppsScript.Tasks.Schema.TaskList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tasks_ extends js.Object {
  
  var Tasklists: js.UndefOr[TasklistsCollection] = js.native
  
  var Tasks: js.UndefOr[TasksCollection] = js.native
  
  // Create a new instance of Task
  def newTask(): Task = js.native
  
  // Create a new instance of TaskLinks
  def newTaskLinks(): TaskLinks = js.native
  
  // Create a new instance of TaskList
  def newTaskList(): TaskList = js.native
}
object Tasks_ {
  
  @scala.inline
  def apply(newTask: () => Task, newTaskLinks: () => TaskLinks, newTaskList: () => TaskList): Tasks_ = {
    val __obj = js.Dynamic.literal(newTask = js.Any.fromFunction0(newTask), newTaskLinks = js.Any.fromFunction0(newTaskLinks), newTaskList = js.Any.fromFunction0(newTaskList))
    __obj.asInstanceOf[Tasks_]
  }
  
  @scala.inline
  implicit class Tasks_Ops[Self <: Tasks_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNewTask(value: () => Task): Self = this.set("newTask", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTaskLinks(value: () => TaskLinks): Self = this.set("newTaskLinks", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTaskList(value: () => TaskList): Self = this.set("newTaskList", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTasklists(value: TasklistsCollection): Self = this.set("Tasklists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTasklists: Self = this.set("Tasklists", js.undefined)
    
    @scala.inline
    def setTasks(value: TasksCollection): Self = this.set("Tasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTasks: Self = this.set("Tasks", js.undefined)
  }
}
