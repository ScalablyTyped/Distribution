package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.SymbolPaletteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Defines whether the symbols can be dragged from palette or not
    * @Default {true}
    */
  var allowDrag: js.UndefOr[scala.Boolean] = js.undefined
  /** Customizes the style of the symbol palette
    * @Default {e-symbolpalette}
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the default properties of nodes and connectors
    */
  var defaultSettings: js.UndefOr[DefaultSettings] = js.undefined
  /** Sets the Id of the diagram, over which the symbols will be dropped
    * @Default {null}
    */
  var diagramId: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the height of the palette headers
    * @Default {30}
    */
  var headerHeight: js.UndefOr[scala.Double] = js.undefined
  /** Defines the height of the symbol palette
    * @Default {400}
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** Defines the height of the palette items
    * @Default {50}
    */
  var paletteItemHeight: js.UndefOr[scala.Double] = js.undefined
  /** Defines the width of the palette items
    * @Default {50}
    */
  var paletteItemWidth: js.UndefOr[scala.Double] = js.undefined
  /** An array of JSON objects, where each object represents a node/connector
    * @Default {[]}
    */
  var palettes: js.UndefOr[js.Array[Palette]] = js.undefined
  /** Defines the preview height of the symbols
    * @Default {100}
    */
  var previewHeight: js.UndefOr[scala.Double] = js.undefined
  /** Defines the offset value to be left between the mouse cursor and symbol previews
    * @Default {(110, 110)}
    */
  var previewOffset: js.UndefOr[js.Any] = js.undefined
  /** Defines the width of the symbol previews
    * @Default {100}
    */
  var previewWidth: js.UndefOr[scala.Double] = js.undefined
  /** Triggers when a palette item is selected or unselected
    */
  var selectionChange: js.UndefOr[js.Function1[/* e */ SelectionChangeEventArgs, scala.Unit]] = js.undefined
  /** Enable or disable the palette item text
    * @Default {true}
    */
  var showPaletteItemText: js.UndefOr[scala.Boolean] = js.undefined
  /** The width of the palette
    * @Default {250}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    allowDrag: js.UndefOr[scala.Boolean] = js.undefined,
    cssClass: java.lang.String = null,
    defaultSettings: DefaultSettings = null,
    diagramId: java.lang.String = null,
    headerHeight: scala.Int | scala.Double = null,
    height: scala.Int | scala.Double = null,
    paletteItemHeight: scala.Int | scala.Double = null,
    paletteItemWidth: scala.Int | scala.Double = null,
    palettes: js.Array[Palette] = null,
    previewHeight: scala.Int | scala.Double = null,
    previewOffset: js.Any = null,
    previewWidth: scala.Int | scala.Double = null,
    selectionChange: js.Function1[/* e */ SelectionChangeEventArgs, scala.Unit] = null,
    showPaletteItemText: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDrag)) __obj.updateDynamic("allowDrag")(allowDrag)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (defaultSettings != null) __obj.updateDynamic("defaultSettings")(defaultSettings)
    if (diagramId != null) __obj.updateDynamic("diagramId")(diagramId)
    if (headerHeight != null) __obj.updateDynamic("headerHeight")(headerHeight.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (paletteItemHeight != null) __obj.updateDynamic("paletteItemHeight")(paletteItemHeight.asInstanceOf[js.Any])
    if (paletteItemWidth != null) __obj.updateDynamic("paletteItemWidth")(paletteItemWidth.asInstanceOf[js.Any])
    if (palettes != null) __obj.updateDynamic("palettes")(palettes)
    if (previewHeight != null) __obj.updateDynamic("previewHeight")(previewHeight.asInstanceOf[js.Any])
    if (previewOffset != null) __obj.updateDynamic("previewOffset")(previewOffset)
    if (previewWidth != null) __obj.updateDynamic("previewWidth")(previewWidth.asInstanceOf[js.Any])
    if (selectionChange != null) __obj.updateDynamic("selectionChange")(selectionChange)
    if (!js.isUndefined(showPaletteItemText)) __obj.updateDynamic("showPaletteItemText")(showPaletteItemText)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

