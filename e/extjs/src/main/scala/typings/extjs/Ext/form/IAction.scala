package typings.extjs.Ext.form

import typings.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAction
  extends StObject
     with IBase {
  
  /** [Property] (String) */
  var CLIENT_INVALID: js.UndefOr[String] = js.undefined
  
  /** [Property] (String) */
  var CONNECT_FAILURE: js.UndefOr[String] = js.undefined
  
  /** [Property] (String) */
  var LOAD_FAILURE: js.UndefOr[String] = js.undefined
  
  /** [Property] (String) */
  var SERVER_INVALID: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Function) */
  var failure: js.UndefOr[Any] = js.undefined
  
  /** [Property] (String) */
  var failureType: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Ext.form.Basic) */
  var form: js.UndefOr[IBasic] = js.undefined
  
  /** [Config Option] (Object) */
  var headers: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String) */
  var method: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Object/String) */
  var params: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Boolean) */
  var reset: js.UndefOr[Boolean] = js.undefined
  
  /** [Property] (Object) */
  var response: js.UndefOr[Any] = js.undefined
  
  /** [Property] (Object) */
  var result: js.UndefOr[Any] = js.undefined
  
  /** [Method] Invokes this action using the current configuration  */
  var run: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (Object) */
  var scope: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Boolean) */
  var submitEmptyText: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Function) */
  var success: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Number) */
  var timeout: js.UndefOr[Double] = js.undefined
  
  /** [Property] (String) */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var url: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var waitMsg: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var waitTitle: js.UndefOr[String] = js.undefined
}
object IAction {
  
  inline def apply(): IAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAction] (val x: Self) extends AnyVal {
    
    inline def setCLIENT_INVALID(value: String): Self = StObject.set(x, "CLIENT_INVALID", value.asInstanceOf[js.Any])
    
    inline def setCLIENT_INVALIDUndefined: Self = StObject.set(x, "CLIENT_INVALID", js.undefined)
    
    inline def setCONNECT_FAILURE(value: String): Self = StObject.set(x, "CONNECT_FAILURE", value.asInstanceOf[js.Any])
    
    inline def setCONNECT_FAILUREUndefined: Self = StObject.set(x, "CONNECT_FAILURE", js.undefined)
    
    inline def setFailure(value: Any): Self = StObject.set(x, "failure", value.asInstanceOf[js.Any])
    
    inline def setFailureType(value: String): Self = StObject.set(x, "failureType", value.asInstanceOf[js.Any])
    
    inline def setFailureTypeUndefined: Self = StObject.set(x, "failureType", js.undefined)
    
    inline def setFailureUndefined: Self = StObject.set(x, "failure", js.undefined)
    
    inline def setForm(value: IBasic): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setLOAD_FAILURE(value: String): Self = StObject.set(x, "LOAD_FAILURE", value.asInstanceOf[js.Any])
    
    inline def setLOAD_FAILUREUndefined: Self = StObject.set(x, "LOAD_FAILURE", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setReset(value: Boolean): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
    
    inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    inline def setResponse(value: Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    inline def setResult(value: Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setRun(value: () => Unit): Self = StObject.set(x, "run", js.Any.fromFunction0(value))
    
    inline def setRunUndefined: Self = StObject.set(x, "run", js.undefined)
    
    inline def setSERVER_INVALID(value: String): Self = StObject.set(x, "SERVER_INVALID", value.asInstanceOf[js.Any])
    
    inline def setSERVER_INVALIDUndefined: Self = StObject.set(x, "SERVER_INVALID", js.undefined)
    
    inline def setScope(value: Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSubmitEmptyText(value: Boolean): Self = StObject.set(x, "submitEmptyText", value.asInstanceOf[js.Any])
    
    inline def setSubmitEmptyTextUndefined: Self = StObject.set(x, "submitEmptyText", js.undefined)
    
    inline def setSuccess(value: Any): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setWaitMsg(value: String): Self = StObject.set(x, "waitMsg", value.asInstanceOf[js.Any])
    
    inline def setWaitMsgUndefined: Self = StObject.set(x, "waitMsg", js.undefined)
    
    inline def setWaitTitle(value: String): Self = StObject.set(x, "waitTitle", value.asInstanceOf[js.Any])
    
    inline def setWaitTitleUndefined: Self = StObject.set(x, "waitTitle", js.undefined)
  }
}
