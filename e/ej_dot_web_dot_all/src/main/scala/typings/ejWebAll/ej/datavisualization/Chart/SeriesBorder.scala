package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesBorder extends js.Object {
  /** Border color of the series.
    * @Default {transparent}
    */
  var color: js.UndefOr[String] = js.native
  /** DashArray for border of the series.
    * @Default {null}
    */
  var dashArray: js.UndefOr[String] = js.native
  /** Border width of the series.
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.native
}

object SeriesBorder {
  @scala.inline
  def apply(): SeriesBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesBorder]
  }
  @scala.inline
  implicit class SeriesBorderOps[Self <: SeriesBorder] (val x: Self) extends AnyVal {
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
    def setDashArray(value: String): Self = this.set("dashArray", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDashArray: Self = this.set("dashArray", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

