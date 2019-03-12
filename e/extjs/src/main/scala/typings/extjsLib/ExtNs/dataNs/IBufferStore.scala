package typings
package extjsLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBufferStore extends IStore

object IBufferStore {
  @scala.inline
  def apply(
    add: /* model */ js.UndefOr[js.Any] => extjsLib.ExtNs.Array = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => scala.Unit = null,
    addFilter: (/* filters */ js.UndefOr[js.Any], /* applyFilters */ js.UndefOr[scala.Boolean]) => scala.Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    addManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    addSorted: /* record */ js.UndefOr[IRecord] => scala.Unit = null,
    aggregate: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* grouped */ js.UndefOr[scala.Boolean], /* args */ js.UndefOr[extjsLib.ExtNs.Array]) => _ = null,
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    autoDestroy: js.UndefOr[scala.Boolean] = js.undefined,
    autoLoad: js.Any = null,
    autoSync: js.UndefOr[scala.Boolean] = js.undefined,
    average: (/* field */ js.UndefOr[java.lang.String], /* grouped */ js.UndefOr[scala.Boolean]) => _ = null,
    batchUpdateMode: java.lang.String = null,
    buffered: js.UndefOr[scala.Boolean] = js.undefined,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clearFilter: /* suppressEvent */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    clearGrouping: () => scala.Unit = null,
    clearListeners: () => scala.Unit = null,
    clearManagedListeners: () => scala.Unit = null,
    clearOnPageLoad: js.UndefOr[scala.Boolean] = js.undefined,
    clearRemovedOnLoad: js.UndefOr[scala.Boolean] = js.undefined,
    collect: (/* dataIndex */ js.UndefOr[java.lang.String], /* allowNull */ js.UndefOr[scala.Boolean], /* bypassFilter */ js.UndefOr[scala.Boolean]) => extjsLib.ExtNs.Array = null,
    commitChanges: () => scala.Unit = null,
    config: js.Any = null,
    count: /* grouped */ js.UndefOr[scala.Boolean] => scala.Double = null,
    currentPage: scala.Int | scala.Double = null,
    data: js.Any = null,
    defaultProxyType: java.lang.String = null,
    defaultSortDirection: java.lang.String = null,
    each: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    enableBubble: /* eventNames */ js.UndefOr[js.Any] => scala.Unit = null,
    extend: java.lang.String = null,
    fields: extjsLib.ExtNs.Array = null,
    filter: (/* filters */ js.UndefOr[js.Any], /* value */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    filterBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    filterOnLoad: js.UndefOr[scala.Boolean] = js.undefined,
    filters: js.Any = null,
    find: (/* fieldName */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[scala.Double], /* anyMatch */ js.UndefOr[scala.Boolean], /* caseSensitive */ js.UndefOr[scala.Boolean], /* exactMatch */ js.UndefOr[scala.Boolean]) => scala.Double = null,
    findBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[scala.Double]) => scala.Double = null,
    findExact: (/* fieldName */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[scala.Double]) => scala.Double = null,
    findRecord: (/* fieldName */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[scala.Double], /* anyMatch */ js.UndefOr[scala.Boolean], /* caseSensitive */ js.UndefOr[scala.Boolean], /* exactMatch */ js.UndefOr[scala.Boolean]) => IModel = null,
    fireEvent: (/* eventName */ java.lang.String, /* repeated */ js.Any) => scala.Boolean = null,
    fireEventArgs: (/* eventName */ js.UndefOr[java.lang.String], /* args */ js.UndefOr[extjsLib.ExtNs.Array]) => scala.Boolean = null,
    first: /* grouped */ js.UndefOr[scala.Boolean] => _ = null,
    generateComparator: () => scala.Unit = null,
    getAt: /* index */ js.UndefOr[scala.Double] => IModel = null,
    getById: /* id */ js.UndefOr[js.Any] => IModel = null,
    getCount: () => scala.Double = null,
    getFirstSorter: () => extjsLib.ExtNs.utilNs.ISorter = null,
    getGroupString: /* instance */ js.UndefOr[IModel] => java.lang.String = null,
    getGroups: /* groupName */ js.UndefOr[java.lang.String] => _ = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getModifiedRecords: () => extjsLib.ExtNs.Array = null,
    getNewRecords: () => extjsLib.ExtNs.Array = null,
    getPageFromRecordIndex: /* index */ js.UndefOr[scala.Double] => scala.Double = null,
    getProxy: () => extjsLib.ExtNs.dataNs.proxyNs.IProxy = null,
    getRange: (/* start */ js.UndefOr[scala.Double], /* end */ js.UndefOr[scala.Double], /* options */ js.UndefOr[js.Any]) => extjsLib.ExtNs.Array = null,
    getRemovedRecords: () => extjsLib.ExtNs.Array = null,
    getTotalCount: () => scala.Double = null,
    getUpdatedRecords: () => extjsLib.ExtNs.Array = null,
    group: (/* groupers */ js.UndefOr[js.Any], /* direction */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    groupDir: java.lang.String = null,
    groupField: java.lang.String = null,
    groupers: extjsLib.ExtNs.utilNs.IMixedCollection = null,
    guaranteeRange: (/* start */ js.UndefOr[js.Any], /* end */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    hasListener: /* eventName */ js.UndefOr[java.lang.String] => scala.Boolean = null,
    hasListeners: js.Any = null,
    indexOf: /* record */ js.UndefOr[IModel] => scala.Double = null,
    indexOfId: /* id */ js.UndefOr[java.lang.String] => scala.Double = null,
    indexOfTotal: /* record */ js.UndefOr[IModel] => scala.Double = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IBufferStore = null,
    initSortable: () => scala.Unit = null,
    insert: (/* index */ js.UndefOr[scala.Double], /* records */ js.UndefOr[extjsLib.ExtNs.Array]) => extjsLib.ExtNs.Array = null,
    isDestroyed: js.UndefOr[scala.Boolean] = js.undefined,
    isFiltered: () => scala.Boolean = null,
    isGrouped: () => scala.Boolean = null,
    isLoading: () => scala.Boolean = null,
    isObservable: js.UndefOr[scala.Boolean] = js.undefined,
    isSortable: js.UndefOr[scala.Boolean] = js.undefined,
    isStore: js.UndefOr[scala.Boolean] = js.undefined,
    last: /* grouped */ js.UndefOr[scala.Boolean] => _ = null,
    leadingBufferZone: scala.Int | scala.Double = null,
    listeners: js.Any = null,
    load: /* options */ js.UndefOr[js.Any] => scala.Unit = null,
    loadData: (/* data */ js.UndefOr[js.Any], /* append */ js.UndefOr[scala.Boolean]) => scala.Unit = null,
    loadPage: (/* page */ js.UndefOr[scala.Double], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    loadRawData: (/* data */ js.UndefOr[extjsLib.ExtNs.Array], /* append */ js.UndefOr[scala.Boolean]) => scala.Unit = null,
    loadRecords: (/* records */ js.UndefOr[extjsLib.ExtNs.Array], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    max: (/* field */ js.UndefOr[java.lang.String], /* grouped */ js.UndefOr[scala.Boolean]) => _ = null,
    min: (/* field */ js.UndefOr[java.lang.String], /* grouped */ js.UndefOr[scala.Boolean]) => _ = null,
    mixins: js.Any = null,
    model: java.lang.String = null,
    mon: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    mun: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    nextPage: /* options */ js.UndefOr[js.Any] => scala.Unit = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    pageSize: scala.Int | scala.Double = null,
    prefetch: /* options */ js.UndefOr[js.Any] => scala.Unit = null,
    prefetchPage: (/* page */ js.UndefOr[scala.Double], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    prefetchRange: (/* start */ js.UndefOr[js.Any], /* end */ js.UndefOr[js.Any]) => scala.Unit = null,
    previousPage: /* options */ js.UndefOr[js.Any] => scala.Unit = null,
    proxy: js.Any = null,
    purgePageCount: scala.Int | scala.Double = null,
    query: (/* property */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[js.Any], /* anyMatch */ js.UndefOr[scala.Boolean], /* caseSensitive */ js.UndefOr[scala.Boolean], /* exactMatch */ js.UndefOr[scala.Boolean]) => extjsLib.ExtNs.utilNs.IMixedCollection = null,
    queryBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => extjsLib.ExtNs.utilNs.IMixedCollection = null,
    rejectChanges: () => scala.Unit = null,
    relayEvents: (/* origin */ js.UndefOr[js.Any], /* events */ js.UndefOr[extjsLib.ExtNs.Array], /* prefix */ js.UndefOr[java.lang.String]) => _ = null,
    reload: /* options */ js.UndefOr[js.Any] => scala.Unit = null,
    remoteFilter: js.UndefOr[scala.Boolean] = js.undefined,
    remoteGroup: js.UndefOr[scala.Boolean] = js.undefined,
    remoteSort: js.UndefOr[scala.Boolean] = js.undefined,
    remove: /* records */ js.UndefOr[js.Any] => scala.Unit = null,
    removeAll: /* silent */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    removeAt: (/* index */ js.UndefOr[scala.Double], /* count */ js.UndefOr[scala.Double]) => scala.Unit = null,
    removeFilter: (/* toRemove */ js.UndefOr[js.Any], /* applyFilters */ js.UndefOr[scala.Boolean]) => scala.Unit = null,
    removeListener: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    removeManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    removed: extjsLib.ExtNs.Array = null,
    requires: extjsLib.ExtNs.Array = null,
    resumeAutoSync: () => scala.Unit = null,
    resumeEvent: /* repeated */ js.Any => scala.Unit = null,
    resumeEvents: () => scala.Unit = null,
    save: () => scala.Unit = null,
    self: extjsLib.ExtNs.IClass = null,
    setProxy: /* proxy */ js.UndefOr[js.Any] => extjsLib.ExtNs.dataNs.proxyNs.IProxy = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    snapshot: extjsLib.ExtNs.utilNs.IMixedCollection = null,
    sort: () => extjsLib.ExtNs.Array = null,
    sortOnFilter: js.UndefOr[scala.Boolean] = js.undefined,
    sortOnLoad: js.UndefOr[scala.Boolean] = js.undefined,
    sortRoot: java.lang.String = null,
    sorters: js.Any = null,
    statefulFilters: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    storeId: java.lang.String = null,
    sum: (/* field */ js.UndefOr[java.lang.String], /* grouped */ js.UndefOr[scala.Boolean]) => scala.Double = null,
    suspendAutoSync: () => scala.Unit = null,
    suspendEvent: /* repeated */ js.Any => scala.Unit = null,
    suspendEvents: /* queueSuspended */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    sync: /* options */ js.UndefOr[js.Any] => IStore = null,
    trailingBufferZone: scala.Int | scala.Double = null,
    un: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    uses: extjsLib.ExtNs.Array = null
  ): IBufferStore = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(js.Any.fromFunction1(add))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addFilter != null) __obj.updateDynamic("addFilter")(js.Any.fromFunction2(addFilter))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction4(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (addSorted != null) __obj.updateDynamic("addSorted")(js.Any.fromFunction1(addSorted))
    if (aggregate != null) __obj.updateDynamic("aggregate")(js.Any.fromFunction4(aggregate))
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (!js.isUndefined(autoDestroy)) __obj.updateDynamic("autoDestroy")(autoDestroy)
    if (autoLoad != null) __obj.updateDynamic("autoLoad")(autoLoad)
    if (!js.isUndefined(autoSync)) __obj.updateDynamic("autoSync")(autoSync)
    if (average != null) __obj.updateDynamic("average")(js.Any.fromFunction2(average))
    if (batchUpdateMode != null) __obj.updateDynamic("batchUpdateMode")(batchUpdateMode)
    if (!js.isUndefined(buffered)) __obj.updateDynamic("buffered")(buffered)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clearFilter != null) __obj.updateDynamic("clearFilter")(js.Any.fromFunction1(clearFilter))
    if (clearGrouping != null) __obj.updateDynamic("clearGrouping")(js.Any.fromFunction0(clearGrouping))
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (clearManagedListeners != null) __obj.updateDynamic("clearManagedListeners")(js.Any.fromFunction0(clearManagedListeners))
    if (!js.isUndefined(clearOnPageLoad)) __obj.updateDynamic("clearOnPageLoad")(clearOnPageLoad)
    if (!js.isUndefined(clearRemovedOnLoad)) __obj.updateDynamic("clearRemovedOnLoad")(clearRemovedOnLoad)
    if (collect != null) __obj.updateDynamic("collect")(js.Any.fromFunction3(collect))
    if (commitChanges != null) __obj.updateDynamic("commitChanges")(js.Any.fromFunction0(commitChanges))
    if (config != null) __obj.updateDynamic("config")(config)
    if (count != null) __obj.updateDynamic("count")(js.Any.fromFunction1(count))
    if (currentPage != null) __obj.updateDynamic("currentPage")(currentPage.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (defaultProxyType != null) __obj.updateDynamic("defaultProxyType")(defaultProxyType)
    if (defaultSortDirection != null) __obj.updateDynamic("defaultSortDirection")(defaultSortDirection)
    if (each != null) __obj.updateDynamic("each")(js.Any.fromFunction2(each))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction2(filter))
    if (filterBy != null) __obj.updateDynamic("filterBy")(js.Any.fromFunction2(filterBy))
    if (!js.isUndefined(filterOnLoad)) __obj.updateDynamic("filterOnLoad")(filterOnLoad)
    if (filters != null) __obj.updateDynamic("filters")(filters)
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
    if (groupDir != null) __obj.updateDynamic("groupDir")(groupDir)
    if (groupField != null) __obj.updateDynamic("groupField")(groupField)
    if (groupers != null) __obj.updateDynamic("groupers")(groupers)
    if (guaranteeRange != null) __obj.updateDynamic("guaranteeRange")(js.Any.fromFunction5(guaranteeRange))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners)
    if (indexOf != null) __obj.updateDynamic("indexOf")(js.Any.fromFunction1(indexOf))
    if (indexOfId != null) __obj.updateDynamic("indexOfId")(js.Any.fromFunction1(indexOfId))
    if (indexOfTotal != null) __obj.updateDynamic("indexOfTotal")(js.Any.fromFunction1(indexOfTotal))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (initSortable != null) __obj.updateDynamic("initSortable")(js.Any.fromFunction0(initSortable))
    if (insert != null) __obj.updateDynamic("insert")(js.Any.fromFunction2(insert))
    if (!js.isUndefined(isDestroyed)) __obj.updateDynamic("isDestroyed")(isDestroyed)
    if (isFiltered != null) __obj.updateDynamic("isFiltered")(js.Any.fromFunction0(isFiltered))
    if (isGrouped != null) __obj.updateDynamic("isGrouped")(js.Any.fromFunction0(isGrouped))
    if (isLoading != null) __obj.updateDynamic("isLoading")(js.Any.fromFunction0(isLoading))
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable)
    if (!js.isUndefined(isSortable)) __obj.updateDynamic("isSortable")(isSortable)
    if (!js.isUndefined(isStore)) __obj.updateDynamic("isStore")(isStore)
    if (last != null) __obj.updateDynamic("last")(js.Any.fromFunction1(last))
    if (leadingBufferZone != null) __obj.updateDynamic("leadingBufferZone")(leadingBufferZone.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1(load))
    if (loadData != null) __obj.updateDynamic("loadData")(js.Any.fromFunction2(loadData))
    if (loadPage != null) __obj.updateDynamic("loadPage")(js.Any.fromFunction2(loadPage))
    if (loadRawData != null) __obj.updateDynamic("loadRawData")(js.Any.fromFunction2(loadRawData))
    if (loadRecords != null) __obj.updateDynamic("loadRecords")(js.Any.fromFunction2(loadRecords))
    if (max != null) __obj.updateDynamic("max")(js.Any.fromFunction2(max))
    if (min != null) __obj.updateDynamic("min")(js.Any.fromFunction2(min))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (model != null) __obj.updateDynamic("model")(model)
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (nextPage != null) __obj.updateDynamic("nextPage")(js.Any.fromFunction1(nextPage))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction4(on))
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (prefetch != null) __obj.updateDynamic("prefetch")(js.Any.fromFunction1(prefetch))
    if (prefetchPage != null) __obj.updateDynamic("prefetchPage")(js.Any.fromFunction2(prefetchPage))
    if (prefetchRange != null) __obj.updateDynamic("prefetchRange")(js.Any.fromFunction2(prefetchRange))
    if (previousPage != null) __obj.updateDynamic("previousPage")(js.Any.fromFunction1(previousPage))
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (purgePageCount != null) __obj.updateDynamic("purgePageCount")(purgePageCount.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(js.Any.fromFunction5(query))
    if (queryBy != null) __obj.updateDynamic("queryBy")(js.Any.fromFunction2(queryBy))
    if (rejectChanges != null) __obj.updateDynamic("rejectChanges")(js.Any.fromFunction0(rejectChanges))
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction3(relayEvents))
    if (reload != null) __obj.updateDynamic("reload")(js.Any.fromFunction1(reload))
    if (!js.isUndefined(remoteFilter)) __obj.updateDynamic("remoteFilter")(remoteFilter)
    if (!js.isUndefined(remoteGroup)) __obj.updateDynamic("remoteGroup")(remoteGroup)
    if (!js.isUndefined(remoteSort)) __obj.updateDynamic("remoteSort")(remoteSort)
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction1(remove))
    if (removeAll != null) __obj.updateDynamic("removeAll")(js.Any.fromFunction1(removeAll))
    if (removeAt != null) __obj.updateDynamic("removeAt")(js.Any.fromFunction2(removeAt))
    if (removeFilter != null) __obj.updateDynamic("removeFilter")(js.Any.fromFunction2(removeFilter))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction3(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (removed != null) __obj.updateDynamic("removed")(removed)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (resumeAutoSync != null) __obj.updateDynamic("resumeAutoSync")(js.Any.fromFunction0(resumeAutoSync))
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(js.Any.fromFunction1(resumeEvent))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction0(resumeEvents))
    if (save != null) __obj.updateDynamic("save")(js.Any.fromFunction0(save))
    if (self != null) __obj.updateDynamic("self")(self)
    if (setProxy != null) __obj.updateDynamic("setProxy")(js.Any.fromFunction1(setProxy))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (snapshot != null) __obj.updateDynamic("snapshot")(snapshot)
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction0(sort))
    if (!js.isUndefined(sortOnFilter)) __obj.updateDynamic("sortOnFilter")(sortOnFilter)
    if (!js.isUndefined(sortOnLoad)) __obj.updateDynamic("sortOnLoad")(sortOnLoad)
    if (sortRoot != null) __obj.updateDynamic("sortRoot")(sortRoot)
    if (sorters != null) __obj.updateDynamic("sorters")(sorters)
    if (!js.isUndefined(statefulFilters)) __obj.updateDynamic("statefulFilters")(statefulFilters)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (storeId != null) __obj.updateDynamic("storeId")(storeId)
    if (sum != null) __obj.updateDynamic("sum")(js.Any.fromFunction2(sum))
    if (suspendAutoSync != null) __obj.updateDynamic("suspendAutoSync")(js.Any.fromFunction0(suspendAutoSync))
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(js.Any.fromFunction1(suspendEvent))
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction1(suspendEvents))
    if (sync != null) __obj.updateDynamic("sync")(js.Any.fromFunction1(sync))
    if (trailingBufferZone != null) __obj.updateDynamic("trailingBufferZone")(trailingBufferZone.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction3(un))
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IBufferStore]
  }
}

