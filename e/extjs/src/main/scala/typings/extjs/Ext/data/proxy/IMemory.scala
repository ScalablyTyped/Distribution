package typings.extjs.Ext.data.proxy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMemory extends IClient {
  
  /** [Config Option] (Object) */
  var data: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var enablePaging: js.UndefOr[Boolean] = js.native
}
object IMemory {
  
  @scala.inline
  def apply(): IMemory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMemory]
  }
  
  @scala.inline
  implicit class IMemoryOps[Self <: IMemory] (val x: Self) extends AnyVal {
    
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setEnablePaging(value: Boolean): Self = this.set("enablePaging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePaging: Self = this.set("enablePaging", js.undefined)
  }
}
