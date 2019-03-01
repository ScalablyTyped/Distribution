package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.TreeMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Level extends js.Object {
  /** specifies the group background
    * @Default {null}
    */
  var groupBackground: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the group border color for tree map level.
    * @Default {null}
    */
  var groupBorderColor: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the group border thickness for tree map level.
    * @Default {1}
    */
  var groupBorderThickness: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the group gap for tree map level.
    * @Default {1}
    */
  var groupGap: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the group padding for tree map level.
    * @Default {4}
    */
  var groupPadding: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the group path for tree map level.
    */
  var groupPath: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the header height for tree map level.
    * @Default {0}
    */
  var headerHeight: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the header template for tree map level.
    * @Default {null}
    */
  var headerTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the mode of header visibility
    * @Default {visible}
    */
  var headerVisibilityMode: js.UndefOr[VisibilityMode | java.lang.String] = js.undefined
  /** Specifies the position of the labels.
    * @Default {center}
    */
  var labelPosition: js.UndefOr[Position | java.lang.String] = js.undefined
  /** Specifies the label template for tree map level.
    * @Default {null}
    */
  var labelTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the mode of label visibility
    * @Default {visible}
    */
  var labelVisibilityMode: js.UndefOr[VisibilityMode | java.lang.String] = js.undefined
  /** Shows or hides the header for tree map level.
    * @Default {false}
    */
  var showHeader: js.UndefOr[scala.Boolean] = js.undefined
  /** Shows or hides the labels for tree map level.
    * @Default {false}
    */
  var showLabels: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the overflow options for leaf labels.
    * @Default {none}
    */
  var textOverflow: js.UndefOr[TextOverflow | java.lang.String] = js.undefined
}

object Level {
  @scala.inline
  def apply(
    groupBackground: java.lang.String = null,
    groupBorderColor: java.lang.String = null,
    groupBorderThickness: scala.Int | scala.Double = null,
    groupGap: scala.Int | scala.Double = null,
    groupPadding: scala.Int | scala.Double = null,
    groupPath: java.lang.String = null,
    headerHeight: scala.Int | scala.Double = null,
    headerTemplate: java.lang.String = null,
    headerVisibilityMode: VisibilityMode | java.lang.String = null,
    labelPosition: Position | java.lang.String = null,
    labelTemplate: java.lang.String = null,
    labelVisibilityMode: VisibilityMode | java.lang.String = null,
    showHeader: js.UndefOr[scala.Boolean] = js.undefined,
    showLabels: js.UndefOr[scala.Boolean] = js.undefined,
    textOverflow: TextOverflow | java.lang.String = null
  ): Level = {
    val __obj = js.Dynamic.literal()
    if (groupBackground != null) __obj.updateDynamic("groupBackground")(groupBackground)
    if (groupBorderColor != null) __obj.updateDynamic("groupBorderColor")(groupBorderColor)
    if (groupBorderThickness != null) __obj.updateDynamic("groupBorderThickness")(groupBorderThickness.asInstanceOf[js.Any])
    if (groupGap != null) __obj.updateDynamic("groupGap")(groupGap.asInstanceOf[js.Any])
    if (groupPadding != null) __obj.updateDynamic("groupPadding")(groupPadding.asInstanceOf[js.Any])
    if (groupPath != null) __obj.updateDynamic("groupPath")(groupPath)
    if (headerHeight != null) __obj.updateDynamic("headerHeight")(headerHeight.asInstanceOf[js.Any])
    if (headerTemplate != null) __obj.updateDynamic("headerTemplate")(headerTemplate)
    if (headerVisibilityMode != null) __obj.updateDynamic("headerVisibilityMode")(headerVisibilityMode.asInstanceOf[js.Any])
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (labelTemplate != null) __obj.updateDynamic("labelTemplate")(labelTemplate)
    if (labelVisibilityMode != null) __obj.updateDynamic("labelVisibilityMode")(labelVisibilityMode.asInstanceOf[js.Any])
    if (!js.isUndefined(showHeader)) __obj.updateDynamic("showHeader")(showHeader)
    if (!js.isUndefined(showLabels)) __obj.updateDynamic("showLabels")(showLabels)
    if (textOverflow != null) __obj.updateDynamic("textOverflow")(textOverflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Level]
  }
}

