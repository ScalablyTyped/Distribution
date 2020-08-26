package typings.ejWebAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawLabelsEventArgs extends js.Object {
  /** returns the gauge model
    */
  var Model: js.UndefOr[js.Any] = js.native
  /** returns the angle of the label.
    */
  var angle: js.UndefOr[Double] = js.native
  /** returns the cancel option value
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** returns the context element
    */
  var context: js.UndefOr[js.Any] = js.native
  /** returns the current label element.
    */
  var element: js.UndefOr[js.Any] = js.native
  /** returns the index of the label.
    */
  var index: js.UndefOr[Double] = js.native
  /** returns the object of the gauge.
    */
  var `object`: js.UndefOr[js.Any] = js.native
  /** returns the startX and startY of the label
    */
  var position: js.UndefOr[js.Any] = js.native
  /** returns the options of the scale element.
    */
  var scaleElement: js.UndefOr[js.Any] = js.native
  /** returns the scaleIndex to which the label belongs.
    */
  var scaleIndex: js.UndefOr[Double] = js.native
  /** returns the label style
    */
  var style: js.UndefOr[String] = js.native
  /** returns the name of the event
    */
  var `type`: js.UndefOr[js.Any] = js.native
  /** returns the label value of the label.
    */
  var value: js.UndefOr[Double] = js.native
}

object DrawLabelsEventArgs {
  @scala.inline
  def apply(): DrawLabelsEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawLabelsEventArgs]
  }
  @scala.inline
  implicit class DrawLabelsEventArgsOps[Self <: DrawLabelsEventArgs] (val x: Self) extends AnyVal {
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
    def setModel(value: js.Any): Self = this.set("Model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("Model", js.undefined)
    @scala.inline
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    @scala.inline
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setElement(value: js.Any): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
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
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

