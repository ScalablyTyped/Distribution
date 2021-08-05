package typings.extjs.Ext.grid

import typings.extjs.Ext.data.IModel
import typings.extjs.Ext.form.IBasic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRowEditor
  extends StObject
     with typings.extjs.Ext.form.IPanel {
  
  /** [Method] Lie to the CQ system about our nesting structure  */
  @JSName("getRefItems")
  var getRefItems_IRowEditor: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Loads an Ext data Model into this form internally just calls Ext form Basic loadRecord See also trackResetOnLoad
    * @param record Object
    * @returns Ext.form.Basic The Ext.form.Basic attached to this FormPanel
    */
  @JSName("loadRecord")
  var loadRecord_IRowEditor: js.UndefOr[js.Function1[/* record */ js.UndefOr[js.Any], IBasic]] = js.undefined
  
  /** [Method] Start editing the specified grid at the specified position
    * @param record Ext.data.Model The Store data record which backs the row to be edited.
    * @param columnHeader Ext.data.Model The Column object defining the column to be edited.
    */
  var startEdit: js.UndefOr[
    js.Function2[/* record */ js.UndefOr[IModel], /* columnHeader */ js.UndefOr[IModel], Unit]
  ] = js.undefined
}
object IRowEditor {
  
  inline def apply(): IRowEditor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRowEditor]
  }
  
  extension [Self <: IRowEditor](x: Self) {
    
    inline def setGetRefItems(value: () => Unit): Self = StObject.set(x, "getRefItems", js.Any.fromFunction0(value))
    
    inline def setGetRefItemsUndefined: Self = StObject.set(x, "getRefItems", js.undefined)
    
    inline def setLoadRecord(value: /* record */ js.UndefOr[js.Any] => IBasic): Self = StObject.set(x, "loadRecord", js.Any.fromFunction1(value))
    
    inline def setLoadRecordUndefined: Self = StObject.set(x, "loadRecord", js.undefined)
    
    inline def setStartEdit(value: (/* record */ js.UndefOr[IModel], /* columnHeader */ js.UndefOr[IModel]) => Unit): Self = StObject.set(x, "startEdit", js.Any.fromFunction2(value))
    
    inline def setStartEditUndefined: Self = StObject.set(x, "startEdit", js.undefined)
  }
}
