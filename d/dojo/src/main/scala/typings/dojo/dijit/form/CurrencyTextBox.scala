package typings.dojo.dijit.form

import typings.dojo.AnonUnwatch
import typings.dojo.dojoStrings.currency
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/CurrencyTextBox.html
  *
  * A validating currency textbox
  * CurrencyTextBox is similar to dijit/form/NumberTextBox but has a few
  * extra features related to currency:
  * 
  * After specifying the currency type (american dollars, euros, etc.) it automatically
  *  sets parse/format options such as how many decimal places to show.
  * The currency mark (dollar sign, euro mark, etc.) is displayed when the field is blurred
  *  but erased during editing, so that the user can just enter a plain number.
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified, replace srcNodeRef with my generated DOM tree.     
  */
@JSGlobal("dijit.form.CurrencyTextBox")
@js.native
class CurrencyTextBox () extends NumberTextBox {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * the ISO4217 currency code, a three letter sequence like "USD"
    * 
    */
  var currency: String = js.native
  @JSName("get")
  def get_currency(property: currency): String = js.native
  /**
    * 
    * @param isFocused             
    */
  @JSName("isValid")
  def isValid_MCurrencyTextBox(isFocused: Boolean): Boolean = js.native
  @JSName("set")
  def set_currency(property: currency, value: String): Unit = js.native
  @JSName("watch")
  def watch_currency(
    property: currency,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

