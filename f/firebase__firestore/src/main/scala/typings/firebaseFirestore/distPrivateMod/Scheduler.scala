package typings.firebaseFirestore.distPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface to schedule periodic tasks within SDK.
  */
trait Scheduler extends StObject {
  
  def start(): Unit
  
  val started: Boolean
  
  def stop(): Unit
}
object Scheduler {
  
  inline def apply(start: () => Unit, started: Boolean, stop: () => Unit): Scheduler = {
    val __obj = js.Dynamic.literal(start = js.Any.fromFunction0(start), started = started.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[Scheduler]
  }
  
  extension [Self <: Scheduler](x: Self) {
    
    inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    
    inline def setStarted(value: Boolean): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
    
    inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
  }
}
