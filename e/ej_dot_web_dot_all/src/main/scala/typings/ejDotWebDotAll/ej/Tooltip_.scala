package typings.ejDotWebDotAll.ej

import typings.ejDotWebDotAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Tooltip")
@js.native
class Tooltip_ protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejDotWebDotAll.ej.Tooltip.Model) = this()
  def this(element: Element, options: typings.ejDotWebDotAll.ej.Tooltip.Model) = this()
  var defaults: typings.ejDotWebDotAll.ej.Tooltip.Model = js.native
  @JSName("model")
  var model_Tooltip_ : typings.ejDotWebDotAll.ej.Tooltip.Model = js.native
  /** Disables the Tooltip control.
    * @returns {void}
    */
  def disable(): Unit = js.native
  /** Enables the Tooltip control.
    * @returns {void}
    */
  def enable(): Unit = js.native
  /** Hide the Tooltip popup.
    * @param {string}  optional Determines the type of effect that takes place when hiding the tooltip.
    * @param {() => void}  optional custom effect takes place when hiding the tooltip.
    * @returns {void}
    */
  def hide(): Unit = js.native
  def hide(effect: String): Unit = js.native
  def hide(effect: String, func: js.Function0[Unit]): Unit = js.native
  /** Shows the Tooltip popup for the given target element with the specified effect.
    * @param {string} optional Determines the type of effect that takes place when showing the tooltip.
    * @param {() => void} optional custom effect takes place when showing the tooltip.
    * @param {JQuery} optional Tooltip will be shown for the given element
    * @returns {void}
    */
  def show(): Unit = js.native
  def show(effect: String): Unit = js.native
  def show(effect: String, func: js.Function0[Unit]): Unit = js.native
  def show(effect: String, func: js.Function0[Unit], target: JQuery): Unit = js.native
}

