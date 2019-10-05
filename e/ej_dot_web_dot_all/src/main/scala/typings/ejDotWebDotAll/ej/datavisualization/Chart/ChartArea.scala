package typings.ejDotWebDotAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartArea extends js.Object {
  /** Background color of the plot area.
    * @Default {transparent}
    */
  var background: js.UndefOr[String] = js.undefined
  /** Options for customizing the border of the plot area.
    */
  var border: js.UndefOr[ChartAreaBorder] = js.undefined
}

object ChartArea {
  @scala.inline
  def apply(background: String = null, border: ChartAreaBorder = null): ChartArea = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (border != null) __obj.updateDynamic("border")(border)
    __obj.asInstanceOf[ChartArea]
  }
}

