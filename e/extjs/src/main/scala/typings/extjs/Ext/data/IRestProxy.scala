package typings.extjs.Ext.data

import typings.extjs.Ext.data.proxy.IAjax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRestProxy
  extends StObject
     with IAjax {
  
  /** [Config Option] (Boolean) */
  var appendId: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var format: js.UndefOr[String] = js.undefined
}
object IRestProxy {
  
  inline def apply(): IRestProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRestProxy]
  }
  
  extension [Self <: IRestProxy](x: Self) {
    
    inline def setAppendId(value: Boolean): Self = StObject.set(x, "appendId", value.asInstanceOf[js.Any])
    
    inline def setAppendIdUndefined: Self = StObject.set(x, "appendId", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
