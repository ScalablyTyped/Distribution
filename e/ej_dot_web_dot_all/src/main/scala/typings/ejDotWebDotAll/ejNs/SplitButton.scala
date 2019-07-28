package typings.ejDotWebDotAll.ejNs

import typings.ejDotWebDotAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.SplitButton")
@js.native
class SplitButton protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejDotWebDotAll.ejNs.SplitButtonNs.Model) = this()
  def this(element: Element, options: typings.ejDotWebDotAll.ejNs.SplitButtonNs.Model) = this()
  var defaults: typings.ejDotWebDotAll.ejNs.SplitButtonNs.Model = js.native
  @JSName("model")
  var model_SplitButton: typings.ejDotWebDotAll.ejNs.SplitButtonNs.Model = js.native
  /** To disable the split button
    * @returns {void}
    */
  def disable(): Unit = js.native
  /** To Enable the split button
    * @returns {void}
    */
  def enable(): Unit = js.native
  /** To hide the list content of the split button.
    * @returns {void}
    */
  def hide(): Unit = js.native
  /** To show the list content of the split button.
    * @returns {void}
    */
  def show(): Unit = js.native
}

/* static members */
@JSGlobal("ej.SplitButton")
@js.native
object SplitButton extends js.Object {
  var Locale: js.Any = js.native
  var fn: SplitButton = js.native
}

