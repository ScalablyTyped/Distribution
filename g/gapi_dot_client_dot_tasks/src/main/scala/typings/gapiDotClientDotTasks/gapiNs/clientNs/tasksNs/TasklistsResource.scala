package typings.gapiDotClientDotTasks.gapiNs.clientNs.tasksNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotTasks.Anon_Alt
import typings.gapiDotClientDotTasks.Anon_AltFields
import typings.gapiDotClientDotTasks.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TasklistsResource extends js.Object {
  /** Deletes the authenticated user's specified task list. */
  def delete(request: Anon_Alt): Request[Unit]
  /** Returns the authenticated user's specified task list. */
  def get(request: Anon_Alt): Request[TaskList]
  /** Creates a new task list and adds it to the authenticated user's task lists. */
  def insert(request: Anon_AltFields): Request[TaskList]
  /** Returns all the authenticated user's task lists. */
  def list(request: Anon_AltFieldsKey): Request[TaskLists]
  /** Updates the authenticated user's specified task list. This method supports patch semantics. */
  def patch(request: Anon_Alt): Request[TaskList]
  /** Updates the authenticated user's specified task list. */
  def update(request: Anon_Alt): Request[TaskList]
}

object TasklistsResource {
  @scala.inline
  def apply(
    delete: Anon_Alt => Request[Unit],
    get: Anon_Alt => Request[TaskList],
    insert: Anon_AltFields => Request[TaskList],
    list: Anon_AltFieldsKey => Request[TaskLists],
    patch: Anon_Alt => Request[TaskList],
    update: Anon_Alt => Request[TaskList]
  ): TasklistsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[TasklistsResource]
  }
}

