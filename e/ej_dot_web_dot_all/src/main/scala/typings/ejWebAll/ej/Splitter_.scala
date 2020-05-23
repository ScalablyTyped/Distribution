package typings.ejWebAll.ej

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Splitter_ extends Widget_ {
  var defaults: typings.ejWebAll.ej.Splitter.Model = js.native
  @JSName("model")
  var model_Splitter_ : typings.ejWebAll.ej.Splitter.Model = js.native
  /** To add a new pane to splitter control.
    * @param {string} content of pane.
    * @param {any} pane properties.
    * @param {number} index of pane.
    * @returns {HTMLElement}
    */
  def addItem(content: String, property: js.Any, index: Double): HTMLElement = js.native
  /** To collapse the splitter control pane.
    * @param {number} index number of pane.
    * @returns {void}
    */
  def collapse(paneIndex: Double): Unit = js.native
  /** To expand the splitter control pane.
    * @param {number} index number of pane.
    * @returns {void}
    */
  def expand(paneIndex: Double): Unit = js.native
  /** To refresh the splitter control pane resizing.
    * @returns {void}
    */
  def refresh(): Unit = js.native
  /** To remove a specified pane from the splitter control.
    * @param {number} index of pane.
    * @returns {void}
    */
  def removeItem(index: Double): Unit = js.native
}

