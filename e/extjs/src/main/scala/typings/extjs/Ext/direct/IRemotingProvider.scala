package typings.extjs.Ext.direct

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRemotingProvider extends IJsonProvider {
  
  /** [Config Option] (Object) */
  var actions: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var disableNestedActions: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Number/Boolean) */
  var enableBuffer: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var enableUrlEncode: js.UndefOr[String] = js.native
  
  /** [Config Option] (Number) */
  var maxRetries: js.UndefOr[Double] = js.native
  
  /** [Config Option] (String/Object) */
  var namespace: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Number) */
  var timeout: js.UndefOr[Double] = js.native
  
  /** [Config Option] (String) */
  var url: js.UndefOr[String] = js.native
}
object IRemotingProvider {
  
  @scala.inline
  def apply(): IRemotingProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRemotingProvider]
  }
  
  @scala.inline
  implicit class IRemotingProviderOps[Self <: IRemotingProvider] (val x: Self) extends AnyVal {
    
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
    def setActions(value: js.Any): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    
    @scala.inline
    def setDisableNestedActions(value: Boolean): Self = this.set("disableNestedActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableNestedActions: Self = this.set("disableNestedActions", js.undefined)
    
    @scala.inline
    def setEnableBuffer(value: js.Any): Self = this.set("enableBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableBuffer: Self = this.set("enableBuffer", js.undefined)
    
    @scala.inline
    def setEnableUrlEncode(value: String): Self = this.set("enableUrlEncode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableUrlEncode: Self = this.set("enableUrlEncode", js.undefined)
    
    @scala.inline
    def setMaxRetries(value: Double): Self = this.set("maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRetries: Self = this.set("maxRetries", js.undefined)
    
    @scala.inline
    def setNamespace(value: js.Any): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
