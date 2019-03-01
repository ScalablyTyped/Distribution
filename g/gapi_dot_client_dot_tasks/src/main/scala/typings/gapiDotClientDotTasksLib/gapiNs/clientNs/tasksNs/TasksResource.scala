package typings
package gapiDotClientDotTasksLib.gapiNs.clientNs.tasksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TasksResource extends js.Object {
  /**
    * Clears all completed tasks from the specified task list. The affected tasks will be marked as 'hidden' and no longer be returned by default when
    * retrieving all tasks for a task list.
    */
  def clear(request: gapiDotClientDotTasksLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Deletes the specified task from the task list. */
  def delete(request: gapiDotClientDotTasksLib.Anon_AltFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Returns the specified task. */
  def get(request: gapiDotClientDotTasksLib.Anon_AltFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[Task]
  /** Creates a new task on the specified task list. */
  def insert(request: gapiDotClientDotTasksLib.Anon_AltFieldsKeyOauthtokenParent): gapiDotClientLib.gapiNs.clientNs.Request[Task]
  /** Returns all tasks in the specified task list. */
  def list(request: gapiDotClientDotTasksLib.Anon_AltCompletedMax): gapiDotClientLib.gapiNs.clientNs.Request[Tasks]
  /**
    * Moves the specified task to another position in the task list. This can include putting it as a child task under a new parent and/or move it to a
    * different position among its sibling tasks.
    */
  def move(request: gapiDotClientDotTasksLib.Anon_AltFieldsKeyOauthtokenParentPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Task]
  /** Updates the specified task. This method supports patch semantics. */
  def patch(request: gapiDotClientDotTasksLib.Anon_AltFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[Task]
  /** Updates the specified task. */
  def update(request: gapiDotClientDotTasksLib.Anon_AltFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[Task]
}

object TasksResource {
  @scala.inline
  def apply(
    clear: js.Function1[
      gapiDotClientDotTasksLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    delete: js.Function1[
      gapiDotClientDotTasksLib.Anon_AltFieldsKeyOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotTasksLib.Anon_AltFieldsKeyOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Task]
    ],
    insert: js.Function1[
      gapiDotClientDotTasksLib.Anon_AltFieldsKeyOauthtokenParent, 
      gapiDotClientLib.gapiNs.clientNs.Request[Task]
    ],
    list: js.Function1[
      gapiDotClientDotTasksLib.Anon_AltCompletedMax, 
      gapiDotClientLib.gapiNs.clientNs.Request[Tasks]
    ],
    move: js.Function1[
      gapiDotClientDotTasksLib.Anon_AltFieldsKeyOauthtokenParentPrettyPrint, 
      gapiDotClientLib.gapiNs.clientNs.Request[Task]
    ],
    patch: js.Function1[
      gapiDotClientDotTasksLib.Anon_AltFieldsKeyOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Task]
    ],
    update: js.Function1[
      gapiDotClientDotTasksLib.Anon_AltFieldsKeyOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Task]
    ]
  ): TasksResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(clear)
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("insert")(insert)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("move")(move)
    __obj.updateDynamic("patch")(patch)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[TasksResource]
  }
}

