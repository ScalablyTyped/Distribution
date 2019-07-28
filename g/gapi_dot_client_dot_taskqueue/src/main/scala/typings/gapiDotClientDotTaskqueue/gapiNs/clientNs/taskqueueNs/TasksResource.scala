package typings.gapiDotClientDotTaskqueue.gapiNs.clientNs.taskqueueNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotTaskqueue.Anon_AltFields
import typings.gapiDotClientDotTaskqueue.Anon_AltFieldsGroupByTag
import typings.gapiDotClientDotTaskqueue.Anon_AltFieldsKey
import typings.gapiDotClientDotTaskqueue.Anon_AltFieldsKeyNewLeaseSeconds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TasksResource extends js.Object {
  /** Delete a task from a TaskQueue. */
  def delete(request: Anon_AltFields): Request[Unit]
  /** Get a particular task from a TaskQueue. */
  def get(request: Anon_AltFields): Request[Task]
  /** Insert a new task in a TaskQueue */
  def insert(request: Anon_AltFieldsKey): Request[Task]
  /** Lease 1 or more tasks from a TaskQueue. */
  def lease(request: Anon_AltFieldsGroupByTag): Request[Tasks]
  /** List Tasks in a TaskQueue */
  def list(request: Anon_AltFieldsKey): Request[Tasks2]
  /** Update tasks that are leased out of a TaskQueue. This method supports patch semantics. */
  def patch(request: Anon_AltFieldsKeyNewLeaseSeconds): Request[Task]
  /** Update tasks that are leased out of a TaskQueue. */
  def update(request: Anon_AltFieldsKeyNewLeaseSeconds): Request[Task]
}

object TasksResource {
  @scala.inline
  def apply(
    delete: Anon_AltFields => Request[Unit],
    get: Anon_AltFields => Request[Task],
    insert: Anon_AltFieldsKey => Request[Task],
    lease: Anon_AltFieldsGroupByTag => Request[Tasks],
    list: Anon_AltFieldsKey => Request[Tasks2],
    patch: Anon_AltFieldsKeyNewLeaseSeconds => Request[Task],
    update: Anon_AltFieldsKeyNewLeaseSeconds => Request[Task]
  ): TasksResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), lease = js.Any.fromFunction1(lease), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[TasksResource]
  }
}

