package typings.extjs.Ext.direct

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPollingProvider extends IJsonProvider {
  
  /** [Config Option] (Object) */
  var baseParams: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Number) */
  var interval: js.UndefOr[Double] = js.native
  
  /** [Config Option] (String/Function) */
  var url: js.UndefOr[js.Any] = js.native
}
object IPollingProvider {
  
  @scala.inline
  def apply(): IPollingProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPollingProvider]
  }
  
  @scala.inline
  implicit class IPollingProviderOps[Self <: IPollingProvider] (val x: Self) extends AnyVal {
    
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
    def setBaseParams(value: js.Any): Self = this.set("baseParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseParams: Self = this.set("baseParams", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setUrl(value: js.Any): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
