package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Timer extends StObject {
  
  def pause(): Unit
  
  def restart(): Unit
  
  def start(): Unit
}
object Timer {
  
  inline def apply(pause: () => Unit, restart: () => Unit, start: () => Unit): Timer = {
    val __obj = js.Dynamic.literal(pause = js.Any.fromFunction0(pause), restart = js.Any.fromFunction0(restart), start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[Timer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Timer] (val x: Self) extends AnyVal {
    
    inline def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    inline def setRestart(value: () => Unit): Self = StObject.set(x, "restart", js.Any.fromFunction0(value))
    
    inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
  }
}
