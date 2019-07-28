package typings.ejDotWebDotAll.ejNs

import typings.ejDotWebDotAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Autocomplete")
@js.native
class Autocomplete protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejDotWebDotAll.ejNs.AutocompleteNs.Model) = this()
  def this(element: Element, options: typings.ejDotWebDotAll.ejNs.AutocompleteNs.Model) = this()
  var defaults: typings.ejDotWebDotAll.ejNs.AutocompleteNs.Model = js.native
  @JSName("model")
  var model_Autocomplete: typings.ejDotWebDotAll.ejNs.AutocompleteNs.Model = js.native
  /** Clears the text in the Autocomplete textbox.
    * @returns {void}
    */
  def clearText(): Unit = js.native
  /** Disables the autocomplete widget.
    * @returns {void}
    */
  def disable(): Unit = js.native
  /** Enables the autocomplete widget.
    * @returns {void}
    */
  def enable(): Unit = js.native
  /** Returns the current active text value in the Autocomplete suggestion list.
    * @returns {string}
    */
  def getActiveText(): String = js.native
  /** Returns objects (data object) of all the selected items in the autocomplete textbox.
    * @returns {any}
    */
  def getSelectedItems(): js.Any = js.native
  /** Returns the current selected value from the Autocomplete textbox.
    * @returns {string}
    */
  def getValue(): String = js.native
  /** Hides the Autocomplete suggestion list.
    * @returns {void}
    */
  def hide(): Unit = js.native
  /** Open up the autocomplete suggestion popup with all list items.
    * @returns {void}
    */
  def open(): Unit = js.native
  /** Search the entered text and show it in the suggestion list if available.
    * @returns {void}
    */
  def search(): Unit = js.native
  /** Sets the value of the Autocomplete textbox based on the given key value.
    * @param {string} The key value of the specific suggestion item.
    * @returns {void}
    */
  def selectValueByKey(Key: String): Unit = js.native
  /** Sets the value of the Autocomplete textbox based on the given input text value.
    * @param {string} The text (label) value of the specific suggestion item.
    * @returns {void}
    */
  def selectValueByText(Text: String): Unit = js.native
}

/* static members */
@JSGlobal("ej.Autocomplete")
@js.native
object Autocomplete extends js.Object {
  var Locale: js.Any = js.native
  var fn: Autocomplete = js.native
}

