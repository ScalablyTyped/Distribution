package typings.dojo.dijit.form

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_NewValue
import typings.dojo.Fn_NewValueOldValue
import typings.dojo.Fn_NewValueOldValueProperty
import typings.dojo.Fn_NewValueOldValuePropertyFunction
import typings.dojo.dijit.form._FormSelectWidget.__SelectOption
import typings.dojo.dojo.store.api.Store
import typings.dojo.dojoStrings.labelAttr
import typings.dojo.dojoStrings.loadChildrenOnOpen
import typings.dojo.dojoStrings.multiple
import typings.dojo.dojoStrings.onFetch
import typings.dojo.dojoStrings.onLoadDeferred
import typings.dojo.dojoStrings.options
import typings.dojo.dojoStrings.query
import typings.dojo.dojoStrings.queryOptions
import typings.dojo.dojoStrings.sortByLabel
import typings.dojo.dojoStrings.store
import typings.dojo.dojoStrings.value
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/_FormSelectWidget.html
  *
  * Extends _FormValueWidget in order to provide "select-specific"
  * values - i.e., those values that are unique to <select> elements.
  * This also provides the mechanism for reading the elements from
  * a store, if desired.
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified, replace srcNodeRef with my generated DOM tree     
  */
@JSGlobal("dijit.form._FormSelectWidget")
@js.native
class _FormSelectWidget_ () extends _FormValueWidget {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * The entries in the drop down list come from this attribute in the dojo.store items.
    * If store is set, labelAttr must be set too, unless store is an old-style
    * dojo.data store rather than a new dojo/store.
    * 
    */
  var labelAttr: js.Object = js.native
  /**
    * By default loadChildren is called when the items are fetched from the
    * store.  This property allows delaying loadChildren (and the creation
    * of the options/menuitems) until the user clicks the button to open the
    * dropdown.
    * 
    */
  var loadChildrenOnOpen: Boolean = js.native
  /**
    * Whether or not we are multi-valued
    * 
    */
  var multiple: Boolean = js.native
  /**
    * A callback to do with an onFetch - but before any items are actually
    * iterated over (i.e. to filter even further what you want to add)
    * 
    */
  var onFetch: js.Function = js.native
  /**
    * This is the dojo.Deferred returned by setStore().
    * Calling onLoadDeferred.then() registers your
    * callback to be called only once, when the prior setStore completes.
    * 
    */
  var onLoadDeferred: js.Object = js.native
  /**
    * The set of options for our select item.  Roughly corresponds to
    * the html <option> tag.
    * 
    */
  var options: js.Object = js.native
  /**
    * A query to use when fetching items from our store
    * 
    */
  var query: js.Object = js.native
  /**
    * Query options to use when fetching from the store
    * 
    */
  var queryOptions: js.Object = js.native
  /**
    * Flag to sort the options returned from a store by the label of
    * the store.
    * 
    */
  var sortByLabel: Boolean = js.native
  /**
    * A store to use for getting our list of options - rather than reading them
    * from the <option> html tags.   Should support getIdentity().
    * For back-compat store can also be a dojo/data/api/Identity.
    * 
    */
  var store: js.Object = js.native
  /**
    * Corresponds to the native HTML <input> element's attribute.
    * 
    */
  @JSName("value")
  var value__FormSelectWidget_ : String = js.native
  /**
    * Adds an option or options to the end of the select.  If value
    * of the option is empty or missing, a separator is created instead.
    * Passing in an array of options will yield slightly better performance
    * since the children are only loaded once.
    * 
    * @param option             
    */
  def addOption(option: js.Array[__SelectOption]): Unit = js.native
  /**
    * Adds an option or options to the end of the select.  If value
    * of the option is empty or missing, a separator is created instead.
    * Passing in an array of options will yield slightly better performance
    * since the children are only loaded once.
    * 
    * @param option             
    */
  def addOption(option: __SelectOption): Unit = js.native
  /**
    * Returns a given option (or options).
    * 
    * @param valueOrIdx If passed in as a string, that string is used to look up the optionin the array of options - based on the value property.(See dijit/form/_FormSelectWidget.__SelectOption).If passed in a number, then the option with the given index (0-based)within this select will be returned.If passed in a dijit/form/_FormSelectWidget.__SelectOption, the same option will bereturned if and only if it exists within this select.If passed an array, then an array will be returned with each elementin the array being looked up.If not passed a value, then all options will be returned             
    */
  def getOptions(valueOrIdx: js.Any): js.Any = js.native
  @JSName("get")
  def get_labelAttr(property: labelAttr): js.Object = js.native
  @JSName("get")
  def get_loadChildrenOnOpen(property: loadChildrenOnOpen): Boolean = js.native
  @JSName("get")
  def get_multiple(property: multiple): Boolean = js.native
  @JSName("get")
  def get_onFetch(property: onFetch): js.Function = js.native
  @JSName("get")
  def get_onLoadDeferred(property: onLoadDeferred): js.Object = js.native
  @JSName("get")
  def get_options(property: options): js.Object = js.native
  @JSName("get")
  def get_query(property: query): js.Object = js.native
  @JSName("get")
  def get_queryOptions(property: queryOptions): js.Object = js.native
  @JSName("get")
  def get_sortByLabel(property: sortByLabel): Boolean = js.native
  @JSName("get")
  def get_store(property: store): js.Object = js.native
  /**
    * a function that can be connected to in order to receive a
    * notification that the store has finished loading and all options
    * from that store are available
    * 
    */
  def onSetStore(): Unit = js.native
  /**
    * Removes the given option or options.  You can remove by string
    * (in which case the value is removed), number (in which case the
    * index in the options array is removed), or select option (in
    * which case, the select option with a matching value is removed).
    * You can also pass in an array of those values for a slightly
    * better performance since the children are only loaded once.
    * For numeric option values, specify {value: number} as the argument.
    * 
    * @param valueOrIdx             
    */
  def removeOption(valueOrIdx: String): Unit = js.native
  /**
    * Removes the given option or options.  You can remove by string
    * (in which case the value is removed), number (in which case the
    * index in the options array is removed), or select option (in
    * which case, the select option with a matching value is removed).
    * You can also pass in an array of those values for a slightly
    * better performance since the children are only loaded once.
    * For numeric option values, specify {value: number} as the argument.
    * 
    * @param valueOrIdx             
    */
  def removeOption(valueOrIdx: js.Array[_]): Unit = js.native
  /**
    * Removes the given option or options.  You can remove by string
    * (in which case the value is removed), number (in which case the
    * index in the options array is removed), or select option (in
    * which case, the select option with a matching value is removed).
    * You can also pass in an array of those values for a slightly
    * better performance since the children are only loaded once.
    * For numeric option values, specify {value: number} as the argument.
    * 
    * @param valueOrIdx             
    */
  def removeOption(valueOrIdx: Double): Unit = js.native
  /**
    * Removes the given option or options.  You can remove by string
    * (in which case the value is removed), number (in which case the
    * index in the options array is removed), or select option (in
    * which case, the select option with a matching value is removed).
    * You can also pass in an array of those values for a slightly
    * better performance since the children are only loaded once.
    * For numeric option values, specify {value: number} as the argument.
    * 
    * @param valueOrIdx             
    */
  def removeOption(valueOrIdx: __SelectOption): Unit = js.native
  /**
    * Sets the store you would like to use with this select widget.
    * The selected value is the value of the new store to set.  This
    * function returns the original store, in case you want to reuse
    * it or something.
    * 
    * @param store The dojo.store you would like to use - it MUST implement getIdentity()and MAY implement observe().For backwards-compatibility this can also be a data.data store, in which caseit MUST implement dojo/data/api/Identity,and MAY implement dojo/data/api/Notification.             
    * @param selectedValue               OptionalThe value that this widget should set itself to after the storehas been loaded             
    * @param fetchArgs               OptionalHash of parameters to set filter on store, etc.query: new value for Select.query,queryOptions: new value for Select.queryOptions,onFetch: callback function for each item in data (Deprecated)             
    */
  def setStore(store: Store, selectedValue: js.Any, fetchArgs: js.Object): js.Any = js.native
  @JSName("set")
  def set_labelAttr(property: labelAttr, value: js.Object): Unit = js.native
  @JSName("set")
  def set_loadChildrenOnOpen(property: loadChildrenOnOpen, value: Boolean): Unit = js.native
  @JSName("set")
  def set_multiple(property: multiple, value: Boolean): Unit = js.native
  @JSName("set")
  def set_onFetch(property: onFetch, value: js.Function): Unit = js.native
  @JSName("set")
  def set_onLoadDeferred(property: onLoadDeferred, value: js.Object): Unit = js.native
  @JSName("set")
  def set_options(property: options, value: js.Object): Unit = js.native
  @JSName("set")
  def set_query(property: query, value: js.Object): Unit = js.native
  @JSName("set")
  def set_queryOptions(property: queryOptions, value: js.Object): Unit = js.native
  @JSName("set")
  def set_sortByLabel(property: sortByLabel, value: Boolean): Unit = js.native
  @JSName("set")
  def set_store(property: store, value: js.Object): Unit = js.native
  @JSName("set")
  def set_value(property: value, value: String): Unit = js.native
  /**
    * Updates the values of the given option.  The option to update
    * is matched based on the value of the entered option.  Passing
    * in an array of new options will yield better performance since
    * the children will only be loaded once.
    * 
    * @param newOption             
    */
  def updateOption(newOption: js.Array[__SelectOption]): Unit = js.native
  /**
    * Updates the values of the given option.  The option to update
    * is matched based on the value of the entered option.  Passing
    * in an array of new options will yield better performance since
    * the children will only be loaded once.
    * 
    * @param newOption             
    */
  def updateOption(newOption: __SelectOption): Unit = js.native
  @JSName("watch")
  def watch_labelAttr(property: labelAttr, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_loadChildrenOnOpen(property: loadChildrenOnOpen, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_multiple(property: multiple, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_onFetch(property: onFetch, callback: Fn_NewValueOldValuePropertyFunction): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_onLoadDeferred(property: onLoadDeferred, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_options(property: options, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_query(property: query, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_queryOptions(property: queryOptions, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_sortByLabel(property: sortByLabel, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_store(property: store, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_value(property: value, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
}

