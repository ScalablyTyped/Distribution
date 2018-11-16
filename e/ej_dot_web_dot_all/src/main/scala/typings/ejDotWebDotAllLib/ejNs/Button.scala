package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Button")
@js.native
class Button protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.ButtonNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.ButtonNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.ButtonNs.Model = js.native
  @JSName("model")
  var model_Button: ejDotWebDotAllLib.ejNs.ButtonNs.Model = js.native
  /** To disable the button
           * @returns {void}
           */
  def disable(): scala.Unit = js.native
  /** To enable the button
           * @returns {void}
           */
  def enable(): scala.Unit = js.native
}

@JSGlobal("ej.Button")
@js.native
object Button extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.Button = js.native
}

