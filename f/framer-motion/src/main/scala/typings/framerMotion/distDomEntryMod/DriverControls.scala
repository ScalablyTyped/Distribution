package typings.framerMotion.distDomEntryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Drivers accept a update function and call it at an interval. This interval
  * could be a synchronous loop, a setInterval, or tied to the device's framerate.
  */
trait DriverControls extends StObject {
  
  def now(): Double
  
  def start(): Unit
  
  def stop(): Unit
}
object DriverControls {
  
  inline def apply(now: () => Double, start: () => Unit, stop: () => Unit): DriverControls = {
    val __obj = js.Dynamic.literal(now = js.Any.fromFunction0(now), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[DriverControls]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DriverControls] (val x: Self) extends AnyVal {
    
    inline def setNow(value: () => Double): Self = StObject.set(x, "now", js.Any.fromFunction0(value))
    
    inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    
    inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
  }
}
