package typings.ejWebAll.ej.datavisualization.BulletGraph

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawFeatureMeasureBarEventArgs extends js.Object {
  /** returns the object of the bullet graph.
    */
  var Object: js.UndefOr[js.Any] = js.native
  /** returns the value of the feature measure bar.
    */
  var Value: js.UndefOr[Double] = js.native
  /** returns the options of feature measure element.
    */
  var currentElement: js.UndefOr[HTMLElement] = js.native
  /** returns the options of the scale element.
    */
  var scaleElement: js.UndefOr[HTMLElement] = js.native
}

object DrawFeatureMeasureBarEventArgs {
  @scala.inline
  def apply(): DrawFeatureMeasureBarEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawFeatureMeasureBarEventArgs]
  }
  @scala.inline
  implicit class DrawFeatureMeasureBarEventArgsOps[Self <: DrawFeatureMeasureBarEventArgs] (val x: Self) extends AnyVal {
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
    def setObject(value: js.Any): Self = this.set("Object", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObject: Self = this.set("Object", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
    @scala.inline
    def setCurrentElement(value: HTMLElement): Self = this.set("currentElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentElement: Self = this.set("currentElement", js.undefined)
    @scala.inline
    def setScaleElement(value: HTMLElement): Self = this.set("scaleElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleElement: Self = this.set("scaleElement", js.undefined)
  }
  
}

