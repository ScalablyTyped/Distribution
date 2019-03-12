package typings
package gapiDotClientDotTaskqueueLib.gapiNs.clientNs.taskqueueNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TasksResource extends js.Object {
  /** Delete a task from a TaskQueue. */
  def delete(request: gapiDotClientDotTaskqueueLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Get a particular task from a TaskQueue. */
  def get(request: gapiDotClientDotTaskqueueLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Task]
  /** Insert a new task in a TaskQueue */
  def insert(request: gapiDotClientDotTaskqueueLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Task]
  /** Lease 1 or more tasks from a TaskQueue. */
  def lease(request: gapiDotClientDotTaskqueueLib.Anon_AltFieldsGroupByTag): gapiDotClientLib.gapiNs.clientNs.Request[Tasks]
  /** List Tasks in a TaskQueue */
  def list(request: gapiDotClientDotTaskqueueLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Tasks2]
  /** Update tasks that are leased out of a TaskQueue. This method supports patch semantics. */
  def patch(request: gapiDotClientDotTaskqueueLib.Anon_AltFieldsKeyNewLeaseSeconds): gapiDotClientLib.gapiNs.clientNs.Request[Task]
  /** Update tasks that are leased out of a TaskQueue. */
  def update(request: gapiDotClientDotTaskqueueLib.Anon_AltFieldsKeyNewLeaseSeconds): gapiDotClientLib.gapiNs.clientNs.Request[Task]
}

object TasksResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotTaskqueueLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotTaskqueueLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[Task],
    insert: gapiDotClientDotTaskqueueLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[Task],
    lease: gapiDotClientDotTaskqueueLib.Anon_AltFieldsGroupByTag => gapiDotClientLib.gapiNs.clientNs.Request[Tasks],
    list: gapiDotClientDotTaskqueueLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[Tasks2],
    patch: gapiDotClientDotTaskqueueLib.Anon_AltFieldsKeyNewLeaseSeconds => gapiDotClientLib.gapiNs.clientNs.Request[Task],
    update: gapiDotClientDotTaskqueueLib.Anon_AltFieldsKeyNewLeaseSeconds => gapiDotClientLib.gapiNs.clientNs.Request[Task]
  ): TasksResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), lease = js.Any.fromFunction1(lease), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[TasksResource]
  }
}

