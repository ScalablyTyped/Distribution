package typings.gapiClientTasks.gapi.client.tasks

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientTasks.AnonAlt
import typings.gapiClientTasks.AnonAltFields
import typings.gapiClientTasks.AnonAltFieldsKey
import typings.gapiClientTasks.AnonAltFieldsKeyMaxResults
import typings.gapiClientTasks.AnonAltFieldsKeyOauthtoken
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
  def insert(request: AnonAltFields): Request_[TaskList] = js.native
  def insert(request: AnonAltFieldsKey, body: TaskList): Request_[TaskList] = js.native
  /** Returns all the authenticated user's task lists. */
  def list(request: AnonAltFieldsKeyMaxResults): Request_[TaskLists_] = js.native
  /** Updates the authenticated user's specified task list. This method supports patch semantics. */
  def patch(request: AnonAltFieldsKeyOauthtoken): Request_[TaskList] = js.native
  def patch(request: AnonAlt, body: TaskList): Request_[TaskList] = js.native
  /** Updates the authenticated user's specified task list. */
  def update(request: AnonAltFieldsKeyOauthtoken): Request_[TaskList] = js.native
  def update(request: AnonAlt, body: TaskList): Request_[TaskList] = js.native
}

