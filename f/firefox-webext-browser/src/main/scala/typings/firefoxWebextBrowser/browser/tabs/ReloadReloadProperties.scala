package typings.firefoxWebextBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReloadReloadProperties extends js.Object {
  
  /** Whether using any local cache. Default is false. */
  var bypassCache: js.UndefOr[Boolean] = js.native
}
object ReloadReloadProperties {
  
  @scala.inline
  def apply(): ReloadReloadProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReloadReloadProperties]
  }
  
  @scala.inline
  implicit class ReloadReloadPropertiesOps[Self <: ReloadReloadProperties] (val x: Self) extends AnyVal {
    
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
    def setBypassCache(value: Boolean): Self = this.set("bypassCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBypassCache: Self = this.set("bypassCache", js.undefined)
  }
}
