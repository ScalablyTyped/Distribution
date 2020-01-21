package typings.dojo.dojox.mobile

import typings.dojo.dojo.data.api.Read
import typings.dojo.dojo.data.api.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/_DataMixin.html
  *
  * Mixin for widgets to enable dojo/data data store.
  * By mixing this class into a widget, it can get data through a
  * dojo/data data store. The widget must implement
  * onComplete(/Array/items) to handle the retrieved data.
  *
  */
@JSGlobal("dojox.mobile._DataMixin")
@js.native
class DataMixin () extends js.Object {
  /**
    * A query that can be passed to 'store' to initially filter the items.
    *
    */
  var query: js.Object = js.native
  /**
    * An optional parameter for the query.
    *
    */
  var queryOptions: js.Object = js.native
  /**
    * Reference to data provider object used by this widget.
    *
    */
  var store: js.Object = js.native
  /**
    * Fetches the data and generates the list items.
    *
    */
  def refresh(): js.Any = js.native
  /**
    * Sets a query.
    *
    * @param query
    * @param queryOptions               Optional
    */
  def setQuery(query: js.Object, queryOptions: js.Object): js.Any = js.native
  /**
    * Sets a query.
    *
    * @param query
    * @param queryOptions               Optional
    */
  def setQuery(query: Request, queryOptions: js.Object): js.Any = js.native
  /**
    * Sets the store to use with this widget.
    *
    * @param store
    * @param query
    * @param queryOptions               Optional
    */
  def setStore(store: Read, query: js.Object, queryOptions: js.Object): js.Any = js.native
  /**
    * Sets the store to use with this widget.
    *
    * @param store
    * @param query
    * @param queryOptions               Optional
    */
  def setStore(store: Read, query: Request, queryOptions: js.Object): js.Any = js.native
}

