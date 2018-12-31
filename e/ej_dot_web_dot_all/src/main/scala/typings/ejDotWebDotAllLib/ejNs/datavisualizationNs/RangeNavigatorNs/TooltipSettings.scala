package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipSettings extends js.Object {
  /** Specifies the background color of tooltip.
    * @Default {#303030}
    */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /** Options for customizing the font in tooltip.
    */
  var font: js.UndefOr[TooltipSettingsFont] = js.undefined
  /** Specifies the format of text to be displayed in tooltip.
    * @Default {MM/dd/yyyy}
    */
  var labelFormat: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the mode of displaying the tooltip. Neither to display the tooltip always nor on demand.
    * @Default {null}
    */
  var tooltipDisplayMode: js.UndefOr[java.lang.String] = js.undefined
  /** Toggles the visibility of tooltip.
    * @Default {true}
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

