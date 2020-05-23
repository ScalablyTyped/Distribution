package typings.gapiClientTasks

import typings.gapiClientTasks.gapi.client.tasks.TasklistsResource
import typings.gapiClientTasks.gapi.client.tasks.TasksResource
import typings.gapiClientTasks.gapiClientTasksStrings.tasks
import typings.gapiClientTasks.gapiClientTasksStrings.v1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object gapi extends js.Object {
    @js.native
    object client extends js.Object {
      /** Load Tasks API v1 */
      def load(name: tasks, version: v1): js.Thenable[Unit] = js.native
      def load(name: tasks, version: v1, callback: js.Function0[_]): Unit = js.native
      @js.native
      object tasks extends js.Object {
        val tasklists: TasklistsResource = js.native
        val tasks: TasksResource = js.native
      }
      
    }
    
  }
  
}

