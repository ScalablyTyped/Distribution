package typings.gapiClientTasks.gapi.client.tasks

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientTasks.AnonAlt
import typings.gapiClientTasks.AnonAltCompletedMax
import typings.gapiClientTasks.AnonAltFieldsKeyOauthtokenParent
import typings.gapiClientTasks.AnonAltFieldsKeyOauthtokenParentPrettyPrint
import typings.gapiClientTasks.AnonAltFieldsKeyOauthtokenParentPrettyPrintPrevious
import typings.gapiClientTasks.AnonAltFieldsKeyOauthtokenPrettyPrint
import typings.gapiClientTasks.AnonAltFieldsKeyOauthtokenPrettyPrintQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TasksResource extends js.Object {
  /**
    * Clears all completed tasks from the specified task list. The affected tasks will be marked as 'hidden' and no longer be returned by default when
    * retrieving all tasks for a task list.
    */
  def clear(request: AnonAlt): Request_[Unit] = js.native
  /** Deletes the specified task from the task list. */
  def delete(request: AnonAltFieldsKeyOauthtokenPrettyPrint): Request_[Unit] = js.native
  /** Returns the specified task. */
  def get(request: AnonAltFieldsKeyOauthtokenPrettyPrint): Request_[Task] = js.native
  /** Creates a new task on the specified task list. */
  def insert(request: AnonAltFieldsKeyOauthtokenParent): Request_[Task] = js.native
  def insert(request: AnonAltFieldsKeyOauthtokenParentPrettyPrint, body: Task): Request_[Task] = js.native
  /** Returns all tasks in the specified task list. */
  def list(request: AnonAltCompletedMax): Request_[Tasks_] = js.native
  /**
    * Moves the specified task to another position in the task list. This can include putting it as a child task under a new parent and/or move it to a
    * different position among its sibling tasks.
    */
  def move(request: AnonAltFieldsKeyOauthtokenParentPrettyPrintPrevious): Request_[Task] = js.native
  /** Updates the specified task. This method supports patch semantics. */
  def patch(request: AnonAltFieldsKeyOauthtokenPrettyPrintQuotaUser): Request_[Task] = js.native
  def patch(request: AnonAltFieldsKeyOauthtokenPrettyPrint, body: Task): Request_[Task] = js.native
  /** Updates the specified task. */
  def update(request: AnonAltFieldsKeyOauthtokenPrettyPrintQuotaUser): Request_[Task] = js.native
  def update(request: AnonAltFieldsKeyOauthtokenPrettyPrint, body: Task): Request_[Task] = js.native
}

