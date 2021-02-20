package typings.extjs.Ext.data

import org.scalablytyped.runtime.StObject
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
  implicit class IArrayStoreMutableBuilder[Self <: IArrayStore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoadData(value: (/* data */ js.UndefOr[js.Any], /* append */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "loadData", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLoadDataUndefined: Self = StObject.set(x, "loadData", js.undefined)
  }
}
