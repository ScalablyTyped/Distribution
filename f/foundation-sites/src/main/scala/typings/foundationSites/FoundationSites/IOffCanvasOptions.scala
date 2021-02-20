package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOffCanvasOptions extends StObject {
  
  var autoFocus: js.UndefOr[Boolean] = js.native
  
  var closeOnClick: js.UndefOr[Boolean] = js.native
  
  var forceTop: js.UndefOr[Boolean] = js.native
  
  var isRevealed: js.UndefOr[Boolean] = js.native
  
  var position: js.UndefOr[String] = js.native
  
  var revealClass: js.UndefOr[String] = js.native
  
  var revealOn: js.UndefOr[String] = js.native
  
  var transitionTime: js.UndefOr[Double] = js.native
  
  var trapFocus: js.UndefOr[Boolean] = js.native
}
object IOffCanvasOptions {
  
  @scala.inline
  def apply(): IOffCanvasOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOffCanvasOptions]
  }
  
  @scala.inline
  implicit class IOffCanvasOptionsMutableBuilder[Self <: IOffCanvasOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    @scala.inline
    def setCloseOnClick(value: Boolean): Self = StObject.set(x, "closeOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseOnClickUndefined: Self = StObject.set(x, "closeOnClick", js.undefined)
    
    @scala.inline
    def setForceTop(value: Boolean): Self = StObject.set(x, "forceTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceTopUndefined: Self = StObject.set(x, "forceTop", js.undefined)
    
    @scala.inline
    def setIsRevealed(value: Boolean): Self = StObject.set(x, "isRevealed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRevealedUndefined: Self = StObject.set(x, "isRevealed", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setRevealClass(value: String): Self = StObject.set(x, "revealClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevealClassUndefined: Self = StObject.set(x, "revealClass", js.undefined)
    
    @scala.inline
    def setRevealOn(value: String): Self = StObject.set(x, "revealOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevealOnUndefined: Self = StObject.set(x, "revealOn", js.undefined)
    
    @scala.inline
    def setTransitionTime(value: Double): Self = StObject.set(x, "transitionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionTimeUndefined: Self = StObject.set(x, "transitionTime", js.undefined)
    
    @scala.inline
    def setTrapFocus(value: Boolean): Self = StObject.set(x, "trapFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrapFocusUndefined: Self = StObject.set(x, "trapFocus", js.undefined)
  }
}
