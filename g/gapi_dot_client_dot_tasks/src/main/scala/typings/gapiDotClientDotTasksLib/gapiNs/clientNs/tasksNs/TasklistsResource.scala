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
    delete: js.Function1[
      gapiDotClientDotTasksLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotTasksLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[TaskList]
    ],
    insert: js.Function1[
      gapiDotClientDotTasksLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[TaskList]
    ],
    list: js.Function1[
      gapiDotClientDotTasksLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[TaskLists]
    ],
    patch: js.Function1[
      gapiDotClientDotTasksLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[TaskList]
    ],
    update: js.Function1[
      gapiDotClientDotTasksLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[TaskList]
    ]
  ): TasklistsResource = {
    val __obj = js.Dynamic.literal(delete = delete, get = get, insert = insert, list = list, patch = patch, update = update)
  
    __obj.asInstanceOf[TasklistsResource]
  }
}

