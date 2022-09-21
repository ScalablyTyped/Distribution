package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Touch extends StObject {
  
  def init(event: js.Object): Unit
  
  def setupSpotSwipe(event: js.Object): Unit
  
  def setupTouchHandler(event: js.Object): Unit
}
object Touch {
  
  inline def apply(init: js.Object => Unit, setupSpotSwipe: js.Object => Unit, setupTouchHandler: js.Object => Unit): Touch = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init), setupSpotSwipe = js.Any.fromFunction1(setupSpotSwipe), setupTouchHandler = js.Any.fromFunction1(setupTouchHandler))
    __obj.asInstanceOf[Touch]
  }
  
  extension [Self <: Touch](x: Self) {
    
    inline def setInit(value: js.Object => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    
    inline def setSetupSpotSwipe(value: js.Object => Unit): Self = StObject.set(x, "setupSpotSwipe", js.Any.fromFunction1(value))
    
    inline def setSetupTouchHandler(value: js.Object => Unit): Self = StObject.set(x, "setupTouchHandler", js.Any.fromFunction1(value))
  }
}
