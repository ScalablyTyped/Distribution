package typings.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskbarClickEventArgs extends js.Object {
  /** Returns currently clicked row data
    */
  var data: js.UndefOr[js.Any] = js.native
  /** Returns the current item index.
    */
  var index: js.UndefOr[Double] = js.native
  /** Returns the Gantt model.
    */
  var model: js.UndefOr[js.Any] = js.native
  /** Returns the target element.
    */
  var target: js.UndefOr[js.Any] = js.native
  /** Returns the clicked row element
    */
  var taskbarElement: js.UndefOr[js.Any] = js.native
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}

object TaskbarClickEventArgs {
  @scala.inline
  def apply(): TaskbarClickEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskbarClickEventArgs]
  }
  @scala.inline
  implicit class TaskbarClickEventArgsOps[Self <: TaskbarClickEventArgs] (val x: Self) extends AnyVal {
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setTaskbarElement(value: js.Any): Self = this.set("taskbarElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskbarElement: Self = this.set("taskbarElement", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

