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

object NavigatorStyleSettings {
  @scala.inline
  def apply(
    background: java.lang.String = null,
    border: NavigatorStyleSettingsBorder = null,
    highlightSettings: NavigatorStyleSettingsHighlightSettings = null,
    leftThumbTemplate: java.lang.String = null,
    majorGridLineStyle: NavigatorStyleSettingsMajorGridLineStyle = null,
    minorGridLineStyle: NavigatorStyleSettingsMinorGridLineStyle = null,
    opacity: scala.Int | scala.Double = null,
    rightThumbTemplate: java.lang.String = null,
    selectedRegionColor: java.lang.String = null,
    selectedRegionOpacity: scala.Int | scala.Double = null,
    selectionSettings: NavigatorStyleSettingsSelectionSettings = null,
    thumbColor: java.lang.String = null,
    thumbRadius: scala.Int | scala.Double = null,
    thumbStroke: java.lang.String = null,
    unselectedRegionColor: java.lang.String = null,
    unselectedRegionOpacity: scala.Int | scala.Double = null
  ): NavigatorStyleSettings = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (border != null) __obj.updateDynamic("border")(border)
    if (highlightSettings != null) __obj.updateDynamic("highlightSettings")(highlightSettings)
    if (leftThumbTemplate != null) __obj.updateDynamic("leftThumbTemplate")(leftThumbTemplate)
    if (majorGridLineStyle != null) __obj.updateDynamic("majorGridLineStyle")(majorGridLineStyle)
    if (minorGridLineStyle != null) __obj.updateDynamic("minorGridLineStyle")(minorGridLineStyle)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (rightThumbTemplate != null) __obj.updateDynamic("rightThumbTemplate")(rightThumbTemplate)
    if (selectedRegionColor != null) __obj.updateDynamic("selectedRegionColor")(selectedRegionColor)
    if (selectedRegionOpacity != null) __obj.updateDynamic("selectedRegionOpacity")(selectedRegionOpacity.asInstanceOf[js.Any])
    if (selectionSettings != null) __obj.updateDynamic("selectionSettings")(selectionSettings)
    if (thumbColor != null) __obj.updateDynamic("thumbColor")(thumbColor)
    if (thumbRadius != null) __obj.updateDynamic("thumbRadius")(thumbRadius.asInstanceOf[js.Any])
    if (thumbStroke != null) __obj.updateDynamic("thumbStroke")(thumbStroke)
    if (unselectedRegionColor != null) __obj.updateDynamic("unselectedRegionColor")(unselectedRegionColor)
    if (unselectedRegionOpacity != null) __obj.updateDynamic("unselectedRegionOpacity")(unselectedRegionOpacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorStyleSettings]
  }
}

