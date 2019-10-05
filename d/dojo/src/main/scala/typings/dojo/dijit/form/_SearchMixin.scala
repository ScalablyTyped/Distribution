package typings.dojo.dijit.form

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/_SearchMixin.html
  *
  * A mixin that implements the base functionality to search a store based upon user-entered text such as
  * with dijit/form/ComboBox or dijit/form/FilteringSelect
  * 
  */
@JSGlobal("dijit.form._SearchMixin")
@js.native
class _SearchMixin () extends js.Object {
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
    * Set true if the query should ignore case when matching possible items
    * 
    */
  var ignoreCase: Boolean = js.native
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
    * The store must accept an object hash of properties for its query. See query and queryExpr for details.
    * 
    */
  var store: js.Object = js.native
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
}

