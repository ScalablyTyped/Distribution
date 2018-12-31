package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.RadioButton")
@js.native
class RadioButton protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.RadioButtonNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.RadioButtonNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.RadioButtonNs.Model = js.native
  @JSName("model")
  var model_RadioButton: ejDotWebDotAllLib.ejNs.RadioButtonNs.Model = js.native
  /** To disable the RadioButton
    * @returns {void}
    */
  def disable(): scala.Unit = js.native
  /** To enable the RadioButton
    * @returns {void}
    */
  def enable(): scala.Unit = js.native
}

@JSGlobal("ej.RadioButton")
@js.native
object RadioButton extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.RadioButton = js.native
}

