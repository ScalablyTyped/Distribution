package typings
package extjsLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(extjsLib.ExtNs.utilNs.ISortable because Would inherit conflicting mutable fields List(statics, uses, mixins, config, extend, inheritableStatics, alias, alternateClassName, requires, singleton, callSuper, self, getInitialConfig, callParent, callOverridden, initConfig))*/

trait IAbstractStore
  extends extjsLib.ExtNs.utilNs.IObservable {
  /** [Config Option] (Boolean/Object) */
  var autoLoad: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var autoSync: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var batchUpdateMode: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (String) */
  var defaultProxyType: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Object[]) */
  var fields: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
  /** [Config Option] (Boolean) */
  var filterOnLoad: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Object[]/Function[]) */
  var filters: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns a comparator function which compares two items and returns 1 0 or 1 depending on the currently defined set  */
  var generateComparator: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Gets the first sorter from the sorters collection excluding any groupers that may be in place
  		* @returns Ext.util.Sorter The sorter, null if none exist
  		*/
  var getFirstSorter: js.UndefOr[js.Function0[extjsLib.ExtNs.utilNs.ISorter]] = js.undefined
  /** [Method] Gets all records added or updated since the last commit
  		* @returns Ext.data.Model[] The added and updated Model instances
  		*/
  var getModifiedRecords: js.UndefOr[js.Function0[extjsLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns all Model instances that are either currently a phantom e g
  		* @returns Ext.data.Model[] The Model instances
  		*/
  var getNewRecords: js.UndefOr[js.Function0[extjsLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the proxy currently attached to this proxy instance
  		* @returns Ext.data.proxy.Proxy The Proxy instance
  		*/
  var getProxy: js.UndefOr[js.Function0[extjsLib.ExtNs.dataNs.proxyNs.IProxy]] = js.undefined
  /** [Method] Returns any records that have been removed from the store but not yet destroyed on the proxy
  		* @returns Ext.data.Model[] The removed Model instances
  		*/
  var getRemovedRecords: js.UndefOr[js.Function0[extjsLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns all Model instances that have been updated in the Store but not yet synchronized with the Proxy
  		* @returns Ext.data.Model[] The updated Model instances
  		*/
  var getUpdatedRecords: js.UndefOr[js.Function0[extjsLib.ExtNs.Array]] = js.undefined
  /** [Method] Performs initialization of this mixin  */
  var initSortable: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Property] (Boolean) */
  var isDestroyed: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns true if the Store is currently performing a load operation
  		* @returns Boolean True if the Store is currently loading
  		*/
  var isLoading: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Property] (Boolean) */
  var isStore: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Loads the Store using its configured proxy
  		* @param options Object config object. This is passed into the Operation object that is created and then sent to the proxy's Ext.data.proxy.Proxy.read function
  		* @returns void this
  		*/
  var load: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var model: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String/Ext.data.proxy.Proxy/Object) */
  var proxy: js.UndefOr[js.Any] = js.undefined
  /** [Method] Reloads the store using the last options passed to the load method
  		* @param options Object A config object which contains options which may override the options passed to the previous load call.
  		*/
  var reload: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var remoteFilter: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var remoteSort: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Removes all records from the store  */
  var removeAll: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Property] (Ext.data.Model[]) */
  var removed: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
  /** [Method] Resumes automatically syncing the Store with its Proxy  */
  var resumeAutoSync: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Saves all pending changes via the configured proxy  */
  var save: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Sets the Store s Proxy by string config object or Proxy instance
  		* @param proxy String/Object/Ext.data.proxy.Proxy The new Proxy, which can be either a type string, a configuration object or an Ext.data.proxy.Proxy instance
  		* @returns Ext.data.proxy.Proxy The attached Proxy object
  		*/
  var setProxy: js.UndefOr[
    js.Function1[/* proxy */ js.UndefOr[js.Any], extjsLib.ExtNs.dataNs.proxyNs.IProxy]
  ] = js.undefined
  /** [Method] Sorts the data in the Store by one or more of its properties
  		* @param sorters String/Ext.util.Sorter[] Either a string name of one of the fields in this Store's configured Model, or an array of sorter configurations.
  		* @param direction String The overall direction to sort the data by.
  		* @returns Ext.util.Sorter[]
  		*/
  var sort: js.UndefOr[
    js.Function2[
      /* sorters */ js.UndefOr[js.Any], 
      /* direction */ js.UndefOr[java.lang.String], 
      extjsLib.ExtNs.Array
    ]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var sortOnLoad: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var statefulFilters: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var storeId: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Suspends automatically syncing the Store with its Proxy  */
  var suspendAutoSync: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Synchronizes the store with its proxy
  		* @param options Object Object containing one or more properties supported by the sync method (these get passed along to the underlying proxy's batch method):
  		* @returns Ext.data.Store this
  		*/
  var sync: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], IStore]] = js.undefined
}

