package typings.glidejsGlide.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoplayComponent
  extends StObject
     with Component {
  
  /**
    * Registers listener for stopping auto-changing on mouseover.
    */
  def bind(): Unit
  
  @JSName("mount")
  def mount_MAutoplayComponent(): Unit
  
  /**
    * Starts auto-changing of slides on the instance.
    */
  def start(): Unit
  
  /**
    * Stops auto-changing of slides on the instance.
    */
  def stop(): Unit
  
  /**
    * Holds collection of `<a>` elements located inside slides.
    */
  val time: Double
  
  /**
    * Removes previously registered mouseover listener.
    */
  def unbind(): Unit
}
object AutoplayComponent {
  
  inline def apply(
    bind: () => Unit,
    mount: () => Unit,
    start: () => Unit,
    stop: () => Unit,
    time: Double,
    unbind: () => Unit
  ): AutoplayComponent = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction0(bind), mount = js.Any.fromFunction0(mount), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop), time = time.asInstanceOf[js.Any], unbind = js.Any.fromFunction0(unbind))
    __obj.asInstanceOf[AutoplayComponent]
  }
  
  extension [Self <: AutoplayComponent](x: Self) {
    
    inline def setBind(value: () => Unit): Self = StObject.set(x, "bind", js.Any.fromFunction0(value))
    
    inline def setMount(value: () => Unit): Self = StObject.set(x, "mount", js.Any.fromFunction0(value))
    
    inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    
    inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setUnbind(value: () => Unit): Self = StObject.set(x, "unbind", js.Any.fromFunction0(value))
  }
}
