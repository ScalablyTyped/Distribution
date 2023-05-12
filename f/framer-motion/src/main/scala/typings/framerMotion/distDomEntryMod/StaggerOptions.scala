package typings.framerMotion.distDomEntryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaggerOptions extends StObject {
  
  var ease: js.UndefOr[Easing] = js.undefined
  
  var from: js.UndefOr[StaggerOrigin] = js.undefined
  
  var startDelay: js.UndefOr[Double] = js.undefined
}
object StaggerOptions {
  
  inline def apply(): StaggerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaggerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StaggerOptions] (val x: Self) extends AnyVal {
    
    inline def setEase(value: Easing): Self = StObject.set(x, "ease", value.asInstanceOf[js.Any])
    
    inline def setEaseFunction1(value: /* v */ Double => Double): Self = StObject.set(x, "ease", js.Any.fromFunction1(value))
    
    inline def setEaseUndefined: Self = StObject.set(x, "ease", js.undefined)
    
    inline def setFrom(value: StaggerOrigin): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setStartDelay(value: Double): Self = StObject.set(x, "startDelay", value.asInstanceOf[js.Any])
    
    inline def setStartDelayUndefined: Self = StObject.set(x, "startDelay", js.undefined)
  }
}
