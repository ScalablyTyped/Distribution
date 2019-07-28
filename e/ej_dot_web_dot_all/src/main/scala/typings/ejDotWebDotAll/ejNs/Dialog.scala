package typings.ejDotWebDotAll.ejNs

import typings.ejDotWebDotAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Dialog")
@js.native
class Dialog protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejDotWebDotAll.ejNs.DialogNs.Model) = this()
  def this(element: Element, options: typings.ejDotWebDotAll.ejNs.DialogNs.Model) = this()
  var defaults: typings.ejDotWebDotAll.ejNs.DialogNs.Model = js.native
  @JSName("model")
  var model_Dialog: typings.ejDotWebDotAll.ejNs.DialogNs.Model = js.native
  /** Closes the dialog widget dynamically.
    * @returns {any}
    */
  def close(): js.Any = js.native
  /** Collapses the content area when it is expanded.
    * @returns {any}
    */
  def collapse(): js.Any = js.native
  /** Expands the content area when it is collapsed.
    * @returns {any}
    */
  def expand(): js.Any = js.native
  /** Sets the focus on the Dialog widget.
    * @returns {any}
    */
  def focus(): js.Any = js.native
  /** Checks whether the Dialog widget is opened or not. This methods returns Boolean value.
    * @returns {boolean}
    */
  def isOpen(): Boolean = js.native
  /** Maximizes the Dialog widget.
    * @returns {any}
    */
  def maximize(): js.Any = js.native
  /** Minimizes the Dialog widget.
    * @returns {any}
    */
  def minimize(): js.Any = js.native
  /** Opens the Dialog widget.
    * @returns {any}
    */
  def open(): js.Any = js.native
  /** Pins the dialog in its current position.
    * @returns {any}
    */
  def pin(): js.Any = js.native
  /** Refreshes the dialog content dynamically.
    * @returns {void}
    */
  def refresh(): Unit = js.native
  /** Restores the dialog.
    * @returns {any}
    */
  def restore(): js.Any = js.native
  /** Sets the content for the Dialog widget dynamically.
    * @param {string} The content for the dialog widget. It accepts both string and HTML string.
    * @returns {any}
    */
  def setContent(content: String): js.Any = js.native
  /** Sets the title for the Dialog widget.
    * @param {string} The title for the dialog widget.
    * @returns {any}
    */
  def setTitle(Title: String): js.Any = js.native
  /** Unpins the Dialog widget.
    * @returns {any}
    */
  def unpin(): js.Any = js.native
}

/* static members */
@JSGlobal("ej.Dialog")
@js.native
object Dialog extends js.Object {
  var Locale: js.Any = js.native
  var fn: Dialog = js.native
}

