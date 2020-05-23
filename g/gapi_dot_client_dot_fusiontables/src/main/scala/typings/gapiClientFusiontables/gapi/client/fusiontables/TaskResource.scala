package typings.gapiClientFusiontables.gapi.client.fusiontables

import typings.gapiClient.gapi.client.Request
import typings.gapiClientFusiontables.anon.PageToken
import typings.gapiClientFusiontables.anon.TableId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskResource extends js.Object {
  /** Deletes a specific task by its ID, unless that task has already started running. */
  def delete(request: TableId): Request[Unit]
  /** Retrieves a specific task by its ID. */
  def get(request: TableId): Request[Task]
  /** Retrieves a list of tasks. */
  def list(request: PageToken): Request[TaskList]
}

object TaskResource {
  @scala.inline
  def apply(
    delete: TableId => Request[Unit],
    get: TableId => Request[Task],
    list: PageToken => Request[TaskList]
  ): TaskResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[TaskResource]
  }
}

