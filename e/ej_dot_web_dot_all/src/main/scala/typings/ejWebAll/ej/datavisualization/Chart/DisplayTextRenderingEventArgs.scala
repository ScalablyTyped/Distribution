package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisplayTextRenderingEventArgs extends js.Object {
  /** Set this option to true to cancel the event.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** text - Text displayed in data label. You can add custom text to the data label    locationX - X-coordinate of data label location    locationY - Y-coordinate of data label
    * location    seriesIndex - Index of the series in series Collection whose data label is being rendered    pointIndex - Index of the point in series whose data label is being
    * rendered
    */
  var data: js.UndefOr[js.Any] = js.native
  /** Instance of the chart model object.
    */
  var model: js.UndefOr[js.Any] = js.native
  /** Name of the event
    */
  var `type`: js.UndefOr[String] = js.native
}

object DisplayTextRenderingEventArgs {
  @scala.inline
  def apply(): DisplayTextRenderingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayTextRenderingEventArgs]
  }
  @scala.inline
  implicit class DisplayTextRenderingEventArgsOps[Self <: DisplayTextRenderingEventArgs] (val x: Self) extends AnyVal {
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

