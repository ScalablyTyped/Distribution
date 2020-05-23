package typings.extjs.Ext.grid

import typings.extjs.Ext.Array
import typings.extjs.Ext.IClass
import typings.extjs.Ext.data.IModel
import typings.extjs.Ext.data.IRecord
import typings.extjs.Ext.data.IStore
import typings.extjs.Ext.data.proxy.IProxy
import typings.extjs.Ext.util.IMixedCollection
import typings.extjs.Ext.util.ISorter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyStore extends IStore

object IPropertyStore {
  @scala.inline
  def apply(
    add: /* model */ js.UndefOr[js.Any] => Array = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    addFilter: (/* filters */ js.UndefOr[js.Any], /* applyFilters */ js.UndefOr[Boolean]) => Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    addManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    addSorted: /* record */ js.UndefOr[IRecord] => Unit = null,
    aggregate: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* grouped */ js.UndefOr[Boolean], /* args */ js.UndefOr[Array]) => _ = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    autoDestroy: js.UndefOr[Boolean] = js.undefined,
    autoLoad: js.Any = null,
    autoSync: js.UndefOr[Boolean] = js.undefined,
    average: (/* field */ js.UndefOr[String], /* grouped */ js.UndefOr[Boolean]) => _ = null,
    batchUpdateMode: String = null,
    buffered: js.UndefOr[Boolean] = js.undefined,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clearFilter: /* suppressEvent */ js.UndefOr[Boolean] => Unit = null,
    clearGrouping: () => Unit = null,
    clearListeners: () => Unit = null,
    clearManagedListeners: () => Unit = null,
    clearOnPageLoad: js.UndefOr[Boolean] = js.undefined,
    clearRemovedOnLoad: js.UndefOr[Boolean] = js.undefined,
    collect: (/* dataIndex */ js.UndefOr[String], /* allowNull */ js.UndefOr[Boolean], /* bypassFilter */ js.UndefOr[Boolean]) => Array = null,
    commitChanges: () => Unit = null,
    config: js.Any = null,
    count: /* grouped */ js.UndefOr[Boolean] => Double = null,
    currentPage: js.UndefOr[Double] = js.undefined,
    data: js.Any = null,
    defaultProxyType: String = null,
    defaultSortDirection: String = null,
    each: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    enableBubble: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    extend: String = null,
    fields: Array = null,
    filter: (/* filters */ js.UndefOr[js.Any], /* value */ js.UndefOr[String]) => Unit = null,
    filterBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    filterOnLoad: js.UndefOr[Boolean] = js.undefined,
    filters: js.Any = null,
    find: (/* fieldName */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[Double], /* anyMatch */ js.UndefOr[Boolean], /* caseSensitive */ js.UndefOr[Boolean], /* exactMatch */ js.UndefOr[Boolean]) => Double = null,
    findBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[Double]) => Double = null,
    findExact: (/* fieldName */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[Double]) => Double = null,
    findRecord: (/* fieldName */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[Double], /* anyMatch */ js.UndefOr[Boolean], /* caseSensitive */ js.UndefOr[Boolean], /* exactMatch */ js.UndefOr[Boolean]) => IModel = null,
    fireEvent: (/* eventName */ String, /* repeated */ js.Any) => Boolean = null,
    fireEventArgs: (/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array]) => Boolean = null,
    first: /* grouped */ js.UndefOr[Boolean] => _ = null,
    generateComparator: () => Unit = null,
    getAt: /* index */ js.UndefOr[Double] => IModel = null,
    getById: /* id */ js.UndefOr[js.Any] => IModel = null,
    getCount: () => Double = null,
    getFirstSorter: () => ISorter = null,
    getGroupString: /* instance */ js.UndefOr[IModel] => String = null,
    getGroups: /* groupName */ js.UndefOr[String] => _ = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    getModifiedRecords: () => Array = null,
    getNewRecords: () => Array = null,
    getPageFromRecordIndex: /* index */ js.UndefOr[Double] => Double = null,
    getProxy: () => IProxy = null,
    getRange: (/* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double], /* options */ js.UndefOr[js.Any]) => Array = null,
    getRemovedRecords: () => Array = null,
    getTotalCount: () => Double = null,
    getUpdatedRecords: () => Array = null,
    group: (/* groupers */ js.UndefOr[js.Any], /* direction */ js.UndefOr[String]) => Unit = null,
    groupDir: String = null,
    groupField: String = null,
    groupers: IMixedCollection = null,
    guaranteeRange: (/* start */ js.UndefOr[js.Any], /* end */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    hasListener: /* eventName */ js.UndefOr[String] => Boolean = null,
    hasListeners: js.Any = null,
    indexOf: /* record */ js.UndefOr[IModel] => Double = null,
    indexOfId: /* id */ js.UndefOr[String] => Double = null,
    indexOfTotal: /* record */ js.UndefOr[IModel] => Double = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IPropertyStore = null,
    initSortable: () => Unit = null,
    insert: (/* index */ js.UndefOr[Double], /* records */ js.UndefOr[Array]) => Array = null,
    isDestroyed: js.UndefOr[Boolean] = js.undefined,
    isFiltered: () => Boolean = null,
    isGrouped: () => Boolean = null,
    isLoading: () => Boolean = null,
    isObservable: js.UndefOr[Boolean] = js.undefined,
    isSortable: js.UndefOr[Boolean] = js.undefined,
    isStore: js.UndefOr[Boolean] = js.undefined,
    last: /* grouped */ js.UndefOr[Boolean] => _ = null,
    leadingBufferZone: js.UndefOr[Double] = js.undefined,
    listeners: js.Any = null,
    load: /* options */ js.UndefOr[js.Any] => Unit = null,
    loadData: (/* data */ js.UndefOr[js.Any], /* append */ js.UndefOr[Boolean]) => Unit = null,
    loadPage: (/* page */ js.UndefOr[Double], /* options */ js.UndefOr[js.Any]) => Unit = null,
    loadRawData: (/* data */ js.UndefOr[Array], /* append */ js.UndefOr[Boolean]) => Unit = null,
    loadRecords: (/* records */ js.UndefOr[Array], /* options */ js.UndefOr[js.Any]) => Unit = null,
    max: (/* field */ js.UndefOr[String], /* grouped */ js.UndefOr[Boolean]) => _ = null,
    min: (/* field */ js.UndefOr[String], /* grouped */ js.UndefOr[Boolean]) => _ = null,
    mixins: js.Any = null,
    model: String = null,
    mon: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    mun: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    nextPage: /* options */ js.UndefOr[js.Any] => Unit = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    pageSize: js.UndefOr[Double] = js.undefined,
    prefetch: /* options */ js.UndefOr[js.Any] => Unit = null,
    prefetchPage: (/* page */ js.UndefOr[Double], /* options */ js.UndefOr[js.Any]) => Unit = null,
    prefetchRange: (/* start */ js.UndefOr[js.Any], /* end */ js.UndefOr[js.Any]) => Unit = null,
    previousPage: /* options */ js.UndefOr[js.Any] => Unit = null,
    proxy: js.Any = null,
    purgePageCount: js.UndefOr[Double] = js.undefined,
    query: (/* property */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], /* anyMatch */ js.UndefOr[Boolean], /* caseSensitive */ js.UndefOr[Boolean], /* exactMatch */ js.UndefOr[Boolean]) => IMixedCollection = null,
    queryBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IMixedCollection = null,
    rejectChanges: () => Unit = null,
    relayEvents: (/* origin */ js.UndefOr[js.Any], /* events */ js.UndefOr[Array], /* prefix */ js.UndefOr[String]) => _ = null,
    reload: /* options */ js.UndefOr[js.Any] => Unit = null,
    remoteFilter: js.UndefOr[Boolean] = js.undefined,
    remoteGroup: js.UndefOr[Boolean] = js.undefined,
    remoteSort: js.UndefOr[Boolean] = js.undefined,
    remove: /* records */ js.UndefOr[js.Any] => Unit = null,
    removeAll: /* silent */ js.UndefOr[Boolean] => Unit = null,
    removeAt: (/* index */ js.UndefOr[Double], /* count */ js.UndefOr[Double]) => Unit = null,
    removeFilter: (/* toRemove */ js.UndefOr[js.Any], /* applyFilters */ js.UndefOr[Boolean]) => Unit = null,
    removeListener: (/* eventName */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    removeManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    removed: Array = null,
    requires: Array = null,
    resumeAutoSync: () => Unit = null,
    resumeEvent: /* repeated */ js.Any => Unit = null,
    resumeEvents: () => Unit = null,
    save: () => Unit = null,
    self: IClass = null,
    setProxy: /* proxy */ js.UndefOr[js.Any] => IProxy = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    snapshot: IMixedCollection = null,
    sort: () => Array = null,
    sortOnFilter: js.UndefOr[Boolean] = js.undefined,
    sortOnLoad: js.UndefOr[Boolean] = js.undefined,
    sortRoot: String = null,
    sorters: js.Any = null,
    statefulFilters: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    storeId: String = null,
    sum: (/* field */ js.UndefOr[String], /* grouped */ js.UndefOr[Boolean]) => Double = null,
    suspendAutoSync: () => Unit = null,
    suspendEvent: /* repeated */ js.Any => Unit = null,
    suspendEvents: /* queueSuspended */ js.UndefOr[Boolean] => Unit = null,
    sync: /* options */ js.UndefOr[js.Any] => IStore = null,
    trailingBufferZone: js.UndefOr[Double] = js.undefined,
    un: (/* eventName */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    uses: Array = null
  ): IPropertyStore = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(js.Any.fromFunction1(add))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addFilter != null) __obj.updateDynamic("addFilter")(js.Any.fromFunction2(addFilter))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction4(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (addSorted != null) __obj.updateDynamic("addSorted")(js.Any.fromFunction1(addSorted))
    if (aggregate != null) __obj.updateDynamic("aggregate")(js.Any.fromFunction4(aggregate))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(autoDestroy)) __obj.updateDynamic("autoDestroy")(autoDestroy.get.asInstanceOf[js.Any])
    if (autoLoad != null) __obj.updateDynamic("autoLoad")(autoLoad.asInstanceOf[js.Any])
    if (!js.isUndefined(autoSync)) __obj.updateDynamic("autoSync")(autoSync.get.asInstanceOf[js.Any])
    if (average != null) __obj.updateDynamic("average")(js.Any.fromFunction2(average))
    if (batchUpdateMode != null) __obj.updateDynamic("batchUpdateMode")(batchUpdateMode.asInstanceOf[js.Any])
    if (!js.isUndefined(buffered)) __obj.updateDynamic("buffered")(buffered.get.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clearFilter != null) __obj.updateDynamic("clearFilter")(js.Any.fromFunction1(clearFilter))
    if (clearGrouping != null) __obj.updateDynamic("clearGrouping")(js.Any.fromFunction0(clearGrouping))
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (clearManagedListeners != null) __obj.updateDynamic("clearManagedListeners")(js.Any.fromFunction0(clearManagedListeners))
    if (!js.isUndefined(clearOnPageLoad)) __obj.updateDynamic("clearOnPageLoad")(clearOnPageLoad.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clearRemovedOnLoad)) __obj.updateDynamic("clearRemovedOnLoad")(clearRemovedOnLoad.get.asInstanceOf[js.Any])
    if (collect != null) __obj.updateDynamic("collect")(js.Any.fromFunction3(collect))
    if (commitChanges != null) __obj.updateDynamic("commitChanges")(js.Any.fromFunction0(commitChanges))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(js.Any.fromFunction1(count))
    if (!js.isUndefined(currentPage)) __obj.updateDynamic("currentPage")(currentPage.get.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (defaultProxyType != null) __obj.updateDynamic("defaultProxyType")(defaultProxyType.asInstanceOf[js.Any])
    if (defaultSortDirection != null) __obj.updateDynamic("defaultSortDirection")(defaultSortDirection.asInstanceOf[js.Any])
    if (each != null) __obj.updateDynamic("each")(js.Any.fromFunction2(each))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction2(filter))
    if (filterBy != null) __obj.updateDynamic("filterBy")(js.Any.fromFunction2(filterBy))
    if (!js.isUndefined(filterOnLoad)) __obj.updateDynamic("filterOnLoad")(filterOnLoad.get.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (find != null) __obj.updateDynamic("find")(js.Any.fromFunction6(find))
    if (findBy != null) __obj.updateDynamic("findBy")(js.Any.fromFunction3(findBy))
    if (findExact != null) __obj.updateDynamic("findExact")(js.Any.fromFunction3(findExact))
    if (findRecord != null) __obj.updateDynamic("findRecord")(js.Any.fromFunction6(findRecord))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(js.Any.fromFunction2(fireEventArgs))
    if (first != null) __obj.updateDynamic("first")(js.Any.fromFunction1(first))
    if (generateComparator != null) __obj.updateDynamic("generateComparator")(js.Any.fromFunction0(generateComparator))
    if (getAt != null) __obj.updateDynamic("getAt")(js.Any.fromFunction1(getAt))
    if (getById != null) __obj.updateDynamic("getById")(js.Any.fromFunction1(getById))
    if (getCount != null) __obj.updateDynamic("getCount")(js.Any.fromFunction0(getCount))
    if (getFirstSorter != null) __obj.updateDynamic("getFirstSorter")(js.Any.fromFunction0(getFirstSorter))
    if (getGroupString != null) __obj.updateDynamic("getGroupString")(js.Any.fromFunction1(getGroupString))
    if (getGroups != null) __obj.updateDynamic("getGroups")(js.Any.fromFunction1(getGroups))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getModifiedRecords != null) __obj.updateDynamic("getModifiedRecords")(js.Any.fromFunction0(getModifiedRecords))
    if (getNewRecords != null) __obj.updateDynamic("getNewRecords")(js.Any.fromFunction0(getNewRecords))
    if (getPageFromRecordIndex != null) __obj.updateDynamic("getPageFromRecordIndex")(js.Any.fromFunction1(getPageFromRecordIndex))
    if (getProxy != null) __obj.updateDynamic("getProxy")(js.Any.fromFunction0(getProxy))
    if (getRange != null) __obj.updateDynamic("getRange")(js.Any.fromFunction3(getRange))
    if (getRemovedRecords != null) __obj.updateDynamic("getRemovedRecords")(js.Any.fromFunction0(getRemovedRecords))
    if (getTotalCount != null) __obj.updateDynamic("getTotalCount")(js.Any.fromFunction0(getTotalCount))
    if (getUpdatedRecords != null) __obj.updateDynamic("getUpdatedRecords")(js.Any.fromFunction0(getUpdatedRecords))
    if (group != null) __obj.updateDynamic("group")(js.Any.fromFunction2(group))
    if (groupDir != null) __obj.updateDynamic("groupDir")(groupDir.asInstanceOf[js.Any])
    if (groupField != null) __obj.updateDynamic("groupField")(groupField.asInstanceOf[js.Any])
    if (groupers != null) __obj.updateDynamic("groupers")(groupers.asInstanceOf[js.Any])
    if (guaranteeRange != null) __obj.updateDynamic("guaranteeRange")(js.Any.fromFunction5(guaranteeRange))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners.asInstanceOf[js.Any])
    if (indexOf != null) __obj.updateDynamic("indexOf")(js.Any.fromFunction1(indexOf))
    if (indexOfId != null) __obj.updateDynamic("indexOfId")(js.Any.fromFunction1(indexOfId))
    if (indexOfTotal != null) __obj.updateDynamic("indexOfTotal")(js.Any.fromFunction1(indexOfTotal))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (initSortable != null) __obj.updateDynamic("initSortable")(js.Any.fromFunction0(initSortable))
    if (insert != null) __obj.updateDynamic("insert")(js.Any.fromFunction2(insert))
    if (!js.isUndefined(isDestroyed)) __obj.updateDynamic("isDestroyed")(isDestroyed.get.asInstanceOf[js.Any])
    if (isFiltered != null) __obj.updateDynamic("isFiltered")(js.Any.fromFunction0(isFiltered))
    if (isGrouped != null) __obj.updateDynamic("isGrouped")(js.Any.fromFunction0(isGrouped))
    if (isLoading != null) __obj.updateDynamic("isLoading")(js.Any.fromFunction0(isLoading))
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isSortable)) __obj.updateDynamic("isSortable")(isSortable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isStore)) __obj.updateDynamic("isStore")(isStore.get.asInstanceOf[js.Any])
    if (last != null) __obj.updateDynamic("last")(js.Any.fromFunction1(last))
    if (!js.isUndefined(leadingBufferZone)) __obj.updateDynamic("leadingBufferZone")(leadingBufferZone.get.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1(load))
    if (loadData != null) __obj.updateDynamic("loadData")(js.Any.fromFunction2(loadData))
    if (loadPage != null) __obj.updateDynamic("loadPage")(js.Any.fromFunction2(loadPage))
    if (loadRawData != null) __obj.updateDynamic("loadRawData")(js.Any.fromFunction2(loadRawData))
    if (loadRecords != null) __obj.updateDynamic("loadRecords")(js.Any.fromFunction2(loadRecords))
    if (max != null) __obj.updateDynamic("max")(js.Any.fromFunction2(max))
    if (min != null) __obj.updateDynamic("min")(js.Any.fromFunction2(min))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (nextPage != null) __obj.updateDynamic("nextPage")(js.Any.fromFunction1(nextPage))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction4(on))
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    if (prefetch != null) __obj.updateDynamic("prefetch")(js.Any.fromFunction1(prefetch))
    if (prefetchPage != null) __obj.updateDynamic("prefetchPage")(js.Any.fromFunction2(prefetchPage))
    if (prefetchRange != null) __obj.updateDynamic("prefetchRange")(js.Any.fromFunction2(prefetchRange))
    if (previousPage != null) __obj.updateDynamic("previousPage")(js.Any.fromFunction1(previousPage))
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (!js.isUndefined(purgePageCount)) __obj.updateDynamic("purgePageCount")(purgePageCount.get.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(js.Any.fromFunction5(query))
    if (queryBy != null) __obj.updateDynamic("queryBy")(js.Any.fromFunction2(queryBy))
    if (rejectChanges != null) __obj.updateDynamic("rejectChanges")(js.Any.fromFunction0(rejectChanges))
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction3(relayEvents))
    if (reload != null) __obj.updateDynamic("reload")(js.Any.fromFunction1(reload))
    if (!js.isUndefined(remoteFilter)) __obj.updateDynamic("remoteFilter")(remoteFilter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(remoteGroup)) __obj.updateDynamic("remoteGroup")(remoteGroup.get.asInstanceOf[js.Any])
    if (!js.isUndefined(remoteSort)) __obj.updateDynamic("remoteSort")(remoteSort.get.asInstanceOf[js.Any])
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction1(remove))
    if (removeAll != null) __obj.updateDynamic("removeAll")(js.Any.fromFunction1(removeAll))
    if (removeAt != null) __obj.updateDynamic("removeAt")(js.Any.fromFunction2(removeAt))
    if (removeFilter != null) __obj.updateDynamic("removeFilter")(js.Any.fromFunction2(removeFilter))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction3(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (removed != null) __obj.updateDynamic("removed")(removed.asInstanceOf[js.Any])
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (resumeAutoSync != null) __obj.updateDynamic("resumeAutoSync")(js.Any.fromFunction0(resumeAutoSync))
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(js.Any.fromFunction1(resumeEvent))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction0(resumeEvents))
    if (save != null) __obj.updateDynamic("save")(js.Any.fromFunction0(save))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setProxy != null) __obj.updateDynamic("setProxy")(js.Any.fromFunction1(setProxy))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.get.asInstanceOf[js.Any])
    if (snapshot != null) __obj.updateDynamic("snapshot")(snapshot.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction0(sort))
    if (!js.isUndefined(sortOnFilter)) __obj.updateDynamic("sortOnFilter")(sortOnFilter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sortOnLoad)) __obj.updateDynamic("sortOnLoad")(sortOnLoad.get.asInstanceOf[js.Any])
    if (sortRoot != null) __obj.updateDynamic("sortRoot")(sortRoot.asInstanceOf[js.Any])
    if (sorters != null) __obj.updateDynamic("sorters")(sorters.asInstanceOf[js.Any])
    if (!js.isUndefined(statefulFilters)) __obj.updateDynamic("statefulFilters")(statefulFilters.get.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (storeId != null) __obj.updateDynamic("storeId")(storeId.asInstanceOf[js.Any])
    if (sum != null) __obj.updateDynamic("sum")(js.Any.fromFunction2(sum))
    if (suspendAutoSync != null) __obj.updateDynamic("suspendAutoSync")(js.Any.fromFunction0(suspendAutoSync))
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(js.Any.fromFunction1(suspendEvent))
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction1(suspendEvents))
    if (sync != null) __obj.updateDynamic("sync")(js.Any.fromFunction1(sync))
    if (!js.isUndefined(trailingBufferZone)) __obj.updateDynamic("trailingBufferZone")(trailingBufferZone.get.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction3(un))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyStore]
  }
}

