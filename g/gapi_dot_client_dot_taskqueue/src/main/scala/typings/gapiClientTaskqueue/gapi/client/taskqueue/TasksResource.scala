package typings.gapiClientTaskqueue.gapi.client.taskqueue

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientTaskqueue.AnonFields
import typings.gapiClientTaskqueue.AnonGroupByTag
import typings.gapiClientTaskqueue.AnonKey
import typings.gapiClientTaskqueue.AnonNewLeaseSeconds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TasksResource extends js.Object {
  /** Delete a task from a TaskQueue. */
  def delete(request: AnonFields): Request_[Unit]
  /** Get a particular task from a TaskQueue. */
  def get(request: AnonFields): Request_[Task]
  /** Insert a new task in a TaskQueue */
  def insert(request: AnonKey): Request_[Task]
  /** Lease 1 or more tasks from a TaskQueue. */
  def lease(request: AnonGroupByTag): Request_[Tasks]
  /** List Tasks in a TaskQueue */
  def list(request: AnonKey): Request_[Tasks2]
  /** Update tasks that are leased out of a TaskQueue. This method supports patch semantics. */
  def patch(request: AnonNewLeaseSeconds): Request_[Task]
  /** Update tasks that are leased out of a TaskQueue. */
  def update(request: AnonNewLeaseSeconds): Request_[Task]
}

object TasksResource {
  @scala.inline
  def apply(
    delete: AnonFields => Request_[Unit],
    get: AnonFields => Request_[Task],
    insert: AnonKey => Request_[Task],
    lease: AnonGroupByTag => Request_[Tasks],
    list: AnonKey => Request_[Tasks2],
    patch: AnonNewLeaseSeconds => Request_[Task],
    update: AnonNewLeaseSeconds => Request_[Task]
  ): TasksResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), lease = js.Any.fromFunction1(lease), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[TasksResource]
  }
}

