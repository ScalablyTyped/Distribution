package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITabsOptions extends StObject {
  
  var activeCollapse: js.UndefOr[Boolean] = js.undefined
  
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  
  var deepLink: js.UndefOr[Boolean] = js.undefined
  
  var deepLinkSmudge: js.UndefOr[Boolean] = js.undefined
  
  var deepLinkSmudgeDelay: js.UndefOr[Double] = js.undefined
  
  var deepLinkSmudgeOffset: js.UndefOr[Double] = js.undefined
  
  var linkActiveClass: js.UndefOr[String] = js.undefined
  
  var linkClass: js.UndefOr[String] = js.undefined
  
  var matchHeight: js.UndefOr[Boolean] = js.undefined
  
  var panelActiveClass: js.UndefOr[String] = js.undefined
  
  var panelClass: js.UndefOr[String] = js.undefined
  
  var updateHistory: js.UndefOr[Boolean] = js.undefined
  
  var wrapOnKeys: js.UndefOr[Boolean] = js.undefined
}
object ITabsOptions {
  
  inline def apply(): ITabsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITabsOptions]
  }
  
  extension [Self <: ITabsOptions](x: Self) {
    
    inline def setActiveCollapse(value: Boolean): Self = StObject.set(x, "activeCollapse", value.asInstanceOf[js.Any])
    
    inline def setActiveCollapseUndefined: Self = StObject.set(x, "activeCollapse", js.undefined)
    
    inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    inline def setDeepLink(value: Boolean): Self = StObject.set(x, "deepLink", value.asInstanceOf[js.Any])
    
    inline def setDeepLinkSmudge(value: Boolean): Self = StObject.set(x, "deepLinkSmudge", value.asInstanceOf[js.Any])
    
    inline def setDeepLinkSmudgeDelay(value: Double): Self = StObject.set(x, "deepLinkSmudgeDelay", value.asInstanceOf[js.Any])
    
    inline def setDeepLinkSmudgeDelayUndefined: Self = StObject.set(x, "deepLinkSmudgeDelay", js.undefined)
    
    inline def setDeepLinkSmudgeOffset(value: Double): Self = StObject.set(x, "deepLinkSmudgeOffset", value.asInstanceOf[js.Any])
    
    inline def setDeepLinkSmudgeOffsetUndefined: Self = StObject.set(x, "deepLinkSmudgeOffset", js.undefined)
    
    inline def setDeepLinkSmudgeUndefined: Self = StObject.set(x, "deepLinkSmudge", js.undefined)
    
    inline def setDeepLinkUndefined: Self = StObject.set(x, "deepLink", js.undefined)
    
    inline def setLinkActiveClass(value: String): Self = StObject.set(x, "linkActiveClass", value.asInstanceOf[js.Any])
    
    inline def setLinkActiveClassUndefined: Self = StObject.set(x, "linkActiveClass", js.undefined)
    
    inline def setLinkClass(value: String): Self = StObject.set(x, "linkClass", value.asInstanceOf[js.Any])
    
    inline def setLinkClassUndefined: Self = StObject.set(x, "linkClass", js.undefined)
    
    inline def setMatchHeight(value: Boolean): Self = StObject.set(x, "matchHeight", value.asInstanceOf[js.Any])
    
    inline def setMatchHeightUndefined: Self = StObject.set(x, "matchHeight", js.undefined)
    
    inline def setPanelActiveClass(value: String): Self = StObject.set(x, "panelActiveClass", value.asInstanceOf[js.Any])
    
    inline def setPanelActiveClassUndefined: Self = StObject.set(x, "panelActiveClass", js.undefined)
    
    inline def setPanelClass(value: String): Self = StObject.set(x, "panelClass", value.asInstanceOf[js.Any])
    
    inline def setPanelClassUndefined: Self = StObject.set(x, "panelClass", js.undefined)
    
    inline def setUpdateHistory(value: Boolean): Self = StObject.set(x, "updateHistory", value.asInstanceOf[js.Any])
    
    inline def setUpdateHistoryUndefined: Self = StObject.set(x, "updateHistory", js.undefined)
    
    inline def setWrapOnKeys(value: Boolean): Self = StObject.set(x, "wrapOnKeys", value.asInstanceOf[js.Any])
    
    inline def setWrapOnKeysUndefined: Self = StObject.set(x, "wrapOnKeys", js.undefined)
  }
}
