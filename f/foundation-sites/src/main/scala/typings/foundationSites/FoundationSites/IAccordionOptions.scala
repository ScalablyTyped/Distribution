package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAccordionOptions extends StObject {
  
  var allowAllClosed: js.UndefOr[Boolean] = js.undefined
  
  var deepLink: js.UndefOr[Boolean] = js.undefined
  
  var deepLinkSmudge: js.UndefOr[Boolean] = js.undefined
  
  var deepLinkSmudgeDelay: js.UndefOr[Double] = js.undefined
  
  var deepLinkSmudgeOffset: js.UndefOr[Double] = js.undefined
  
  var multiExpand: js.UndefOr[Boolean] = js.undefined
  
  var slideSpeed: js.UndefOr[Double] = js.undefined
  
  var updateHistory: js.UndefOr[Boolean] = js.undefined
}
object IAccordionOptions {
  
  inline def apply(): IAccordionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAccordionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAccordionOptions] (val x: Self) extends AnyVal {
    
    inline def setAllowAllClosed(value: Boolean): Self = StObject.set(x, "allowAllClosed", value.asInstanceOf[js.Any])
    
    inline def setAllowAllClosedUndefined: Self = StObject.set(x, "allowAllClosed", js.undefined)
    
    inline def setDeepLink(value: Boolean): Self = StObject.set(x, "deepLink", value.asInstanceOf[js.Any])
    
    inline def setDeepLinkSmudge(value: Boolean): Self = StObject.set(x, "deepLinkSmudge", value.asInstanceOf[js.Any])
    
    inline def setDeepLinkSmudgeDelay(value: Double): Self = StObject.set(x, "deepLinkSmudgeDelay", value.asInstanceOf[js.Any])
    
    inline def setDeepLinkSmudgeDelayUndefined: Self = StObject.set(x, "deepLinkSmudgeDelay", js.undefined)
    
    inline def setDeepLinkSmudgeOffset(value: Double): Self = StObject.set(x, "deepLinkSmudgeOffset", value.asInstanceOf[js.Any])
    
    inline def setDeepLinkSmudgeOffsetUndefined: Self = StObject.set(x, "deepLinkSmudgeOffset", js.undefined)
    
    inline def setDeepLinkSmudgeUndefined: Self = StObject.set(x, "deepLinkSmudge", js.undefined)
    
    inline def setDeepLinkUndefined: Self = StObject.set(x, "deepLink", js.undefined)
    
    inline def setMultiExpand(value: Boolean): Self = StObject.set(x, "multiExpand", value.asInstanceOf[js.Any])
    
    inline def setMultiExpandUndefined: Self = StObject.set(x, "multiExpand", js.undefined)
    
    inline def setSlideSpeed(value: Double): Self = StObject.set(x, "slideSpeed", value.asInstanceOf[js.Any])
    
    inline def setSlideSpeedUndefined: Self = StObject.set(x, "slideSpeed", js.undefined)
    
    inline def setUpdateHistory(value: Boolean): Self = StObject.set(x, "updateHistory", value.asInstanceOf[js.Any])
    
    inline def setUpdateHistoryUndefined: Self = StObject.set(x, "updateHistory", js.undefined)
  }
}
