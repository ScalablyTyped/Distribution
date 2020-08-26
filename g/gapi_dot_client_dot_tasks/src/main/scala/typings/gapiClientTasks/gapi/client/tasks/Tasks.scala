package typings.gapiClientTasks.gapi.client.tasks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tasks extends js.Object {
  /** ETag of the resource. */
  var etag: js.UndefOr[String] = js.native
  /** Collection of tasks. */
  var items: js.UndefOr[js.Array[Task]] = js.native
  /** Type of the resource. This is always "tasks#tasks". */
  var kind: js.UndefOr[String] = js.native
  /** Token used to access the next page of this result. */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Tasks {
  @scala.inline
  def apply(): Tasks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tasks]
  }
  @scala.inline
  implicit class TasksOps[Self <: Tasks] (val x: Self) extends AnyVal {
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
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setItemsVarargs(value: Task*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Task]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

