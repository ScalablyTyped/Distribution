package typings.ejWebAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayersShapeSettings extends js.Object {
  /** Enables or Disables the auto fill colors for shape layer in map. When this property value set to true, shapes will be filled with palette colors.
    * @Default {false}
    */
  var autoFill: js.UndefOr[Boolean] = js.native
  /** Specifies the colorMappings of the shape layer in map
    * @Default {null}
    */
  var colorMappings: js.UndefOr[LayersShapeSettingsColorMappings] = js.native
  /** Specifies the shape color palette value of the shape layer in map. Accepted colorPalette values are palette1, palette2, palette3 and custompalette.
    * @Default {palette1}
    */
  var colorPalette: js.UndefOr[ColorPalette | String] = js.native
  /** Specifies the field name in the datasource that contains color values for each shapes.
    * @Default {null}
    */
  var colorPath: js.UndefOr[String] = js.native
  /** Specifies the shape color valuePath of the shape layer in map
    * @Default {null}
    */
  var colorValuePath: js.UndefOr[String] = js.native
  /** Enables or Disables the gradient colors for map shapes.
    * @Default {false}
    */
  var enableGradient: js.UndefOr[Boolean] = js.native
  /** Specifies the shape fill color of the shape layer in map
    * @Default {#E5E5E5}
    */
  var fill: js.UndefOr[String] = js.native
  /** Specifies the mouse over width of the shape layer in map
    * @Default {1}
    */
  var highlightBorderWidth: js.UndefOr[Double] = js.native
  /** Specifies the mouse hover color of the shape layer in map
    * @Default {gray}
    */
  var highlightColor: js.UndefOr[String] = js.native
  /** Specifies the mouse over stroke color of the shape layer in map
    * @Default {#C1C1C1}
    */
  var highlightStroke: js.UndefOr[String] = js.native
  /** Specifies the shape selection color of the shape layer in map
    * @Default {gray}
    */
  var selectionColor: js.UndefOr[String] = js.native
  /** Specifies the shape selection stroke color of the shape layer in map
    * @Default {#C1C1C1}
    */
  var selectionStroke: js.UndefOr[String] = js.native
  /** Specifies the shape selection stroke width of the shape layer in map
    * @Default {1}
    */
  var selectionStrokeWidth: js.UndefOr[Double] = js.native
  /** Specifies the shape stroke color of the shape layer in map
    * @Default {#C1C1C1}
    */
  var stroke: js.UndefOr[String] = js.native
  /** Specifies the shape stroke thickness value of the shape layer in map
    * @Default {0.2}
    */
  var strokeThickness: js.UndefOr[Double] = js.native
  /** Specifies the shape valuePath of the shape layer in map
    * @Default {null}
    */
  var valuePath: js.UndefOr[String] = js.native
}

object LayersShapeSettings {
  @scala.inline
  def apply(): LayersShapeSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayersShapeSettings]
  }
  @scala.inline
  implicit class LayersShapeSettingsOps[Self <: LayersShapeSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoFill(value: Boolean): Self = this.set("autoFill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFill: Self = this.set("autoFill", js.undefined)
    @scala.inline
    def setColorMappings(value: LayersShapeSettingsColorMappings): Self = this.set("colorMappings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorMappings: Self = this.set("colorMappings", js.undefined)
    @scala.inline
    def setColorPalette(value: ColorPalette | String): Self = this.set("colorPalette", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorPalette: Self = this.set("colorPalette", js.undefined)
    @scala.inline
    def setColorPath(value: String): Self = this.set("colorPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorPath: Self = this.set("colorPath", js.undefined)
    @scala.inline
    def setColorValuePath(value: String): Self = this.set("colorValuePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorValuePath: Self = this.set("colorValuePath", js.undefined)
    @scala.inline
    def setEnableGradient(value: Boolean): Self = this.set("enableGradient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableGradient: Self = this.set("enableGradient", js.undefined)
    @scala.inline
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setHighlightBorderWidth(value: Double): Self = this.set("highlightBorderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightBorderWidth: Self = this.set("highlightBorderWidth", js.undefined)
    @scala.inline
    def setHighlightColor(value: String): Self = this.set("highlightColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightColor: Self = this.set("highlightColor", js.undefined)
    @scala.inline
    def setHighlightStroke(value: String): Self = this.set("highlightStroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightStroke: Self = this.set("highlightStroke", js.undefined)
    @scala.inline
    def setSelectionColor(value: String): Self = this.set("selectionColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionColor: Self = this.set("selectionColor", js.undefined)
    @scala.inline
    def setSelectionStroke(value: String): Self = this.set("selectionStroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionStroke: Self = this.set("selectionStroke", js.undefined)
    @scala.inline
    def setSelectionStrokeWidth(value: Double): Self = this.set("selectionStrokeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionStrokeWidth: Self = this.set("selectionStrokeWidth", js.undefined)
    @scala.inline
    def setStroke(value: String): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    @scala.inline
    def setStrokeThickness(value: Double): Self = this.set("strokeThickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeThickness: Self = this.set("strokeThickness", js.undefined)
    @scala.inline
    def setValuePath(value: String): Self = this.set("valuePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValuePath: Self = this.set("valuePath", js.undefined)
  }
  
}

