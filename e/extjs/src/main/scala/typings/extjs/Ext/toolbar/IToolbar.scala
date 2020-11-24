package typings.extjs.Ext.toolbar

import typings.extjs.Ext.container.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IToolbar extends IContainer {
  
  /** [Config Option] (String) */
  var defaultButtonUI: js.UndefOr[String] = js.native
  
  /** [Config Option] (Boolean) */
  var enableOverflow: js.UndefOr[Boolean] = js.native
  
  /** [Property] (Boolean) */
  var isToolbar: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var menuTriggerCls: js.UndefOr[String] = js.native
  
  /** [Config Option] (Boolean) */
  var vertical: js.UndefOr[Boolean] = js.native
}
object IToolbar {
  
  @scala.inline
  def apply(): IToolbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IToolbar]
  }
  
  @scala.inline
  implicit class IToolbarOps[Self <: IToolbar] (val x: Self) extends AnyVal {
    
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
    def setDefaultButtonUI(value: String): Self = this.set("defaultButtonUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultButtonUI: Self = this.set("defaultButtonUI", js.undefined)
    
    @scala.inline
    def setEnableOverflow(value: Boolean): Self = this.set("enableOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableOverflow: Self = this.set("enableOverflow", js.undefined)
    
    @scala.inline
    def setIsToolbar(value: Boolean): Self = this.set("isToolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsToolbar: Self = this.set("isToolbar", js.undefined)
    
    @scala.inline
    def setMenuTriggerCls(value: String): Self = this.set("menuTriggerCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuTriggerCls: Self = this.set("menuTriggerCls", js.undefined)
    
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
}
