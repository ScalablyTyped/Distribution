package typings.gapiClientTasks.gapi.client.tasks

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientTasks.AnonAlt
import typings.gapiClientTasks.AnonFields
import typings.gapiClientTasks.AnonKey
import typings.gapiClientTasks.AnonMaxResults
import typings.gapiClientTasks.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TasklistsResource extends js.Object {
  /** Deletes the authenticated user's specified task list. */
  def delete(request: AnonAlt): Request_[Unit] = js.native
  /** Returns the authenticated user's specified task list. */
  def get(request: AnonAlt): Request_[TaskList] = js.native
  /** Creates a new task list and adds it to the authenticated user's task lists. */
  def insert(request: AnonFields): Request_[TaskList] = js.native
  def insert(request: AnonKey, body: TaskList): Request_[TaskList] = js.native
  /** Returns all the authenticated user's task lists. */
  def list(request: AnonMaxResults): Request_[TaskLists_] = js.native
  def patch(request: AnonAlt, body: TaskList): Request_[TaskList] = js.native
  /** Updates the authenticated user's specified task list. This method supports patch semantics. */
  def patch(request: AnonOauthtoken): Request_[TaskList] = js.native
  def update(request: AnonAlt, body: TaskList): Request_[TaskList] = js.native
  /** Updates the authenticated user's specified task list. */
  def update(request: AnonOauthtoken): Request_[TaskList] = js.native
}

