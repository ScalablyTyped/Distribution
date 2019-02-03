package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.CheckBox")
@js.native
class CheckBox protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.CheckBoxNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.CheckBoxNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.CheckBoxNs.Model = js.native
  @JSName("model")
  var model_CheckBox: ejDotWebDotAllLib.ejNs.CheckBoxNs.Model = js.native
  /** Disable the CheckBox to prevent all user interactions.
    * @returns {void}
    */
  def disable(): scala.Unit = js.native
  /** To enable the CheckBox
    * @returns {void}
    */
  def enable(): scala.Unit = js.native
  /** To Check the status of CheckBox
    * @returns {boolean}
    */
  def isChecked(): scala.Boolean = js.native
}

/* static members */
@JSGlobal("ej.CheckBox")
@js.native
object CheckBox extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.CheckBox = js.native
}

