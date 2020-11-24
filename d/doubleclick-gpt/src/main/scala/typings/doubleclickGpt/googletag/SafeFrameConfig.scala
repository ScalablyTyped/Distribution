package typings.doubleclickGpt.googletag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SafeFrameConfig extends js.Object {
  
  var allowOverlayExpansion: js.UndefOr[Boolean] = js.native
  
  var allowPushExpansion: js.UndefOr[Boolean] = js.native
  
  var sandbox: js.UndefOr[Boolean] = js.native
  
  var useUniqueDomain: js.UndefOr[Boolean | Null] = js.native
}
object SafeFrameConfig {
  
  @scala.inline
  def apply(): SafeFrameConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SafeFrameConfig]
  }
  
  @scala.inline
  implicit class SafeFrameConfigOps[Self <: SafeFrameConfig] (val x: Self) extends AnyVal {
    
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
    def setAllowOverlayExpansion(value: Boolean): Self = this.set("allowOverlayExpansion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowOverlayExpansion: Self = this.set("allowOverlayExpansion", js.undefined)
    
    @scala.inline
    def setAllowPushExpansion(value: Boolean): Self = this.set("allowPushExpansion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowPushExpansion: Self = this.set("allowPushExpansion", js.undefined)
    
    @scala.inline
    def setSandbox(value: Boolean): Self = this.set("sandbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSandbox: Self = this.set("sandbox", js.undefined)
    
    @scala.inline
    def setUseUniqueDomain(value: Boolean): Self = this.set("useUniqueDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseUniqueDomain: Self = this.set("useUniqueDomain", js.undefined)
    
    @scala.inline
    def setUseUniqueDomainNull: Self = this.set("useUniqueDomain", null)
  }
}
