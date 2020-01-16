package typings.gapiDotClientDotTasks.gapi.client.tasks

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotTasks.Anon_Alt
import typings.gapiDotClientDotTasks.Anon_AltCompletedMax
import typings.gapiDotClientDotTasks.Anon_AltFieldsKeyOauthtokenParent
import typings.gapiDotClientDotTasks.Anon_AltFieldsKeyOauthtokenParentPrettyPrint
import typings.gapiDotClientDotTasks.Anon_AltFieldsKeyOauthtokenParentPrettyPrintPrevious
import typings.gapiDotClientDotTasks.Anon_AltFieldsKeyOauthtokenPrettyPrint
import typings.gapiDotClientDotTasks.Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TasksResource extends js.Object {
  /**
    * Clears all completed tasks from the specified task list. The affected tasks will be marked as 'hidden' and no longer be returned by default when
    * retrieving all tasks for a task list.
    */
  def clear(request: Anon_Alt): Request[Unit] = js.native
  /** Deletes the specified task from the task list. */
  def delete(request: Anon_AltFieldsKeyOauthtokenPrettyPrint): Request[Unit] = js.native
  /** Returns the specified task. */
  def get(request: Anon_AltFieldsKeyOauthtokenPrettyPrint): Request[Task] = js.native
  /** Creates a new task on the specified task list. */
  def insert(request: Anon_AltFieldsKeyOauthtokenParent): Request[Task] = js.native
  def insert(request: Anon_AltFieldsKeyOauthtokenParentPrettyPrint, body: Task): Request[Task] = js.native
  /** Returns all tasks in the specified task list. */
  def list(request: Anon_AltCompletedMax): Request[Tasks] = js.native
  /**
    * Moves the specified task to another position in the task list. This can include putting it as a child task under a new parent and/or move it to a
    * different position among its sibling tasks.
    */
  def move(request: Anon_AltFieldsKeyOauthtokenParentPrettyPrintPrevious): Request[Task] = js.native
  /** Updates the specified task. This method supports patch semantics. */
  def patch(request: Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUser): Request[Task] = js.native
  def patch(request: Anon_AltFieldsKeyOauthtokenPrettyPrint, body: Task): Request[Task] = js.native
  /** Updates the specified task. */
  def update(request: Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUser): Request[Task] = js.native
  def update(request: Anon_AltFieldsKeyOauthtokenPrettyPrint, body: Task): Request[Task] = js.native
}

