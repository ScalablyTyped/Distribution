package typings.dojo.dijit.form

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/_AutoCompleterMixin.html
  *
  * A mixin that implements the base functionality for dijit/form/ComboBox/dijit/form/FilteringSelect
  * All widgets that mix in dijit/form/_AutoCompleterMixin must extend dijit/form/_FormValueWidget.
  * 
  */
@JSGlobal("dijit.form._AutoCompleterMixin")
@js.native
class AutoCompleterMixin () extends SearchMixin {
  /**
    * If user types in a partial string, and then tab out of the <input> box,
    * automatically copy the first entry displayed in the drop down list to
    * the <input> field
    * 
    */
  var autoComplete: Boolean = js.native
  /**
    * One of: "first", "all" or "none".
    * 
    * If the ComboBox/FilteringSelect opens with the search results and the searched
    * string can be found, it will be highlighted.  If set to "all"
    * then will probably want to change queryExpr parameter to '${0}'
    * 
    * Highlighting is only performed when labelType is "text", so as to not
    * interfere with any HTML markup an HTML label might contain.
    * 
    */
  var highlightMatch: String = js.native
  /**
    * This is the item returned by the dojo/store/api/Store implementation that
    * provides the data for this ComboBox, it's the currently selected item.
    * 
    */
  var item: js.Object = js.native
  /**
    * The entries in the drop down list come from this attribute in the
    * dojo.data items.
    * If not specified, the searchAttr attribute is used instead.
    * 
    */
  var labelAttr: js.Object = js.native
  /**
    * Specifies how to interpret the labelAttr in the data store items.
    * Can be "html" or "text".
    * 
    */
  var labelType: String = js.native
  /**
    * 
    */
  var maxHeight: Double = js.native
  /**
    * 
    */
  def closeDropDown(): Unit = js.native
  /**
    * Highlights the string entered by the user in the menu.  By default this
    * highlights the first occurrence found. Override this method
    * to implement your custom highlighting.
    * 
    * @param label             
    * @param find             
    */
  def doHighlight(label: String, find: String): js.Any = js.native
  /**
    * 
    */
  def isLoaded(): Boolean = js.native
  /**
    * 
    * @param callback             
    */
  def loadDropDown(callback: js.Function): Unit = js.native
  /**
    * Subclasses must call this method from their postCreate() methods
    * 
    */
  def postCreate(): Unit = js.native
  /**
    * 
    */
  def reset(): Unit = js.native
}

