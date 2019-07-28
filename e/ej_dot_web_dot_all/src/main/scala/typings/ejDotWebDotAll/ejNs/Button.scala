package typings.ejDotWebDotAll.ejNs

import typings.ejDotWebDotAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Button")
@js.native
class Button protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejDotWebDotAll.ejNs.ButtonNs.Model) = this()
  def this(element: Element, options: typings.ejDotWebDotAll.ejNs.ButtonNs.Model) = this()
  var defaults: typings.ejDotWebDotAll.ejNs.ButtonNs.Model = js.native
  @JSName("model")
  var model_Button: typings.ejDotWebDotAll.ejNs.ButtonNs.Model = js.native
  /** To disable the button
    * @returns {void}
    */
  def disable(): Unit = js.native
  /** To enable the button
    * @returns {void}
    */
  def enable(): Unit = js.native
}

/* static members */
@JSGlobal("ej.Button")
@js.native
object Button extends js.Object {
  var Locale: js.Any = js.native
  var fn: Button = js.native
}

