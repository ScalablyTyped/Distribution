package typings.ejWebAll.ej.datavisualization

import typings.ejWebAll.ej.Widget_
import typings.ejWebAll.ej.datavisualization.SymbolPalette.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SymbolPalette_ extends Widget_ {
  
  /** Add items to Palettes at runtime
    * @param {string} name of the Palette
    * @param {any} JSON for the new items to added in Palette
    * @returns {void}
    */
  def addPaletteItem(paletteName: String, node: js.Any): Unit = js.native
  
  var defaults: Model = js.native
  
  @JSName("model")
  var model_SymbolPalette_ : Model = js.native
  
  /** Remove items to Palettes at runtime
    * @param {string} name of the Palette
    * @param {any} JSON for the new node to removed in Palette
    * @returns {void}
    */
  def removePaletteItem(paletteName: String, node: js.Any): Unit = js.native
}
