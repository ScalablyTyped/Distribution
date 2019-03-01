package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipAlignment extends js.Object {
  /** Defines the horizontal alignment of tooltip.
    * @Default {ej.datavisualization.Diagram.HorizontalAlignment.Center}
    */
  var horizontal: js.UndefOr[HorizontalAlignment | java.lang.String] = js.undefined
  /** Defines the vertical alignment of tooltip.
    * @Default {ej.datavisualization.Diagram.VerticalAlignment.Bottom}
    */
  var vertical: js.UndefOr[VerticalAlignment | java.lang.String] = js.undefined
}

object TooltipAlignment {
  @scala.inline
  def apply(
    horizontal: HorizontalAlignment | java.lang.String = null,
    vertical: VerticalAlignment | java.lang.String = null
  ): TooltipAlignment = {
    val __obj = js.Dynamic.literal()
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipAlignment]
  }
}

