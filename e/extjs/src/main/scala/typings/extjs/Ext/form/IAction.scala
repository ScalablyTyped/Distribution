package typings.extjs.Ext.form

import typings.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAction extends IBase {
  
  /** [Property] (String) */
  var CLIENT_INVALID: js.UndefOr[String] = js.native
  
  /** [Property] (String) */
  var CONNECT_FAILURE: js.UndefOr[String] = js.native
  
  /** [Property] (String) */
  var LOAD_FAILURE: js.UndefOr[String] = js.native
  
  /** [Property] (String) */
  var SERVER_INVALID: js.UndefOr[String] = js.native
  
  /** [Config Option] (Function) */
  var failure: js.UndefOr[js.Any] = js.native
  
  /** [Property] (String) */
  var failureType: js.UndefOr[String] = js.native
  
  /** [Config Option] (Ext.form.Basic) */
  var form: js.UndefOr[IBasic] = js.native
  
  /** [Config Option] (Object) */
  var headers: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var method: js.UndefOr[String] = js.native
  
  /** [Config Option] (Object/String) */
  var params: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var reset: js.UndefOr[Boolean] = js.native
  
  /** [Property] (Object) */
  var response: js.UndefOr[js.Any] = js.native
  
  /** [Property] (Object) */
  var result: js.UndefOr[js.Any] = js.native
  
  /** [Method] Invokes this action using the current configuration  */
  var run: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var submitEmptyText: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Function) */
  var success: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Number) */
  var timeout: js.UndefOr[Double] = js.native
  
  /** [Property] (String) */
  var `type`: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var url: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var waitMsg: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var waitTitle: js.UndefOr[String] = js.native
}
object IAction {
  
  @scala.inline
  def apply(): IAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAction]
  }
  
  @scala.inline
  implicit class IActionOps[Self <: IAction] (val x: Self) extends AnyVal {
    
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
    def setCLIENT_INVALID(value: String): Self = this.set("CLIENT_INVALID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCLIENT_INVALID: Self = this.set("CLIENT_INVALID", js.undefined)
    
    @scala.inline
    def setCONNECT_FAILURE(value: String): Self = this.set("CONNECT_FAILURE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCONNECT_FAILURE: Self = this.set("CONNECT_FAILURE", js.undefined)
    
    @scala.inline
    def setLOAD_FAILURE(value: String): Self = this.set("LOAD_FAILURE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLOAD_FAILURE: Self = this.set("LOAD_FAILURE", js.undefined)
    
    @scala.inline
    def setSERVER_INVALID(value: String): Self = this.set("SERVER_INVALID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSERVER_INVALID: Self = this.set("SERVER_INVALID", js.undefined)
    
    @scala.inline
    def setFailure(value: js.Any): Self = this.set("failure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailure: Self = this.set("failure", js.undefined)
    
    @scala.inline
    def setFailureType(value: String): Self = this.set("failureType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureType: Self = this.set("failureType", js.undefined)
    
    @scala.inline
    def setForm(value: IBasic): Self = this.set("form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Any): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setParams(value: js.Any): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setReset(value: Boolean): Self = this.set("reset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReset: Self = this.set("reset", js.undefined)
    
    @scala.inline
    def setResponse(value: js.Any): Self = this.set("response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
    
    @scala.inline
    def setResult(value: js.Any): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
    
    @scala.inline
    def setRun(value: () => Unit): Self = this.set("run", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRun: Self = this.set("run", js.undefined)
    
    @scala.inline
    def setScope(value: js.Any): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    
    @scala.inline
    def setSubmitEmptyText(value: Boolean): Self = this.set("submitEmptyText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmitEmptyText: Self = this.set("submitEmptyText", js.undefined)
    
    @scala.inline
    def setSuccess(value: js.Any): Self = this.set("success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setWaitMsg(value: String): Self = this.set("waitMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitMsg: Self = this.set("waitMsg", js.undefined)
    
    @scala.inline
    def setWaitTitle(value: String): Self = this.set("waitTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitTitle: Self = this.set("waitTitle", js.undefined)
  }
}
