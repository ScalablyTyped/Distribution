package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.viz.chartPointObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Point extends js.Object {
  var point: js.UndefOr[chartPointObject] = js.native
  var value: js.UndefOr[typings.std.Date | Double | String] = js.native
  var valueText: js.UndefOr[String] = js.native
}

object Point {
  @scala.inline
  def apply(): Point = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Point]
  }
  @scala.inline
  implicit class PointOps[Self <: Point] (val x: Self) extends AnyVal {
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
    def setPoint(value: chartPointObject): Self = this.set("point", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoint: Self = this.set("point", js.undefined)
    @scala.inline
    def setValue(value: typings.std.Date | Double | String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValueText(value: String): Self = this.set("valueText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueText: Self = this.set("valueText", js.undefined)
  }
  
}

