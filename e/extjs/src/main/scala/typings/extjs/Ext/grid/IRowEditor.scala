package typings.extjs.Ext.grid

import typings.extjs.Ext.data.IModel
import typings.extjs.Ext.form.IBasic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRowEditor
  extends typings.extjs.Ext.form.IPanel {
  
  /** [Method] Lie to the CQ system about our nesting structure  */
  @JSName("getRefItems")
  var getRefItems_IRowEditor: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Loads an Ext data Model into this form internally just calls Ext form Basic loadRecord See also trackResetOnLoad
    * @param record Object
    * @returns Ext.form.Basic The Ext.form.Basic attached to this FormPanel
    */
  @JSName("loadRecord")
  var loadRecord_IRowEditor: js.UndefOr[js.Function1[/* record */ js.UndefOr[js.Any], IBasic]] = js.native
  
  /** [Method] Start editing the specified grid at the specified position
    * @param record Ext.data.Model The Store data record which backs the row to be edited.
    * @param columnHeader Ext.data.Model The Column object defining the column to be edited.
    */
  var startEdit: js.UndefOr[
    js.Function2[/* record */ js.UndefOr[IModel], /* columnHeader */ js.UndefOr[IModel], Unit]
  ] = js.native
}
object IRowEditor {
  
  @scala.inline
  def apply(): IRowEditor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRowEditor]
  }
  
  @scala.inline
  implicit class IRowEditorOps[Self <: IRowEditor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetRefItems(value: () => Unit): Self = this.set("getRefItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetRefItems: Self = this.set("getRefItems", js.undefined)
    
    @scala.inline
    def setLoadRecord(value: /* record */ js.UndefOr[js.Any] => IBasic): Self = this.set("loadRecord", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLoadRecord: Self = this.set("loadRecord", js.undefined)
    
    @scala.inline
    def setStartEdit(value: (/* record */ js.UndefOr[IModel], /* columnHeader */ js.UndefOr[IModel]) => Unit): Self = this.set("startEdit", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteStartEdit: Self = this.set("startEdit", js.undefined)
  }
}
