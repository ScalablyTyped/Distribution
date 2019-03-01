package typings
package extjsLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- extjsLib.ExtNs.utilNs.IBindable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined bindStore, bindStoreListeners, getStore, getStoreListeners, onBindStore, onUnbindStore, unbindStoreListeners */ trait IPagingToolbar
  extends extjsLib.ExtNs.toolbarNs.IToolbar {
  /** [Config Option] (String) */
  var afterPageText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var beforePageText: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Binds the paging toolbar to the specified Ext data Store deprecated
  		* @param store Ext.data.Store The data store to bind
  		*/
  var bind: js.UndefOr[js.Function1[/* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IStore], scala.Unit]] = js.undefined
  /** [Method] Binds a store to this instance
  		* @param store Ext.data.AbstractStore/String The store to bind or ID of the store. When no store given (or when null or undefined passed), unbinds the existing store.
  		*/
  var bindStore: js.UndefOr[js.Function1[/* store */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Binds listeners for this component to the store
  		* @param store Ext.data.AbstractStore The store to bind to
  		*/
  var bindStoreListeners: js.UndefOr[
    js.Function1[/* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IAbstractStore], scala.Unit]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var displayInfo: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var displayMsg: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Refresh the current page has the same effect as clicking the refresh button  */
  var doRefresh: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var emptyMsg: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var firstText: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Gets the current store instance
  		* @returns Ext.data.AbstractStore The store, null if one does not exist.
  		*/
  var getStore: js.UndefOr[js.Function0[extjsLib.ExtNs.dataNs.IAbstractStore]] = js.undefined
  /** [Method] Gets the listeners to bind to a new store
  		* @returns Object The listeners to be bound to the store in object literal form. The scope may be omitted, it is assumed to be the current instance.
  		*/
  var getStoreListeners: js.UndefOr[
    js.Function0[_] | (js.Function1[/* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IStore], _])
  ] = js.undefined
  /** [Config Option] (Number) */
  var inputItemWidth: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var lastText: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Move to the first page has the same effect as clicking the first button  */
  var moveFirst: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Move to the last page has the same effect as clicking the last button  */
  var moveLast: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Move to the next page has the same effect as clicking the next button  */
  var moveNext: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Move to the previous page has the same effect as clicking the previous button  */
  var movePrevious: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var nextText: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Template method it is called when a new store is bound to the current instance
  		* @param store Ext.data.AbstractStore The store being bound
  		* @param initial Boolean True if this store is being bound as initialization of the instance.
  		*/
  var onBindStore: js.UndefOr[
    js.Function2[
      /* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IAbstractStore], 
      /* initial */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Template method it is called when an existing store is unbound from the current instance
  		* @param store Ext.data.AbstractStore The store being unbound
  		* @param initial Boolean True if this store is being bound as initialization of the instance.
  		*/
  var onUnbindStore: js.UndefOr[
    js.Function2[
      /* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IAbstractStore], 
      /* initial */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var prependButtons: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var prevText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var refreshText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Ext.data.Store) */
  var store: js.UndefOr[extjsLib.ExtNs.dataNs.IStore] = js.undefined
  /** [Method] Unbinds the paging toolbar from the specified Ext data Store deprecated
  		* @param store Ext.data.Store The data store to unbind
  		*/
  var unbind: js.UndefOr[js.Function1[/* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IStore], scala.Unit]] = js.undefined
  /** [Method] Unbinds listeners from this component to the store
  		* @param store Ext.data.AbstractStore The store to unbind from
  		*/
  var unbindStoreListeners: js.UndefOr[
    js.Function1[/* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IAbstractStore], scala.Unit]
  ] = js.undefined
}

object IPagingToolbar {
  @scala.inline
  def apply(
    IBindable: extjsLib.ExtNs.utilNs.IBindable = null,
    IToolbar: extjsLib.ExtNs.toolbarNs.IToolbar = null,
    afterPageText: java.lang.String = null,
    beforePageText: java.lang.String = null,
    bind: js.Function1[/* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IStore], scala.Unit] = null,
    bindStore: js.Function1[/* store */ js.UndefOr[js.Any], scala.Unit] = null,
    bindStoreListeners: js.Function1[/* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IAbstractStore], scala.Unit] = null,
    displayInfo: js.UndefOr[scala.Boolean] = js.undefined,
    displayMsg: java.lang.String = null,
    doRefresh: js.Function0[scala.Unit] = null,
    emptyMsg: java.lang.String = null,
    firstText: java.lang.String = null,
    getStore: js.Function0[extjsLib.ExtNs.dataNs.IAbstractStore] = null,
    getStoreListeners: js.Function0[_] = null,
    inputItemWidth: scala.Int | scala.Double = null,
    lastText: java.lang.String = null,
    moveFirst: js.Function0[scala.Unit] = null,
    moveLast: js.Function0[scala.Unit] = null,
    moveNext: js.Function0[scala.Unit] = null,
    movePrevious: js.Function0[scala.Unit] = null,
    nextText: java.lang.String = null,
    onBindStore: js.Function2[
      /* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IAbstractStore], 
      /* initial */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ] = null,
    onUnbindStore: js.Function2[
      /* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IAbstractStore], 
      /* initial */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ] = null,
    prependButtons: js.UndefOr[scala.Boolean] = js.undefined,
    prevText: java.lang.String = null,
    refreshText: java.lang.String = null,
    store: extjsLib.ExtNs.dataNs.IStore = null,
    unbind: js.Function1[/* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IStore], scala.Unit] = null,
    unbindStoreListeners: js.Function1[/* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IAbstractStore], scala.Unit] = null
  ): IPagingToolbar = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IBindable)
    js.Dynamic.global.Object.assign(__obj, IToolbar)
    if (afterPageText != null) __obj.updateDynamic("afterPageText")(afterPageText)
    if (beforePageText != null) __obj.updateDynamic("beforePageText")(beforePageText)
    if (bind != null) __obj.updateDynamic("bind")(bind)
    if (bindStore != null) __obj.updateDynamic("bindStore")(bindStore)
    if (bindStoreListeners != null) __obj.updateDynamic("bindStoreListeners")(bindStoreListeners)
    if (!js.isUndefined(displayInfo)) __obj.updateDynamic("displayInfo")(displayInfo)
    if (displayMsg != null) __obj.updateDynamic("displayMsg")(displayMsg)
    if (doRefresh != null) __obj.updateDynamic("doRefresh")(doRefresh)
    if (emptyMsg != null) __obj.updateDynamic("emptyMsg")(emptyMsg)
    if (firstText != null) __obj.updateDynamic("firstText")(firstText)
    if (getStore != null) __obj.updateDynamic("getStore")(getStore)
    if (getStoreListeners != null) __obj.updateDynamic("getStoreListeners")(getStoreListeners)
    if (inputItemWidth != null) __obj.updateDynamic("inputItemWidth")(inputItemWidth.asInstanceOf[js.Any])
    if (lastText != null) __obj.updateDynamic("lastText")(lastText)
    if (moveFirst != null) __obj.updateDynamic("moveFirst")(moveFirst)
    if (moveLast != null) __obj.updateDynamic("moveLast")(moveLast)
    if (moveNext != null) __obj.updateDynamic("moveNext")(moveNext)
    if (movePrevious != null) __obj.updateDynamic("movePrevious")(movePrevious)
    if (nextText != null) __obj.updateDynamic("nextText")(nextText)
    if (onBindStore != null) __obj.updateDynamic("onBindStore")(onBindStore)
    if (onUnbindStore != null) __obj.updateDynamic("onUnbindStore")(onUnbindStore)
    if (!js.isUndefined(prependButtons)) __obj.updateDynamic("prependButtons")(prependButtons)
    if (prevText != null) __obj.updateDynamic("prevText")(prevText)
    if (refreshText != null) __obj.updateDynamic("refreshText")(refreshText)
    if (store != null) __obj.updateDynamic("store")(store)
    if (unbind != null) __obj.updateDynamic("unbind")(unbind)
    if (unbindStoreListeners != null) __obj.updateDynamic("unbindStoreListeners")(unbindStoreListeners)
    __obj.asInstanceOf[IPagingToolbar]
  }
}

