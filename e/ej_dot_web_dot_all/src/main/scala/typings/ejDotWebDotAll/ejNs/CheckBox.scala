package typings.ejDotWebDotAll.ejNs

import typings.ejDotWebDotAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.CheckBox")
@js.native
class CheckBox protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejDotWebDotAll.ejNs.CheckBoxNs.Model) = this()
  def this(element: Element, options: typings.ejDotWebDotAll.ejNs.CheckBoxNs.Model) = this()
  var defaults: typings.ejDotWebDotAll.ejNs.CheckBoxNs.Model = js.native
  @JSName("model")
  var model_CheckBox: typings.ejDotWebDotAll.ejNs.CheckBoxNs.Model = js.native
  /** Disable the CheckBox to prevent all user interactions.
    * @returns {void}
    */
  def disable(): Unit = js.native
  /** To enable the CheckBox
    * @returns {void}
    */
  def enable(): Unit = js.native
  /** To Check the status of CheckBox
    * @returns {boolean}
    */
  def isChecked(): Boolean = js.native
}

/* static members */
@JSGlobal("ej.CheckBox")
@js.native
object CheckBox extends js.Object {
  var Locale: js.Any = js.native
  var fn: CheckBox = js.native
}

