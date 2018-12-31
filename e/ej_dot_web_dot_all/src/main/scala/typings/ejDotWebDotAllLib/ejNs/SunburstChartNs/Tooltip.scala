package typings
package ejDotWebDotAllLib.ejNs.SunburstChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tooltip extends js.Object {
  /** Options for customizing the border of the sunburst tooltip.
    */
  var border: js.UndefOr[TooltipBorder] = js.undefined
  /** Fill color for the sunburst tooltip.
    * @Default {null}
    */
  var fill: js.UndefOr[java.lang.String] = js.undefined
  /** Options for customizing the font of the tooltip.
    */
  var font: js.UndefOr[TooltipFont] = js.undefined
  /** Setting the format for the data displayed in the tooltip
    * @Default {#point.x# : #point.y#}
    */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the opacity of the displayed tooltip
    * @Default {0.95}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Custom template to the tooltip.
    * @Default {null}
    */
  var template: js.UndefOr[java.lang.String] = js.undefined
  /** tooltip visibility of the Sunburst.
    * @Default {true}
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

