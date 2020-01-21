package typings.gapiClientTaskqueue.gapi.client.taskqueue

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientTaskqueue.AnonAltFields
import typings.gapiClientTaskqueue.AnonAltFieldsGroupByTag
import typings.gapiClientTaskqueue.AnonAltFieldsKey
import typings.gapiClientTaskqueue.AnonAltFieldsKeyNewLeaseSeconds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TasksResource extends js.Object {
  /** Delete a task from a TaskQueue. */
  def delete(request: AnonAltFields): Request_[Unit]
  /** Get a particular task from a TaskQueue. */
  def get(request: AnonAltFields): Request_[Task]
  /** Insert a new task in a TaskQueue */
  def insert(request: AnonAltFieldsKey): Request_[Task]
  /** Lease 1 or more tasks from a TaskQueue. */
  def lease(request: AnonAltFieldsGroupByTag): Request_[Tasks]
  /** List Tasks in a TaskQueue */
  def list(request: AnonAltFieldsKey): Request_[Tasks2]
  /** Update tasks that are leased out of a TaskQueue. This method supports patch semantics. */
  def patch(request: AnonAltFieldsKeyNewLeaseSeconds): Request_[Task]
  /** Update tasks that are leased out of a TaskQueue. */
  def update(request: AnonAltFieldsKeyNewLeaseSeconds): Request_[Task]
}

object TasksResource {
  @scala.inline
  def apply(
    delete: AnonAltFields => Request_[Unit],
    get: AnonAltFields => Request_[Task],
    insert: AnonAltFieldsKey => Request_[Task],
    lease: AnonAltFieldsGroupByTag => Request_[Tasks],
    list: AnonAltFieldsKey => Request_[Tasks2],
    patch: AnonAltFieldsKeyNewLeaseSeconds => Request_[Task],
    update: AnonAltFieldsKeyNewLeaseSeconds => Request_[Task]
  ): TasksResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), lease = js.Any.fromFunction1(lease), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[TasksResource]
  }
}

