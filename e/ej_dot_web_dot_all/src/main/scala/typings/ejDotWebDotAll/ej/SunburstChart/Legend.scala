package typings.ejDotWebDotAll.ej.SunburstChart

import typings.ejDotWebDotAll.ej.datavisualization.Sunburst.SunburstAlignment
import typings.ejDotWebDotAll.ej.datavisualization.Sunburst.SunburstClickAction
import typings.ejDotWebDotAll.ej.datavisualization.Sunburst.SunburstLegendPosition
import typings.ejDotWebDotAll.ej.datavisualization.Sunburst.SunburstLegendShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Legend extends js.Object {
  /** Horizontal alignment of the legend.
    * @Default {Center. See Alignment}
    */
  var alignment: js.UndefOr[SunburstAlignment | String] = js.undefined
  /** Options for customizing the legend border.
    */
  var border: js.UndefOr[LegendBorder] = js.undefined
  /** Interactive action of legend items.
    * @Default {toggleSegmentVisibility. See Alignment}
    */
  var clickAction: js.UndefOr[SunburstClickAction | String] = js.undefined
  /** Number of columns to arrange the legend items.
    * @Default {null}
    */
  var columnCount: js.UndefOr[Double] = js.undefined
  /** Options to customize the font used for legend item text.
    */
  var font: js.UndefOr[LegendFont] = js.undefined
  /** Gap or padding between the legend items.
    * @Default {10}
    */
  var itemPadding: js.UndefOr[Double] = js.undefined
  /** Options to customize the style of legend items.
    */
  var itemStyle: js.UndefOr[LegendItemStyle] = js.undefined
  /** Options to customize the location of sunburst legend. Legend is placed in provided location only when value of position property is custom
    */
  var location: js.UndefOr[LegendLocation] = js.undefined
  /** Places the legend at specified position. Legend can be placed at **left**, **right**, **top** or **bottom** of the chart area. To manually specify the location of legend, set
    * **custom** as value to this property.
    * @Default {Bottom. See Position}
    */
  var position: js.UndefOr[SunburstLegendPosition | String] = js.undefined
  /** Number of rows to arrange the legend items.
    * @Default {null}
    */
  var rowCount: js.UndefOr[Double] = js.undefined
  /** Shape of the legend items.
    * @Default {None. See Shape}
    */
  var shape: js.UndefOr[SunburstLegendShape | String] = js.undefined
  /** Options to customize the size of the legend.
    */
  var size: js.UndefOr[LegendSize] = js.undefined
  /** Options to customize the legend title.
    */
  var title: js.UndefOr[LegendTitle] = js.undefined
  /** Visibility of the legend.
    * @Default {false}
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object Legend {
  @scala.inline
  def apply(
    alignment: SunburstAlignment | String = null,
    border: LegendBorder = null,
    clickAction: SunburstClickAction | String = null,
    columnCount: Int | Double = null,
    font: LegendFont = null,
    itemPadding: Int | Double = null,
    itemStyle: LegendItemStyle = null,
    location: LegendLocation = null,
    position: SunburstLegendPosition | String = null,
    rowCount: Int | Double = null,
    shape: SunburstLegendShape | String = null,
    size: LegendSize = null,
    title: LegendTitle = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): Legend = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border)
    if (clickAction != null) __obj.updateDynamic("clickAction")(clickAction.asInstanceOf[js.Any])
    if (columnCount != null) __obj.updateDynamic("columnCount")(columnCount.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font)
    if (itemPadding != null) __obj.updateDynamic("itemPadding")(itemPadding.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    if (location != null) __obj.updateDynamic("location")(location)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (rowCount != null) __obj.updateDynamic("rowCount")(rowCount.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[Legend]
  }
}

