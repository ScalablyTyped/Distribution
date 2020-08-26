package typings.devextreme.anon

import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.fixed
import typings.devextreme.devextremeStrings.high
import typings.devextreme.devextremeStrings.low
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.percent
import typings.devextreme.devextremeStrings.stdDeviation
import typings.devextreme.devextremeStrings.stdError
import typings.devextreme.devextremeStrings.variance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EdgeLength extends js.Object {
  var color: js.UndefOr[String] = js.native
  var displayMode: js.UndefOr[auto | high | low | none] = js.native
  var edgeLength: js.UndefOr[Double] = js.native
  var highValueField: js.UndefOr[String] = js.native
  var lineWidth: js.UndefOr[Double] = js.native
  var lowValueField: js.UndefOr[String] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[fixed | percent | stdDeviation | stdError | variance] = js.native
  var value: js.UndefOr[Double] = js.native
}

object EdgeLength {
  @scala.inline
  def apply(): EdgeLength = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EdgeLength]
  }
  @scala.inline
  implicit class EdgeLengthOps[Self <: EdgeLength] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDisplayMode(value: auto | high | low | none): Self = this.set("displayMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayMode: Self = this.set("displayMode", js.undefined)
    @scala.inline
    def setEdgeLength(value: Double): Self = this.set("edgeLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdgeLength: Self = this.set("edgeLength", js.undefined)
    @scala.inline
    def setHighValueField(value: String): Self = this.set("highValueField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighValueField: Self = this.set("highValueField", js.undefined)
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
    @scala.inline
    def setLowValueField(value: String): Self = this.set("lowValueField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLowValueField: Self = this.set("lowValueField", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setType(value: fixed | percent | stdDeviation | stdError | variance): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

