package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.ToggleButton")
@js.native
class ToggleButton protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.ToggleButtonNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.ToggleButtonNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.ToggleButtonNs.Model = js.native
  @JSName("model")
  var model_ToggleButton: ejDotWebDotAllLib.ejNs.ToggleButtonNs.Model = js.native
  /** To disable the ToggleButton to prevent all user interactions.
    * @returns {void}
    */
  def disable(): scala.Unit = js.native
  /** To enable the ToggleButton.
    * @returns {void}
    */
  def enable(): scala.Unit = js.native
}

@JSGlobal("ej.ToggleButton")
@js.native
object ToggleButton extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.ToggleButton = js.native
}

