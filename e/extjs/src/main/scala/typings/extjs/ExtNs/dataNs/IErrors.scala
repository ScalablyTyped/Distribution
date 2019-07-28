package typings.extjs.ExtNs.dataNs

import typings.extjs.ExtNs.Array
import typings.extjs.ExtNs.IClass
import typings.extjs.ExtNs.utilNs.IMixedCollection
import typings.extjs.ExtNs.utilNs.ISorter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IErrors extends IMixedCollection {
  /** [Method] Returns all of the errors for the given field
  		* @param fieldName String The field to get errors for
  		* @returns Object[] All errors for the given field
  		*/
  var getByField: js.UndefOr[js.Function1[/* fieldName */ js.UndefOr[java.lang.String], Array]] = js.undefined
  /** [Method] Returns true if there are no errors in the collection
  		* @returns Boolean
  		*/
  var isValid: js.UndefOr[js.Function0[Boolean]] = js.undefined
}

object IErrors {
  @scala.inline
  def apply(
    add: (/* key */ js.UndefOr[js.Any], /* obj */ js.UndefOr[js.Any]) => _ = null,
    addAll: /* objs */ js.UndefOr[js.Any] => Unit = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    addManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    alias: Array = null,
    allowFunctions: js.UndefOr[Boolean] = js.undefined,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clear: () => Unit = null,
    clearListeners: () => Unit = null,
    clearManagedListeners: () => Unit = null,
    clone: () => IMixedCollection = null,
    collect: (/* property */ js.UndefOr[java.lang.String], /* root */ js.UndefOr[java.lang.String], /* allowBlank */ js.UndefOr[Boolean]) => Array = null,
    config: js.Any = null,
    contains: /* o */ js.UndefOr[js.Any] => Boolean = null,
    containsKey: /* key */ js.UndefOr[java.lang.String] => Boolean = null,
    defaultSortDirection: java.lang.String = null,
    each: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    eachKey: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    enableBubble: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    extend: java.lang.String = null,
    filter: (/* property */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any], /* anyMatch */ js.UndefOr[Boolean], /* caseSensitive */ js.UndefOr[Boolean]) => IMixedCollection = null,
    filterBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IMixedCollection = null,
    find: () => Unit = null,
    findBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _ = null,
    findIndex: (/* property */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[js.Any], /* start */ js.UndefOr[Double], /* anyMatch */ js.UndefOr[Boolean], /* caseSensitive */ js.UndefOr[Boolean]) => Double = null,
    findIndexBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* start */ js.UndefOr[Double]) => Double = null,
    findInsertionIndex: (/* newItem */ js.UndefOr[js.Any], /* sorterFn */ js.UndefOr[js.Any]) => Double = null,
    fireEvent: (/* eventName */ java.lang.String, /* repeated */ js.Any) => Boolean = null,
    fireEventArgs: (/* eventName */ js.UndefOr[java.lang.String], /* args */ js.UndefOr[Array]) => Boolean = null,
    first: () => _ = null,
    generateComparator: () => Unit = null,
    get: /* key */ js.UndefOr[js.Any] => _ = null,
    getAt: /* index */ js.UndefOr[Double] => _ = null,
    getByField: /* fieldName */ js.UndefOr[java.lang.String] => Array = null,
    getByKey: /* key */ js.UndefOr[js.Any] => _ = null,
    getCount: () => Double = null,
    getFirstSorter: () => ISorter = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getKey: /* item */ js.UndefOr[js.Any] => _ = null,
    getRange: (/* startIndex */ js.UndefOr[Double], /* endIndex */ js.UndefOr[Double]) => Array = null,
    hasListener: /* eventName */ js.UndefOr[java.lang.String] => Boolean = null,
    hasListeners: js.Any = null,
    indexOf: /* o */ js.UndefOr[js.Any] => Double = null,
    indexOfKey: /* key */ js.UndefOr[java.lang.String] => Double = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IErrors = null,
    initSortable: () => Unit = null,
    insert: (/* index */ js.UndefOr[Double], /* key */ js.UndefOr[js.Any], /* o */ js.UndefOr[js.Any]) => _ = null,
    isMixedCollection: js.UndefOr[Boolean] = js.undefined,
    isObservable: js.UndefOr[Boolean] = js.undefined,
    isSortable: js.UndefOr[Boolean] = js.undefined,
    isValid: () => Boolean = null,
    last: () => _ = null,
    listeners: js.Any = null,
    mixins: js.Any = null,
    mon: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    mun: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    relayEvents: (/* origin */ js.UndefOr[js.Any], /* events */ js.UndefOr[Array], /* prefix */ js.UndefOr[java.lang.String]) => _ = null,
    remove: /* o */ js.UndefOr[js.Any] => _ = null,
    removeAll: /* items */ js.UndefOr[Array] => IMixedCollection = null,
    removeAt: /* index */ js.UndefOr[Double] => _ = null,
    removeAtKey: /* key */ js.UndefOr[java.lang.String] => _ = null,
    removeListener: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    removeManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    removeRange: (/* index */ js.UndefOr[Double], /* removeCount */ js.UndefOr[Double]) => _ = null,
    reorder: /* mapping */ js.UndefOr[js.Any] => Unit = null,
    replace: (/* key */ js.UndefOr[java.lang.String], /* o */ js.UndefOr[js.Any]) => _ = null,
    requires: Array = null,
    resumeEvent: /* repeated */ js.Any => Unit = null,
    resumeEvents: () => Unit = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    sort: (/* sorters */ js.UndefOr[js.Any], /* direction */ js.UndefOr[java.lang.String]) => Array = null,
    sortBy: /* sorterFn */ js.UndefOr[js.Any] => Unit = null,
    sortByKey: (/* direction */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any]) => Unit = null,
    sortRoot: java.lang.String = null,
    sorters: js.Any = null,
    statics: js.Any = null,
    sum: (/* property */ js.UndefOr[java.lang.String], /* root */ js.UndefOr[java.lang.String], /* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double]) => Double = null,
    suspendEvent: /* repeated */ js.Any => Unit = null,
    suspendEvents: /* queueSuspended */ js.UndefOr[Boolean] => Unit = null,
    un: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    updateKey: (/* oldKey */ js.UndefOr[js.Any], /* newKey */ js.UndefOr[js.Any]) => Unit = null,
    uses: Array = null
  ): IErrors = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(js.Any.fromFunction2(add))
    if (addAll != null) __obj.updateDynamic("addAll")(js.Any.fromFunction1(addAll))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction4(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (!js.isUndefined(allowFunctions)) __obj.updateDynamic("allowFunctions")(allowFunctions)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clear != null) __obj.updateDynamic("clear")(js.Any.fromFunction0(clear))
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (clearManagedListeners != null) __obj.updateDynamic("clearManagedListeners")(js.Any.fromFunction0(clearManagedListeners))
    if (clone != null) __obj.updateDynamic("clone")(js.Any.fromFunction0(clone))
    if (collect != null) __obj.updateDynamic("collect")(js.Any.fromFunction3(collect))
    if (config != null) __obj.updateDynamic("config")(config)
    if (contains != null) __obj.updateDynamic("contains")(js.Any.fromFunction1(contains))
    if (containsKey != null) __obj.updateDynamic("containsKey")(js.Any.fromFunction1(containsKey))
    if (defaultSortDirection != null) __obj.updateDynamic("defaultSortDirection")(defaultSortDirection)
    if (each != null) __obj.updateDynamic("each")(js.Any.fromFunction2(each))
    if (eachKey != null) __obj.updateDynamic("eachKey")(js.Any.fromFunction2(eachKey))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction4(filter))
    if (filterBy != null) __obj.updateDynamic("filterBy")(js.Any.fromFunction2(filterBy))
    if (find != null) __obj.updateDynamic("find")(js.Any.fromFunction0(find))
    if (findBy != null) __obj.updateDynamic("findBy")(js.Any.fromFunction2(findBy))
    if (findIndex != null) __obj.updateDynamic("findIndex")(js.Any.fromFunction5(findIndex))
    if (findIndexBy != null) __obj.updateDynamic("findIndexBy")(js.Any.fromFunction3(findIndexBy))
    if (findInsertionIndex != null) __obj.updateDynamic("findInsertionIndex")(js.Any.fromFunction2(findInsertionIndex))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(js.Any.fromFunction2(fireEventArgs))
    if (first != null) __obj.updateDynamic("first")(js.Any.fromFunction0(first))
    if (generateComparator != null) __obj.updateDynamic("generateComparator")(js.Any.fromFunction0(generateComparator))
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction1(get))
    if (getAt != null) __obj.updateDynamic("getAt")(js.Any.fromFunction1(getAt))
    if (getByField != null) __obj.updateDynamic("getByField")(js.Any.fromFunction1(getByField))
    if (getByKey != null) __obj.updateDynamic("getByKey")(js.Any.fromFunction1(getByKey))
    if (getCount != null) __obj.updateDynamic("getCount")(js.Any.fromFunction0(getCount))
    if (getFirstSorter != null) __obj.updateDynamic("getFirstSorter")(js.Any.fromFunction0(getFirstSorter))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getKey != null) __obj.updateDynamic("getKey")(js.Any.fromFunction1(getKey))
    if (getRange != null) __obj.updateDynamic("getRange")(js.Any.fromFunction2(getRange))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners)
    if (indexOf != null) __obj.updateDynamic("indexOf")(js.Any.fromFunction1(indexOf))
    if (indexOfKey != null) __obj.updateDynamic("indexOfKey")(js.Any.fromFunction1(indexOfKey))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (initSortable != null) __obj.updateDynamic("initSortable")(js.Any.fromFunction0(initSortable))
    if (insert != null) __obj.updateDynamic("insert")(js.Any.fromFunction3(insert))
    if (!js.isUndefined(isMixedCollection)) __obj.updateDynamic("isMixedCollection")(isMixedCollection)
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable)
    if (!js.isUndefined(isSortable)) __obj.updateDynamic("isSortable")(isSortable)
    if (isValid != null) __obj.updateDynamic("isValid")(js.Any.fromFunction0(isValid))
    if (last != null) __obj.updateDynamic("last")(js.Any.fromFunction0(last))
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction4(on))
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction3(relayEvents))
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction1(remove))
    if (removeAll != null) __obj.updateDynamic("removeAll")(js.Any.fromFunction1(removeAll))
    if (removeAt != null) __obj.updateDynamic("removeAt")(js.Any.fromFunction1(removeAt))
    if (removeAtKey != null) __obj.updateDynamic("removeAtKey")(js.Any.fromFunction1(removeAtKey))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction3(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (removeRange != null) __obj.updateDynamic("removeRange")(js.Any.fromFunction2(removeRange))
    if (reorder != null) __obj.updateDynamic("reorder")(js.Any.fromFunction1(reorder))
    if (replace != null) __obj.updateDynamic("replace")(js.Any.fromFunction2(replace))
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(js.Any.fromFunction1(resumeEvent))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction0(resumeEvents))
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction2(sort))
    if (sortBy != null) __obj.updateDynamic("sortBy")(js.Any.fromFunction1(sortBy))
    if (sortByKey != null) __obj.updateDynamic("sortByKey")(js.Any.fromFunction2(sortByKey))
    if (sortRoot != null) __obj.updateDynamic("sortRoot")(sortRoot)
    if (sorters != null) __obj.updateDynamic("sorters")(sorters)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (sum != null) __obj.updateDynamic("sum")(js.Any.fromFunction4(sum))
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(js.Any.fromFunction1(suspendEvent))
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction1(suspendEvents))
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction3(un))
    if (updateKey != null) __obj.updateDynamic("updateKey")(js.Any.fromFunction2(updateKey))
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IErrors]
  }
}

