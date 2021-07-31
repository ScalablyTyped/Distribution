package typings.extjs.Ext.form

import typings.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object action {
  
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
    var failure: js.UndefOr[js.Any] = js.undefined
    
    /** [Property] (String) */
    var failureType: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (Ext.form.Basic) */
    var form: js.UndefOr[IBasic] = js.undefined
    
    /** [Config Option] (Object) */
    var headers: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (String) */
    var method: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (Object/String) */
    var params: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (Boolean) */
    var reset: js.UndefOr[Boolean] = js.undefined
    
    /** [Property] (Object) */
    var response: js.UndefOr[js.Any] = js.undefined
    
    /** [Property] (Object) */
    var result: js.UndefOr[js.Any] = js.undefined
    
    /** [Method] Invokes this action using the current configuration  */
    var run: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Config Option] (Object) */
    var scope: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (Boolean) */
    var submitEmptyText: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Function) */
    var success: js.UndefOr[js.Any] = js.undefined
    
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
    
    @scala.inline
    def apply(): typings.extjs.Ext.form.action.IAction = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.extjs.Ext.form.action.IAction]
    }
    
    @scala.inline
    implicit class IActionMutableBuilder[Self <: typings.extjs.Ext.form.action.IAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCLIENT_INVALID(value: String): Self = StObject.set(x, "CLIENT_INVALID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCLIENT_INVALIDUndefined: Self = StObject.set(x, "CLIENT_INVALID", js.undefined)
      
      @scala.inline
      def setCONNECT_FAILURE(value: String): Self = StObject.set(x, "CONNECT_FAILURE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCONNECT_FAILUREUndefined: Self = StObject.set(x, "CONNECT_FAILURE", js.undefined)
      
      @scala.inline
      def setFailure(value: js.Any): Self = StObject.set(x, "failure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailureType(value: String): Self = StObject.set(x, "failureType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailureTypeUndefined: Self = StObject.set(x, "failureType", js.undefined)
      
      @scala.inline
      def setFailureUndefined: Self = StObject.set(x, "failure", js.undefined)
      
      @scala.inline
      def setForm(value: IBasic): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      @scala.inline
      def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setLOAD_FAILURE(value: String): Self = StObject.set(x, "LOAD_FAILURE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLOAD_FAILUREUndefined: Self = StObject.set(x, "LOAD_FAILURE", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setReset(value: Boolean): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
      
      @scala.inline
      def setResponse(value: js.Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
      
      @scala.inline
      def setResult(value: js.Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      
      @scala.inline
      def setRun(value: () => Unit): Self = StObject.set(x, "run", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRunUndefined: Self = StObject.set(x, "run", js.undefined)
      
      @scala.inline
      def setSERVER_INVALID(value: String): Self = StObject.set(x, "SERVER_INVALID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSERVER_INVALIDUndefined: Self = StObject.set(x, "SERVER_INVALID", js.undefined)
      
      @scala.inline
      def setScope(value: js.Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setSubmitEmptyText(value: Boolean): Self = StObject.set(x, "submitEmptyText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmitEmptyTextUndefined: Self = StObject.set(x, "submitEmptyText", js.undefined)
      
      @scala.inline
      def setSuccess(value: js.Any): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setWaitMsg(value: String): Self = StObject.set(x, "waitMsg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitMsgUndefined: Self = StObject.set(x, "waitMsg", js.undefined)
      
      @scala.inline
      def setWaitTitle(value: String): Self = StObject.set(x, "waitTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitTitleUndefined: Self = StObject.set(x, "waitTitle", js.undefined)
    }
  }
  
  trait IDirectLoad
    extends StObject
       with ILoad
  object IDirectLoad {
    
    @scala.inline
    def apply(): IDirectLoad = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDirectLoad]
    }
  }
  
  trait IDirectSubmit
    extends StObject
       with ISubmit
  object IDirectSubmit {
    
    @scala.inline
    def apply(): IDirectSubmit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDirectSubmit]
    }
  }
  
  trait ILoad
    extends StObject
       with typings.extjs.Ext.form.action.IAction
  object ILoad {
    
    @scala.inline
    def apply(): ILoad = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILoad]
    }
  }
  
  trait IStandardSubmit
    extends StObject
       with ISubmit {
    
    /** [Config Option] (String) */
    var target: js.UndefOr[String] = js.undefined
  }
  object IStandardSubmit {
    
    @scala.inline
    def apply(): IStandardSubmit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStandardSubmit]
    }
    
    @scala.inline
    implicit class IStandardSubmitMutableBuilder[Self <: IStandardSubmit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait ISubmit
    extends StObject
       with typings.extjs.Ext.form.action.IAction {
    
    /** [Config Option] (Boolean) */
    var clientValidation: js.UndefOr[Boolean] = js.undefined
  }
  object ISubmit {
    
    @scala.inline
    def apply(): ISubmit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISubmit]
    }
    
    @scala.inline
    implicit class ISubmitMutableBuilder[Self <: ISubmit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientValidation(value: Boolean): Self = StObject.set(x, "clientValidation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientValidationUndefined: Self = StObject.set(x, "clientValidation", js.undefined)
    }
  }
}
