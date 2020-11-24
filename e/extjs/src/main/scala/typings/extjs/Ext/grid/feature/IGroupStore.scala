package typings.extjs.Ext.grid.feature

import typings.extjs.Ext.data.IModel
import typings.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGroupStore extends IObservable {
  
  /** [Method] Get the index within the entire dataset
    * @param record Ext.data.Model The Ext.data.Model object to find.
    * @returns Number The index of the passed Record. Returns -1 if not found.
    */
  var indexOfTotal: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], Double]] = js.native
}
object IGroupStore {
  
  @scala.inline
  def apply(): IGroupStore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGroupStore]
  }
  
  @scala.inline
  implicit class IGroupStoreOps[Self <: IGroupStore] (val x: Self) extends AnyVal {
    
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
    def setIndexOfTotal(value: /* record */ js.UndefOr[IModel] => Double): Self = this.set("indexOfTotal", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIndexOfTotal: Self = this.set("indexOfTotal", js.undefined)
  }
}
