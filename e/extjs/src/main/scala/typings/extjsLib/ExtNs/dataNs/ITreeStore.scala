package typings
package extjsLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITreeStore extends IAbstractStore {
  /** [Config Option] (Boolean) */
  var clearOnLoad: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var clearRemovedOnLoad: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var defaultRootId: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var defaultRootProperty: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var defaultRootText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var folderSort: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns the record node by id
  		* @param id Object
  		* @returns Ext.data.NodeInterface
  		*/
  var getNodeById: js.UndefOr[js.Function1[/* id */ js.UndefOr[js.Any], INodeInterface]] = js.undefined
  /** [Method] Returns the root node for this tree
  		* @returns Ext.data.NodeInterface
  		*/
  var getRootNode: js.UndefOr[js.Function0[INodeInterface]] = js.undefined
  /** [Config Option] (String) */
  var nodeParam: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Ext.data.Model/Ext.data.NodeInterface/Object) */
  var root: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the root node for this store
  		* @param root Ext.data.Model/Ext.data.NodeInterface/Object
  		* @returns Ext.data.NodeInterface The new root
  		*/
  var setRootNode: js.UndefOr[js.Function1[/* root */ js.UndefOr[js.Any], INodeInterface]] = js.undefined
}

object ITreeStore {
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
    clearOnLoad: js.UndefOr[scala.Boolean] = js.undefined,
    clearRemovedOnLoad: js.UndefOr[scala.Boolean] = js.undefined,
    config: js.Any = null,
    defaultProxyType: java.lang.String = null,
    defaultRootId: java.lang.String = null,
    defaultRootProperty: java.lang.String = null,
    defaultRootText: java.lang.String = null,
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
    folderSort: js.UndefOr[scala.Boolean] = js.undefined,
    generateComparator: js.Function0[scala.Unit] = null,
    getFirstSorter: js.Function0[extjsLib.ExtNs.utilNs.ISorter] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getModifiedRecords: js.Function0[extjsLib.ExtNs.Array] = null,
    getNewRecords: js.Function0[extjsLib.ExtNs.Array] = null,
    getNodeById: js.Function1[/* id */ js.UndefOr[js.Any], INodeInterface] = null,
    getProxy: js.Function0[extjsLib.ExtNs.dataNs.proxyNs.IProxy] = null,
    getRemovedRecords: js.Function0[extjsLib.ExtNs.Array] = null,
    getRootNode: js.Function0[INodeInterface] = null,
    getUpdatedRecords: js.Function0[extjsLib.ExtNs.Array] = null,
    hasListener: js.Function1[/* eventName */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    hasListeners: js.Any = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], ITreeStore] = null,
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
    nodeParam: java.lang.String = null,
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
    root: js.Any = null,
    save: js.Function0[scala.Unit] = null,
    self: extjsLib.ExtNs.IClass = null,
    setProxy: js.Function1[/* proxy */ js.UndefOr[js.Any], extjsLib.ExtNs.dataNs.proxyNs.IProxy] = null,
    setRootNode: js.Function1[/* root */ js.UndefOr[js.Any], INodeInterface] = null,
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
  ): ITreeStore = {
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
    if (!js.isUndefined(clearOnLoad)) __obj.updateDynamic("clearOnLoad")(clearOnLoad)
    if (!js.isUndefined(clearRemovedOnLoad)) __obj.updateDynamic("clearRemovedOnLoad")(clearRemovedOnLoad)
    if (config != null) __obj.updateDynamic("config")(config)
    if (defaultProxyType != null) __obj.updateDynamic("defaultProxyType")(defaultProxyType)
    if (defaultRootId != null) __obj.updateDynamic("defaultRootId")(defaultRootId)
    if (defaultRootProperty != null) __obj.updateDynamic("defaultRootProperty")(defaultRootProperty)
    if (defaultRootText != null) __obj.updateDynamic("defaultRootText")(defaultRootText)
    if (defaultSortDirection != null) __obj.updateDynamic("defaultSortDirection")(defaultSortDirection)
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(enableBubble)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (!js.isUndefined(filterOnLoad)) __obj.updateDynamic("filterOnLoad")(filterOnLoad)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(fireEvent)
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(fireEventArgs)
    if (!js.isUndefined(folderSort)) __obj.updateDynamic("folderSort")(folderSort)
    if (generateComparator != null) __obj.updateDynamic("generateComparator")(generateComparator)
    if (getFirstSorter != null) __obj.updateDynamic("getFirstSorter")(getFirstSorter)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getModifiedRecords != null) __obj.updateDynamic("getModifiedRecords")(getModifiedRecords)
    if (getNewRecords != null) __obj.updateDynamic("getNewRecords")(getNewRecords)
    if (getNodeById != null) __obj.updateDynamic("getNodeById")(getNodeById)
    if (getProxy != null) __obj.updateDynamic("getProxy")(getProxy)
    if (getRemovedRecords != null) __obj.updateDynamic("getRemovedRecords")(getRemovedRecords)
    if (getRootNode != null) __obj.updateDynamic("getRootNode")(getRootNode)
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
    if (nodeParam != null) __obj.updateDynamic("nodeParam")(nodeParam)
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
    if (root != null) __obj.updateDynamic("root")(root)
    if (save != null) __obj.updateDynamic("save")(save)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setProxy != null) __obj.updateDynamic("setProxy")(setProxy)
    if (setRootNode != null) __obj.updateDynamic("setRootNode")(setRootNode)
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
    __obj.asInstanceOf[ITreeStore]
  }
}

