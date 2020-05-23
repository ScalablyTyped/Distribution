package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tile_ extends Widget_ {
  var defaults: typings.ejWebAll.ej.Tile.Model = js.native
  @JSName("model")
  var model_Tile_ : typings.ejWebAll.ej.Tile.Model = js.native
  /** Update the image template of tile item to another one.
    * @param {string} UpdateTemplate by using id
    * @param {number} index of the tile
    * @returns {void}
    */
  def updateTemplate(id: String, index: Double): Unit = js.native
}

