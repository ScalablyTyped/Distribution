package typings.extjs.ExtNs.selectionNs

import typings.extjs.ExtNs.Array
import typings.extjs.ExtNs.IClass
import typings.extjs.ExtNs.dataNs.IAbstractStore
import typings.extjs.ExtNs.utilNs.IMixedCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICheckboxModel extends IRowModel {
  /** [Config Option] (Boolean) */
  var checkOnly: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var checkSelector: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Retrieve a configuration to be used in a HeaderContainer  */
  var getHeaderConfig: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Number/String) */
  var injectCheckbox: js.UndefOr[js.Any] = js.undefined
  /** [Method] Toggle between selecting all and deselecting all when clicking on a checkbox header
  		* @param headerCt Object
  		* @param header Object
  		* @param e Object
  		*/
  var onHeaderClick: js.UndefOr[
    js.Function3[
      /* headerCt */ js.UndefOr[js.Any], 
      /* header */ js.UndefOr[js.Any], 
      /* e */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Generates the HTML to be rendered in the injected checkbox column for each row
  		* @param value Object
  		* @param metaData Object
  		* @param record Object
  		* @param rowIndex Object
  		* @param colIndex Object
  		* @param store Object
  		* @param view Object
  		*/
  var renderer: js.UndefOr[
    js.Function7[
      /* value */ js.UndefOr[js.Any], 
      /* metaData */ js.UndefOr[js.Any], 
      /* record */ js.UndefOr[js.Any], 
      /* rowIndex */ js.UndefOr[js.Any], 
      /* colIndex */ js.UndefOr[js.Any], 
      /* store */ js.UndefOr[js.Any], 
      /* view */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var showHeaderCheckbox: js.UndefOr[Boolean] = js.undefined
}

object ICheckboxModel {
  @scala.inline
  def apply(
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    addManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    alias: Array = null,
    allowDeselect: js.UndefOr[Boolean] = js.undefined,
    alternateClassName: js.Any = null,
    bindStore: (/* store */ js.UndefOr[js.Any], /* initial */ js.UndefOr[js.Any]) => Unit = null,
    bindStoreListeners: /* store */ js.UndefOr[IAbstractStore] => Unit = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    checkOnly: js.UndefOr[Boolean] = js.undefined,
    checkSelector: java.lang.String = null,
    clearListeners: () => Unit = null,
    clearManagedListeners: () => Unit = null,
    config: js.Any = null,
    deselect: (/* records */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[Boolean]) => Unit = null,
    deselectAll: /* suppressEvent */ js.UndefOr[Boolean] => Unit = null,
    deselectRange: (/* startRow */ js.UndefOr[js.Any], /* endRow */ js.UndefOr[js.Any]) => Unit = null,
    enableBubble: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    enableKeyNav: js.UndefOr[Boolean] = js.undefined,
    extend: java.lang.String = null,
    fireEvent: (/* eventName */ java.lang.String, /* repeated */ js.Any) => Boolean = null,
    fireEventArgs: (/* eventName */ js.UndefOr[java.lang.String], /* args */ js.UndefOr[Array]) => Boolean = null,
    getCount: () => Double = null,
    getCurrentPosition: () => Unit = null,
    getHeaderConfig: () => Unit = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getLastSelected: () => ICheckboxModel = null,
    getSelection: () => Array = null,
    getSelectionMode: () => java.lang.String = null,
    getStore: () => IAbstractStore = null,
    getStoreListeners: () => _ = null,
    hasListener: /* eventName */ js.UndefOr[java.lang.String] => Boolean = null,
    hasListeners: js.Any = null,
    hasSelection: () => Boolean = null,
    ignoreRightMouseSelection: js.UndefOr[Boolean] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => ICheckboxModel = null,
    injectCheckbox: js.Any = null,
    isFocused: /* record */ js.UndefOr[ICheckboxModel] => Unit = null,
    isLocked: () => Boolean = null,
    isObservable: js.UndefOr[Boolean] = js.undefined,
    isRangeSelected: (/* from */ js.UndefOr[js.Any], /* to */ js.UndefOr[js.Any]) => Boolean = null,
    isSelected: /* record */ js.UndefOr[js.Any] => Boolean = null,
    listeners: js.Any = null,
    mixins: js.Any = null,
    mode: js.Any = null,
    mon: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    mun: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    onBindStore: (/* store */ js.UndefOr[IAbstractStore], /* initial */ js.UndefOr[Boolean]) => Unit = null,
    onHeaderClick: (/* headerCt */ js.UndefOr[js.Any], /* header */ js.UndefOr[js.Any], /* e */ js.UndefOr[js.Any]) => Unit = null,
    onUnbindStore: (/* store */ js.UndefOr[IAbstractStore], /* initial */ js.UndefOr[Boolean]) => Unit = null,
    pruneRemoved: js.UndefOr[Boolean] = js.undefined,
    relayEvents: (/* origin */ js.UndefOr[js.Any], /* events */ js.UndefOr[Array], /* prefix */ js.UndefOr[java.lang.String]) => _ = null,
    removeListener: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    removeManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    renderer: (/* value */ js.UndefOr[js.Any], /* metaData */ js.UndefOr[js.Any], /* record */ js.UndefOr[js.Any], /* rowIndex */ js.UndefOr[js.Any], /* colIndex */ js.UndefOr[js.Any], /* store */ js.UndefOr[js.Any], /* view */ js.UndefOr[js.Any]) => Unit = null,
    requires: Array = null,
    resumeEvent: /* repeated */ js.Any => Unit = null,
    resumeEvents: () => Unit = null,
    select: (/* records */ js.UndefOr[js.Any], /* keepExisting */ js.UndefOr[Boolean], /* suppressEvent */ js.UndefOr[Boolean]) => Unit = null,
    selectAll: /* suppressEvent */ js.UndefOr[Boolean] => Unit = null,
    selectNext: (/* keepExisting */ js.UndefOr[Boolean], /* suppressEvent */ js.UndefOr[Boolean]) => Boolean = null,
    selectPrevious: (/* keepExisting */ js.UndefOr[Boolean], /* suppressEvent */ js.UndefOr[Boolean]) => Boolean = null,
    selectRange: (/* startRow */ js.UndefOr[js.Any], /* endRow */ js.UndefOr[js.Any], /* keepExisting */ js.UndefOr[Boolean]) => Unit = null,
    selected: IMixedCollection = null,
    self: IClass = null,
    setLastFocused: /* record */ js.UndefOr[ICheckboxModel] => Unit = null,
    setLocked: /* locked */ js.UndefOr[Boolean] => Unit = null,
    setSelectionMode: /* selMode */ js.UndefOr[java.lang.String] => Unit = null,
    showHeaderCheckbox: js.UndefOr[Boolean] = js.undefined,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    suspendEvent: /* repeated */ js.Any => Unit = null,
    suspendEvents: /* queueSuspended */ js.UndefOr[Boolean] => Unit = null,
    toggleOnClick: js.UndefOr[Boolean] = js.undefined,
    un: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    unbindStoreListeners: /* store */ js.UndefOr[IAbstractStore] => Unit = null,
    uses: Array = null
  ): ICheckboxModel = {
    val __obj = js.Dynamic.literal()
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction4(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (!js.isUndefined(allowDeselect)) __obj.updateDynamic("allowDeselect")(allowDeselect)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (bindStore != null) __obj.updateDynamic("bindStore")(js.Any.fromFunction2(bindStore))
    if (bindStoreListeners != null) __obj.updateDynamic("bindStoreListeners")(js.Any.fromFunction1(bindStoreListeners))
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (!js.isUndefined(checkOnly)) __obj.updateDynamic("checkOnly")(checkOnly)
    if (checkSelector != null) __obj.updateDynamic("checkSelector")(checkSelector)
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (clearManagedListeners != null) __obj.updateDynamic("clearManagedListeners")(js.Any.fromFunction0(clearManagedListeners))
    if (config != null) __obj.updateDynamic("config")(config)
    if (deselect != null) __obj.updateDynamic("deselect")(js.Any.fromFunction2(deselect))
    if (deselectAll != null) __obj.updateDynamic("deselectAll")(js.Any.fromFunction1(deselectAll))
    if (deselectRange != null) __obj.updateDynamic("deselectRange")(js.Any.fromFunction2(deselectRange))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (!js.isUndefined(enableKeyNav)) __obj.updateDynamic("enableKeyNav")(enableKeyNav)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(js.Any.fromFunction2(fireEventArgs))
    if (getCount != null) __obj.updateDynamic("getCount")(js.Any.fromFunction0(getCount))
    if (getCurrentPosition != null) __obj.updateDynamic("getCurrentPosition")(js.Any.fromFunction0(getCurrentPosition))
    if (getHeaderConfig != null) __obj.updateDynamic("getHeaderConfig")(js.Any.fromFunction0(getHeaderConfig))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getLastSelected != null) __obj.updateDynamic("getLastSelected")(js.Any.fromFunction0(getLastSelected))
    if (getSelection != null) __obj.updateDynamic("getSelection")(js.Any.fromFunction0(getSelection))
    if (getSelectionMode != null) __obj.updateDynamic("getSelectionMode")(js.Any.fromFunction0(getSelectionMode))
    if (getStore != null) __obj.updateDynamic("getStore")(js.Any.fromFunction0(getStore))
    if (getStoreListeners != null) __obj.updateDynamic("getStoreListeners")(js.Any.fromFunction0(getStoreListeners))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners)
    if (hasSelection != null) __obj.updateDynamic("hasSelection")(js.Any.fromFunction0(hasSelection))
    if (!js.isUndefined(ignoreRightMouseSelection)) __obj.updateDynamic("ignoreRightMouseSelection")(ignoreRightMouseSelection)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (injectCheckbox != null) __obj.updateDynamic("injectCheckbox")(injectCheckbox)
    if (isFocused != null) __obj.updateDynamic("isFocused")(js.Any.fromFunction1(isFocused))
    if (isLocked != null) __obj.updateDynamic("isLocked")(js.Any.fromFunction0(isLocked))
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable)
    if (isRangeSelected != null) __obj.updateDynamic("isRangeSelected")(js.Any.fromFunction2(isRangeSelected))
    if (isSelected != null) __obj.updateDynamic("isSelected")(js.Any.fromFunction1(isSelected))
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction4(on))
    if (onBindStore != null) __obj.updateDynamic("onBindStore")(js.Any.fromFunction2(onBindStore))
    if (onHeaderClick != null) __obj.updateDynamic("onHeaderClick")(js.Any.fromFunction3(onHeaderClick))
    if (onUnbindStore != null) __obj.updateDynamic("onUnbindStore")(js.Any.fromFunction2(onUnbindStore))
    if (!js.isUndefined(pruneRemoved)) __obj.updateDynamic("pruneRemoved")(pruneRemoved)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction3(relayEvents))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction3(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (renderer != null) __obj.updateDynamic("renderer")(js.Any.fromFunction7(renderer))
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(js.Any.fromFunction1(resumeEvent))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction0(resumeEvents))
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction3(select))
    if (selectAll != null) __obj.updateDynamic("selectAll")(js.Any.fromFunction1(selectAll))
    if (selectNext != null) __obj.updateDynamic("selectNext")(js.Any.fromFunction2(selectNext))
    if (selectPrevious != null) __obj.updateDynamic("selectPrevious")(js.Any.fromFunction2(selectPrevious))
    if (selectRange != null) __obj.updateDynamic("selectRange")(js.Any.fromFunction3(selectRange))
    if (selected != null) __obj.updateDynamic("selected")(selected)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setLastFocused != null) __obj.updateDynamic("setLastFocused")(js.Any.fromFunction1(setLastFocused))
    if (setLocked != null) __obj.updateDynamic("setLocked")(js.Any.fromFunction1(setLocked))
    if (setSelectionMode != null) __obj.updateDynamic("setSelectionMode")(js.Any.fromFunction1(setSelectionMode))
    if (!js.isUndefined(showHeaderCheckbox)) __obj.updateDynamic("showHeaderCheckbox")(showHeaderCheckbox)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(js.Any.fromFunction1(suspendEvent))
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction1(suspendEvents))
    if (!js.isUndefined(toggleOnClick)) __obj.updateDynamic("toggleOnClick")(toggleOnClick)
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction3(un))
    if (unbindStoreListeners != null) __obj.updateDynamic("unbindStoreListeners")(js.Any.fromFunction1(unbindStoreListeners))
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[ICheckboxModel]
  }
}

