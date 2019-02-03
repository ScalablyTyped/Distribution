package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Autocomplete")
@js.native
class Autocomplete protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.AutocompleteNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.AutocompleteNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.AutocompleteNs.Model = js.native
  @JSName("model")
  var model_Autocomplete: ejDotWebDotAllLib.ejNs.AutocompleteNs.Model = js.native
  /** Clears the text in the Autocomplete textbox.
    * @returns {void}
    */
  def clearText(): scala.Unit = js.native
  /** Disables the autocomplete widget.
    * @returns {void}
    */
  def disable(): scala.Unit = js.native
  /** Enables the autocomplete widget.
    * @returns {void}
    */
  def enable(): scala.Unit = js.native
  /** Returns the current active text value in the Autocomplete suggestion list.
    * @returns {string}
    */
  def getActiveText(): java.lang.String = js.native
  /** Returns objects (data object) of all the selected items in the autocomplete textbox.
    * @returns {any}
    */
  def getSelectedItems(): js.Any = js.native
  /** Returns the current selected value from the Autocomplete textbox.
    * @returns {string}
    */
  def getValue(): java.lang.String = js.native
  /** Hides the Autocomplete suggestion list.
    * @returns {void}
    */
  def hide(): scala.Unit = js.native
  /** Open up the autocomplete suggestion popup with all list items.
    * @returns {void}
    */
  def open(): scala.Unit = js.native
  /** Search the entered text and show it in the suggestion list if available.
    * @returns {void}
    */
  def search(): scala.Unit = js.native
  /** Sets the value of the Autocomplete textbox based on the given key value.
    * @param {string} The key value of the specific suggestion item.
    * @returns {void}
    */
  def selectValueByKey(Key: java.lang.String): scala.Unit = js.native
  /** Sets the value of the Autocomplete textbox based on the given input text value.
    * @param {string} The text (label) value of the specific suggestion item.
    * @returns {void}
    */
  def selectValueByText(Text: java.lang.String): scala.Unit = js.native
}

/* static members */
@JSGlobal("ej.Autocomplete")
@js.native
object Autocomplete extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.Autocomplete = js.native
}

