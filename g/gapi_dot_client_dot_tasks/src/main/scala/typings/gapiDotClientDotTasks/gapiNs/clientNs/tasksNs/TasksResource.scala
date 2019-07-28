package typings.gapiDotClientDotTasks.gapiNs.clientNs.tasksNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotTasks.Anon_Alt
import typings.gapiDotClientDotTasks.Anon_AltCompletedMax
import typings.gapiDotClientDotTasks.Anon_AltFieldsKeyOauthtoken
import typings.gapiDotClientDotTasks.Anon_AltFieldsKeyOauthtokenParent
import typings.gapiDotClientDotTasks.Anon_AltFieldsKeyOauthtokenParentPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TasksResource extends js.Object {
  /**
    * Clears all completed tasks from the specified task list. The affected tasks will be marked as 'hidden' and no longer be returned by default when
    * retrieving all tasks for a task list.
    */
  def clear(request: Anon_Alt): Request[Unit]
  /** Deletes the specified task from the task list. */
  def delete(request: Anon_AltFieldsKeyOauthtoken): Request[Unit]
  /** Returns the specified task. */
  def get(request: Anon_AltFieldsKeyOauthtoken): Request[Task]
  /** Creates a new task on the specified task list. */
  def insert(request: Anon_AltFieldsKeyOauthtokenParent): Request[Task]
  /** Returns all tasks in the specified task list. */
  def list(request: Anon_AltCompletedMax): Request[Tasks]
  /**
    * Moves the specified task to another position in the task list. This can include putting it as a child task under a new parent and/or move it to a
    * different position among its sibling tasks.
    */
  def move(request: Anon_AltFieldsKeyOauthtokenParentPrettyPrint): Request[Task]
  /** Updates the specified task. This method supports patch semantics. */
  def patch(request: Anon_AltFieldsKeyOauthtoken): Request[Task]
  /** Updates the specified task. */
  def update(request: Anon_AltFieldsKeyOauthtoken): Request[Task]
}

object TasksResource {
  @scala.inline
  def apply(
    clear: Anon_Alt => Request[Unit],
    delete: Anon_AltFieldsKeyOauthtoken => Request[Unit],
    get: Anon_AltFieldsKeyOauthtoken => Request[Task],
    insert: Anon_AltFieldsKeyOauthtokenParent => Request[Task],
    list: Anon_AltCompletedMax => Request[Tasks],
    move: Anon_AltFieldsKeyOauthtokenParentPrettyPrint => Request[Task],
    patch: Anon_AltFieldsKeyOauthtoken => Request[Task],
    update: Anon_AltFieldsKeyOauthtoken => Request[Task]
  ): TasksResource = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), move = js.Any.fromFunction1(move), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[TasksResource]
  }
}

