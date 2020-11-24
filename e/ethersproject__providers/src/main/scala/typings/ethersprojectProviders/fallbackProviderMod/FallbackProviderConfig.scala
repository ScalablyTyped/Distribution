package typings.ethersprojectProviders.fallbackProviderMod

import typings.ethersprojectAbstractProvider.mod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FallbackProviderConfig extends js.Object {
  
  var priority: js.UndefOr[Double] = js.native
  
  var provider: Provider = js.native
  
  var stallTimeout: js.UndefOr[Double] = js.native
  
  var weight: js.UndefOr[Double] = js.native
}
object FallbackProviderConfig {
  
  @scala.inline
  def apply(provider: Provider): FallbackProviderConfig = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[FallbackProviderConfig]
  }
  
  @scala.inline
  implicit class FallbackProviderConfigOps[Self <: FallbackProviderConfig] (val x: Self) extends AnyVal {
    
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
    def setProvider(value: Provider): Self = this.set("provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setStallTimeout(value: Double): Self = this.set("stallTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStallTimeout: Self = this.set("stallTimeout", js.undefined)
    
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
}
