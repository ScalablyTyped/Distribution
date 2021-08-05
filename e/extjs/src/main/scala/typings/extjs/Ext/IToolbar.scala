package typings.extjs.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IToolbar
  extends StObject
     with typings.extjs.Ext.container.IContainer {
  
  /** [Config Option] (String) */
  var defaultButtonUI: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (Boolean) */
  var enableOverflow: js.UndefOr[Boolean] = js.undefined
  
  /** [Property] (Boolean) */
  var isToolbar: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var menuTriggerCls: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (Boolean) */
  var vertical: js.UndefOr[Boolean] = js.undefined
}
object IToolbar {
  
  inline def apply(): IToolbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IToolbar]
  }
  
  extension [Self <: IToolbar](x: Self) {
    
    inline def setDefaultButtonUI(value: java.lang.String): Self = StObject.set(x, "defaultButtonUI", value.asInstanceOf[js.Any])
    
    inline def setDefaultButtonUIUndefined: Self = StObject.set(x, "defaultButtonUI", js.undefined)
    
    inline def setEnableOverflow(value: Boolean): Self = StObject.set(x, "enableOverflow", value.asInstanceOf[js.Any])
    
    inline def setEnableOverflowUndefined: Self = StObject.set(x, "enableOverflow", js.undefined)
    
    inline def setIsToolbar(value: Boolean): Self = StObject.set(x, "isToolbar", value.asInstanceOf[js.Any])
    
    inline def setIsToolbarUndefined: Self = StObject.set(x, "isToolbar", js.undefined)
    
    inline def setMenuTriggerCls(value: java.lang.String): Self = StObject.set(x, "menuTriggerCls", value.asInstanceOf[js.Any])
    
    inline def setMenuTriggerClsUndefined: Self = StObject.set(x, "menuTriggerCls", js.undefined)
    
    inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
