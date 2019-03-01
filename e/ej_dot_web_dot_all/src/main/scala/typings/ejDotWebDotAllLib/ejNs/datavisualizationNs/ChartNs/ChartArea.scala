package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartArea extends js.Object {
  /** Background color of the plot area.
    * @Default {transparent}
    */
  var background: js.UndefOr[java.lang.String] = js.undefined
  /** Options for customizing the border of the plot area.
    */
  var border: js.UndefOr[ChartAreaBorder] = js.undefined
}

object ChartArea {
  @scala.inline
  def apply(background: java.lang.String = null, border: ChartAreaBorder = null): ChartArea = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (border != null) __obj.updateDynamic("border")(border)
    __obj.asInstanceOf[ChartArea]
  }
}

