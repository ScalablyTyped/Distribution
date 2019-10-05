package typings.dojo.dojo._base.kernel

import typings.dojo.dojo.store.api.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/_base/kernel.store.html
  *
  *
  */
trait store extends js.Object {
  /**
    *
    */
  var util: js.Object
  /**
    *
    * @param masterStore
    * @param cachingStore
    * @param options
    */
  def Cache(masterStore: js.Any, cachingStore: js.Any, options: js.Any): js.Any
  /**
    *
    */
  def DataStore(): Unit
  /**
    *
    */
  def JsonRest(): Unit
  /**
    *
    */
  def Memory(): Unit
  /**
    * The Observable store wrapper takes a store and sets an observe method on query()
    * results that can be used to monitor results for changes.
    * Observable wraps an existing store so that notifications can be made when a query
    * is performed.
    *
    * @param store
    */
  def Observable(store: Store): js.Any
}

object store {
  @scala.inline
  def apply(
    Cache: (js.Any, js.Any, js.Any) => js.Any,
    DataStore: () => Unit,
    JsonRest: () => Unit,
    Memory: () => Unit,
    Observable: Store => js.Any,
    util: js.Object
  ): store = {
    val __obj = js.Dynamic.literal(Cache = js.Any.fromFunction3(Cache), DataStore = js.Any.fromFunction0(DataStore), JsonRest = js.Any.fromFunction0(JsonRest), Memory = js.Any.fromFunction0(Memory), Observable = js.Any.fromFunction1(Observable), util = util)
  
    __obj.asInstanceOf[store]
  }
}

