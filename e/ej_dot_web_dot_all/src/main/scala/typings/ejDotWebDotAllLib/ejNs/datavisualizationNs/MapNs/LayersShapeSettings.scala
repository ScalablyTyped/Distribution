package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayersShapeSettings extends js.Object {
  /** Enables or Disables the auto fill colors for shape layer in map. When this property value set to true, shapes will be filled with palette colors.
    * @Default {false}
    */
  var autoFill: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the colorMappings of the shape layer in map
    * @Default {null}
    */
  var colorMappings: js.UndefOr[LayersShapeSettingsColorMappings] = js.undefined
  /** Specifies the shape color palette value of the shape layer in map. Accepted colorPalette values are palette1, palette2, palette3 and custompalette.
    * @Default {palette1}
    */
  var colorPalette: js.UndefOr[ColorPalette | java.lang.String] = js.undefined
  /** Specifies the field name in the datasource that contains color values for each shapes.
    * @Default {null}
    */
  var colorPath: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the shape color valuePath of the shape layer in map
    * @Default {null}
    */
  var colorValuePath: js.UndefOr[java.lang.String] = js.undefined
  /** Enables or Disables the gradient colors for map shapes.
    * @Default {false}
    */
  var enableGradient: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the shape fill color of the shape layer in map
    * @Default {#E5E5E5}
    */
  var fill: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the mouse over width of the shape layer in map
    * @Default {1}
    */
  var highlightBorderWidth: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the mouse hover color of the shape layer in map
    * @Default {gray}
    */
  var highlightColor: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the mouse over stroke color of the shape layer in map
    * @Default {#C1C1C1}
    */
  var highlightStroke: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the shape selection color of the shape layer in map
    * @Default {gray}
    */
  var selectionColor: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the shape selection stroke color of the shape layer in map
    * @Default {#C1C1C1}
    */
  var selectionStroke: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the shape selection stroke width of the shape layer in map
    * @Default {1}
    */
  var selectionStrokeWidth: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the shape stroke color of the shape layer in map
    * @Default {#C1C1C1}
    */
  var stroke: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the shape stroke thickness value of the shape layer in map
    * @Default {0.2}
    */
  var strokeThickness: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the shape valuePath of the shape layer in map
    * @Default {null}
    */
  var valuePath: js.UndefOr[java.lang.String] = js.undefined
}

