package typings.ejDotWebDotAll.ej.datavisualization

import typings.ejDotWebDotAll.JQuery
import typings.ejDotWebDotAll.ej.Widget
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.datavisualization.SymbolPalette")
@js.native
class SymbolPalette_ protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejDotWebDotAll.ej.datavisualization.SymbolPalette.Model) = this()
  def this(element: Element, options: typings.ejDotWebDotAll.ej.datavisualization.SymbolPalette.Model) = this()
  var defaults: typings.ejDotWebDotAll.ej.datavisualization.SymbolPalette.Model = js.native
  @JSName("model")
  var model_SymbolPalette_ : typings.ejDotWebDotAll.ej.datavisualization.SymbolPalette.Model = js.native
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

