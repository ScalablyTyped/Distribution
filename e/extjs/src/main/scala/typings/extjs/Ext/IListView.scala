package typings.extjs.Ext

import typings.extjs.Ext.data.IStore
import typings.extjs.Ext.panel.ITable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IListView extends ITable {
  
  /** [Method] Reconfigures the grid with a new store columns
    * @param store Ext.data.Store The new store.
    * @param columns Object[] An array of column configs
    */
  var reconfigure: js.UndefOr[
    js.Function2[/* store */ js.UndefOr[IStore], /* columns */ js.UndefOr[Array], Unit]
  ] = js.native
}
object IListView {
  
  @scala.inline
  def apply(): IListView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListView]
  }
  
  @scala.inline
  implicit class IListViewOps[Self <: IListView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setReconfigure(value: (/* store */ js.UndefOr[IStore], /* columns */ js.UndefOr[Array]) => Unit): Self = this.set("reconfigure", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteReconfigure: Self = this.set("reconfigure", js.undefined)
  }
}
