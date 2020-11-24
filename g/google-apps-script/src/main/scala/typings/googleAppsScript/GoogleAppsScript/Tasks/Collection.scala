package typings.googleAppsScript.GoogleAppsScript.Tasks

import typings.googleAppsScript.GoogleAppsScript.Tasks.Schema.Task
import typings.googleAppsScript.GoogleAppsScript.Tasks.Schema.TaskList
import typings.googleAppsScript.GoogleAppsScript.Tasks.Schema.TaskLists
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("GoogleAppsScript.Tasks.Collection")
@js.native
object Collection extends js.Object {
  
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
    def list(tasklist: String): typings.googleAppsScript.GoogleAppsScript.Tasks.Schema.Tasks = js.native
    // Returns all tasks in the specified task list.
    def list(tasklist: String, optionalArgs: js.Object): typings.googleAppsScript.GoogleAppsScript.Tasks.Schema.Tasks = js.native
    
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
}
