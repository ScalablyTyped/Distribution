package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TitleRenderingEventArgs extends js.Object {
  /** Set this option to true to cancel the event
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** location - Option to customize the title location in pixels    size - Read-only option to find the size of the title    title - Use this option to add custom text in title
    */
  var data: js.UndefOr[js.Any] = js.native
  /** Instance of the chart model object
    */
  var model: js.UndefOr[js.Any] = js.native
  /** Name of the event
    */
  var `type`: js.UndefOr[String] = js.native
}

object TitleRenderingEventArgs {
  @scala.inline
  def apply(): TitleRenderingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TitleRenderingEventArgs]
  }
  @scala.inline
  implicit class TitleRenderingEventArgsOps[Self <: TitleRenderingEventArgs] (val x: Self) extends AnyVal {
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
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

