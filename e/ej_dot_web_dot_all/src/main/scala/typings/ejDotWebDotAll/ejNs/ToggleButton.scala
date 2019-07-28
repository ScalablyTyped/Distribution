package typings.ejDotWebDotAll.ejNs

import typings.ejDotWebDotAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.ToggleButton")
@js.native
class ToggleButton protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejDotWebDotAll.ejNs.ToggleButtonNs.Model) = this()
  def this(element: Element, options: typings.ejDotWebDotAll.ejNs.ToggleButtonNs.Model) = this()
  var defaults: typings.ejDotWebDotAll.ejNs.ToggleButtonNs.Model = js.native
  @JSName("model")
  var model_ToggleButton: typings.ejDotWebDotAll.ejNs.ToggleButtonNs.Model = js.native
  /** To disable the ToggleButton to prevent all user interactions.
    * @returns {void}
    */
  def disable(): Unit = js.native
  /** To enable the ToggleButton.
    * @returns {void}
    */
  def enable(): Unit = js.native
}

/* static members */
@JSGlobal("ej.ToggleButton")
@js.native
object ToggleButton extends js.Object {
  var Locale: js.Any = js.native
  var fn: ToggleButton = js.native
}

