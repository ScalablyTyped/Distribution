package typings.extjs.ExtNs.dataNs

import typings.extjs.ExtNs.Array
import typings.extjs.ExtNs.IClass
import typings.extjs.ExtNs.utilNs.ISorter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITreeStore extends IAbstractStore {
  /** [Config Option] (Boolean) */
  var clearOnLoad: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var clearRemovedOnLoad: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var defaultRootId: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var defaultRootProperty: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var defaultRootText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var folderSort: js.UndefOr[Boolean] = js.undefined
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
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    addManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    autoLoad: js.Any = null,
    autoSync: js.UndefOr[Boolean] = js.undefined,
    batchUpdateMode: java.lang.String = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clearListeners: () => Unit = null,
    clearManagedListeners: () => Unit = null,
    clearOnLoad: js.UndefOr[Boolean] = js.undefined,
    clearRemovedOnLoad: js.UndefOr[Boolean] = js.undefined,
    config: js.Any = null,
    defaultProxyType: java.lang.String = null,
    defaultRootId: java.lang.String = null,
    defaultRootProperty: java.lang.String = null,
    defaultRootText: java.lang.String = null,
    defaultSortDirection: java.lang.String = null,
    enableBubble: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    extend: java.lang.String = null,
    fields: Array = null,
    filterOnLoad: js.UndefOr[Boolean] = js.undefined,
    filters: js.Any = null,
    fireEvent: (/* eventName */ java.lang.String, /* repeated */ js.Any) => Boolean = null,
    fireEventArgs: (/* eventName */ js.UndefOr[java.lang.String], /* args */ js.UndefOr[Array]) => Boolean = null,
    folderSort: js.UndefOr[Boolean] = js.undefined,
    generateComparator: () => Unit = null,
    getFirstSorter: () => ISorter = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getModifiedRecords: () => Array = null,
    getNewRecords: () => Array = null,
    getNodeById: /* id */ js.UndefOr[js.Any] => INodeInterface = null,
    getProxy: () => typings.extjs.ExtNs.dataNs.proxyNs.IProxy = null,
    getRemovedRecords: () => Array = null,
    getRootNode: () => INodeInterface = null,
    getUpdatedRecords: () => Array = null,
    hasListener: /* eventName */ js.UndefOr[java.lang.String] => Boolean = null,
    hasListeners: js.Any = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => ITreeStore = null,
    initSortable: () => Unit = null,
    isDestroyed: js.UndefOr[Boolean] = js.undefined,
    isLoading: () => Boolean = null,
    isObservable: js.UndefOr[Boolean] = js.undefined,
    isSortable: js.UndefOr[Boolean] = js.undefined,
    isStore: js.UndefOr[Boolean] = js.undefined,
    listeners: js.Any = null,
    load: /* options */ js.UndefOr[js.Any] => Unit = null,
    mixins: js.Any = null,
    model: java.lang.String = null,
    mon: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    mun: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    nodeParam: java.lang.String = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    proxy: js.Any = null,
    relayEvents: (/* origin */ js.UndefOr[js.Any], /* events */ js.UndefOr[Array], /* prefix */ js.UndefOr[java.lang.String]) => _ = null,
    reload: /* options */ js.UndefOr[js.Any] => Unit = null,
    remoteFilter: js.UndefOr[Boolean] = js.undefined,
    remoteSort: js.UndefOr[Boolean] = js.undefined,
    removeAll: () => Unit = null,
    removeListener: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    removeManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    removed: Array = null,
    requires: Array = null,
    resumeAutoSync: () => Unit = null,
    resumeEvent: /* repeated */ js.Any => Unit = null,
    resumeEvents: () => Unit = null,
    root: js.Any = null,
    save: () => Unit = null,
    self: IClass = null,
    setProxy: /* proxy */ js.UndefOr[js.Any] => typings.extjs.ExtNs.dataNs.proxyNs.IProxy = null,
    setRootNode: /* root */ js.UndefOr[js.Any] => INodeInterface = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    sort: (/* sorters */ js.UndefOr[js.Any], /* direction */ js.UndefOr[java.lang.String]) => Array = null,
    sortOnLoad: js.UndefOr[Boolean] = js.undefined,
    sortRoot: java.lang.String = null,
    sorters: js.Any = null,
    statefulFilters: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    storeId: java.lang.String = null,
    suspendAutoSync: () => Unit = null,
    suspendEvent: /* repeated */ js.Any => Unit = null,
    suspendEvents: /* queueSuspended */ js.UndefOr[Boolean] => Unit = null,
    sync: /* options */ js.UndefOr[js.Any] => IStore = null,
    un: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    uses: Array = null
  ): ITreeStore = {
    val __obj = js.Dynamic.literal()
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction4(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (autoLoad != null) __obj.updateDynamic("autoLoad")(autoLoad)
    if (!js.isUndefined(autoSync)) __obj.updateDynamic("autoSync")(autoSync)
    if (batchUpdateMode != null) __obj.updateDynamic("batchUpdateMode")(batchUpdateMode)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (clearManagedListeners != null) __obj.updateDynamic("clearManagedListeners")(js.Any.fromFunction0(clearManagedListeners))
    if (!js.isUndefined(clearOnLoad)) __obj.updateDynamic("clearOnLoad")(clearOnLoad)
    if (!js.isUndefined(clearRemovedOnLoad)) __obj.updateDynamic("clearRemovedOnLoad")(clearRemovedOnLoad)
    if (config != null) __obj.updateDynamic("config")(config)
    if (defaultProxyType != null) __obj.updateDynamic("defaultProxyType")(defaultProxyType)
    if (defaultRootId != null) __obj.updateDynamic("defaultRootId")(defaultRootId)
    if (defaultRootProperty != null) __obj.updateDynamic("defaultRootProperty")(defaultRootProperty)
    if (defaultRootText != null) __obj.updateDynamic("defaultRootText")(defaultRootText)
    if (defaultSortDirection != null) __obj.updateDynamic("defaultSortDirection")(defaultSortDirection)
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (!js.isUndefined(filterOnLoad)) __obj.updateDynamic("filterOnLoad")(filterOnLoad)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(js.Any.fromFunction2(fireEventArgs))
    if (!js.isUndefined(folderSort)) __obj.updateDynamic("folderSort")(folderSort)
    if (generateComparator != null) __obj.updateDynamic("generateComparator")(js.Any.fromFunction0(generateComparator))
    if (getFirstSorter != null) __obj.updateDynamic("getFirstSorter")(js.Any.fromFunction0(getFirstSorter))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getModifiedRecords != null) __obj.updateDynamic("getModifiedRecords")(js.Any.fromFunction0(getModifiedRecords))
    if (getNewRecords != null) __obj.updateDynamic("getNewRecords")(js.Any.fromFunction0(getNewRecords))
    if (getNodeById != null) __obj.updateDynamic("getNodeById")(js.Any.fromFunction1(getNodeById))
    if (getProxy != null) __obj.updateDynamic("getProxy")(js.Any.fromFunction0(getProxy))
    if (getRemovedRecords != null) __obj.updateDynamic("getRemovedRecords")(js.Any.fromFunction0(getRemovedRecords))
    if (getRootNode != null) __obj.updateDynamic("getRootNode")(js.Any.fromFunction0(getRootNode))
    if (getUpdatedRecords != null) __obj.updateDynamic("getUpdatedRecords")(js.Any.fromFunction0(getUpdatedRecords))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (initSortable != null) __obj.updateDynamic("initSortable")(js.Any.fromFunction0(initSortable))
    if (!js.isUndefined(isDestroyed)) __obj.updateDynamic("isDestroyed")(isDestroyed)
    if (isLoading != null) __obj.updateDynamic("isLoading")(js.Any.fromFunction0(isLoading))
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable)
    if (!js.isUndefined(isSortable)) __obj.updateDynamic("isSortable")(isSortable)
    if (!js.isUndefined(isStore)) __obj.updateDynamic("isStore")(isStore)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1(load))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (model != null) __obj.updateDynamic("model")(model)
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (nodeParam != null) __obj.updateDynamic("nodeParam")(nodeParam)
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction4(on))
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction3(relayEvents))
    if (reload != null) __obj.updateDynamic("reload")(js.Any.fromFunction1(reload))
    if (!js.isUndefined(remoteFilter)) __obj.updateDynamic("remoteFilter")(remoteFilter)
    if (!js.isUndefined(remoteSort)) __obj.updateDynamic("remoteSort")(remoteSort)
    if (removeAll != null) __obj.updateDynamic("removeAll")(js.Any.fromFunction0(removeAll))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction3(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (removed != null) __obj.updateDynamic("removed")(removed)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (resumeAutoSync != null) __obj.updateDynamic("resumeAutoSync")(js.Any.fromFunction0(resumeAutoSync))
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(js.Any.fromFunction1(resumeEvent))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction0(resumeEvents))
    if (root != null) __obj.updateDynamic("root")(root)
    if (save != null) __obj.updateDynamic("save")(js.Any.fromFunction0(save))
    if (self != null) __obj.updateDynamic("self")(self)
    if (setProxy != null) __obj.updateDynamic("setProxy")(js.Any.fromFunction1(setProxy))
    if (setRootNode != null) __obj.updateDynamic("setRootNode")(js.Any.fromFunction1(setRootNode))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction2(sort))
    if (!js.isUndefined(sortOnLoad)) __obj.updateDynamic("sortOnLoad")(sortOnLoad)
    if (sortRoot != null) __obj.updateDynamic("sortRoot")(sortRoot)
    if (sorters != null) __obj.updateDynamic("sorters")(sorters)
    if (!js.isUndefined(statefulFilters)) __obj.updateDynamic("statefulFilters")(statefulFilters)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (storeId != null) __obj.updateDynamic("storeId")(storeId)
    if (suspendAutoSync != null) __obj.updateDynamic("suspendAutoSync")(js.Any.fromFunction0(suspendAutoSync))
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(js.Any.fromFunction1(suspendEvent))
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction1(suspendEvents))
    if (sync != null) __obj.updateDynamic("sync")(js.Any.fromFunction1(sync))
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction3(un))
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[ITreeStore]
  }
}

