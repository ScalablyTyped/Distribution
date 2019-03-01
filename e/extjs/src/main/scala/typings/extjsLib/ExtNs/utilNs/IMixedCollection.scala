package typings
package extjsLib.ExtNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- extjsLib.ExtNs.utilNs.ISortable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined defaultSortDirection, sortRoot, sorters, isSortable, generateComparator, getFirstSorter, initSortable, sort */ trait IMixedCollection extends IAbstractMixedCollection {
  /** [Config Option] (String) */
  var defaultSortDirection: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Calculates the insertion index of the new item based upon the comparison function passed or the current sort order
  		* @param newItem Object The new object to find the insertion position of.
  		* @param sorterFn Function The function to sort by. This is the same as the sorting function passed to sortBy. It accepts 2 items from this MixedCollection, and returns -1 0, or 1 depending on the relative sort positions of the 2 compared items. If omitted, a function generated from the currently defined set of sorters will be used.
  		* @returns Number The insertion point to add the new item into this MixedCollection at using insert
  		*/
  var findInsertionIndex: js.UndefOr[
    js.Function2[/* newItem */ js.UndefOr[js.Any], /* sorterFn */ js.UndefOr[js.Any], scala.Double]
  ] = js.undefined
  /** [Method] Returns a comparator function which compares two items and returns 1 0 or 1 depending on the currently defined set  */
  var generateComparator: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Gets the first sorter from the sorters collection excluding any groupers that may be in place
  		* @returns Ext.util.Sorter The sorter, null if none exist
  		*/
  var getFirstSorter: js.UndefOr[js.Function0[ISorter]] = js.undefined
  /** [Method] Performs initialization of this mixin  */
  var initSortable: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Property] (Boolean) */
  var isSortable: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Reorders each of the items based on a mapping from old index to new index
  		* @param mapping Object Mapping from old item index to new item index
  		*/
  var reorder: js.UndefOr[js.Function1[/* mapping */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
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
  /** [Method] Sorts the collection by a single sorter function
  		* @param sorterFn Function The function to sort by
  		*/
  var sortBy: js.UndefOr[js.Function1[/* sorterFn */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sorts this collection by keys
  		* @param direction String 'ASC' or 'DESC'. Defaults to 'ASC'.
  		* @param fn Function Comparison function that defines the sort order. Defaults to sorting by case insensitive string.
  		*/
  var sortByKey: js.UndefOr[
    js.Function2[
      /* direction */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (String) */
  var sortRoot: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Ext.util.Sorter[]/Object[]) */
  var sorters: js.UndefOr[js.Any] = js.undefined
}

object IMixedCollection {
  @scala.inline
  def apply(
    add: js.Function2[/* key */ js.UndefOr[js.Any], /* obj */ js.UndefOr[js.Any], _] = null,
    addAll: js.Function1[/* objs */ js.UndefOr[js.Any], scala.Unit] = null,
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
    allowFunctions: js.UndefOr[scala.Boolean] = js.undefined,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    clear: js.Function0[scala.Unit] = null,
    clearListeners: js.Function0[scala.Unit] = null,
    clearManagedListeners: js.Function0[scala.Unit] = null,
    clone: js.Function0[IMixedCollection] = null,
    collect: js.Function3[
      /* property */ js.UndefOr[java.lang.String], 
      /* root */ js.UndefOr[java.lang.String], 
      /* allowBlank */ js.UndefOr[scala.Boolean], 
      extjsLib.ExtNs.Array
    ] = null,
    config: js.Any = null,
    contains: js.Function1[/* o */ js.UndefOr[js.Any], scala.Boolean] = null,
    containsKey: js.Function1[/* key */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    defaultSortDirection: java.lang.String = null,
    each: js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], scala.Unit] = null,
    eachKey: js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], scala.Unit] = null,
    enableBubble: js.Function1[/* eventNames */ js.UndefOr[js.Any], scala.Unit] = null,
    extend: java.lang.String = null,
    filter: js.Function4[
      /* property */ js.UndefOr[js.Any], 
      /* value */ js.UndefOr[js.Any], 
      /* anyMatch */ js.UndefOr[scala.Boolean], 
      /* caseSensitive */ js.UndefOr[scala.Boolean], 
      IMixedCollection
    ] = null,
    filterBy: js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], IMixedCollection] = null,
    find: js.Function0[scala.Unit] = null,
    findBy: js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], _] = null,
    findIndex: js.Function5[
      /* property */ js.UndefOr[java.lang.String], 
      /* value */ js.UndefOr[js.Any], 
      /* start */ js.UndefOr[scala.Double], 
      /* anyMatch */ js.UndefOr[scala.Boolean], 
      /* caseSensitive */ js.UndefOr[scala.Boolean], 
      scala.Double
    ] = null,
    findIndexBy: js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* start */ js.UndefOr[scala.Double], 
      scala.Double
    ] = null,
    findInsertionIndex: js.Function2[/* newItem */ js.UndefOr[js.Any], /* sorterFn */ js.UndefOr[js.Any], scala.Double] = null,
    fireEvent: js.Function2[/* eventName */ java.lang.String, /* repeated */ js.Any, scala.Boolean] = null,
    fireEventArgs: js.Function2[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* args */ js.UndefOr[extjsLib.ExtNs.Array], 
      scala.Boolean
    ] = null,
    first: js.Function0[_] = null,
    generateComparator: js.Function0[scala.Unit] = null,
    get: js.Function1[/* key */ js.UndefOr[js.Any], _] = null,
    getAt: js.Function1[/* index */ js.UndefOr[scala.Double], _] = null,
    getByKey: js.Function1[/* key */ js.UndefOr[js.Any], _] = null,
    getCount: js.Function0[scala.Double] = null,
    getFirstSorter: js.Function0[ISorter] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getKey: js.Function1[/* item */ js.UndefOr[js.Any], _] = null,
    getRange: js.Function2[
      /* startIndex */ js.UndefOr[scala.Double], 
      /* endIndex */ js.UndefOr[scala.Double], 
      extjsLib.ExtNs.Array
    ] = null,
    hasListener: js.Function1[/* eventName */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    hasListeners: js.Any = null,
    indexOf: js.Function1[/* o */ js.UndefOr[js.Any], scala.Double] = null,
    indexOfKey: js.Function1[/* key */ js.UndefOr[java.lang.String], scala.Double] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], IMixedCollection] = null,
    initSortable: js.Function0[scala.Unit] = null,
    insert: js.Function3[
      /* index */ js.UndefOr[scala.Double], 
      /* key */ js.UndefOr[js.Any], 
      /* o */ js.UndefOr[js.Any], 
      _
    ] = null,
    isMixedCollection: js.UndefOr[scala.Boolean] = js.undefined,
    isObservable: js.UndefOr[scala.Boolean] = js.undefined,
    isSortable: js.UndefOr[scala.Boolean] = js.undefined,
    last: js.Function0[_] = null,
    listeners: js.Any = null,
    mixins: js.Any = null,
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
    relayEvents: js.Function3[
      /* origin */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[extjsLib.ExtNs.Array], 
      /* prefix */ js.UndefOr[java.lang.String], 
      _
    ] = null,
    remove: js.Function1[/* o */ js.UndefOr[js.Any], _] = null,
    removeAll: js.Function1[/* items */ js.UndefOr[extjsLib.ExtNs.Array], IMixedCollection] = null,
    removeAt: js.Function1[/* index */ js.UndefOr[scala.Double], _] = null,
    removeAtKey: js.Function1[/* key */ js.UndefOr[java.lang.String], _] = null,
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
    removeRange: js.Function2[/* index */ js.UndefOr[scala.Double], /* removeCount */ js.UndefOr[scala.Double], _] = null,
    reorder: js.Function1[/* mapping */ js.UndefOr[js.Any], scala.Unit] = null,
    replace: js.Function2[/* key */ js.UndefOr[java.lang.String], /* o */ js.UndefOr[js.Any], _] = null,
    requires: extjsLib.ExtNs.Array = null,
    resumeEvent: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    resumeEvents: js.Function0[scala.Unit] = null,
    self: extjsLib.ExtNs.IClass = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    sort: js.Function2[
      /* sorters */ js.UndefOr[js.Any], 
      /* direction */ js.UndefOr[java.lang.String], 
      extjsLib.ExtNs.Array
    ] = null,
    sortBy: js.Function1[/* sorterFn */ js.UndefOr[js.Any], scala.Unit] = null,
    sortByKey: js.Function2[
      /* direction */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    sortRoot: java.lang.String = null,
    sorters: js.Any = null,
    statics: js.Any = null,
    sum: js.Function4[
      /* property */ js.UndefOr[java.lang.String], 
      /* root */ js.UndefOr[java.lang.String], 
      /* start */ js.UndefOr[scala.Double], 
      /* end */ js.UndefOr[scala.Double], 
      scala.Double
    ] = null,
    suspendEvent: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    suspendEvents: js.Function1[/* queueSuspended */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    un: js.Function3[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    updateKey: js.Function2[/* oldKey */ js.UndefOr[js.Any], /* newKey */ js.UndefOr[js.Any], scala.Unit] = null,
    uses: extjsLib.ExtNs.Array = null
  ): IMixedCollection = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(add)
    if (addAll != null) __obj.updateDynamic("addAll")(addAll)
    if (addEvents != null) __obj.updateDynamic("addEvents")(addEvents)
    if (addListener != null) __obj.updateDynamic("addListener")(addListener)
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(addManagedListener)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (!js.isUndefined(allowFunctions)) __obj.updateDynamic("allowFunctions")(allowFunctions)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (clear != null) __obj.updateDynamic("clear")(clear)
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(clearListeners)
    if (clearManagedListeners != null) __obj.updateDynamic("clearManagedListeners")(clearManagedListeners)
    if (clone != null) __obj.updateDynamic("clone")(clone)
    if (collect != null) __obj.updateDynamic("collect")(collect)
    if (config != null) __obj.updateDynamic("config")(config)
    if (contains != null) __obj.updateDynamic("contains")(contains)
    if (containsKey != null) __obj.updateDynamic("containsKey")(containsKey)
    if (defaultSortDirection != null) __obj.updateDynamic("defaultSortDirection")(defaultSortDirection)
    if (each != null) __obj.updateDynamic("each")(each)
    if (eachKey != null) __obj.updateDynamic("eachKey")(eachKey)
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(enableBubble)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (filterBy != null) __obj.updateDynamic("filterBy")(filterBy)
    if (find != null) __obj.updateDynamic("find")(find)
    if (findBy != null) __obj.updateDynamic("findBy")(findBy)
    if (findIndex != null) __obj.updateDynamic("findIndex")(findIndex)
    if (findIndexBy != null) __obj.updateDynamic("findIndexBy")(findIndexBy)
    if (findInsertionIndex != null) __obj.updateDynamic("findInsertionIndex")(findInsertionIndex)
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(fireEvent)
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(fireEventArgs)
    if (first != null) __obj.updateDynamic("first")(first)
    if (generateComparator != null) __obj.updateDynamic("generateComparator")(generateComparator)
    if (get != null) __obj.updateDynamic("get")(get)
    if (getAt != null) __obj.updateDynamic("getAt")(getAt)
    if (getByKey != null) __obj.updateDynamic("getByKey")(getByKey)
    if (getCount != null) __obj.updateDynamic("getCount")(getCount)
    if (getFirstSorter != null) __obj.updateDynamic("getFirstSorter")(getFirstSorter)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getKey != null) __obj.updateDynamic("getKey")(getKey)
    if (getRange != null) __obj.updateDynamic("getRange")(getRange)
    if (hasListener != null) __obj.updateDynamic("hasListener")(hasListener)
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners)
    if (indexOf != null) __obj.updateDynamic("indexOf")(indexOf)
    if (indexOfKey != null) __obj.updateDynamic("indexOfKey")(indexOfKey)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (initSortable != null) __obj.updateDynamic("initSortable")(initSortable)
    if (insert != null) __obj.updateDynamic("insert")(insert)
    if (!js.isUndefined(isMixedCollection)) __obj.updateDynamic("isMixedCollection")(isMixedCollection)
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable)
    if (!js.isUndefined(isSortable)) __obj.updateDynamic("isSortable")(isSortable)
    if (last != null) __obj.updateDynamic("last")(last)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (mon != null) __obj.updateDynamic("mon")(mon)
    if (mun != null) __obj.updateDynamic("mun")(mun)
    if (on != null) __obj.updateDynamic("on")(on)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(relayEvents)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    if (removeAll != null) __obj.updateDynamic("removeAll")(removeAll)
    if (removeAt != null) __obj.updateDynamic("removeAt")(removeAt)
    if (removeAtKey != null) __obj.updateDynamic("removeAtKey")(removeAtKey)
    if (removeListener != null) __obj.updateDynamic("removeListener")(removeListener)
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(removeManagedListener)
    if (removeRange != null) __obj.updateDynamic("removeRange")(removeRange)
    if (reorder != null) __obj.updateDynamic("reorder")(reorder)
    if (replace != null) __obj.updateDynamic("replace")(replace)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(resumeEvent)
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(resumeEvents)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (sortBy != null) __obj.updateDynamic("sortBy")(sortBy)
    if (sortByKey != null) __obj.updateDynamic("sortByKey")(sortByKey)
    if (sortRoot != null) __obj.updateDynamic("sortRoot")(sortRoot)
    if (sorters != null) __obj.updateDynamic("sorters")(sorters)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (sum != null) __obj.updateDynamic("sum")(sum)
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(suspendEvent)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(suspendEvents)
    if (un != null) __obj.updateDynamic("un")(un)
    if (updateKey != null) __obj.updateDynamic("updateKey")(updateKey)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IMixedCollection]
  }
}

