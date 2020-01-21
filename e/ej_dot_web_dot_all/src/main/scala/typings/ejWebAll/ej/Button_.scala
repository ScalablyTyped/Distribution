package typings.ejWebAll.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Button")
@js.native
class Button_ protected () extends Widget_ {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Button.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Button.Model) = this()
  var defaults: typings.ejWebAll.ej.Button.Model = js.native
  @JSName("model")
  var model_Button_ : typings.ejWebAll.ej.Button.Model = js.native
  /** To disable the button
    * @returns {void}
    */
  def disable(): Unit = js.native
  /** To enable the button
    * @returns {void}
    */
  def enable(): Unit = js.native
}

