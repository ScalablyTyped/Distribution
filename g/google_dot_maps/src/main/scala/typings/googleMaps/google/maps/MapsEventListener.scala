package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An event listener, created by <code><a
  * href="#event">google.maps.event.addListener</a>()</code> and friends.
  */
trait MapsEventListener extends StObject {
  
  /**
    * Removes the listener. <p>Calling <code>listener.remove()</code> is
    * equivalent to <code>google.maps.event.removeListener(listener)</code>.
    */
  def remove(): Unit
}
object MapsEventListener {
  
  inline def apply(remove: () => Unit): MapsEventListener = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[MapsEventListener]
  }
  
  extension [Self <: MapsEventListener](x: Self) {
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
