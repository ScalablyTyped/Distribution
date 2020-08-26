package typings.frappeGantt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Task extends js.Object {
  var custom_class: js.UndefOr[String] = js.native
  var dependencies: String = js.native
  var end: String = js.native
  var id: String = js.native
  var name: String = js.native
  var progress: Double = js.native
  var start: String = js.native
}

object Task {
  @scala.inline
  def apply(dependencies: String, end: String, id: String, name: String, progress: Double, start: String): Task = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Task]
  }
  @scala.inline
  implicit class TaskOps[Self <: Task] (val x: Self) extends AnyVal {
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
    def setDependencies(value: String): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd(value: String): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: String): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustom_class(value: String): Self = this.set("custom_class", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustom_class: Self = this.set("custom_class", js.undefined)
  }
  
}

