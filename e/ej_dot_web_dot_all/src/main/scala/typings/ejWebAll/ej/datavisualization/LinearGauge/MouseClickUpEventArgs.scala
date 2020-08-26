package typings.ejWebAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MouseClickUpEventArgs extends js.Object {
  /** returns the cancel option value
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** returns the context element* @param {Object} args.markerPointer returns the context element
    */
  var context: js.UndefOr[js.Any] = js.native
  /** returns the pointer element.
    */
  var markerPointerElement: js.UndefOr[js.Any] = js.native
  /** returns the pointer Index
    */
  var markerPointerIndex: js.UndefOr[Double] = js.native
  /** returns the value of the pointer.
    */
  var markerPointerValue: js.UndefOr[Double] = js.native
  /** returns the gauge model
    */
  var model: js.UndefOr[js.Any] = js.native
  /** returns the object of the gauge.
    */
  var `object`: js.UndefOr[js.Any] = js.native
  /** returns the startX and startY of the pointer.
    */
  var position: js.UndefOr[js.Any] = js.native
  /** returns the scale element.
    */
  var scaleElement: js.UndefOr[js.Any] = js.native
  /** returns the scaleIndex to which the pointer belongs.
    */
  var scaleIndex: js.UndefOr[Double] = js.native
  /** returns the pointer style
    */
  var style: js.UndefOr[String] = js.native
  /** returns the name of the event
    */
  var `type`: js.UndefOr[js.Any] = js.native
}

object MouseClickUpEventArgs {
  @scala.inline
  def apply(): MouseClickUpEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MouseClickUpEventArgs]
  }
  @scala.inline
  implicit class MouseClickUpEventArgsOps[Self <: MouseClickUpEventArgs] (val x: Self) extends AnyVal {
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
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setMarkerPointerElement(value: js.Any): Self = this.set("markerPointerElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerPointerElement: Self = this.set("markerPointerElement", js.undefined)
    @scala.inline
    def setMarkerPointerIndex(value: Double): Self = this.set("markerPointerIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerPointerIndex: Self = this.set("markerPointerIndex", js.undefined)
    @scala.inline
    def setMarkerPointerValue(value: Double): Self = this.set("markerPointerValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerPointerValue: Self = this.set("markerPointerValue", js.undefined)
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setObject(value: js.Any): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObject: Self = this.set("object", js.undefined)
    @scala.inline
    def setPosition(value: js.Any): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setScaleElement(value: js.Any): Self = this.set("scaleElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleElement: Self = this.set("scaleElement", js.undefined)
    @scala.inline
    def setScaleIndex(value: Double): Self = this.set("scaleIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleIndex: Self = this.set("scaleIndex", js.undefined)
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setType(value: js.Any): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

