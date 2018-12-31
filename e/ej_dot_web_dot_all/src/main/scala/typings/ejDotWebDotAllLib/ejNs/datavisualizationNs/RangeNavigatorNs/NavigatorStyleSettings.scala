package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorStyleSettings extends js.Object {
  /** Specifies the background color of range navigator.
    * @Default {#dddddd}
    */
  var background: js.UndefOr[java.lang.String] = js.undefined
  /** Options for customizing the border color and width of range navigator.
    */
  var border: js.UndefOr[NavigatorStyleSettingsBorder] = js.undefined
  /** Contains the options for highlighting the range navigator on mouse over.
    */
  var highlightSettings: js.UndefOr[NavigatorStyleSettingsHighlightSettings] = js.undefined
  /** Specifies the left side thumb template in range navigator we can give either div id or HTML string
    * @Default {null}
    */
  var leftThumbTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** Options for customizing the major grid lines.
    */
  var majorGridLineStyle: js.UndefOr[NavigatorStyleSettingsMajorGridLineStyle] = js.undefined
  /** Options for customizing the minor grid lines.
    */
  var minorGridLineStyle: js.UndefOr[NavigatorStyleSettingsMinorGridLineStyle] = js.undefined
  /** Specifies the opacity of RangeNavigator.
    * @Default {1}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the right side thumb template in range navigator we can give either div id or HTML string
    * @Default {null}
    */
  var rightThumbTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the color of the selected region in range navigator.
    * @Default {#EFEFEF}
    */
  var selectedRegionColor: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the opacity of Selected Region.
    * @Default {0}
    */
  var selectedRegionOpacity: js.UndefOr[scala.Double] = js.undefined
  /** Contains the options for selection the range navigator on mouse over.
    */
  var selectionSettings: js.UndefOr[NavigatorStyleSettingsSelectionSettings] = js.undefined
  /** Specifies the color of the thumb in range navigator.
    * @Default {#2382C3}
    */
  var thumbColor: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the radius of the thumb in range navigator.
    * @Default {10}
    */
  var thumbRadius: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the stroke color of the thumb in range navigator.
    * @Default {#303030}
    */
  var thumbStroke: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the color of the unselected region in range navigator.
    * @Default {#5EABDE}
    */
  var unselectedRegionColor: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the opacity of Unselected Region.
    * @Default {0.3}
    */
  var unselectedRegionOpacity: js.UndefOr[scala.Double] = js.undefined
}

