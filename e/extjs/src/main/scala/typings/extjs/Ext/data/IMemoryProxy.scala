package typings.extjs.Ext.data

import typings.extjs.Ext.data.proxy.IClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMemoryProxy extends IClient {
  
  /** [Config Option] (Object) */
  var data: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var enablePaging: js.UndefOr[Boolean] = js.native
}
object IMemoryProxy {
  
  @scala.inline
  def apply(): IMemoryProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMemoryProxy]
  }
  
  @scala.inline
  implicit class IMemoryProxyMutableBuilder[Self <: IMemoryProxy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setEnablePaging(value: Boolean): Self = StObject.set(x, "enablePaging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnablePagingUndefined: Self = StObject.set(x, "enablePaging", js.undefined)
  }
}
