package typings.extjs.Ext.data

import typings.extjs.Ext.data.proxy.IClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMemoryProxy
  extends StObject
     with IClient {
  
  /** [Config Option] (Object) */
  var data: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Boolean) */
  var enablePaging: js.UndefOr[Boolean] = js.undefined
}
object IMemoryProxy {
  
  inline def apply(): IMemoryProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMemoryProxy]
  }
  
  extension [Self <: IMemoryProxy](x: Self) {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setEnablePaging(value: Boolean): Self = StObject.set(x, "enablePaging", value.asInstanceOf[js.Any])
    
    inline def setEnablePagingUndefined: Self = StObject.set(x, "enablePaging", js.undefined)
  }
}
