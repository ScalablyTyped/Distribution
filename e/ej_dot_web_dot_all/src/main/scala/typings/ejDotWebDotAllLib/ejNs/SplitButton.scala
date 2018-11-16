package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.SplitButton")
@js.native
class SplitButton protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.SplitButtonNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.SplitButtonNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.SplitButtonNs.Model = js.native
  @JSName("model")
  var model_SplitButton: ejDotWebDotAllLib.ejNs.SplitButtonNs.Model = js.native
  /** To disable the split button
           * @returns {void}
           */
  def disable(): scala.Unit = js.native
  /** To Enable the split button
           * @returns {void}
           */
  def enable(): scala.Unit = js.native
  /** To hide the list content of the split button.
           * @returns {void}
           */
  def hide(): scala.Unit = js.native
  /** To show the list content of the split button.
           * @returns {void}
           */
  def show(): scala.Unit = js.native
}

@JSGlobal("ej.SplitButton")
@js.native
object SplitButton extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.SplitButton = js.native
}

