package typings.extjs.Ext.data

import typings.extjs.Ext.Array
import typings.extjs.Ext.util.IObservable
import typings.extjs.Ext.util.ISorter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.extjs.Ext.IClass because Already inherited
- typings.extjs.Ext.IBase because Already inherited
- typings.extjs.Ext.util.ISortable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined defaultSortDirection, sortRoot, sorters, isSortable, generateComparator, getFirstSorter, initSortable, sort */ @js.native
trait IAbstractStore extends IObservable {
  
  /** [Config Option] (Boolean/Object) */
  var autoLoad: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var autoSync: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var batchUpdateMode: js.UndefOr[String] = js.native
  
  /** [Property] (String) */
  var defaultProxyType: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var defaultSortDirection: js.UndefOr[String] = js.native
  
  /** [Config Option] (Object[]) */
  var fields: js.UndefOr[Array] = js.native
  
  /** [Config Option] (Boolean) */
  var filterOnLoad: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Object[]/Function[]) */
  var filters: js.UndefOr[js.Any] = js.native
  
  /** [Method] Returns a comparator function which compares two items and returns 1 0 or 1 depending on the currently defined set  */
  var generateComparator: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Gets the first sorter from the sorters collection excluding any groupers that may be in place
    * @returns Ext.util.Sorter The sorter, null if none exist
    */
  var getFirstSorter: js.UndefOr[js.Function0[ISorter]] = js.native
  
  /** [Method] Gets all records added or updated since the last commit
    * @returns Ext.data.Model[] The added and updated Model instances
    */
  var getModifiedRecords: js.UndefOr[js.Function0[Array]] = js.native
  
  /** [Method] Returns all Model instances that are either currently a phantom e g
    * @returns Ext.data.Model[] The Model instances
    */
  var getNewRecords: js.UndefOr[js.Function0[Array]] = js.native
  
  /** [Method] Returns the proxy currently attached to this proxy instance
    * @returns Ext.data.proxy.Proxy The Proxy instance
    */
  var getProxy: js.UndefOr[js.Function0[typings.extjs.Ext.data.proxy.IProxy]] = js.native
  
  /** [Method] Returns any records that have been removed from the store but not yet destroyed on the proxy
    * @returns Ext.data.Model[] The removed Model instances
    */
  var getRemovedRecords: js.UndefOr[js.Function0[Array]] = js.native
  
  /** [Method] Returns all Model instances that have been updated in the Store but not yet synchronized with the Proxy
    * @returns Ext.data.Model[] The updated Model instances
    */
  var getUpdatedRecords: js.UndefOr[js.Function0[Array]] = js.native
  
  /** [Method] Performs initialization of this mixin  */
  var initSortable: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Property] (Boolean) */
  var isDestroyed: js.UndefOr[Boolean] = js.native
  
  /** [Method] Returns true if the Store is currently performing a load operation
    * @returns Boolean True if the Store is currently loading
    */
  var isLoading: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Property] (Boolean) */
  var isSortable: js.UndefOr[Boolean] = js.native
  
  /** [Property] (Boolean) */
  var isStore: js.UndefOr[Boolean] = js.native
  
  /** [Method] Loads the Store using its configured proxy
    * @param options Object config object. This is passed into the Operation object that is created and then sent to the proxy's Ext.data.proxy.Proxy.read function
    * @returns void this
    */
  var load: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (String) */
  var model: js.UndefOr[String] = js.native
  
  /** [Config Option] (String/Ext.data.proxy.Proxy/Object) */
  var proxy: js.UndefOr[js.Any] = js.native
  
  /** [Method] Reloads the store using the last options passed to the load method
    * @param options Object A config object which contains options which may override the options passed to the previous load call.
    */
  var reload: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var remoteFilter: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var remoteSort: js.UndefOr[Boolean] = js.native
  
  /** [Method] Removes all records from the store  */
  var removeAll: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Property] (Ext.data.Model[]) */
  var removed: js.UndefOr[Array] = js.native
  
  /** [Method] Resumes automatically syncing the Store with its Proxy  */
  var resumeAutoSync: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Saves all pending changes via the configured proxy  */
  var save: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Sets the Store s Proxy by string config object or Proxy instance
    * @param proxy String/Object/Ext.data.proxy.Proxy The new Proxy, which can be either a type string, a configuration object or an Ext.data.proxy.Proxy instance
    * @returns Ext.data.proxy.Proxy The attached Proxy object
    */
  var setProxy: js.UndefOr[
    js.Function1[/* proxy */ js.UndefOr[js.Any], typings.extjs.Ext.data.proxy.IProxy]
  ] = js.native
  
  /** [Method] Sorts the data in the Store by one or more of its properties
    * @param sorters String/Ext.util.Sorter[] Either a string name of one of the fields in this Store's configured Model, or an array of sorter configurations.
    * @param direction String The overall direction to sort the data by.
    * @returns Ext.util.Sorter[]
    */
  var sort: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[String], Array]] = js.native
  
  /** [Config Option] (Boolean) */
  var sortOnLoad: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var sortRoot: js.UndefOr[String] = js.native
  
  /** [Config Option] (Ext.util.Sorter[]/Object[]) */
  var sorters: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var statefulFilters: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var storeId: js.UndefOr[String] = js.native
  
  /** [Method] Suspends automatically syncing the Store with its Proxy  */
  var suspendAutoSync: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Synchronizes the store with its proxy
    * @param options Object Object containing one or more properties supported by the sync method (these get passed along to the underlying proxy's batch method):
    * @returns Ext.data.Store this
    */
  var sync: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], IStore]] = js.native
}
object IAbstractStore {
  
