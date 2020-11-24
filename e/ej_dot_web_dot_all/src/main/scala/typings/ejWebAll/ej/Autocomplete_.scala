package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Autocomplete_ extends Widget_ {
  
  /** Clears the text in the Autocomplete textbox.
    * @returns {void}
    */
  def clearText(): Unit = js.native
  
  var defaults: typings.ejWebAll.ej.Autocomplete.Model = js.native
  
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
  
  @JSName("model")
  var model_Autocomplete_ : typings.ejWebAll.ej.Autocomplete.Model = js.native
  
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
