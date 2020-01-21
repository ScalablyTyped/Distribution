package typings.ejWebAll.ej.datavisualization.SymbolPalette

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Defines whether the symbols can be dragged from palette or not
    * @Default {true}
    */
  var allowDrag: js.UndefOr[Boolean] = js.undefined
  /** Customizes the style of the symbol palette
    * @Default {e-symbolpalette}
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Defines the default properties of nodes and connectors
    */
  var defaultSettings: js.UndefOr[DefaultSettings] = js.undefined
  /** Sets the Id of the diagram, over which the symbols will be dropped
    * @Default {null}
    */
  var diagramId: js.UndefOr[String] = js.undefined
  /** Sets the height of the palette headers
    * @Default {30}
    */
  var headerHeight: js.UndefOr[Double] = js.undefined
  /** Defines the height of the symbol palette
    * @Default {400}
    */
  var height: js.UndefOr[Double] = js.undefined
  /** Defines the height of the palette items
    * @Default {50}
    */
  var paletteItemHeight: js.UndefOr[Double] = js.undefined
  /** Defines the width of the palette items
    * @Default {50}
    */
  var paletteItemWidth: js.UndefOr[Double] = js.undefined
  /** An array of JSON objects, where each object represents a node/connector
    * @Default {[]}
    */
  var palettes: js.UndefOr[js.Array[Palette]] = js.undefined
  /** Defines the preview height of the symbols
    * @Default {100}
    */
  var previewHeight: js.UndefOr[Double] = js.undefined
  /** Defines the offset value to be left between the mouse cursor and symbol previews
    * @Default {(110, 110)}
    */
  var previewOffset: js.UndefOr[js.Any] = js.undefined
  /** Defines the width of the symbol previews
    * @Default {100}
    */
  var previewWidth: js.UndefOr[Double] = js.undefined
  /** Triggers when a palette item is selected or unselected
    */
  var selectionChange: js.UndefOr[js.Function1[/* e */ SelectionChangeEventArgs, Unit]] = js.undefined
  /** Enable or disable the palette item text
    * @Default {true}
    */
  var showPaletteItemText: js.UndefOr[Boolean] = js.undefined
  /** The width of the palette
    * @Default {250}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    allowDrag: js.UndefOr[Boolean] = js.undefined,
    cssClass: String = null,
    defaultSettings: DefaultSettings = null,
    diagramId: String = null,
    headerHeight: Int | Double = null,
    height: Int | Double = null,
    paletteItemHeight: Int | Double = null,
    paletteItemWidth: Int | Double = null,
    palettes: js.Array[Palette] = null,
    previewHeight: Int | Double = null,
    previewOffset: js.Any = null,
    previewWidth: Int | Double = null,
    selectionChange: /* e */ SelectionChangeEventArgs => Unit = null,
    showPaletteItemText: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDrag)) __obj.updateDynamic("allowDrag")(allowDrag.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (defaultSettings != null) __obj.updateDynamic("defaultSettings")(defaultSettings.asInstanceOf[js.Any])
    if (diagramId != null) __obj.updateDynamic("diagramId")(diagramId.asInstanceOf[js.Any])
    if (headerHeight != null) __obj.updateDynamic("headerHeight")(headerHeight.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (paletteItemHeight != null) __obj.updateDynamic("paletteItemHeight")(paletteItemHeight.asInstanceOf[js.Any])
    if (paletteItemWidth != null) __obj.updateDynamic("paletteItemWidth")(paletteItemWidth.asInstanceOf[js.Any])
    if (palettes != null) __obj.updateDynamic("palettes")(palettes.asInstanceOf[js.Any])
    if (previewHeight != null) __obj.updateDynamic("previewHeight")(previewHeight.asInstanceOf[js.Any])
    if (previewOffset != null) __obj.updateDynamic("previewOffset")(previewOffset.asInstanceOf[js.Any])
    if (previewWidth != null) __obj.updateDynamic("previewWidth")(previewWidth.asInstanceOf[js.Any])
    if (selectionChange != null) __obj.updateDynamic("selectionChange")(js.Any.fromFunction1(selectionChange))
    if (!js.isUndefined(showPaletteItemText)) __obj.updateDynamic("showPaletteItemText")(showPaletteItemText.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

