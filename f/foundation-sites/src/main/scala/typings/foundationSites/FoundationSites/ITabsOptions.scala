package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITabsOptions extends StObject {
  
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  
  var linkClass: js.UndefOr[String] = js.undefined
  
  var matchHeight: js.UndefOr[Boolean] = js.undefined
  
  var panelClass: js.UndefOr[String] = js.undefined
  
  var wrapOnKeys: js.UndefOr[Boolean] = js.undefined
}
object ITabsOptions {
  
  inline def apply(): ITabsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITabsOptions]
  }
  
  extension [Self <: ITabsOptions](x: Self) {
    
    inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    inline def setLinkClass(value: String): Self = StObject.set(x, "linkClass", value.asInstanceOf[js.Any])
    
    inline def setLinkClassUndefined: Self = StObject.set(x, "linkClass", js.undefined)
    
    inline def setMatchHeight(value: Boolean): Self = StObject.set(x, "matchHeight", value.asInstanceOf[js.Any])
    
    inline def setMatchHeightUndefined: Self = StObject.set(x, "matchHeight", js.undefined)
    
    inline def setPanelClass(value: String): Self = StObject.set(x, "panelClass", value.asInstanceOf[js.Any])
    
    inline def setPanelClassUndefined: Self = StObject.set(x, "panelClass", js.undefined)
    
    inline def setWrapOnKeys(value: Boolean): Self = StObject.set(x, "wrapOnKeys", value.asInstanceOf[js.Any])
    
    inline def setWrapOnKeysUndefined: Self = StObject.set(x, "wrapOnKeys", js.undefined)
  }
}
