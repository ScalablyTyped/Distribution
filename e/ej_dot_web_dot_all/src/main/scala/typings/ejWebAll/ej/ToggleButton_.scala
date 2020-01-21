package typings.ejWebAll.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.ToggleButton")
@js.native
class ToggleButton_ protected () extends Widget_ {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.ToggleButton.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.ToggleButton.Model) = this()
  var defaults: typings.ejWebAll.ej.ToggleButton.Model = js.native
  @JSName("model")
  var model_ToggleButton_ : typings.ejWebAll.ej.ToggleButton.Model = js.native
  /** To disable the ToggleButton to prevent all user interactions.
    * @returns {void}
    */
  def disable(): Unit = js.native
  /** To enable the ToggleButton.
    * @returns {void}
    */
  def enable(): Unit = js.native
}

