package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.AnonBottom
import typings.devextreme.AnonCornerRadius
import typings.devextreme.AnonHorizontalAlignment
import typings.devextreme.AnonItemText
import typings.devextreme.devextremeStrings.bottom
import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.horizontal
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.top
import typings.devextreme.devextremeStrings.vertical
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.DevExpress.ui.format
import typings.devextreme.mod._Global_.JQuery
import typings.std.SVGElement
import typings.std.SVGGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxBarGaugeLegend extends BaseLegend {
  /** @name dxBarGauge.Options.legend.customizeHint */
  var customizeHint: js.UndefOr[js.Function1[/* arg */ AnonItemText, String]] = js.undefined
  /** @name dxBarGauge.Options.legend.customizeItems */
  var customizeItems: js.UndefOr[
    js.Function1[/* items */ js.Array[BarGaugeLegendItem], js.Array[BarGaugeLegendItem]]
  ] = js.undefined
  /** @name dxBarGauge.Options.legend.customizeText */
  var customizeText: js.UndefOr[js.Function1[/* arg */ AnonItemText, String]] = js.undefined
  /** @name dxBarGauge.Options.legend.itemTextFormat */
  var itemTextFormat: js.UndefOr[format] = js.undefined
  /** @name dxBarGauge.Options.legend.markerTemplate */
  var markerTemplate: js.UndefOr[
    template | (js.Function2[
      /* legendItem */ BarGaugeLegendItem, 
      /* element */ SVGGElement, 
      String | SVGElement | JQuery
    ])
  ] = js.undefined
}

object dxBarGaugeLegend {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    border: AnonCornerRadius = null,
    columnCount: Int | Double = null,
    columnItemSpacing: Int | Double = null,
    customizeHint: /* arg */ AnonItemText => String = null,
    customizeItems: /* items */ js.Array[BarGaugeLegendItem] => js.Array[BarGaugeLegendItem] = null,
    customizeText: /* arg */ AnonItemText => String = null,
    font: Font = null,
    horizontalAlignment: center | left | right = null,
    itemTextFormat: format = null,
    itemTextPosition: bottom | left | right | top = null,
    itemsAlignment: center | left | right = null,
    margin: Double | AnonBottom = null,
    markerSize: Int | Double = null,
    markerTemplate: template | (js.Function2[
      /* legendItem */ BarGaugeLegendItem, 
      /* element */ SVGGElement, 
      String | SVGElement | JQuery
    ]) = null,
    orientation: horizontal | vertical = null,
    paddingLeftRight: Int | Double = null,
    paddingTopBottom: Int | Double = null,
    rowCount: Int | Double = null,
    rowItemSpacing: Int | Double = null,
    title: AnonHorizontalAlignment | String = null,
    verticalAlignment: bottom | top = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): dxBarGaugeLegend = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (columnCount != null) __obj.updateDynamic("columnCount")(columnCount.asInstanceOf[js.Any])
    if (columnItemSpacing != null) __obj.updateDynamic("columnItemSpacing")(columnItemSpacing.asInstanceOf[js.Any])
    if (customizeHint != null) __obj.updateDynamic("customizeHint")(js.Any.fromFunction1(customizeHint))
    if (customizeItems != null) __obj.updateDynamic("customizeItems")(js.Any.fromFunction1(customizeItems))
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1(customizeText))
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (itemTextFormat != null) __obj.updateDynamic("itemTextFormat")(itemTextFormat.asInstanceOf[js.Any])
    if (itemTextPosition != null) __obj.updateDynamic("itemTextPosition")(itemTextPosition.asInstanceOf[js.Any])
    if (itemsAlignment != null) __obj.updateDynamic("itemsAlignment")(itemsAlignment.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (markerSize != null) __obj.updateDynamic("markerSize")(markerSize.asInstanceOf[js.Any])
    if (markerTemplate != null) __obj.updateDynamic("markerTemplate")(markerTemplate.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (paddingLeftRight != null) __obj.updateDynamic("paddingLeftRight")(paddingLeftRight.asInstanceOf[js.Any])
    if (paddingTopBottom != null) __obj.updateDynamic("paddingTopBottom")(paddingTopBottom.asInstanceOf[js.Any])
    if (rowCount != null) __obj.updateDynamic("rowCount")(rowCount.asInstanceOf[js.Any])
    if (rowItemSpacing != null) __obj.updateDynamic("rowItemSpacing")(rowItemSpacing.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxBarGaugeLegend]
  }
}

