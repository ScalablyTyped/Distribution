package typings.ejWebAll.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.CheckBox")
@js.native
class CheckBox_ protected () extends Widget_ {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.CheckBox.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.CheckBox.Model) = this()
  var defaults: typings.ejWebAll.ej.CheckBox.Model = js.native
  @JSName("model")
  var model_CheckBox_ : typings.ejWebAll.ej.CheckBox.Model = js.native
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

