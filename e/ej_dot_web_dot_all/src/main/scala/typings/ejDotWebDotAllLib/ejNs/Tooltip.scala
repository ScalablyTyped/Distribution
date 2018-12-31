package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Tooltip")
@js.native
class Tooltip protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.TooltipNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.TooltipNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.TooltipNs.Model = js.native
  @JSName("model")
  var model_Tooltip: ejDotWebDotAllLib.ejNs.TooltipNs.Model = js.native
  /** Disables the Tooltip control.
    * @returns {void}
    */
  def disable(): scala.Unit = js.native
  /** Enables the Tooltip control.
    * @returns {void}
    */
  def enable(): scala.Unit = js.native
  /** Hide the Tooltip popup.
    * @param {string}  optional Determines the type of effect that takes place when hiding the tooltip.
    * @param {() => void}  optional custom effect takes place when hiding the tooltip.
    * @returns {void}
    */
  def hide(): scala.Unit = js.native
  def hide(effect: java.lang.String): scala.Unit = js.native
  def hide(effect: java.lang.String, func: js.Function0[scala.Unit]): scala.Unit = js.native
  /** Shows the Tooltip popup for the given target element with the specified effect.
    * @param {string} optional Determines the type of effect that takes place when showing the tooltip.
    * @param {() => void} optional custom effect takes place when showing the tooltip.
    * @param {JQuery} optional Tooltip will be shown for the given element
    * @returns {void}
    */
  def show(): scala.Unit = js.native
  def show(effect: java.lang.String): scala.Unit = js.native
  def show(effect: java.lang.String, func: js.Function0[scala.Unit]): scala.Unit = js.native
  def show(effect: java.lang.String, func: js.Function0[scala.Unit], target: ejDotWebDotAllLib.JQuery): scala.Unit = js.native
}

@JSGlobal("ej.Tooltip")
@js.native
object Tooltip extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.Tooltip = js.native
}

