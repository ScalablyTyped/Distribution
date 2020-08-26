package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Margin extends js.Object {
  /** Spacing for the bottom margin of the chart area. Setting positive value decreases the height of the chart area from the bottom.
    * @Default {10}
    */
  var bottom: js.UndefOr[Double] = js.native
  /** Spacing for the left margin of chart area. Setting positive value decreases the width of the chart area from left side.
    * @Default {10}
    */
  var left: js.UndefOr[Double] = js.native
  /** Spacing for the right margin of chart area. Setting positive value decreases the width of the chart area from right side.
    * @Default {10}
    */
  var right: js.UndefOr[Double] = js.native
  /** Spacing for the top margin of chart area. Setting positive value decreases the height of the chart area from the top.
    * @Default {10}
    */
  var top: js.UndefOr[Double] = js.native
}

object Margin {
  @scala.inline
  def apply(): Margin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Margin]
  }
  @scala.inline
  implicit class MarginOps[Self <: Margin] (val x: Self) extends AnyVal {
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
    def setBottom(value: Double): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setRight(value: Double): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
  }
  
}

