package typings.extjs.Ext

import typings.extjs.Ext.data.IAbstractStore
import typings.extjs.Ext.data.IStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.extjs.Ext.IClass because Already inherited
- typings.extjs.Ext.IBase because Already inherited
- typings.extjs.Ext.util.IBindable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined bindStore, bindStoreListeners, getStore, getStoreListeners, onBindStore, onUnbindStore, unbindStoreListeners */ trait IPagingToolbar
  extends StObject
     with typings.extjs.Ext.toolbar.IToolbar {
  
  /** [Config Option] (String) */
  var afterPageText: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (String) */
  var beforePageText: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Method] Binds the paging toolbar to the specified Ext data Store deprecated
    * @param store Ext.data.Store The data store to bind
    */
  var bind: js.UndefOr[js.Function1[/* store */ js.UndefOr[IStore], Unit]] = js.undefined
  
  /** [Method] Binds a store to this instance
    * @param store Ext.data.AbstractStore/String The store to bind or ID of the store. When no store given (or when null or undefined passed), unbinds the existing store.
    */
  var bindStore: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Binds listeners for this component to the store
    * @param store Ext.data.AbstractStore The store to bind to
    */
  var bindStoreListeners: js.UndefOr[js.Function1[js.UndefOr[IAbstractStore], Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var displayInfo: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var displayMsg: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Method] Refresh the current page has the same effect as clicking the refresh button  */
  var doRefresh: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var emptyMsg: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (String) */
  var firstText: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Method] Gets the current store instance
    * @returns Ext.data.AbstractStore The store, null if one does not exist.
    */
  var getStore: js.UndefOr[js.Function0[IAbstractStore]] = js.undefined
  
  /** [Method] Gets the listeners to bind to a new store
    * @returns Object The listeners to be bound to the store in object literal form. The scope may be omitted, it is assumed to be the current instance.
    */
  var getStoreListeners: js.UndefOr[js.Function0[js.Any] | (js.Function1[/* store */ js.UndefOr[IStore], js.Any])] = js.undefined
  
  /** [Config Option] (Number) */
  var inputItemWidth: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (String) */
  var lastText: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Method] Move to the first page has the same effect as clicking the first button  */
  var moveFirst: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Move to the last page has the same effect as clicking the last button  */
  var moveLast: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Move to the next page has the same effect as clicking the next button  */
  var moveNext: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Move to the previous page has the same effect as clicking the previous button  */
  var movePrevious: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var nextText: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Method] Template method it is called when a new store is bound to the current instance
    * @param store Ext.data.AbstractStore The store being bound
    * @param initial Boolean True if this store is being bound as initialization of the instance.
    */
  var onBindStore: js.UndefOr[js.Function2[js.UndefOr[IAbstractStore], js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Template method it is called when an existing store is unbound from the current instance
    * @param store Ext.data.AbstractStore The store being unbound
    * @param initial Boolean True if this store is being bound as initialization of the instance.
    */
  var onUnbindStore: js.UndefOr[js.Function2[js.UndefOr[IAbstractStore], js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var prependButtons: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var prevText: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (String) */
  var refreshText: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (Ext.data.Store) */
  var store: js.UndefOr[IStore] = js.undefined
  
  /** [Method] Unbinds the paging toolbar from the specified Ext data Store deprecated
    * @param store Ext.data.Store The data store to unbind
    */
  var unbind: js.UndefOr[js.Function1[/* store */ js.UndefOr[IStore], Unit]] = js.undefined
  
  /** [Method] Unbinds listeners from this component to the store
    * @param store Ext.data.AbstractStore The store to unbind from
    */
  var unbindStoreListeners: js.UndefOr[js.Function1[js.UndefOr[IAbstractStore], Unit]] = js.undefined
}
object IPagingToolbar {
  
  inline def apply(): IPagingToolbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPagingToolbar]
  }
  
  extension [Self <: IPagingToolbar](x: Self) {
    
    inline def setAfterPageText(value: java.lang.String): Self = StObject.set(x, "afterPageText", value.asInstanceOf[js.Any])
    
    inline def setAfterPageTextUndefined: Self = StObject.set(x, "afterPageText", js.undefined)
    
    inline def setBeforePageText(value: java.lang.String): Self = StObject.set(x, "beforePageText", value.asInstanceOf[js.Any])
    
    inline def setBeforePageTextUndefined: Self = StObject.set(x, "beforePageText", js.undefined)
    
    inline def setBind(value: /* store */ js.UndefOr[IStore] => Unit): Self = StObject.set(x, "bind", js.Any.fromFunction1(value))
    
    inline def setBindStore(value: js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "bindStore", js.Any.fromFunction1(value))
    
    inline def setBindStoreListeners(value: js.UndefOr[IAbstractStore] => Unit): Self = StObject.set(x, "bindStoreListeners", js.Any.fromFunction1(value))
    
    inline def setBindStoreListenersUndefined: Self = StObject.set(x, "bindStoreListeners", js.undefined)
    
    inline def setBindStoreUndefined: Self = StObject.set(x, "bindStore", js.undefined)
    
    inline def setBindUndefined: Self = StObject.set(x, "bind", js.undefined)
    
    inline def setDisplayInfo(value: Boolean): Self = StObject.set(x, "displayInfo", value.asInstanceOf[js.Any])
    
    inline def setDisplayInfoUndefined: Self = StObject.set(x, "displayInfo", js.undefined)
    
    inline def setDisplayMsg(value: java.lang.String): Self = StObject.set(x, "displayMsg", value.asInstanceOf[js.Any])
    
    inline def setDisplayMsgUndefined: Self = StObject.set(x, "displayMsg", js.undefined)
    
    inline def setDoRefresh(value: () => Unit): Self = StObject.set(x, "doRefresh", js.Any.fromFunction0(value))
    
    inline def setDoRefreshUndefined: Self = StObject.set(x, "doRefresh", js.undefined)
    
    inline def setEmptyMsg(value: java.lang.String): Self = StObject.set(x, "emptyMsg", value.asInstanceOf[js.Any])
    
    inline def setEmptyMsgUndefined: Self = StObject.set(x, "emptyMsg", js.undefined)
    
    inline def setFirstText(value: java.lang.String): Self = StObject.set(x, "firstText", value.asInstanceOf[js.Any])
    
    inline def setFirstTextUndefined: Self = StObject.set(x, "firstText", js.undefined)
    
    inline def setGetStore(value: () => IAbstractStore): Self = StObject.set(x, "getStore", js.Any.fromFunction0(value))
    
    inline def setGetStoreListeners(value: js.Function0[js.Any] | (js.Function1[/* store */ js.UndefOr[IStore], js.Any])): Self = StObject.set(x, "getStoreListeners", value.asInstanceOf[js.Any])
    
    inline def setGetStoreListenersFunction0(value: () => js.Any): Self = StObject.set(x, "getStoreListeners", js.Any.fromFunction0(value))
    
    inline def setGetStoreListenersFunction1(value: /* store */ js.UndefOr[IStore] => js.Any): Self = StObject.set(x, "getStoreListeners", js.Any.fromFunction1(value))
    
    inline def setGetStoreListenersUndefined: Self = StObject.set(x, "getStoreListeners", js.undefined)
    
    inline def setGetStoreUndefined: Self = StObject.set(x, "getStore", js.undefined)
    
    inline def setInputItemWidth(value: Double): Self = StObject.set(x, "inputItemWidth", value.asInstanceOf[js.Any])
    
    inline def setInputItemWidthUndefined: Self = StObject.set(x, "inputItemWidth", js.undefined)
    
    inline def setLastText(value: java.lang.String): Self = StObject.set(x, "lastText", value.asInstanceOf[js.Any])
    
    inline def setLastTextUndefined: Self = StObject.set(x, "lastText", js.undefined)
    
    inline def setMoveFirst(value: () => Unit): Self = StObject.set(x, "moveFirst", js.Any.fromFunction0(value))
    
    inline def setMoveFirstUndefined: Self = StObject.set(x, "moveFirst", js.undefined)
    
    inline def setMoveLast(value: () => Unit): Self = StObject.set(x, "moveLast", js.Any.fromFunction0(value))
    
    inline def setMoveLastUndefined: Self = StObject.set(x, "moveLast", js.undefined)
    
    inline def setMoveNext(value: () => Unit): Self = StObject.set(x, "moveNext", js.Any.fromFunction0(value))
    
    inline def setMoveNextUndefined: Self = StObject.set(x, "moveNext", js.undefined)
    
    inline def setMovePrevious(value: () => Unit): Self = StObject.set(x, "movePrevious", js.Any.fromFunction0(value))
    
    inline def setMovePreviousUndefined: Self = StObject.set(x, "movePrevious", js.undefined)
    
    inline def setNextText(value: java.lang.String): Self = StObject.set(x, "nextText", value.asInstanceOf[js.Any])
    
    inline def setNextTextUndefined: Self = StObject.set(x, "nextText", js.undefined)
    
    inline def setOnBindStore(value: (js.UndefOr[IAbstractStore], js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "onBindStore", js.Any.fromFunction2(value))
    
    inline def setOnBindStoreUndefined: Self = StObject.set(x, "onBindStore", js.undefined)
    
    inline def setOnUnbindStore(value: (js.UndefOr[IAbstractStore], js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "onUnbindStore", js.Any.fromFunction2(value))
    
    inline def setOnUnbindStoreUndefined: Self = StObject.set(x, "onUnbindStore", js.undefined)
    
    inline def setPrependButtons(value: Boolean): Self = StObject.set(x, "prependButtons", value.asInstanceOf[js.Any])
    
    inline def setPrependButtonsUndefined: Self = StObject.set(x, "prependButtons", js.undefined)
    
    inline def setPrevText(value: java.lang.String): Self = StObject.set(x, "prevText", value.asInstanceOf[js.Any])
    
    inline def setPrevTextUndefined: Self = StObject.set(x, "prevText", js.undefined)
    
    inline def setRefreshText(value: java.lang.String): Self = StObject.set(x, "refreshText", value.asInstanceOf[js.Any])
    
    inline def setRefreshTextUndefined: Self = StObject.set(x, "refreshText", js.undefined)
    
    inline def setStore(value: IStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    
    inline def setUnbind(value: /* store */ js.UndefOr[IStore] => Unit): Self = StObject.set(x, "unbind", js.Any.fromFunction1(value))
    
    inline def setUnbindStoreListeners(value: js.UndefOr[IAbstractStore] => Unit): Self = StObject.set(x, "unbindStoreListeners", js.Any.fromFunction1(value))
    
    inline def setUnbindStoreListenersUndefined: Self = StObject.set(x, "unbindStoreListeners", js.undefined)
    
    inline def setUnbindUndefined: Self = StObject.set(x, "unbind", js.undefined)
  }
}
