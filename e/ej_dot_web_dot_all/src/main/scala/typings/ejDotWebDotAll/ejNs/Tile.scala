package typings.ejDotWebDotAll.ejNs

import typings.ejDotWebDotAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Tile")
@js.native
class Tile protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejDotWebDotAll.ejNs.TileNs.Model) = this()
  def this(element: Element, options: typings.ejDotWebDotAll.ejNs.TileNs.Model) = this()
  var defaults: typings.ejDotWebDotAll.ejNs.TileNs.Model = js.native
  @JSName("model")
  var model_Tile: typings.ejDotWebDotAll.ejNs.TileNs.Model = js.native
  /** Update the image template of tile item to another one.
    * @param {string} UpdateTemplate by using id
    * @param {number} index of the tile
    * @returns {void}
    */
  def updateTemplate(id: String, index: Double): Unit = js.native
}

/* static members */
@JSGlobal("ej.Tile")
@js.native
object Tile extends js.Object {
  var Locale: js.Any = js.native
  var fn: Tile = js.native
}

