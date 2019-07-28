package typings.ejDotWebDotAll.ejNs.datavisualizationNs

import typings.ejDotWebDotAll.JQuery
import typings.ejDotWebDotAll.ejNs.Widget
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.datavisualization.SymbolPalette")
@js.native
class SymbolPalette protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejDotWebDotAll.ejNs.datavisualizationNs.SymbolPaletteNs.Model) = this()
  def this(element: Element, options: typings.ejDotWebDotAll.ejNs.datavisualizationNs.SymbolPaletteNs.Model) = this()
  var defaults: typings.ejDotWebDotAll.ejNs.datavisualizationNs.SymbolPaletteNs.Model = js.native
  @JSName("model")
  var model_SymbolPalette: typings.ejDotWebDotAll.ejNs.datavisualizationNs.SymbolPaletteNs.Model = js.native
  /** Add items to Palettes at runtime
    * @param {string} name of the Palette
    * @param {any} JSON for the new items to added in Palette
    * @returns {void}
    */
  def addPaletteItem(paletteName: String, node: js.Any): Unit = js.native
  /** Remove items to Palettes at runtime
    * @param {string} name of the Palette
    * @param {any} JSON for the new node to removed in Palette
    * @returns {void}
    */
  def removePaletteItem(paletteName: String, node: js.Any): Unit = js.native
}

/* static members */
@JSGlobal("ej.datavisualization.SymbolPalette")
@js.native
object SymbolPalette extends js.Object {
  var Locale: js.Any = js.native
  var fn: SymbolPalette = js.native
}

