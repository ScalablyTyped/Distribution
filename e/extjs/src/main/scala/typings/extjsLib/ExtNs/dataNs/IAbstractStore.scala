package typings
package extjsLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- extjsLib.ExtNs.utilNs.ISortable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined defaultSortDirection, sortRoot, sorters, isSortable, generateComparator, getFirstSorter, initSortable, sort */ trait IAbstractStore
  extends extjsLib.ExtNs.utilNs.IObservable {
  /** [Config Option] (Boolean/Object) */
  var autoLoad: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var autoSync: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var batchUpdateMode: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (String) */
  var defaultProxyType: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var defaultSortDirection: js.UndefOr[java.lang.String] = js.undefined
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
  var isSortable: js.UndefOr[scala.Boolean] = js.undefined
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
  /** [Config Option] (String) */
  var sortRoot: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Ext.util.Sorter[]/Object[]) */
  var sorters: js.UndefOr[js.Any] = js.undefined
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

object IAbstractStore {
  @scala.inline
  def apply(
    addEvents: js.Function1[/* eventNames */ js.UndefOr[js.Any], scala.Unit] = null,
    addListener: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      _
    ] = null,
    addManagedListener: js.Function5[
      /* item */ js.UndefOr[js.Any], 
      /* ename */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      _
    ] = null,
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    autoLoad: js.Any = null,
    autoSync: js.UndefOr[scala.Boolean] = js.undefined,
    batchUpdateMode: java.lang.String = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    clearListeners: js.Function0[scala.Unit] = null,
    clearManagedListeners: js.Function0[scala.Unit] = null,
    config: js.Any = null,
    defaultProxyType: java.lang.String = null,
    defaultSortDirection: java.lang.String = null,
    enableBubble: js.Function1[/* eventNames */ js.UndefOr[js.Any], scala.Unit] = null,
    extend: java.lang.String = null,
    fields: extjsLib.ExtNs.Array = null,
    filterOnLoad: js.UndefOr[scala.Boolean] = js.undefined,
    filters: js.Any = null,
    fireEvent: js.Function2[/* eventName */ java.lang.String, /* repeated */ js.Any, scala.Boolean] = null,
    fireEventArgs: js.Function2[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* args */ js.UndefOr[extjsLib.ExtNs.Array], 
      scala.Boolean
    ] = null,
    generateComparator: js.Function0[scala.Unit] = null,
    getFirstSorter: js.Function0[extjsLib.ExtNs.utilNs.ISorter] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getModifiedRecords: js.Function0[extjsLib.ExtNs.Array] = null,
    getNewRecords: js.Function0[extjsLib.ExtNs.Array] = null,
    getProxy: js.Function0[extjsLib.ExtNs.dataNs.proxyNs.IProxy] = null,
    getRemovedRecords: js.Function0[extjsLib.ExtNs.Array] = null,
    getUpdatedRecords: js.Function0[extjsLib.ExtNs.Array] = null,
    hasListener: js.Function1[/* eventName */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    hasListeners: js.Any = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], IAbstractStore] = null,
    initSortable: js.Function0[scala.Unit] = null,
    isDestroyed: js.UndefOr[scala.Boolean] = js.undefined,
    isLoading: js.Function0[scala.Boolean] = null,
    isObservable: js.UndefOr[scala.Boolean] = js.undefined,
    isSortable: js.UndefOr[scala.Boolean] = js.undefined,
    isStore: js.UndefOr[scala.Boolean] = js.undefined,
    listeners: js.Any = null,
    load: js.Function1[/* options */ js.UndefOr[js.Any], scala.Unit] = null,
    mixins: js.Any = null,
    model: java.lang.String = null,
    mon: js.Function5[
      /* item */ js.UndefOr[js.Any], 
      /* ename */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      _
    ] = null,
    mun: js.Function4[
      /* item */ js.UndefOr[js.Any], 
      /* ename */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    on: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      _
    ] = null,
    proxy: js.Any = null,
    relayEvents: js.Function3[
      /* origin */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[extjsLib.ExtNs.Array], 
      /* prefix */ js.UndefOr[java.lang.String], 
      _
    ] = null,
    reload: js.Function1[/* options */ js.UndefOr[js.Any], scala.Unit] = null,
    remoteFilter: js.UndefOr[scala.Boolean] = js.undefined,
    remoteSort: js.UndefOr[scala.Boolean] = js.undefined,
    removeAll: js.Function0[scala.Unit] = null,
    removeListener: js.Function3[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    removeManagedListener: js.Function4[
      /* item */ js.UndefOr[js.Any], 
      /* ename */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    removed: extjsLib.ExtNs.Array = null,
    requires: extjsLib.ExtNs.Array = null,
    resumeAutoSync: js.Function0[scala.Unit] = null,
    resumeEvent: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    resumeEvents: js.Function0[scala.Unit] = null,
    save: js.Function0[scala.Unit] = null,
    self: extjsLib.ExtNs.IClass = null,
    setProxy: js.Function1[/* proxy */ js.UndefOr[js.Any], extjsLib.ExtNs.dataNs.proxyNs.IProxy] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    sort: js.Function2[
      /* sorters */ js.UndefOr[js.Any], 
      /* direction */ js.UndefOr[java.lang.String], 
      extjsLib.ExtNs.Array
    ] = null,
    sortOnLoad: js.UndefOr[scala.Boolean] = js.undefined,
    sortRoot: java.lang.String = null,
    sorters: js.Any = null,
    statefulFilters: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    storeId: java.lang.String = null,
    suspendAutoSync: js.Function0[scala.Unit] = null,
    suspendEvent: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    suspendEvents: js.Function1[/* queueSuspended */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    sync: js.Function1[/* options */ js.UndefOr[js.Any], IStore] = null,
    un: js.Function3[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    uses: extjsLib.ExtNs.Array = null
  ): IAbstractStore = {
    val __obj = js.Dynamic.literal()
    if (addEvents != null) __obj.updateDynamic("addEvents")(addEvents)
    if (addListener != null) __obj.updateDynamic("addListener")(addListener)
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(addManagedListener)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (autoLoad != null) __obj.updateDynamic("autoLoad")(autoLoad)
    if (!js.isUndefined(autoSync)) __obj.updateDynamic("autoSync")(autoSync)
    if (batchUpdateMode != null) __obj.updateDynamic("batchUpdateMode")(batchUpdateMode)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(clearListeners)
    if (clearManagedListeners != null) __obj.updateDynamic("clearManagedListeners")(clearManagedListeners)
    if (config != null) __obj.updateDynamic("config")(config)
    if (defaultProxyType != null) __obj.updateDynamic("defaultProxyType")(defaultProxyType)
    if (defaultSortDirection != null) __obj.updateDynamic("defaultSortDirection")(defaultSortDirection)
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(enableBubble)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (!js.isUndefined(filterOnLoad)) __obj.updateDynamic("filterOnLoad")(filterOnLoad)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(fireEvent)
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(fireEventArgs)
    if (generateComparator != null) __obj.updateDynamic("generateComparator")(generateComparator)
    if (getFirstSorter != null) __obj.updateDynamic("getFirstSorter")(getFirstSorter)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getModifiedRecords != null) __obj.updateDynamic("getModifiedRecords")(getModifiedRecords)
    if (getNewRecords != null) __obj.updateDynamic("getNewRecords")(getNewRecords)
    if (getProxy != null) __obj.updateDynamic("getProxy")(getProxy)
    if (getRemovedRecords != null) __obj.updateDynamic("getRemovedRecords")(getRemovedRecords)
    if (getUpdatedRecords != null) __obj.updateDynamic("getUpdatedRecords")(getUpdatedRecords)
    if (hasListener != null) __obj.updateDynamic("hasListener")(hasListener)
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (initSortable != null) __obj.updateDynamic("initSortable")(initSortable)
    if (!js.isUndefined(isDestroyed)) __obj.updateDynamic("isDestroyed")(isDestroyed)
    if (isLoading != null) __obj.updateDynamic("isLoading")(isLoading)
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable)
    if (!js.isUndefined(isSortable)) __obj.updateDynamic("isSortable")(isSortable)
    if (!js.isUndefined(isStore)) __obj.updateDynamic("isStore")(isStore)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (load != null) __obj.updateDynamic("load")(load)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (model != null) __obj.updateDynamic("model")(model)
    if (mon != null) __obj.updateDynamic("mon")(mon)
    if (mun != null) __obj.updateDynamic("mun")(mun)
    if (on != null) __obj.updateDynamic("on")(on)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(relayEvents)
    if (reload != null) __obj.updateDynamic("reload")(reload)
    if (!js.isUndefined(remoteFilter)) __obj.updateDynamic("remoteFilter")(remoteFilter)
    if (!js.isUndefined(remoteSort)) __obj.updateDynamic("remoteSort")(remoteSort)
    if (removeAll != null) __obj.updateDynamic("removeAll")(removeAll)
    if (removeListener != null) __obj.updateDynamic("removeListener")(removeListener)
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(removeManagedListener)
    if (removed != null) __obj.updateDynamic("removed")(removed)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (resumeAutoSync != null) __obj.updateDynamic("resumeAutoSync")(resumeAutoSync)
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(resumeEvent)
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(resumeEvents)
    if (save != null) __obj.updateDynamic("save")(save)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setProxy != null) __obj.updateDynamic("setProxy")(setProxy)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (!js.isUndefined(sortOnLoad)) __obj.updateDynamic("sortOnLoad")(sortOnLoad)
    if (sortRoot != null) __obj.updateDynamic("sortRoot")(sortRoot)
    if (sorters != null) __obj.updateDynamic("sorters")(sorters)
    if (!js.isUndefined(statefulFilters)) __obj.updateDynamic("statefulFilters")(statefulFilters)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (storeId != null) __obj.updateDynamic("storeId")(storeId)
    if (suspendAutoSync != null) __obj.updateDynamic("suspendAutoSync")(suspendAutoSync)
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(suspendEvent)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(suspendEvents)
    if (sync != null) __obj.updateDynamic("sync")(sync)
    if (un != null) __obj.updateDynamic("un")(un)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IAbstractStore]
  }
}

