package typings
package extjsLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(extjsLib.ExtNs.utilNs.IBindable because Would inherit conflicting mutable fields List(statics, uses, mixins, config, extend, inheritableStatics, alias, alternateClassName, requires, singleton, callSuper, self, getInitialConfig, callParent, callOverridden, initConfig))*/

trait IPagingToolbar
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
  var getStoreListeners: js.UndefOr[js.Function0[_]] = js.undefined
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

