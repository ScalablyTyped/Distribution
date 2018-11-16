package typings
package extjsLib.ExtNs.selectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(extjsLib.ExtNs.utilNs.IBindable because Would inherit conflicting mutable fields List(statics, uses, mixins, config, extend, inheritableStatics, alias, alternateClassName, requires, singleton, callSuper, self, getInitialConfig, callParent, callOverridden, initConfig))*/

trait IModel
  extends extjsLib.ExtNs.utilNs.IObservable {
  /** [Config Option] (Boolean) */
  var allowDeselect: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] binds the store to the selModel
  		* @param store Object
  		* @param initial Object
  		*/
  var bindStore: js.UndefOr[
    js.Function2[/* store */ js.UndefOr[js.Any], /* initial */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Binds listeners for this component to the store
  		* @param store Ext.data.AbstractStore The store to bind to
  		*/
  var bindStoreListeners: js.UndefOr[
    js.Function1[/* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IAbstractStore], scala.Unit]
  ] = js.undefined
  /** [Method] Deselects a record instance by record instance or index
  		* @param records Ext.data.Model[]/Number An array of records or an index
  		* @param suppressEvent Boolean True to not fire a deselect event
  		*/
  var deselect: js.UndefOr[
    js.Function2[
      /* records */ js.UndefOr[js.Any], 
      /* suppressEvent */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Deselects all records in the view
  		* @param suppressEvent Boolean True to suppress any deselect events
  		*/
  var deselectAll: js.UndefOr[js.Function1[/* suppressEvent */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Deselects a range of rows if the selection model is not locked
  		* @param startRow Ext.data.Model/Number The record or index of the first row in the range
  		* @param endRow Ext.data.Model/Number The record or index of the last row in the range
  		*/
  var deselectRange: js.UndefOr[
    js.Function2[/* startRow */ js.UndefOr[js.Any], /* endRow */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Returns the count of selected records
  		* @returns Number The number of selected records
  		*/
  var getCount: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method]
  		* @returns Ext.data.Model Returns the last selected record.
  		*/
  var getLastSelected: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Returns an array of the currently selected records
  		* @returns Ext.data.Model[] The selected records
  		*/
  var getSelection: js.UndefOr[js.Function0[extjsLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the current selectionMode
  		* @returns String The selectionMode: 'SINGLE', 'MULTI' or 'SIMPLE'.
  		*/
  var getSelectionMode: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Gets the current store instance
  		* @returns Ext.data.AbstractStore The store, null if one does not exist.
  		*/
  var getStore: js.UndefOr[js.Function0[extjsLib.ExtNs.dataNs.IAbstractStore]] = js.undefined
  /** [Method] Gets the listeners to bind to a new store
  		* @returns Object The listeners to be bound to the store in object literal form. The scope may be omitted, it is assumed to be the current instance.
  		*/
  var getStoreListeners: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns true if there are any a selected records
  		* @returns Boolean
  		*/
  var hasSelection: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Determines if this record is currently focused
  		* @param record Ext.data.Model
  		*/
  var isFocused: js.UndefOr[js.Function1[/* record */ js.UndefOr[this.type], scala.Unit]] = js.undefined
  /** [Method] Returns true if the selections are locked
  		* @returns Boolean
  		*/
  var isLocked: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns true if the specified row is selected
  		* @param from Ext.data.Model/Number The start of the range to check.
  		* @param to Ext.data.Model/Number The end of the range to check.
  		* @returns Boolean
  		*/
  var isRangeSelected: js.UndefOr[
    js.Function2[/* from */ js.UndefOr[js.Any], /* to */ js.UndefOr[js.Any], scala.Boolean]
  ] = js.undefined
  /** [Method] Returns true if the specified row is selected
  		* @param record Ext.data.Model/Number The record or index of the record to check
  		* @returns Boolean
  		*/
  var isSelected: js.UndefOr[js.Function1[/* record */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
  /** [Config Option] ("SINGLE"/"SIMPLE"/"MULTI") */
  var mode: js.UndefOr[js.Any] = js.undefined
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
  var pruneRemoved: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Selects a record instance by record instance or index
  		* @param records Ext.data.Model[]/Number An array of records or an index
  		* @param keepExisting Boolean True to retain existing selections
  		* @param suppressEvent Boolean True to not fire a select event
  		*/
  var select: js.UndefOr[
    js.Function3[
      /* records */ js.UndefOr[js.Any], 
      /* keepExisting */ js.UndefOr[scala.Boolean], 
      /* suppressEvent */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Selects all records in the view
  		* @param suppressEvent Boolean True to suppress any select events
  		*/
  var selectAll: js.UndefOr[js.Function1[/* suppressEvent */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Selects a range of rows if the selection model is not locked
  		* @param startRow Ext.data.Model/Number The record or index of the first row in the range
  		* @param endRow Ext.data.Model/Number The record or index of the last row in the range
  		* @param keepExisting Boolean True to retain existing selections
  		*/
  var selectRange: js.UndefOr[
    js.Function3[
      /* startRow */ js.UndefOr[js.Any], 
      /* endRow */ js.UndefOr[js.Any], 
      /* keepExisting */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Property] (Ext.util.MixedCollection) */
  var selected: js.UndefOr[extjsLib.ExtNs.utilNs.IMixedCollection] = js.undefined
  /** [Method] Sets a record as the last focused record
  		* @param record Ext.data.Model
  		*/
  var setLastFocused: js.UndefOr[js.Function1[/* record */ js.UndefOr[this.type], scala.Unit]] = js.undefined
  /** [Method] Locks the current selection and disables any changes from happening to the selection
  		* @param locked Boolean True to lock, false to unlock.
  		*/
  var setLocked: js.UndefOr[js.Function1[/* locked */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the current selectionMode
  		* @param selMode String 'SINGLE', 'MULTI' or 'SIMPLE'.
  		*/
  var setSelectionMode: js.UndefOr[js.Function1[/* selMode */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var toggleOnClick: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Unbinds listeners from this component to the store
  		* @param store Ext.data.AbstractStore The store to unbind from
  		*/
  var unbindStoreListeners: js.UndefOr[
    js.Function1[/* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IAbstractStore], scala.Unit]
  ] = js.undefined
}

