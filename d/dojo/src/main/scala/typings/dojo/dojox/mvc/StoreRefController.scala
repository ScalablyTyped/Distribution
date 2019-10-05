package typings.dojo.dojox.mvc

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_NewValueOldValue
import typings.dojo.dojo.store.api.Store.PutDirectives
import typings.dojo.dojo.store.api.Store.QueryOptions
import typings.dojo.dojoStrings.getStatefulOptions
import typings.dojo.dojoStrings.store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/StoreRefController.html
  *
  * A child class of dojox.mvc.ModelRefController, which keeps a reference to Dojo Object Store (in store property).
  * Has several methods to work with the store:
  *
  * queryStore(): Runs query() against the store, and creates a data model from retrieved data
  * getStore(): Runs get() against the store, and creates a data model from retrieved data
  * putStore(): Runs put() against the store
  * addStore(): Runs add() against the store
  * removeStore(): Runs remove() against the store
  * dojo.Stateful get()/set()/watch() interfaces in dojox.mvc.StoreRefController will work with the data model from queryStore() or getStore().
  *
  * NOTE - If this class is used with a widget by data-dojo-mixins, make sure putting the widget in data-dojo-type and putting this class to data-dojo-mixins.
  *
  */
@JSGlobal("dojox.mvc.StoreRefController")
@js.native
class StoreRefController () extends ModelRefController {
  /**
    * The options to get stateful object from plain value.
    *
    */
  var getStatefulOptions: js.Object = js.native
  /**
    * The Dojo Object Store in use.
    *
    */
  var store: js.Object = js.native
  /**
    * Creates an object, throws an error if the object already exists.
    *
    * @param object The object to store.
    * @param options               OptionalAdditional metadata for storing the data.  Includes an "id" property if a specific id is to be used.
    */
  def addStore(`object`: js.Object, options: PutDirectives): js.Any = js.native
  /**
    * Retrieves an object by its identity.
    *
    * @param id The identity to use to lookup the object.
    * @param options The options for dojo/store.*.get().
    */
  def getStore(id: Double, options: js.Object): js.Any = js.native
  @JSName("get")
  def get_getStatefulOptions(property: getStatefulOptions): js.Object = js.native
  @JSName("get")
  def get_store(property: store): js.Object = js.native
  /**
    * Stores an object.
    *
    * @param object The object to store.
    * @param options               OptionalAdditional metadata for storing the data.  Includes an "id" property if a specific id is to be used.
    */
  def putStore(`object`: js.Object, options: PutDirectives): js.Any = js.native
  /**
    * Queries the store for objects.
    *
    * @param query The query to use for retrieving objects from the store.
    * @param options               OptionalThe optional arguments to apply to the resultset.
    */
  def queryStore(query: js.Object, options: QueryOptions): js.Any = js.native
  /**
    * Deletes an object by its identity
    *
    * @param id The identity to use to delete the object
    * @param options The options for dojo/store//.remove().
    */
  def removeStore(id: Double, options: js.Object): js.Any = js.native
  @JSName("set")
  def set_getStatefulOptions(property: getStatefulOptions, value: js.Object): Unit = js.native
  @JSName("set")
  def set_store(property: store, value: js.Object): Unit = js.native
  @JSName("watch")
  def watch_getStatefulOptions(property: getStatefulOptions, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_store(property: store, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
}

