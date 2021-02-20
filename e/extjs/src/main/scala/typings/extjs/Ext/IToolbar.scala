package typings.extjs.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IToolbar
  extends typings.extjs.Ext.container.IContainer {
  
  /** [Config Option] (String) */
  var defaultButtonUI: js.UndefOr[java.lang.String] = js.native
  
  /** [Config Option] (Boolean) */
  var enableOverflow: js.UndefOr[Boolean] = js.native
  
  /** [Property] (Boolean) */
  var isToolbar: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var menuTriggerCls: js.UndefOr[java.lang.String] = js.native
  
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
  implicit class IToolbarMutableBuilder[Self <: IToolbar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultButtonUI(value: java.lang.String): Self = StObject.set(x, "defaultButtonUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultButtonUIUndefined: Self = StObject.set(x, "defaultButtonUI", js.undefined)
    
    @scala.inline
    def setEnableOverflow(value: Boolean): Self = StObject.set(x, "enableOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableOverflowUndefined: Self = StObject.set(x, "enableOverflow", js.undefined)
    
    @scala.inline
    def setIsToolbar(value: Boolean): Self = StObject.set(x, "isToolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsToolbarUndefined: Self = StObject.set(x, "isToolbar", js.undefined)
    
    @scala.inline
    def setMenuTriggerCls(value: java.lang.String): Self = StObject.set(x, "menuTriggerCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuTriggerClsUndefined: Self = StObject.set(x, "menuTriggerCls", js.undefined)
    
    @scala.inline
    def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
