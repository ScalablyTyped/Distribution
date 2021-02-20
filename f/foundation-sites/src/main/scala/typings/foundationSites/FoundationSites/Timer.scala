package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Timer extends StObject {
  
  def pause(): Unit = js.native
  
  def restart(): Unit = js.native
  
  def start(): Unit = js.native
}
object Timer {
  
  @scala.inline
  def apply(pause: () => Unit, restart: () => Unit, start: () => Unit): Timer = {
    val __obj = js.Dynamic.literal(pause = js.Any.fromFunction0(pause), restart = js.Any.fromFunction0(restart), start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[Timer]
  }
  
  @scala.inline
  implicit class TimerMutableBuilder[Self <: Timer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRestart(value: () => Unit): Self = StObject.set(x, "restart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
  }
}
