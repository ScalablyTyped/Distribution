package typings
package extjsLib.ExtNs.selectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICheckboxModel extends IRowModel {
  /** [Config Option] (Boolean) */
  var checkOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var checkSelector: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Retrieve a configuration to be used in a HeaderContainer  */
  var getHeaderConfig: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
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
      scala.Unit
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
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var showHeaderCheckbox: js.UndefOr[scala.Boolean] = js.undefined
}

object ICheckboxModel {
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
    allowDeselect: js.UndefOr[scala.Boolean] = js.undefined,
    alternateClassName: js.Any = null,
    bindStore: js.Function2[/* store */ js.UndefOr[js.Any], /* initial */ js.UndefOr[js.Any], scala.Unit] = null,
    bindStoreListeners: js.Function1[/* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IAbstractStore], scala.Unit] = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    checkOnly: js.UndefOr[scala.Boolean] = js.undefined,
    checkSelector: java.lang.String = null,
    clearListeners: js.Function0[scala.Unit] = null,
    clearManagedListeners: js.Function0[scala.Unit] = null,
    config: js.Any = null,
    deselect: js.Function2[
      /* records */ js.UndefOr[js.Any], 
      /* suppressEvent */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ] = null,
    deselectAll: js.Function1[/* suppressEvent */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    deselectRange: js.Function2[/* startRow */ js.UndefOr[js.Any], /* endRow */ js.UndefOr[js.Any], scala.Unit] = null,
    enableBubble: js.Function1[/* eventNames */ js.UndefOr[js.Any], scala.Unit] = null,
    enableKeyNav: js.UndefOr[scala.Boolean] = js.undefined,
    extend: java.lang.String = null,
    fireEvent: js.Function2[/* eventName */ java.lang.String, /* repeated */ js.Any, scala.Boolean] = null,
    fireEventArgs: js.Function2[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* args */ js.UndefOr[extjsLib.ExtNs.Array], 
      scala.Boolean
    ] = null,
    getCount: js.Function0[scala.Double] = null,
    getCurrentPosition: js.Function0[scala.Unit] = null,
    getHeaderConfig: js.Function0[scala.Unit] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getLastSelected: js.Function0[ICheckboxModel] = null,
    getSelection: js.Function0[extjsLib.ExtNs.Array] = null,
    getSelectionMode: js.Function0[java.lang.String] = null,
    getStore: js.Function0[extjsLib.ExtNs.dataNs.IAbstractStore] = null,
    getStoreListeners: js.Function0[_] = null,
    hasListener: js.Function1[/* eventName */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    hasListeners: js.Any = null,
    hasSelection: js.Function0[scala.Boolean] = null,
    ignoreRightMouseSelection: js.UndefOr[scala.Boolean] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], ICheckboxModel] = null,
    injectCheckbox: js.Any = null,
    isFocused: js.Function1[/* record */ js.UndefOr[ICheckboxModel], scala.Unit] = null,
    isLocked: js.Function0[scala.Boolean] = null,
    isObservable: js.UndefOr[scala.Boolean] = js.undefined,
    isRangeSelected: js.Function2[/* from */ js.UndefOr[js.Any], /* to */ js.UndefOr[js.Any], scala.Boolean] = null,
    isSelected: js.Function1[/* record */ js.UndefOr[js.Any], scala.Boolean] = null,
    listeners: js.Any = null,
    mixins: js.Any = null,
    mode: js.Any = null,
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
    onBindStore: js.Function2[
      /* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IAbstractStore], 
      /* initial */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ] = null,
    onHeaderClick: js.Function3[
      /* headerCt */ js.UndefOr[js.Any], 
      /* header */ js.UndefOr[js.Any], 
      /* e */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    onUnbindStore: js.Function2[
      /* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IAbstractStore], 
      /* initial */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ] = null,
    pruneRemoved: js.UndefOr[scala.Boolean] = js.undefined,
    relayEvents: js.Function3[
      /* origin */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[extjsLib.ExtNs.Array], 
      /* prefix */ js.UndefOr[java.lang.String], 
      _
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
    renderer: js.Function7[
      /* value */ js.UndefOr[js.Any], 
      /* metaData */ js.UndefOr[js.Any], 
      /* record */ js.UndefOr[js.Any], 
      /* rowIndex */ js.UndefOr[js.Any], 
      /* colIndex */ js.UndefOr[js.Any], 
      /* store */ js.UndefOr[js.Any], 
      /* view */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    requires: extjsLib.ExtNs.Array = null,
    resumeEvent: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    resumeEvents: js.Function0[scala.Unit] = null,
    select: js.Function3[
      /* records */ js.UndefOr[js.Any], 
      /* keepExisting */ js.UndefOr[scala.Boolean], 
      /* suppressEvent */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ] = null,
    selectAll: js.Function1[/* suppressEvent */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    selectNext: js.Function2[
      /* keepExisting */ js.UndefOr[scala.Boolean], 
      /* suppressEvent */ js.UndefOr[scala.Boolean], 
      scala.Boolean
    ] = null,
    selectPrevious: js.Function2[
      /* keepExisting */ js.UndefOr[scala.Boolean], 
      /* suppressEvent */ js.UndefOr[scala.Boolean], 
      scala.Boolean
    ] = null,
    selectRange: js.Function3[
      /* startRow */ js.UndefOr[js.Any], 
      /* endRow */ js.UndefOr[js.Any], 
      /* keepExisting */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ] = null,
    selected: extjsLib.ExtNs.utilNs.IMixedCollection = null,
    self: extjsLib.ExtNs.IClass = null,
    setLastFocused: js.Function1[/* record */ js.UndefOr[ICheckboxModel], scala.Unit] = null,
    setLocked: js.Function1[/* locked */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setSelectionMode: js.Function1[/* selMode */ js.UndefOr[java.lang.String], scala.Unit] = null,
    showHeaderCheckbox: js.UndefOr[scala.Boolean] = js.undefined,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    suspendEvent: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    suspendEvents: js.Function1[/* queueSuspended */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    toggleOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    un: js.Function3[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    unbindStoreListeners: js.Function1[/* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IAbstractStore], scala.Unit] = null,
    uses: extjsLib.ExtNs.Array = null
  ): ICheckboxModel = {
    val __obj = js.Dynamic.literal()
    if (addEvents != null) __obj.updateDynamic("addEvents")(addEvents)
    if (addListener != null) __obj.updateDynamic("addListener")(addListener)
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(addManagedListener)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (!js.isUndefined(allowDeselect)) __obj.updateDynamic("allowDeselect")(allowDeselect)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (bindStore != null) __obj.updateDynamic("bindStore")(bindStore)
    if (bindStoreListeners != null) __obj.updateDynamic("bindStoreListeners")(bindStoreListeners)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (!js.isUndefined(checkOnly)) __obj.updateDynamic("checkOnly")(checkOnly)
    if (checkSelector != null) __obj.updateDynamic("checkSelector")(checkSelector)
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(clearListeners)
    if (clearManagedListeners != null) __obj.updateDynamic("clearManagedListeners")(clearManagedListeners)
    if (config != null) __obj.updateDynamic("config")(config)
    if (deselect != null) __obj.updateDynamic("deselect")(deselect)
    if (deselectAll != null) __obj.updateDynamic("deselectAll")(deselectAll)
    if (deselectRange != null) __obj.updateDynamic("deselectRange")(deselectRange)
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(enableBubble)
    if (!js.isUndefined(enableKeyNav)) __obj.updateDynamic("enableKeyNav")(enableKeyNav)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(fireEvent)
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(fireEventArgs)
    if (getCount != null) __obj.updateDynamic("getCount")(getCount)
    if (getCurrentPosition != null) __obj.updateDynamic("getCurrentPosition")(getCurrentPosition)
    if (getHeaderConfig != null) __obj.updateDynamic("getHeaderConfig")(getHeaderConfig)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getLastSelected != null) __obj.updateDynamic("getLastSelected")(getLastSelected)
    if (getSelection != null) __obj.updateDynamic("getSelection")(getSelection)
    if (getSelectionMode != null) __obj.updateDynamic("getSelectionMode")(getSelectionMode)
    if (getStore != null) __obj.updateDynamic("getStore")(getStore)
    if (getStoreListeners != null) __obj.updateDynamic("getStoreListeners")(getStoreListeners)
    if (hasListener != null) __obj.updateDynamic("hasListener")(hasListener)
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners)
    if (hasSelection != null) __obj.updateDynamic("hasSelection")(hasSelection)
    if (!js.isUndefined(ignoreRightMouseSelection)) __obj.updateDynamic("ignoreRightMouseSelection")(ignoreRightMouseSelection)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (injectCheckbox != null) __obj.updateDynamic("injectCheckbox")(injectCheckbox)
    if (isFocused != null) __obj.updateDynamic("isFocused")(isFocused)
    if (isLocked != null) __obj.updateDynamic("isLocked")(isLocked)
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable)
    if (isRangeSelected != null) __obj.updateDynamic("isRangeSelected")(isRangeSelected)
    if (isSelected != null) __obj.updateDynamic("isSelected")(isSelected)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (mon != null) __obj.updateDynamic("mon")(mon)
    if (mun != null) __obj.updateDynamic("mun")(mun)
    if (on != null) __obj.updateDynamic("on")(on)
    if (onBindStore != null) __obj.updateDynamic("onBindStore")(onBindStore)
    if (onHeaderClick != null) __obj.updateDynamic("onHeaderClick")(onHeaderClick)
    if (onUnbindStore != null) __obj.updateDynamic("onUnbindStore")(onUnbindStore)
    if (!js.isUndefined(pruneRemoved)) __obj.updateDynamic("pruneRemoved")(pruneRemoved)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(relayEvents)
    if (removeListener != null) __obj.updateDynamic("removeListener")(removeListener)
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(removeManagedListener)
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(resumeEvent)
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(resumeEvents)
    if (select != null) __obj.updateDynamic("select")(select)
    if (selectAll != null) __obj.updateDynamic("selectAll")(selectAll)
    if (selectNext != null) __obj.updateDynamic("selectNext")(selectNext)
    if (selectPrevious != null) __obj.updateDynamic("selectPrevious")(selectPrevious)
    if (selectRange != null) __obj.updateDynamic("selectRange")(selectRange)
    if (selected != null) __obj.updateDynamic("selected")(selected)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setLastFocused != null) __obj.updateDynamic("setLastFocused")(setLastFocused)
    if (setLocked != null) __obj.updateDynamic("setLocked")(setLocked)
    if (setSelectionMode != null) __obj.updateDynamic("setSelectionMode")(setSelectionMode)
    if (!js.isUndefined(showHeaderCheckbox)) __obj.updateDynamic("showHeaderCheckbox")(showHeaderCheckbox)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(suspendEvent)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(suspendEvents)
    if (!js.isUndefined(toggleOnClick)) __obj.updateDynamic("toggleOnClick")(toggleOnClick)
    if (un != null) __obj.updateDynamic("un")(un)
    if (unbindStoreListeners != null) __obj.updateDynamic("unbindStoreListeners")(unbindStoreListeners)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[ICheckboxModel]
  }
}

