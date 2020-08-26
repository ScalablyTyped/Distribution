package typings.gapiClientFusiontables.gapi.client.fusiontables

import typings.gapiClient.gapi.client.Request
import typings.gapiClientFusiontables.anon.PageToken
import typings.gapiClientFusiontables.anon.TableId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskResource extends js.Object {
  /** Deletes a specific task by its ID, unless that task has already started running. */
  def delete(request: TableId): Request[Unit] = js.native
  /** Retrieves a specific task by its ID. */
  def get(request: TableId): Request[Task] = js.native
  /** Retrieves a list of tasks. */
  def list(request: PageToken): Request[TaskList] = js.native
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
  @scala.inline
  implicit class TaskResourceOps[Self <: TaskResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDelete(value: TableId => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: TableId => Request[Task]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: PageToken => Request[TaskList]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

