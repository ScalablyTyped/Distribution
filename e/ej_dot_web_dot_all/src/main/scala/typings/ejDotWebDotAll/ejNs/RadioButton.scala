package typings.ejDotWebDotAll.ejNs

import typings.ejDotWebDotAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.RadioButton")
@js.native
class RadioButton protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejDotWebDotAll.ejNs.RadioButtonNs.Model) = this()
  def this(element: Element, options: typings.ejDotWebDotAll.ejNs.RadioButtonNs.Model) = this()
  var defaults: typings.ejDotWebDotAll.ejNs.RadioButtonNs.Model = js.native
  @JSName("model")
  var model_RadioButton: typings.ejDotWebDotAll.ejNs.RadioButtonNs.Model = js.native
  /** To disable the RadioButton
    * @returns {void}
    */
  def disable(): Unit = js.native
  /** To enable the RadioButton
    * @returns {void}
    */
  def enable(): Unit = js.native
}

/* static members */
@JSGlobal("ej.RadioButton")
@js.native
object RadioButton extends js.Object {
  var Locale: js.Any = js.native
  var fn: RadioButton = js.native
}

