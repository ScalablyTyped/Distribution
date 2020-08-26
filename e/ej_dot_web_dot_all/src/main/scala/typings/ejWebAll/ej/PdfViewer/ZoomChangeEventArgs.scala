package typings.ejWebAll.ej.PdfViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoomChangeEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** Returns the current zoom percentage of the PDF viewer control
    */
  var currentZoomPercentage: js.UndefOr[Double] = js.native
  /** Returns the PDF viewer model
    */
  var model: js.UndefOr[js.Any] = js.native
  /** Returns the previous zoom percentage of the PDF viewer control
    */
  var previousZoomPercentage: js.UndefOr[Double] = js.native
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}

object ZoomChangeEventArgs {
  @scala.inline
  def apply(): ZoomChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoomChangeEventArgs]
  }
  @scala.inline
  implicit class ZoomChangeEventArgsOps[Self <: ZoomChangeEventArgs] (val x: Self) extends AnyVal {
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
    def setCurrentZoomPercentage(value: Double): Self = this.set("currentZoomPercentage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentZoomPercentage: Self = this.set("currentZoomPercentage", js.undefined)
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setPreviousZoomPercentage(value: Double): Self = this.set("previousZoomPercentage", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousZoomPercentage: Self = this.set("previousZoomPercentage", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

