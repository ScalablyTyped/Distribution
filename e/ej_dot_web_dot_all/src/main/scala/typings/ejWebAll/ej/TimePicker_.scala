package typings.ejWebAll.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.TimePicker")
@js.native
class TimePicker_ protected () extends Widget_ {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.TimePicker.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.TimePicker.Model) = this()
  var defaults: typings.ejWebAll.ej.TimePicker.Model = js.native
  @JSName("model")
  var model_TimePicker_ : typings.ejWebAll.ej.TimePicker.Model = js.native
  /** Allows you to disable the TimePicker.
    * @returns {void}
    */
  def disable(): Unit = js.native
  /** Allows you to enable the TimePicker.
    * @returns {void}
    */
  def enable(): Unit = js.native
  /** It returns the current time value.
    * @returns {string}
    */
  def getValue(): String = js.native
  /** This method will hide the TimePicker control popup.
    * @returns {void}
    */
  def hide(): Unit = js.native
  /** Updates the current system time in TimePicker.
    * @returns {void}
    */
  def setCurrentTime(): Unit = js.native
  /** This method will show the TimePicker control popup.
    * @returns {void}
    */
  def show(): Unit = js.native
}

