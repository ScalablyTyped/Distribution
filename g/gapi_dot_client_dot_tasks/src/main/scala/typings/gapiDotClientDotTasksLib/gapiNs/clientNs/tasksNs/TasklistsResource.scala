package typings
package gapiDotClientDotTasksLib.gapiNs.clientNs.tasksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TasklistsResource extends js.Object {
  /** Deletes the authenticated user's specified task list. */
  def delete(request: gapiDotClientDotTasksLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Returns the authenticated user's specified task list. */
  def get(request: gapiDotClientDotTasksLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[TaskList]
  /** Creates a new task list and adds it to the authenticated user's task lists. */
  def insert(request: gapiDotClientDotTasksLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[TaskList]
  /** Returns all the authenticated user's task lists. */
  def list(request: gapiDotClientDotTasksLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[TaskLists]
  /** Updates the authenticated user's specified task list. This method supports patch semantics. */
  def patch(request: gapiDotClientDotTasksLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[TaskList]
  /** Updates the authenticated user's specified task list. */
  def update(request: gapiDotClientDotTasksLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[TaskList]
}

object TasklistsResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotTasksLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotTasksLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[TaskList],
    insert: gapiDotClientDotTasksLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[TaskList],
    list: gapiDotClientDotTasksLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[TaskLists],
    patch: gapiDotClientDotTasksLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[TaskList],
    update: gapiDotClientDotTasksLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[TaskList]
  ): TasklistsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[TasklistsResource]
  }
}

