package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.AnonBottom
import typings.devextreme.AnonCornerRadius
import typings.devextreme.AnonHorizontalAlignment
import typings.devextreme.devextremeStrings.bottom
import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.horizontal
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.top
import typings.devextreme.devextremeStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseLegend extends js.Object {
  /** Colors the legend's background. */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /** Configures the legend's border. */
  var border: js.UndefOr[AnonCornerRadius] = js.undefined
  /** Arranges legend items into several columns. */
  var columnCount: js.UndefOr[Double] = js.undefined
  /** Specifies an empty space between item columns in pixels. */
  var columnItemSpacing: js.UndefOr[Double] = js.undefined
  /** Specifies the legend items' font options. */
  var font: js.UndefOr[Font] = js.undefined
  /** Along with verticalAlignment, specifies the legend's position. */
  var horizontalAlignment: js.UndefOr[center | left | right] = js.undefined
  /** Specifies the text's position relative to the marker in a legend item. */
  var itemTextPosition: js.UndefOr[bottom | left | right | top] = js.undefined
  /** Aligns items in the last column or row (depending on the legend's orientation). Applies when legend items are not divided into columns or rows equally. */
  var itemsAlignment: js.UndefOr[center | left | right] = js.undefined
  /** Generates an empty space, measured in pixels, around the legend. */
  var margin: js.UndefOr[Double | AnonBottom] = js.undefined
  /** Specifies the marker's size in a legend item in pixels. */
  var markerSize: js.UndefOr[Double] = js.undefined
  /** Arranges legend items vertically (in a column) or horizontally (in a row). The default value is "horizontal" if the legend.horizontalAlignment is "center". Otherwise, it is "vertical". */
  var orientation: js.UndefOr[horizontal | vertical] = js.undefined
  /** Generates an empty space, measured in pixels, between the legend's left/right border and its items. */
  var paddingLeftRight: js.UndefOr[Double] = js.undefined
  /** Generates an empty space, measured in pixels, between the legend's top/bottom border and its items. */
  var paddingTopBottom: js.UndefOr[Double] = js.undefined
  /** Arranges legend items in several rows. */
  var rowCount: js.UndefOr[Double] = js.undefined
  /** Specifies an empty space between item rows in pixels. */
  var rowItemSpacing: js.UndefOr[Double] = js.undefined
  /** Configures the legend title. */
  var title: js.UndefOr[AnonHorizontalAlignment | String] = js.undefined
  /** Along with horizontalAlignment, specifies the legend's position. */
  var verticalAlignment: js.UndefOr[bottom | top] = js.undefined
  /** Specifies the legend's visibility. */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object BaseLegend {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    border: AnonCornerRadius = null,
    columnCount: Int | Double = null,
    columnItemSpacing: Int | Double = null,
    font: Font = null,
    horizontalAlignment: center | left | right = null,
    itemTextPosition: bottom | left | right | top = null,
    itemsAlignment: center | left | right = null,
    margin: Double | AnonBottom = null,
    markerSize: Int | Double = null,
    orientation: horizontal | vertical = null,
    paddingLeftRight: Int | Double = null,
    paddingTopBottom: Int | Double = null,
    rowCount: Int | Double = null,
    rowItemSpacing: Int | Double = null,
    title: AnonHorizontalAlignment | String = null,
    verticalAlignment: bottom | top = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): BaseLegend = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (columnCount != null) __obj.updateDynamic("columnCount")(columnCount.asInstanceOf[js.Any])
    if (columnItemSpacing != null) __obj.updateDynamic("columnItemSpacing")(columnItemSpacing.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (itemTextPosition != null) __obj.updateDynamic("itemTextPosition")(itemTextPosition.asInstanceOf[js.Any])
    if (itemsAlignment != null) __obj.updateDynamic("itemsAlignment")(itemsAlignment.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (markerSize != null) __obj.updateDynamic("markerSize")(markerSize.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (paddingLeftRight != null) __obj.updateDynamic("paddingLeftRight")(paddingLeftRight.asInstanceOf[js.Any])
    if (paddingTopBottom != null) __obj.updateDynamic("paddingTopBottom")(paddingTopBottom.asInstanceOf[js.Any])
    if (rowCount != null) __obj.updateDynamic("rowCount")(rowCount.asInstanceOf[js.Any])
    if (rowItemSpacing != null) __obj.updateDynamic("rowItemSpacing")(rowItemSpacing.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseLegend]
  }
}

