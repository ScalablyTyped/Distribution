package typings.extjs.Ext.data

import typings.extjs.Ext.data.proxy.IAjax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRestProxy extends IAjax {
  
  /** [Config Option] (Boolean) */
  var appendId: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var format: js.UndefOr[String] = js.native
}
object IRestProxy {
  
  @scala.inline
  def apply(): IRestProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRestProxy]
  }
  
  @scala.inline
  implicit class IRestProxyMutableBuilder[Self <: IRestProxy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppendId(value: Boolean): Self = StObject.set(x, "appendId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendIdUndefined: Self = StObject.set(x, "appendId", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
