package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOffCanvasOptions extends StObject {
  
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  
  var closeOnClick: js.UndefOr[Boolean] = js.undefined
  
  var forceTop: js.UndefOr[Boolean] = js.undefined
  
  var isRevealed: js.UndefOr[Boolean] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
  
  var revealClass: js.UndefOr[String] = js.undefined
  
  var revealOn: js.UndefOr[String] = js.undefined
  
  var transitionTime: js.UndefOr[Double] = js.undefined
  
  var trapFocus: js.UndefOr[Boolean] = js.undefined
}
object IOffCanvasOptions {
  
  inline def apply(): IOffCanvasOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOffCanvasOptions]
  }
  
  extension [Self <: IOffCanvasOptions](x: Self) {
    
    inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    inline def setCloseOnClick(value: Boolean): Self = StObject.set(x, "closeOnClick", value.asInstanceOf[js.Any])
    
    inline def setCloseOnClickUndefined: Self = StObject.set(x, "closeOnClick", js.undefined)
    
    inline def setForceTop(value: Boolean): Self = StObject.set(x, "forceTop", value.asInstanceOf[js.Any])
    
    inline def setForceTopUndefined: Self = StObject.set(x, "forceTop", js.undefined)
    
    inline def setIsRevealed(value: Boolean): Self = StObject.set(x, "isRevealed", value.asInstanceOf[js.Any])
    
    inline def setIsRevealedUndefined: Self = StObject.set(x, "isRevealed", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRevealClass(value: String): Self = StObject.set(x, "revealClass", value.asInstanceOf[js.Any])
    
    inline def setRevealClassUndefined: Self = StObject.set(x, "revealClass", js.undefined)
    
    inline def setRevealOn(value: String): Self = StObject.set(x, "revealOn", value.asInstanceOf[js.Any])
    
    inline def setRevealOnUndefined: Self = StObject.set(x, "revealOn", js.undefined)
    
    inline def setTransitionTime(value: Double): Self = StObject.set(x, "transitionTime", value.asInstanceOf[js.Any])
    
    inline def setTransitionTimeUndefined: Self = StObject.set(x, "transitionTime", js.undefined)
    
    inline def setTrapFocus(value: Boolean): Self = StObject.set(x, "trapFocus", value.asInstanceOf[js.Any])
    
    inline def setTrapFocusUndefined: Self = StObject.set(x, "trapFocus", js.undefined)
  }
}
