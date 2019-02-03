package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.datavisualization.SymbolPalette")
@js.native
class SymbolPalette protected ()
  extends ejDotWebDotAllLib.ejNs.Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.datavisualizationNs.SymbolPaletteNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.datavisualizationNs.SymbolPaletteNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.datavisualizationNs.SymbolPaletteNs.Model = js.native
  @JSName("model")
  var model_SymbolPalette: ejDotWebDotAllLib.ejNs.datavisualizationNs.SymbolPaletteNs.Model = js.native
  /** Add items to Palettes at runtime
    * @param {string} name of the Palette
    * @param {any} JSON for the new items to added in Palette
    * @returns {void}
    */
  def addPaletteItem(paletteName: java.lang.String, node: js.Any): scala.Unit = js.native
  /** Remove items to Palettes at runtime
    * @param {string} name of the Palette
    * @param {any} JSON for the new node to removed in Palette
    * @returns {void}
    */
  def removePaletteItem(paletteName: java.lang.String, node: js.Any): scala.Unit = js.native
}

/* static members */
@JSGlobal("ej.datavisualization.SymbolPalette")
@js.native
object SymbolPalette extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.datavisualizationNs.SymbolPalette = js.native
}