  @scala.inline
  def apply(): IAbstractStore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstractStore]
  }
  
  @scala.inline
  implicit class IAbstractStoreMutableBuilder[Self <: IAbstractStore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoLoad(value: js.Any): Self = StObject.set(x, "autoLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoLoadUndefined: Self = StObject.set(x, "autoLoad", js.undefined)
    
    @scala.inline
    def setAutoSync(value: Boolean): Self = StObject.set(x, "autoSync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSyncUndefined: Self = StObject.set(x, "autoSync", js.undefined)
    
    @scala.inline
    def setBatchUpdateMode(value: String): Self = StObject.set(x, "batchUpdateMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchUpdateModeUndefined: Self = StObject.set(x, "batchUpdateMode", js.undefined)
    
    @scala.inline
    def setDefaultProxyType(value: String): Self = StObject.set(x, "defaultProxyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultProxyTypeUndefined: Self = StObject.set(x, "defaultProxyType", js.undefined)
    
    @scala.inline
    def setDefaultSortDirection(value: String): Self = StObject.set(x, "defaultSortDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultSortDirectionUndefined: Self = StObject.set(x, "defaultSortDirection", js.undefined)
    
    @scala.inline
    def setFields(value: Array): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFilterOnLoad(value: Boolean): Self = StObject.set(x, "filterOnLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterOnLoadUndefined: Self = StObject.set(x, "filterOnLoad", js.undefined)
    
    @scala.inline
    def setFilters(value: js.Any): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setGenerateComparator(value: () => Unit): Self = StObject.set(x, "generateComparator", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGenerateComparatorUndefined: Self = StObject.set(x, "generateComparator", js.undefined)
    
    @scala.inline
    def setGetFirstSorter(value: () => ISorter): Self = StObject.set(x, "getFirstSorter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFirstSorterUndefined: Self = StObject.set(x, "getFirstSorter", js.undefined)
    
    @scala.inline
    def setGetModifiedRecords(value: () => Array): Self = StObject.set(x, "getModifiedRecords", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetModifiedRecordsUndefined: Self = StObject.set(x, "getModifiedRecords", js.undefined)
    
    @scala.inline
    def setGetNewRecords(value: () => Array): Self = StObject.set(x, "getNewRecords", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNewRecordsUndefined: Self = StObject.set(x, "getNewRecords", js.undefined)
    
    @scala.inline
    def setGetProxy(value: () => typings.extjs.Ext.data.proxy.IProxy): Self = StObject.set(x, "getProxy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetProxyUndefined: Self = StObject.set(x, "getProxy", js.undefined)
    
    @scala.inline
    def setGetRemovedRecords(value: () => Array): Self = StObject.set(x, "getRemovedRecords", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRemovedRecordsUndefined: Self = StObject.set(x, "getRemovedRecords", js.undefined)
    
    @scala.inline
    def setGetUpdatedRecords(value: () => Array): Self = StObject.set(x, "getUpdatedRecords", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUpdatedRecordsUndefined: Self = StObject.set(x, "getUpdatedRecords", js.undefined)
    
    @scala.inline
    def setInitSortable(value: () => Unit): Self = StObject.set(x, "initSortable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInitSortableUndefined: Self = StObject.set(x, "initSortable", js.undefined)
    
    @scala.inline
    def setIsDestroyed(value: Boolean): Self = StObject.set(x, "isDestroyed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDestroyedUndefined: Self = StObject.set(x, "isDestroyed", js.undefined)
    
    @scala.inline
    def setIsLoading(value: () => Boolean): Self = StObject.set(x, "isLoading", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsLoadingUndefined: Self = StObject.set(x, "isLoading", js.undefined)
    
    @scala.inline
    def setIsSortable(value: Boolean): Self = StObject.set(x, "isSortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSortableUndefined: Self = StObject.set(x, "isSortable", js.undefined)
    
    @scala.inline
    def setIsStore(value: Boolean): Self = StObject.set(x, "isStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStoreUndefined: Self = StObject.set(x, "isStore", js.undefined)
    
    @scala.inline
    def setLoad(value: /* options */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setProxy(value: js.Any): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    @scala.inline
    def setReload(value: /* options */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "reload", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReloadUndefined: Self = StObject.set(x, "reload", js.undefined)
    
    @scala.inline
    def setRemoteFilter(value: Boolean): Self = StObject.set(x, "remoteFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteFilterUndefined: Self = StObject.set(x, "remoteFilter", js.undefined)
    
    @scala.inline
    def setRemoteSort(value: Boolean): Self = StObject.set(x, "remoteSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteSortUndefined: Self = StObject.set(x, "remoteSort", js.undefined)
    
    @scala.inline
    def setRemoveAll(value: () => Unit): Self = StObject.set(x, "removeAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveAllUndefined: Self = StObject.set(x, "removeAll", js.undefined)
    
    @scala.inline
    def setRemoved(value: Array): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedUndefined: Self = StObject.set(x, "removed", js.undefined)
    
    @scala.inline
    def setResumeAutoSync(value: () => Unit): Self = StObject.set(x, "resumeAutoSync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResumeAutoSyncUndefined: Self = StObject.set(x, "resumeAutoSync", js.undefined)
    
    @scala.inline
    def setSave(value: () => Unit): Self = StObject.set(x, "save", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
    
    @scala.inline
    def setSetProxy(value: /* proxy */ js.UndefOr[js.Any] => typings.extjs.Ext.data.proxy.IProxy): Self = StObject.set(x, "setProxy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetProxyUndefined: Self = StObject.set(x, "setProxy", js.undefined)
    
    @scala.inline
    def setSort(value: (js.UndefOr[js.Any], js.UndefOr[String]) => Array): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSortOnLoad(value: Boolean): Self = StObject.set(x, "sortOnLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOnLoadUndefined: Self = StObject.set(x, "sortOnLoad", js.undefined)
    
    @scala.inline
    def setSortRoot(value: String): Self = StObject.set(x, "sortRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortRootUndefined: Self = StObject.set(x, "sortRoot", js.undefined)
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setSorters(value: js.Any): Self = StObject.set(x, "sorters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortersUndefined: Self = StObject.set(x, "sorters", js.undefined)
    
    @scala.inline
    def setStatefulFilters(value: Boolean): Self = StObject.set(x, "statefulFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatefulFiltersUndefined: Self = StObject.set(x, "statefulFilters", js.undefined)
    
    @scala.inline
    def setStoreId(value: String): Self = StObject.set(x, "storeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreIdUndefined: Self = StObject.set(x, "storeId", js.undefined)
    
    @scala.inline
    def setSuspendAutoSync(value: () => Unit): Self = StObject.set(x, "suspendAutoSync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSuspendAutoSyncUndefined: Self = StObject.set(x, "suspendAutoSync", js.undefined)
    
    @scala.inline
    def setSync(value: /* options */ js.UndefOr[js.Any] => IStore): Self = StObject.set(x, "sync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
  }
}
