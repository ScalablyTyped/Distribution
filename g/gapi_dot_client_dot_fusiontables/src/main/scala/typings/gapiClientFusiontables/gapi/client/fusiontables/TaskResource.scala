package typings.gapiClientFusiontables.gapi.client.fusiontables

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientFusiontables.AnonPageToken
import typings.gapiClientFusiontables.AnonTableId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskResource extends js.Object {
  /** Deletes a specific task by its ID, unless that task has already started running. */
  def delete(request: AnonTableId): Request_[Unit]
  /** Retrieves a specific task by its ID. */
  def get(request: AnonTableId): Request_[Task]
  /** Retrieves a list of tasks. */
  def list(request: AnonPageToken): Request_[TaskList]
}

object TaskResource {
  @scala.inline
  def apply(
    delete: AnonTableId => Request_[Unit],
    get: AnonTableId => Request_[Task],
    list: AnonPageToken => Request_[TaskList]
  ): TaskResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[TaskResource]
  }
}

