package typings.extjs.Ext.data

import typings.extjs.Ext.data.proxy.IServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAjaxProxy extends IServer {
  
  /** [Property] (Object) */
  var actionMethods: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var binary: js.UndefOr[Boolean] = js.native
  
  /** [Method] Returns the HTTP method name for a given request
    * @param request Ext.data.Request The request object
    * @returns String The HTTP method to use (should be one of 'GET', 'POST', 'PUT' or 'DELETE')
    */
  var getMethod: js.UndefOr[js.Function1[/* request */ js.UndefOr[IRequest], String]] = js.native
  
  /** [Config Option] (Object) */
  var headers: js.UndefOr[js.Any] = js.native
}
object IAjaxProxy {
  
  @scala.inline
  def apply(): IAjaxProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAjaxProxy]
  }
  
  @scala.inline
  implicit class IAjaxProxyMutableBuilder[Self <: IAjaxProxy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionMethods(value: js.Any): Self = StObject.set(x, "actionMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionMethodsUndefined: Self = StObject.set(x, "actionMethods", js.undefined)
    
    @scala.inline
    def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
    
    @scala.inline
    def setGetMethod(value: /* request */ js.UndefOr[IRequest] => String): Self = StObject.set(x, "getMethod", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetMethodUndefined: Self = StObject.set(x, "getMethod", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
  }
}
