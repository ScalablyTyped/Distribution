package typings.fancybox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FancyBoxTouchOptions extends StObject {
  
  /**
    * Continue movement after releasing mouse/touch when panning
    */
  var momentum: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  Allow to drag content vertically
    */
  var vertical: js.UndefOr[Boolean] = js.undefined
}
object FancyBoxTouchOptions {
  
  @scala.inline
  def apply(): FancyBoxTouchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FancyBoxTouchOptions]
  }
  
  @scala.inline
  implicit class FancyBoxTouchOptionsMutableBuilder[Self <: FancyBoxTouchOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMomentum(value: Boolean): Self = StObject.set(x, "momentum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMomentumUndefined: Self = StObject.set(x, "momentum", js.undefined)
    
    @scala.inline
    def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
