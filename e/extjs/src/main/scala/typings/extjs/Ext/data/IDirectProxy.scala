package typings.extjs.Ext.data

import typings.extjs.Ext.data.proxy.IServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDirectProxy extends IServer {
  
  /** [Method] inherit docs
    * @returns String The url
    */
  @JSName("buildUrl")
  var buildUrl_IDirectProxy: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Config Option] (Function/String) */
  var directFn: js.UndefOr[js.Any] = js.native
  
  /** [Method] In ServerProxy subclasses the create read update and destroy methods all pass through to doRequest
    * @param operation Object
    * @param callback Object
    * @param scope Object
    */
  @JSName("doRequest")
  var doRequest_IDirectProxy: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  /** [Config Option] (String/String[]) */
  var paramOrder: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var paramsAsHash: js.UndefOr[Boolean] = js.native
}
object IDirectProxy {
  
  @scala.inline
  def apply(): IDirectProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDirectProxy]
  }
  
  @scala.inline
  implicit class IDirectProxyMutableBuilder[Self <: IDirectProxy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuildUrl(value: () => String): Self = StObject.set(x, "buildUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBuildUrlUndefined: Self = StObject.set(x, "buildUrl", js.undefined)
    
    @scala.inline
    def setDirectFn(value: js.Any): Self = StObject.set(x, "directFn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectFnUndefined: Self = StObject.set(x, "directFn", js.undefined)
    
    @scala.inline
    def setDoRequest(
      value: (/* operation */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "doRequest", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDoRequestUndefined: Self = StObject.set(x, "doRequest", js.undefined)
    
    @scala.inline
    def setParamOrder(value: js.Any): Self = StObject.set(x, "paramOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamOrderUndefined: Self = StObject.set(x, "paramOrder", js.undefined)
    
    @scala.inline
    def setParamsAsHash(value: Boolean): Self = StObject.set(x, "paramsAsHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsAsHashUndefined: Self = StObject.set(x, "paramsAsHash", js.undefined)
  }
}
