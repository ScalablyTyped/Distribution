package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesErrorBarCap extends js.Object {
  /** Color of the error bar cap.
    * @Default {#000000}
    */
  var fill: js.UndefOr[String] = js.native
  /** Length of the error bar cap.
    * @Default {1}
    */
  var length: js.UndefOr[Double] = js.native
  /** Show/Hides the error bar cap.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.native
  /** Width of the error bar cap.
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.native
}

object SeriesErrorBarCap {
  @scala.inline
  def apply(): SeriesErrorBarCap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesErrorBarCap]
  }
  @scala.inline
  implicit class SeriesErrorBarCapOps[Self <: SeriesErrorBarCap] (val x: Self) extends AnyVal {
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
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

