package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartArea extends js.Object {
  /** Background color of the plot area.
    * @Default {transparent}
    */
  var background: js.UndefOr[String] = js.native
  /** Options for customizing the border of the plot area.
    */
  var border: js.UndefOr[ChartAreaBorder] = js.native
}

object ChartArea {
  @scala.inline
  def apply(): ChartArea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartArea]
  }
  @scala.inline
  implicit class ChartAreaOps[Self <: ChartArea] (val x: Self) extends AnyVal {
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
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setBorder(value: ChartAreaBorder): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
  }
  
}

