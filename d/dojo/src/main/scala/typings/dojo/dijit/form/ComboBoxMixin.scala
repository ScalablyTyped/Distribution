package typings.dojo.dijit.form

import typings.dojo.dijit.HasDropDown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/ComboBoxMixin.html
  *
  * Provides main functionality of ComboBox widget
  * 
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit.form.SearchMixin because Inheritance from two classes. Inlined 
- typings.dojo.dijit.form.AutoCompleterMixin because Inheritance from two classes. Inlined autoComplete, fetchProperties, highlightMatch, ignoreCase, item, labelAttr, labelType, pageSize, query, queryExpr, searchAttr, searchDelay, store, closeDropDown, doHighlight, isLoaded, loadDropDown, postCreate, postMixInProperties, reset, onSearch */ @JSGlobal("dijit.form.ComboBoxMixin")
@js.native
class ComboBoxMixin () extends HasDropDown {
  /**
    * If user types in a partial string, and then tab out of the <input> box,
    * automatically copy the first entry displayed in the drop down list to
    * the <input> field
    * 
    */
  var autoComplete: Boolean = js.native
  /**
    * 
    */
  var baseClass: String = js.native
  /**
    * 
    */
  var cssStateNodes: js.Object = js.native
  /**
    * Mixin to the store's fetch.
    * For example, to set the sort order of the ComboBox menu, pass:
    * 
    * { sort: [{attribute:"name",descending: true}] }
    * To override the default queryOptions so that deep=false, do:
    * 
    * { queryOptions: {ignoreCase: true, deep: false} }
    * 
    */
  var fetchProperties: js.Object = js.native
  /**
    * Set this textbox to have a down arrow button, to display the drop down list.
    * Defaults to true.
    * 
    */
  var hasDownArrow: Boolean = js.native
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
    * Set true if the query should ignore case when matching possible items
    * 
    */
  var ignoreCase: Boolean = js.native
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
    * Argument to data provider.
    * Specifies maximum number of search results to return per query
    * 
    */
  var pageSize: Double = js.native
  /**
    * A query that can be passed to store to initially filter the items.
    * ComboBox overwrites any reference to the searchAttr and sets it to the queryExpr with the user's input substituted.
    * 
    */
  var query: js.Object = js.native
  /**
    * This specifies what query is sent to the data store,
    * based on what the user has typed.  Changing this expression will modify
    * whether the results are only exact matches, a "starting with" match,
    * etc.
    * ${0} will be substituted for the user text.
    * * is used for wildcards.
    * ${0}* means "starts with", *${0}* means "contains", ${0} means "is"
    * 
    */
  var queryExpr: String = js.native
  /**
    * Search for items in the data store where this attribute (in the item)
    * matches what the user typed
    * 
    */
  var searchAttr: String = js.native
  /**
    * Delay in milliseconds between when user types something and we start
    * searching based on that value
    * 
    */
  var searchDelay: Double = js.native
  /**
    * Reference to data provider object used by this ComboBox.
    * 
    * Should be dojo/store/api/Store, but dojo/data/api/Read supported
    * for backwards compatibility.
    * 
    */
  var store: js.Object = js.native
  /**
    * 
    */
  var templateString: String = js.native
  /**
    * Closes the drop down on this widget
    * 
    * @param focus If true, refocuses the button widget             
    */
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
    * Dropdown widget class used to select a date/time.
    * Subclasses should specify this.
    * 
    */
  def dropDownClass(): Unit = js.native
  /**
    * Callback when a search completes.
    * 
    * @param results An array of items from the originating _SearchMixin's store.             
    * @param query A copy of the originating _SearchMixin's query property.             
    * @param options The additional parameters sent to the originating _SearchMixin's store, including: start, count, queryOptions.             
    */
  def onSearch(results: js.Object, query: js.Object, options: js.Object): Unit = js.native
  /**
    * 
    */
  def postMixInProperties(): Unit = js.native
  /**
    * 
    */
  def reset(): Unit = js.native
}

