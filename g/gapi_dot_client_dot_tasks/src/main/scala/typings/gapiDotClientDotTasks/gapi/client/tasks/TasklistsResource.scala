package typings.gapiDotClientDotTasks.gapi.client.tasks

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotTasks.Anon_Alt
import typings.gapiDotClientDotTasks.Anon_AltFields
import typings.gapiDotClientDotTasks.Anon_AltFieldsKey
import typings.gapiDotClientDotTasks.Anon_AltFieldsKeyMaxResults
import typings.gapiDotClientDotTasks.Anon_AltFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TasklistsResource extends js.Object {
  /** Deletes the authenticated user's specified task list. */
  def delete(request: Anon_Alt): Request[Unit] = js.native
  /** Returns the authenticated user's specified task list. */
  def get(request: Anon_Alt): Request[TaskList] = js.native
  /** Creates a new task list and adds it to the authenticated user's task lists. */
  def insert(request: Anon_AltFields): Request[TaskList] = js.native
  def insert(request: Anon_AltFieldsKey, body: TaskList): Request[TaskList] = js.native
  /** Returns all the authenticated user's task lists. */
  def list(request: Anon_AltFieldsKeyMaxResults): Request[TaskLists] = js.native
  /** Updates the authenticated user's specified task list. This method supports patch semantics. */
  def patch(request: Anon_AltFieldsKeyOauthtoken): Request[TaskList] = js.native
  def patch(request: Anon_Alt, body: TaskList): Request[TaskList] = js.native
  /** Updates the authenticated user's specified task list. */
  def update(request: Anon_AltFieldsKeyOauthtoken): Request[TaskList] = js.native
  def update(request: Anon_Alt, body: TaskList): Request[TaskList] = js.native
}

