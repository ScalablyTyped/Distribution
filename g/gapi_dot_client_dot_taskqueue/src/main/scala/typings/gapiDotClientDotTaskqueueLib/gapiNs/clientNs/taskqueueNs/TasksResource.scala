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
    delete: js.Function1[
      gapiDotClientDotTaskqueueLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotTaskqueueLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Task]
    ],
    insert: js.Function1[
      gapiDotClientDotTaskqueueLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Task]
    ],
    lease: js.Function1[
      gapiDotClientDotTaskqueueLib.Anon_AltFieldsGroupByTag, 
      gapiDotClientLib.gapiNs.clientNs.Request[Tasks]
    ],
    list: js.Function1[
      gapiDotClientDotTaskqueueLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Tasks2]
    ],
    patch: js.Function1[
      gapiDotClientDotTaskqueueLib.Anon_AltFieldsKeyNewLeaseSeconds, 
      gapiDotClientLib.gapiNs.clientNs.Request[Task]
    ],
    update: js.Function1[
      gapiDotClientDotTaskqueueLib.Anon_AltFieldsKeyNewLeaseSeconds, 
      gapiDotClientLib.gapiNs.clientNs.Request[Task]
    ]
  ): TasksResource = {
    val __obj = js.Dynamic.literal(delete = delete, get = get, insert = insert, lease = lease, list = list, patch = patch, update = update)
  
    __obj.asInstanceOf[TasksResource]
  }
}

