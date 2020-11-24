package typings.extjs.Ext.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IArrayStore extends IStore {
  
  /** [Method] Loads an array of data straight into the Store
    * @param data Object
    * @param append Object
    */
  @JSName("loadData")
  var loadData_IArrayStore: js.UndefOr[
    js.Function2[/* data */ js.UndefOr[js.Any], /* append */ js.UndefOr[js.Any], Unit]
  ] = js.native
}
object IArrayStore {
  
  @scala.inline
  def apply(): IArrayStore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IArrayStore]
  }
  
  @scala.inline
  implicit class IArrayStoreOps[Self <: IArrayStore] (val x: Self) extends AnyVal {
    
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
    def setLoadData(value: (/* data */ js.UndefOr[js.Any], /* append */ js.UndefOr[js.Any]) => Unit): Self = this.set("loadData", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteLoadData: Self = this.set("loadData", js.undefined)
  }
}
