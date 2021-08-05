package typings.expoLocation.locationTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationSubscription extends StObject {
  
  def remove(): Unit
}
object LocationSubscription {
  
  inline def apply(remove: () => Unit): LocationSubscription = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[LocationSubscription]
  }
  
  extension [Self <: LocationSubscription](x: Self) {
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
