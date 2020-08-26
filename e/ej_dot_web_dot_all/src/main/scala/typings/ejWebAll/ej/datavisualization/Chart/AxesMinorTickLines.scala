package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AxesMinorTickLines extends js.Object {
  /** Length of the minor tick lines.
    * @Default {5}
    */
  var size: js.UndefOr[Double] = js.native
  /** Show/hides the minor tick lines.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.native
  /** Width of the minor tick line.
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.native
}

object AxesMinorTickLines {
  @scala.inline
  def apply(): AxesMinorTickLines = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxesMinorTickLines]
  }
  @scala.inline
  implicit class AxesMinorTickLinesOps[Self <: AxesMinorTickLines] (val x: Self) extends AnyVal {
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
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
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

