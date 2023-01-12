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
  
  inline def apply(): FancyBoxTouchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FancyBoxTouchOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FancyBoxTouchOptions] (val x: Self) extends AnyVal {
    
    inline def setMomentum(value: Boolean): Self = StObject.set(x, "momentum", value.asInstanceOf[js.Any])
    
    inline def setMomentumUndefined: Self = StObject.set(x, "momentum", js.undefined)
    
    inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
