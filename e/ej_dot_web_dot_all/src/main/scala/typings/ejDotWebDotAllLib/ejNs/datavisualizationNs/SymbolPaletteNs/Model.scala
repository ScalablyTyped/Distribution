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

