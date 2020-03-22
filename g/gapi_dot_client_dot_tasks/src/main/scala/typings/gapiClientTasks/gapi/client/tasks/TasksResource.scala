package typings.gapiClientTasks.gapi.client.tasks

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientTasks.AnonAlt
import typings.gapiClientTasks.AnonCompletedMax
import typings.gapiClientTasks.AnonParent
import typings.gapiClientTasks.AnonPrettyPrint
import typings.gapiClientTasks.AnonPrevious
import typings.gapiClientTasks.AnonQuotaUser
import typings.gapiClientTasks.AnonResource
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
  def delete(request: AnonPrettyPrint): Request_[Unit] = js.native
  /** Returns the specified task. */
  def get(request: AnonPrettyPrint): Request_[Task] = js.native
  /** Creates a new task on the specified task list. */
  def insert(request: AnonParent): Request_[Task] = js.native
  def insert(request: AnonPrevious, body: Task): Request_[Task] = js.native
  /** Returns all tasks in the specified task list. */
  def list(request: AnonCompletedMax): Request_[Tasks_] = js.native
  /**
    * Moves the specified task to another position in the task list. This can include putting it as a child task under a new parent and/or move it to a
    * different position among its sibling tasks.
    */
  def move(request: AnonQuotaUser): Request_[Task] = js.native
  def patch(request: AnonPrettyPrint, body: Task): Request_[Task] = js.native
  /** Updates the specified task. This method supports patch semantics. */
  def patch(request: AnonResource): Request_[Task] = js.native
  def update(request: AnonPrettyPrint, body: Task): Request_[Task] = js.native
  /** Updates the specified task. */
  def update(request: AnonResource): Request_[Task] = js.native
}

