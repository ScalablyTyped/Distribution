package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesConnectorLine extends js.Object {
  /** Color of the connector line.
    * @Default {#565656}
    */
  var color: js.UndefOr[String] = js.native
  /** DashArray of the connector line.
    * @Default {null}
    */
  var dashArray: js.UndefOr[String] = js.native
  /** Opacity of the connector line.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.native
  /** Width of the connector line.
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.native
}

object SeriesConnectorLine {
  @scala.inline
  def apply(): SeriesConnectorLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesConnectorLine]
  }
  @scala.inline
  implicit class SeriesConnectorLineOps[Self <: SeriesConnectorLine] (val x: Self) extends AnyVal {
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
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

