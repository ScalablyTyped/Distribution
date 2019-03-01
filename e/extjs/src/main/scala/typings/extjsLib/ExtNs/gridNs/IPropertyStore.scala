package typings
package extjsLib.ExtNs.gridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyStore
  extends extjsLib.ExtNs.dataNs.IStore

object IPropertyStore {
  @scala.inline
  def apply(
    add: js.Function1[/* model */ js.UndefOr[js.Any], extjsLib.ExtNs.Array] = null,
    addEvents: js.Function1[/* eventNames */ js.UndefOr[js.Any], scala.Unit] = null,
    addFilter: js.Function2[
      /* filters */ js.UndefOr[js.Any], 
      /* applyFilters */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ] = null,
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
    addSorted: js.Function1[/* record */ js.UndefOr[extjsLib.ExtNs.dataNs.IRecord], scala.Unit] = null,
    aggregate: js.Function4[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* grouped */ js.UndefOr[scala.Boolean], 
      /* args */ js.UndefOr[extjsLib.ExtNs.Array], 
      _
    ] = null,
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    autoDestroy: js.UndefOr[scala.Boolean] = js.undefined,
    autoLoad: js.Any = null,
    autoSync: js.UndefOr[scala.Boolean] = js.undefined,
    average: js.Function2[/* field */ js.UndefOr[java.lang.String], /* grouped */ js.UndefOr[scala.Boolean], _] = null,
    batchUpdateMode: java.lang.String = null,
    buffered: js.UndefOr[scala.Boolean] = js.undefined,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    clearFilter: js.Function1[/* suppressEvent */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    clearGrouping: js.Function0[scala.Unit] = null,
    clearListeners: js.Function0[scala.Unit] = null,
    clearManagedListeners: js.Function0[scala.Unit] = null,
    clearOnPageLoad: js.UndefOr[scala.Boolean] = js.undefined,
    clearRemovedOnLoad: js.UndefOr[scala.Boolean] = js.undefined,
    collect: js.Function3[
      /* dataIndex */ js.UndefOr[java.lang.String], 
      /* allowNull */ js.UndefOr[scala.Boolean], 
      /* bypassFilter */ js.UndefOr[scala.Boolean], 
      extjsLib.ExtNs.Array
    ] = null,
    commitChanges: js.Function0[scala.Unit] = null,
    config: js.Any = null,
    count: js.Function1[/* grouped */ js.UndefOr[scala.Boolean], scala.Double] = null,
    currentPage: scala.Int | scala.Double = null,
    data: js.Any = null,
    defaultProxyType: java.lang.String = null,
    defaultSortDirection: java.lang.String = null,
    each: js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], scala.Unit] = null,
    enableBubble: js.Function1[/* eventNames */ js.UndefOr[js.Any], scala.Unit] = null,
    extend: java.lang.String = null,
    fields: extjsLib.ExtNs.Array = null,
    filter: js.Function2[
      /* filters */ js.UndefOr[js.Any], 
      /* value */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    filterBy: js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], scala.Unit] = null,
    filterOnLoad: js.UndefOr[scala.Boolean] = js.undefined,
    filters: js.Any = null,
    find: js.Function6[
      /* fieldName */ js.UndefOr[java.lang.String], 
      /* value */ js.UndefOr[js.Any], 
      /* startIndex */ js.UndefOr[scala.Double], 
      /* anyMatch */ js.UndefOr[scala.Boolean], 
      /* caseSensitive */ js.UndefOr[scala.Boolean], 
      /* exactMatch */ js.UndefOr[scala.Boolean], 
      scala.Double
    ] = null,
    findBy: js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* startIndex */ js.UndefOr[scala.Double], 
      scala.Double
    ] = null,
    findExact: js.Function3[
      /* fieldName */ js.UndefOr[java.lang.String], 
      /* value */ js.UndefOr[js.Any], 
      /* startIndex */ js.UndefOr[scala.Double], 
      scala.Double
    ] = null,
    findRecord: js.Function6[
      /* fieldName */ js.UndefOr[java.lang.String], 
      /* value */ js.UndefOr[js.Any], 
      /* startIndex */ js.UndefOr[scala.Double], 
      /* anyMatch */ js.UndefOr[scala.Boolean], 
      /* caseSensitive */ js.UndefOr[scala.Boolean], 
      /* exactMatch */ js.UndefOr[scala.Boolean], 
      extjsLib.ExtNs.dataNs.IModel
    ] = null,
    fireEvent: js.Function2[/* eventName */ java.lang.String, /* repeated */ js.Any, scala.Boolean] = null,
    fireEventArgs: js.Function2[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* args */ js.UndefOr[extjsLib.ExtNs.Array], 
      scala.Boolean
    ] = null,
    first: js.Function1[/* grouped */ js.UndefOr[scala.Boolean], _] = null,
    generateComparator: js.Function0[scala.Unit] = null,
    getAt: js.Function1[/* index */ js.UndefOr[scala.Double], extjsLib.ExtNs.dataNs.IModel] = null,
    getById: js.Function1[/* id */ js.UndefOr[js.Any], extjsLib.ExtNs.dataNs.IModel] = null,
    getCount: js.Function0[scala.Double] = null,
    getFirstSorter: js.Function0[extjsLib.ExtNs.utilNs.ISorter] = null,
    getGroupString: js.Function1[/* instance */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], java.lang.String] = null,
    getGroups: js.Function1[/* groupName */ js.UndefOr[java.lang.String], _] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getModifiedRecords: js.Function0[extjsLib.ExtNs.Array] = null,
    getNewRecords: js.Function0[extjsLib.ExtNs.Array] = null,
    getPageFromRecordIndex: js.Function1[/* index */ js.UndefOr[scala.Double], scala.Double] = null,
    getProxy: js.Function0[extjsLib.ExtNs.dataNs.proxyNs.IProxy] = null,
    getRange: js.Function3[
      /* start */ js.UndefOr[scala.Double], 
      /* end */ js.UndefOr[scala.Double], 
      /* options */ js.UndefOr[js.Any], 
      extjsLib.ExtNs.Array
    ] = null,
    getRemovedRecords: js.Function0[extjsLib.ExtNs.Array] = null,
    getTotalCount: js.Function0[scala.Double] = null,
    getUpdatedRecords: js.Function0[extjsLib.ExtNs.Array] = null,
    group: js.Function2[
      /* groupers */ js.UndefOr[js.Any], 
      /* direction */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    groupDir: java.lang.String = null,
    groupField: java.lang.String = null,
    groupers: extjsLib.ExtNs.utilNs.IMixedCollection = null,
    guaranteeRange: js.Function5[
      /* start */ js.UndefOr[js.Any], 
      /* end */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    hasListener: js.Function1[/* eventName */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    hasListeners: js.Any = null,
    indexOf: js.Function1[/* record */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], scala.Double] = null,
    indexOfId: js.Function1[/* id */ js.UndefOr[java.lang.String], scala.Double] = null,
    indexOfTotal: js.Function1[/* record */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], scala.Double] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], IPropertyStore] = null,
    initSortable: js.Function0[scala.Unit] = null,
    insert: js.Function2[
      /* index */ js.UndefOr[scala.Double], 
      /* records */ js.UndefOr[extjsLib.ExtNs.Array], 
      extjsLib.ExtNs.Array
    ] = null,
    isDestroyed: js.UndefOr[scala.Boolean] = js.undefined,
    isFiltered: js.Function0[scala.Boolean] = null,
    isGrouped: js.Function0[scala.Boolean] = null,
    isLoading: js.Function0[scala.Boolean] = null,
    isObservable: js.UndefOr[scala.Boolean] = js.undefined,
    isSortable: js.UndefOr[scala.Boolean] = js.undefined,
    isStore: js.UndefOr[scala.Boolean] = js.undefined,
    last: js.Function1[/* grouped */ js.UndefOr[scala.Boolean], _] = null,
    leadingBufferZone: scala.Int | scala.Double = null,
    listeners: js.Any = null,
    load: js.Function1[/* options */ js.UndefOr[js.Any], scala.Unit] = null,
    loadData: js.Function2[/* data */ js.UndefOr[js.Any], /* append */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    loadPage: js.Function2[/* page */ js.UndefOr[scala.Double], /* options */ js.UndefOr[js.Any], scala.Unit] = null,
    loadRawData: js.Function2[
      /* data */ js.UndefOr[extjsLib.ExtNs.Array], 
      /* append */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ] = null,
    loadRecords: js.Function2[
      /* records */ js.UndefOr[extjsLib.ExtNs.Array], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    max: js.Function2[/* field */ js.UndefOr[java.lang.String], /* grouped */ js.UndefOr[scala.Boolean], _] = null,
    min: js.Function2[/* field */ js.UndefOr[java.lang.String], /* grouped */ js.UndefOr[scala.Boolean], _] = null,
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
    nextPage: js.Function1[/* options */ js.UndefOr[js.Any], scala.Unit] = null,
    on: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      _
    ] = null,
    pageSize: scala.Int | scala.Double = null,
    prefetch: js.Function1[/* options */ js.UndefOr[js.Any], scala.Unit] = null,
    prefetchPage: js.Function2[/* page */ js.UndefOr[scala.Double], /* options */ js.UndefOr[js.Any], scala.Unit] = null,
    prefetchRange: js.Function2[/* start */ js.UndefOr[js.Any], /* end */ js.UndefOr[js.Any], scala.Unit] = null,
    previousPage: js.Function1[/* options */ js.UndefOr[js.Any], scala.Unit] = null,
    proxy: js.Any = null,
    purgePageCount: scala.Int | scala.Double = null,
    query: js.Function5[
      /* property */ js.UndefOr[java.lang.String], 
      /* value */ js.UndefOr[js.Any], 
      /* anyMatch */ js.UndefOr[scala.Boolean], 
      /* caseSensitive */ js.UndefOr[scala.Boolean], 
      /* exactMatch */ js.UndefOr[scala.Boolean], 
      extjsLib.ExtNs.utilNs.IMixedCollection
    ] = null,
    queryBy: js.Function2[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      extjsLib.ExtNs.utilNs.IMixedCollection
    ] = null,
    rejectChanges: js.Function0[scala.Unit] = null,
    relayEvents: js.Function3[
      /* origin */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[extjsLib.ExtNs.Array], 
      /* prefix */ js.UndefOr[java.lang.String], 
      _
    ] = null,
    reload: js.Function1[/* options */ js.UndefOr[js.Any], scala.Unit] = null,
    remoteFilter: js.UndefOr[scala.Boolean] = js.undefined,
    remoteGroup: js.UndefOr[scala.Boolean] = js.undefined,
    remoteSort: js.UndefOr[scala.Boolean] = js.undefined,
    remove: js.Function1[/* records */ js.UndefOr[js.Any], scala.Unit] = null,
    removeAll: js.Function1[/* silent */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    removeAt: js.Function2[
      /* index */ js.UndefOr[scala.Double], 
      /* count */ js.UndefOr[scala.Double], 
      scala.Unit
    ] = null,
    removeFilter: js.Function2[
      /* toRemove */ js.UndefOr[js.Any], 
      /* applyFilters */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ] = null,
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
    snapshot: extjsLib.ExtNs.utilNs.IMixedCollection = null,
    sort: js.Function0[extjsLib.ExtNs.Array] = null,
    sortOnFilter: js.UndefOr[scala.Boolean] = js.undefined,
    sortOnLoad: js.UndefOr[scala.Boolean] = js.undefined,
    sortRoot: java.lang.String = null,
    sorters: js.Any = null,
    statefulFilters: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    storeId: java.lang.String = null,
    sum: js.Function2[
      /* field */ js.UndefOr[java.lang.String], 
      /* grouped */ js.UndefOr[scala.Boolean], 
      scala.Double
    ] = null,
    suspendAutoSync: js.Function0[scala.Unit] = null,
    suspendEvent: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    suspendEvents: js.Function1[/* queueSuspended */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    sync: js.Function1[/* options */ js.UndefOr[js.Any], extjsLib.ExtNs.dataNs.IStore] = null,
    trailingBufferZone: scala.Int | scala.Double = null,
    un: js.Function3[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    uses: extjsLib.ExtNs.Array = null
  ): IPropertyStore = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(add)
    if (addEvents != null) __obj.updateDynamic("addEvents")(addEvents)
    if (addFilter != null) __obj.updateDynamic("addFilter")(addFilter)
    if (addListener != null) __obj.updateDynamic("addListener")(addListener)
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(addManagedListener)
    if (addSorted != null) __obj.updateDynamic("addSorted")(addSorted)
    if (aggregate != null) __obj.updateDynamic("aggregate")(aggregate)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (!js.isUndefined(autoDestroy)) __obj.updateDynamic("autoDestroy")(autoDestroy)
    if (autoLoad != null) __obj.updateDynamic("autoLoad")(autoLoad)
    if (!js.isUndefined(autoSync)) __obj.updateDynamic("autoSync")(autoSync)
    if (average != null) __obj.updateDynamic("average")(average)
    if (batchUpdateMode != null) __obj.updateDynamic("batchUpdateMode")(batchUpdateMode)
    if (!js.isUndefined(buffered)) __obj.updateDynamic("buffered")(buffered)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (clearFilter != null) __obj.updateDynamic("clearFilter")(clearFilter)
    if (clearGrouping != null) __obj.updateDynamic("clearGrouping")(clearGrouping)
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(clearListeners)
    if (clearManagedListeners != null) __obj.updateDynamic("clearManagedListeners")(clearManagedListeners)
    if (!js.isUndefined(clearOnPageLoad)) __obj.updateDynamic("clearOnPageLoad")(clearOnPageLoad)
    if (!js.isUndefined(clearRemovedOnLoad)) __obj.updateDynamic("clearRemovedOnLoad")(clearRemovedOnLoad)
    if (collect != null) __obj.updateDynamic("collect")(collect)
    if (commitChanges != null) __obj.updateDynamic("commitChanges")(commitChanges)
    if (config != null) __obj.updateDynamic("config")(config)
    if (count != null) __obj.updateDynamic("count")(count)
    if (currentPage != null) __obj.updateDynamic("currentPage")(currentPage.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (defaultProxyType != null) __obj.updateDynamic("defaultProxyType")(defaultProxyType)
    if (defaultSortDirection != null) __obj.updateDynamic("defaultSortDirection")(defaultSortDirection)
    if (each != null) __obj.updateDynamic("each")(each)
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(enableBubble)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (filterBy != null) __obj.updateDynamic("filterBy")(filterBy)
    if (!js.isUndefined(filterOnLoad)) __obj.updateDynamic("filterOnLoad")(filterOnLoad)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (find != null) __obj.updateDynamic("find")(find)
    if (findBy != null) __obj.updateDynamic("findBy")(findBy)
    if (findExact != null) __obj.updateDynamic("findExact")(findExact)
    if (findRecord != null) __obj.updateDynamic("findRecord")(findRecord)
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(fireEvent)
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(fireEventArgs)
    if (first != null) __obj.updateDynamic("first")(first)
    if (generateComparator != null) __obj.updateDynamic("generateComparator")(generateComparator)
    if (getAt != null) __obj.updateDynamic("getAt")(getAt)
    if (getById != null) __obj.updateDynamic("getById")(getById)
    if (getCount != null) __obj.updateDynamic("getCount")(getCount)
    if (getFirstSorter != null) __obj.updateDynamic("getFirstSorter")(getFirstSorter)
    if (getGroupString != null) __obj.updateDynamic("getGroupString")(getGroupString)
    if (getGroups != null) __obj.updateDynamic("getGroups")(getGroups)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getModifiedRecords != null) __obj.updateDynamic("getModifiedRecords")(getModifiedRecords)
    if (getNewRecords != null) __obj.updateDynamic("getNewRecords")(getNewRecords)
    if (getPageFromRecordIndex != null) __obj.updateDynamic("getPageFromRecordIndex")(getPageFromRecordIndex)
    if (getProxy != null) __obj.updateDynamic("getProxy")(getProxy)
    if (getRange != null) __obj.updateDynamic("getRange")(getRange)
    if (getRemovedRecords != null) __obj.updateDynamic("getRemovedRecords")(getRemovedRecords)
    if (getTotalCount != null) __obj.updateDynamic("getTotalCount")(getTotalCount)
    if (getUpdatedRecords != null) __obj.updateDynamic("getUpdatedRecords")(getUpdatedRecords)
    if (group != null) __obj.updateDynamic("group")(group)
    if (groupDir != null) __obj.updateDynamic("groupDir")(groupDir)
    if (groupField != null) __obj.updateDynamic("groupField")(groupField)
    if (groupers != null) __obj.updateDynamic("groupers")(groupers)
    if (guaranteeRange != null) __obj.updateDynamic("guaranteeRange")(guaranteeRange)
    if (hasListener != null) __obj.updateDynamic("hasListener")(hasListener)
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners)
    if (indexOf != null) __obj.updateDynamic("indexOf")(indexOf)
    if (indexOfId != null) __obj.updateDynamic("indexOfId")(indexOfId)
    if (indexOfTotal != null) __obj.updateDynamic("indexOfTotal")(indexOfTotal)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (initSortable != null) __obj.updateDynamic("initSortable")(initSortable)
    if (insert != null) __obj.updateDynamic("insert")(insert)
    if (!js.isUndefined(isDestroyed)) __obj.updateDynamic("isDestroyed")(isDestroyed)
    if (isFiltered != null) __obj.updateDynamic("isFiltered")(isFiltered)
    if (isGrouped != null) __obj.updateDynamic("isGrouped")(isGrouped)
    if (isLoading != null) __obj.updateDynamic("isLoading")(isLoading)
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable)
    if (!js.isUndefined(isSortable)) __obj.updateDynamic("isSortable")(isSortable)
    if (!js.isUndefined(isStore)) __obj.updateDynamic("isStore")(isStore)
    if (last != null) __obj.updateDynamic("last")(last)
    if (leadingBufferZone != null) __obj.updateDynamic("leadingBufferZone")(leadingBufferZone.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (load != null) __obj.updateDynamic("load")(load)
    if (loadData != null) __obj.updateDynamic("loadData")(loadData)
    if (loadPage != null) __obj.updateDynamic("loadPage")(loadPage)
    if (loadRawData != null) __obj.updateDynamic("loadRawData")(loadRawData)
    if (loadRecords != null) __obj.updateDynamic("loadRecords")(loadRecords)
    if (max != null) __obj.updateDynamic("max")(max)
    if (min != null) __obj.updateDynamic("min")(min)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (model != null) __obj.updateDynamic("model")(model)
    if (mon != null) __obj.updateDynamic("mon")(mon)
    if (mun != null) __obj.updateDynamic("mun")(mun)
    if (nextPage != null) __obj.updateDynamic("nextPage")(nextPage)
    if (on != null) __obj.updateDynamic("on")(on)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (prefetch != null) __obj.updateDynamic("prefetch")(prefetch)
    if (prefetchPage != null) __obj.updateDynamic("prefetchPage")(prefetchPage)
    if (prefetchRange != null) __obj.updateDynamic("prefetchRange")(prefetchRange)
    if (previousPage != null) __obj.updateDynamic("previousPage")(previousPage)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (purgePageCount != null) __obj.updateDynamic("purgePageCount")(purgePageCount.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query)
    if (queryBy != null) __obj.updateDynamic("queryBy")(queryBy)
    if (rejectChanges != null) __obj.updateDynamic("rejectChanges")(rejectChanges)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(relayEvents)
    if (reload != null) __obj.updateDynamic("reload")(reload)
    if (!js.isUndefined(remoteFilter)) __obj.updateDynamic("remoteFilter")(remoteFilter)
    if (!js.isUndefined(remoteGroup)) __obj.updateDynamic("remoteGroup")(remoteGroup)
    if (!js.isUndefined(remoteSort)) __obj.updateDynamic("remoteSort")(remoteSort)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    if (removeAll != null) __obj.updateDynamic("removeAll")(removeAll)
    if (removeAt != null) __obj.updateDynamic("removeAt")(removeAt)
    if (removeFilter != null) __obj.updateDynamic("removeFilter")(removeFilter)
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
    if (snapshot != null) __obj.updateDynamic("snapshot")(snapshot)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (!js.isUndefined(sortOnFilter)) __obj.updateDynamic("sortOnFilter")(sortOnFilter)
    if (!js.isUndefined(sortOnLoad)) __obj.updateDynamic("sortOnLoad")(sortOnLoad)
    if (sortRoot != null) __obj.updateDynamic("sortRoot")(sortRoot)
    if (sorters != null) __obj.updateDynamic("sorters")(sorters)
    if (!js.isUndefined(statefulFilters)) __obj.updateDynamic("statefulFilters")(statefulFilters)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (storeId != null) __obj.updateDynamic("storeId")(storeId)
    if (sum != null) __obj.updateDynamic("sum")(sum)
    if (suspendAutoSync != null) __obj.updateDynamic("suspendAutoSync")(suspendAutoSync)
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(suspendEvent)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(suspendEvents)
    if (sync != null) __obj.updateDynamic("sync")(sync)
    if (trailingBufferZone != null) __obj.updateDynamic("trailingBufferZone")(trailingBufferZone.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(un)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IPropertyStore]
  }
}

