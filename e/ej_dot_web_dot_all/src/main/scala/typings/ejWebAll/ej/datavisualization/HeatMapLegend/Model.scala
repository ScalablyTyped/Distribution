package typings.ejWebAll.ej.datavisualization.HeatMapLegend

import typings.ejWebAll.ej.datavisualization.HeatMap.LegendMode
import typings.ejWebAll.ej.datavisualization.HeatMap.LegendOrientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Specifies the color values of the column data.
    * @Default {[]}
    */
  var colorMappingCollection: js.UndefOr[js.Array[ColorMappingCollection]] = js.undefined
  /** Specifies the height of the heatmap legend.
    * @Default {null}
    */
  var height: js.UndefOr[js.Any] = js.undefined
  /** Specifies can enable responsive mode or not for heatmap legend.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.undefined
  /** Specifies the legend mode as gradient or list.
    * @Default {ej.HeatMap.LegendMode.Gradient}
    */
  var legendMode: js.UndefOr[LegendMode | String] = js.undefined
  /** Specifies the orientation of the heatmap legend
    * @Default {ej.HeatMap.LegendOrientation.Horizontal}
    */
  var orientation: js.UndefOr[LegendOrientation | String] = js.undefined
  /** Specifies whether the cell label can be shown or not.
    * @Default {false}
    */
  var showLabel: js.UndefOr[Boolean] = js.undefined
  /** Specifies the width of the heatmap legend.
    * @Default {null}
    */
  var width: js.UndefOr[js.Any] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    colorMappingCollection: js.Array[ColorMappingCollection] = null,
    height: js.Any = null,
    isResponsive: js.UndefOr[Boolean] = js.undefined,
    legendMode: LegendMode | String = null,
    orientation: LegendOrientation | String = null,
    showLabel: js.UndefOr[Boolean] = js.undefined,
    width: js.Any = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (colorMappingCollection != null) __obj.updateDynamic("colorMappingCollection")(colorMappingCollection.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive.get.asInstanceOf[js.Any])
    if (legendMode != null) __obj.updateDynamic("legendMode")(legendMode.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (!js.isUndefined(showLabel)) __obj.updateDynamic("showLabel")(showLabel.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

