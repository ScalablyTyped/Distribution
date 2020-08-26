package typings.extjs.Ext.data

import typings.extjs.Ext.Array
import typings.extjs.Ext.util.IObservable
import typings.extjs.Ext.util.ISorter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class IAbstractStoreOps[Self <: IAbstractStore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoLoad(value: js.Any): Self = this.set("autoLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoLoad: Self = this.set("autoLoad", js.undefined)
    @scala.inline
    def setAutoSync(value: Boolean): Self = this.set("autoSync", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoSync: Self = this.set("autoSync", js.undefined)
    @scala.inline
    def setBatchUpdateMode(value: String): Self = this.set("batchUpdateMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchUpdateMode: Self = this.set("batchUpdateMode", js.undefined)
    @scala.inline
    def setDefaultProxyType(value: String): Self = this.set("defaultProxyType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultProxyType: Self = this.set("defaultProxyType", js.undefined)
    @scala.inline
    def setDefaultSortDirection(value: String): Self = this.set("defaultSortDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSortDirection: Self = this.set("defaultSortDirection", js.undefined)
    @scala.inline
    def setFields(value: Array): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setFilterOnLoad(value: Boolean): Self = this.set("filterOnLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterOnLoad: Self = this.set("filterOnLoad", js.undefined)
    @scala.inline
    def setFilters(value: js.Any): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setGenerateComparator(value: () => Unit): Self = this.set("generateComparator", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGenerateComparator: Self = this.set("generateComparator", js.undefined)
    @scala.inline
    def setGetFirstSorter(value: () => ISorter): Self = this.set("getFirstSorter", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetFirstSorter: Self = this.set("getFirstSorter", js.undefined)
    @scala.inline
    def setGetModifiedRecords(value: () => Array): Self = this.set("getModifiedRecords", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetModifiedRecords: Self = this.set("getModifiedRecords", js.undefined)
    @scala.inline
    def setGetNewRecords(value: () => Array): Self = this.set("getNewRecords", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetNewRecords: Self = this.set("getNewRecords", js.undefined)
    @scala.inline
    def setGetProxy(value: () => typings.extjs.Ext.data.proxy.IProxy): Self = this.set("getProxy", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetProxy: Self = this.set("getProxy", js.undefined)
    @scala.inline
    def setGetRemovedRecords(value: () => Array): Self = this.set("getRemovedRecords", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetRemovedRecords: Self = this.set("getRemovedRecords", js.undefined)
    @scala.inline
    def setGetUpdatedRecords(value: () => Array): Self = this.set("getUpdatedRecords", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetUpdatedRecords: Self = this.set("getUpdatedRecords", js.undefined)
    @scala.inline
    def setInitSortable(value: () => Unit): Self = this.set("initSortable", js.Any.fromFunction0(value))
    @scala.inline
    def deleteInitSortable: Self = this.set("initSortable", js.undefined)
    @scala.inline
    def setIsDestroyed(value: Boolean): Self = this.set("isDestroyed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDestroyed: Self = this.set("isDestroyed", js.undefined)
    @scala.inline
    def setIsLoading(value: () => Boolean): Self = this.set("isLoading", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsLoading: Self = this.set("isLoading", js.undefined)
    @scala.inline
    def setIsSortable(value: Boolean): Self = this.set("isSortable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSortable: Self = this.set("isSortable", js.undefined)
    @scala.inline
    def setIsStore(value: Boolean): Self = this.set("isStore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsStore: Self = this.set("isStore", js.undefined)
    @scala.inline
    def setLoad(value: /* options */ js.UndefOr[js.Any] => Unit): Self = this.set("load", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    @scala.inline
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setProxy(value: js.Any): Self = this.set("proxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    @scala.inline
    def setReload(value: /* options */ js.UndefOr[js.Any] => Unit): Self = this.set("reload", js.Any.fromFunction1(value))
    @scala.inline
    def deleteReload: Self = this.set("reload", js.undefined)
    @scala.inline
    def setRemoteFilter(value: Boolean): Self = this.set("remoteFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoteFilter: Self = this.set("remoteFilter", js.undefined)
    @scala.inline
    def setRemoteSort(value: Boolean): Self = this.set("remoteSort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoteSort: Self = this.set("remoteSort", js.undefined)
    @scala.inline
    def setRemoveAll(value: () => Unit): Self = this.set("removeAll", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRemoveAll: Self = this.set("removeAll", js.undefined)
    @scala.inline
    def setRemoved(value: Array): Self = this.set("removed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoved: Self = this.set("removed", js.undefined)
    @scala.inline
    def setResumeAutoSync(value: () => Unit): Self = this.set("resumeAutoSync", js.Any.fromFunction0(value))
    @scala.inline
    def deleteResumeAutoSync: Self = this.set("resumeAutoSync", js.undefined)
    @scala.inline
    def setSave(value: () => Unit): Self = this.set("save", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSave: Self = this.set("save", js.undefined)
    @scala.inline
    def setSetProxy(value: /* proxy */ js.UndefOr[js.Any] => typings.extjs.Ext.data.proxy.IProxy): Self = this.set("setProxy", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetProxy: Self = this.set("setProxy", js.undefined)
    @scala.inline
    def setSort(value: (js.UndefOr[js.Any], js.UndefOr[String]) => Array): Self = this.set("sort", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    @scala.inline
    def setSortOnLoad(value: Boolean): Self = this.set("sortOnLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortOnLoad: Self = this.set("sortOnLoad", js.undefined)
    @scala.inline
    def setSortRoot(value: String): Self = this.set("sortRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortRoot: Self = this.set("sortRoot", js.undefined)
    @scala.inline
    def setSorters(value: js.Any): Self = this.set("sorters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSorters: Self = this.set("sorters", js.undefined)
    @scala.inline
    def setStatefulFilters(value: Boolean): Self = this.set("statefulFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatefulFilters: Self = this.set("statefulFilters", js.undefined)
    @scala.inline
    def setStoreId(value: String): Self = this.set("storeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStoreId: Self = this.set("storeId", js.undefined)
    @scala.inline
    def setSuspendAutoSync(value: () => Unit): Self = this.set("suspendAutoSync", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSuspendAutoSync: Self = this.set("suspendAutoSync", js.undefined)
    @scala.inline
    def setSync(value: /* options */ js.UndefOr[js.Any] => IStore): Self = this.set("sync", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSync: Self = this.set("sync", js.undefined)
  }
  
}

