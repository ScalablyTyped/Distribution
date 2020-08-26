package typings.gapiClientTaskqueue.gapi.client.taskqueue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tasks2 extends js.Object {
  /** The actual list of tasks currently active in the TaskQueue. */
  var items: js.UndefOr[js.Array[Task]] = js.native
  /** The kind of object returned, a list of tasks. */
  var kind: js.UndefOr[String] = js.native
}

object Tasks2 {
  @scala.inline
  def apply(): Tasks2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tasks2]
  }
  @scala.inline
  implicit class Tasks2Ops[Self <: Tasks2] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: Task*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Task]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

