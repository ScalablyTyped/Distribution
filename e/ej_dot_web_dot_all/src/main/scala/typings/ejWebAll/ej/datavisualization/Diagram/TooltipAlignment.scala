package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipAlignment extends js.Object {
  /** Defines the horizontal alignment of tooltip.
    * @Default {ej.datavisualization.Diagram.HorizontalAlignment.Center}
    */
  var horizontal: js.UndefOr[HorizontalAlignment | String] = js.undefined
  /** Defines the vertical alignment of tooltip.
    * @Default {ej.datavisualization.Diagram.VerticalAlignment.Bottom}
    */
  var vertical: js.UndefOr[VerticalAlignment | String] = js.undefined
}

object TooltipAlignment {
  @scala.inline
  def apply(horizontal: HorizontalAlignment | String = null, vertical: VerticalAlignment | String = null): TooltipAlignment = {
    val __obj = js.Dynamic.literal()
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipAlignment]
  }
}

