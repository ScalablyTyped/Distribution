package typings.ejDotWebDotAll.ejNs.datavisualizationNs.MapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayersShapeSettings extends js.Object {
  /** Enables or Disables the auto fill colors for shape layer in map. When this property value set to true, shapes will be filled with palette colors.
    * @Default {false}
    */
  var autoFill: js.UndefOr[Boolean] = js.undefined
  /** Specifies the colorMappings of the shape layer in map
    * @Default {null}
    */
  var colorMappings: js.UndefOr[LayersShapeSettingsColorMappings] = js.undefined
  /** Specifies the shape color palette value of the shape layer in map. Accepted colorPalette values are palette1, palette2, palette3 and custompalette.
    * @Default {palette1}
    */
  var colorPalette: js.UndefOr[ColorPalette | String] = js.undefined
  /** Specifies the field name in the datasource that contains color values for each shapes.
    * @Default {null}
    */
  var colorPath: js.UndefOr[String] = js.undefined
  /** Specifies the shape color valuePath of the shape layer in map
    * @Default {null}
    */
  var colorValuePath: js.UndefOr[String] = js.undefined
  /** Enables or Disables the gradient colors for map shapes.
    * @Default {false}
    */
  var enableGradient: js.UndefOr[Boolean] = js.undefined
  /** Specifies the shape fill color of the shape layer in map
    * @Default {#E5E5E5}
    */
  var fill: js.UndefOr[String] = js.undefined
  /** Specifies the mouse over width of the shape layer in map
    * @Default {1}
    */
  var highlightBorderWidth: js.UndefOr[Double] = js.undefined
  /** Specifies the mouse hover color of the shape layer in map
    * @Default {gray}
    */
  var highlightColor: js.UndefOr[String] = js.undefined
  /** Specifies the mouse over stroke color of the shape layer in map
    * @Default {#C1C1C1}
    */
  var highlightStroke: js.UndefOr[String] = js.undefined
  /** Specifies the shape selection color of the shape layer in map
    * @Default {gray}
    */
  var selectionColor: js.UndefOr[String] = js.undefined
  /** Specifies the shape selection stroke color of the shape layer in map
    * @Default {#C1C1C1}
    */
  var selectionStroke: js.UndefOr[String] = js.undefined
  /** Specifies the shape selection stroke width of the shape layer in map
    * @Default {1}
    */
  var selectionStrokeWidth: js.UndefOr[Double] = js.undefined
  /** Specifies the shape stroke color of the shape layer in map
    * @Default {#C1C1C1}
    */
  var stroke: js.UndefOr[String] = js.undefined
  /** Specifies the shape stroke thickness value of the shape layer in map
    * @Default {0.2}
    */
  var strokeThickness: js.UndefOr[Double] = js.undefined
  /** Specifies the shape valuePath of the shape layer in map
    * @Default {null}
    */
  var valuePath: js.UndefOr[String] = js.undefined
}

object LayersShapeSettings {
  @scala.inline
  def apply(
    autoFill: js.UndefOr[Boolean] = js.undefined,
    colorMappings: LayersShapeSettingsColorMappings = null,
    colorPalette: ColorPalette | String = null,
    colorPath: String = null,
    colorValuePath: String = null,
    enableGradient: js.UndefOr[Boolean] = js.undefined,
    fill: String = null,
    highlightBorderWidth: Int | Double = null,
    highlightColor: String = null,
    highlightStroke: String = null,
    selectionColor: String = null,
    selectionStroke: String = null,
    selectionStrokeWidth: Int | Double = null,
    stroke: String = null,
    strokeThickness: Int | Double = null,
    valuePath: String = null
  ): LayersShapeSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFill)) __obj.updateDynamic("autoFill")(autoFill)
    if (colorMappings != null) __obj.updateDynamic("colorMappings")(colorMappings)
    if (colorPalette != null) __obj.updateDynamic("colorPalette")(colorPalette.asInstanceOf[js.Any])
    if (colorPath != null) __obj.updateDynamic("colorPath")(colorPath)
    if (colorValuePath != null) __obj.updateDynamic("colorValuePath")(colorValuePath)
    if (!js.isUndefined(enableGradient)) __obj.updateDynamic("enableGradient")(enableGradient)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (highlightBorderWidth != null) __obj.updateDynamic("highlightBorderWidth")(highlightBorderWidth.asInstanceOf[js.Any])
    if (highlightColor != null) __obj.updateDynamic("highlightColor")(highlightColor)
    if (highlightStroke != null) __obj.updateDynamic("highlightStroke")(highlightStroke)
    if (selectionColor != null) __obj.updateDynamic("selectionColor")(selectionColor)
    if (selectionStroke != null) __obj.updateDynamic("selectionStroke")(selectionStroke)
    if (selectionStrokeWidth != null) __obj.updateDynamic("selectionStrokeWidth")(selectionStrokeWidth.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (strokeThickness != null) __obj.updateDynamic("strokeThickness")(strokeThickness.asInstanceOf[js.Any])
    if (valuePath != null) __obj.updateDynamic("valuePath")(valuePath)
    __obj.asInstanceOf[LayersShapeSettings]
  }
}

