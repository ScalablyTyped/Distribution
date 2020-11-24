package typings.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITabsOptions extends js.Object {
  
  var autoFocus: js.UndefOr[Boolean] = js.native
  
  var linkClass: js.UndefOr[String] = js.native
  
  var matchHeight: js.UndefOr[Boolean] = js.native
  
  var panelClass: js.UndefOr[String] = js.native
  
  var wrapOnKeys: js.UndefOr[Boolean] = js.native
}
object ITabsOptions {
  
  @scala.inline
  def apply(): ITabsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITabsOptions]
  }
  
  @scala.inline
  implicit class ITabsOptionsOps[Self <: ITabsOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    
    @scala.inline
    def setLinkClass(value: String): Self = this.set("linkClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkClass: Self = this.set("linkClass", js.undefined)
    
    @scala.inline
    def setMatchHeight(value: Boolean): Self = this.set("matchHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchHeight: Self = this.set("matchHeight", js.undefined)
    
    @scala.inline
    def setPanelClass(value: String): Self = this.set("panelClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePanelClass: Self = this.set("panelClass", js.undefined)
    
    @scala.inline
    def setWrapOnKeys(value: Boolean): Self = this.set("wrapOnKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapOnKeys: Self = this.set("wrapOnKeys", js.undefined)
  }
}
