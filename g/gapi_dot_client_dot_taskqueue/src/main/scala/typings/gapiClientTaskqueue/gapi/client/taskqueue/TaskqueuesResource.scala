package typings.gapiClientTaskqueue.gapi.client.taskqueue

import typings.gapiClient.gapi.client.Request
import typings.gapiClientTaskqueue.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskqueuesResource extends js.Object {
  /** Get detailed information about a TaskQueue. */
  def get(request: Alt): Request[TaskQueue] = js.native
}

object TaskqueuesResource {
  @scala.inline
  def apply(get: Alt => Request[TaskQueue]): TaskqueuesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[TaskqueuesResource]
  }
  @scala.inline
  implicit class TaskqueuesResourceOps[Self <: TaskqueuesResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Alt => Request[TaskQueue]): Self = this.set("get", js.Any.fromFunction1(value))
  }
  
}

