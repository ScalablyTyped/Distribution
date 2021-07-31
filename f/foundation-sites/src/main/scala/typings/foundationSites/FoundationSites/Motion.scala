package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Motion extends StObject {
  
  def animateIn(element: js.Object, animation: js.Any, cb: js.Function): Unit
  
  def animateOut(element: js.Object, animation: js.Any, cb: js.Function): Unit
}
object Motion {
  
  @scala.inline
  def apply(
    animateIn: (js.Object, js.Any, js.Function) => Unit,
    animateOut: (js.Object, js.Any, js.Function) => Unit
  ): Motion = {
    val __obj = js.Dynamic.literal(animateIn = js.Any.fromFunction3(animateIn), animateOut = js.Any.fromFunction3(animateOut))
    __obj.asInstanceOf[Motion]
  }
  
  @scala.inline
  implicit class MotionMutableBuilder[Self <: Motion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimateIn(value: (js.Object, js.Any, js.Function) => Unit): Self = StObject.set(x, "animateIn", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAnimateOut(value: (js.Object, js.Any, js.Function) => Unit): Self = StObject.set(x, "animateOut", js.Any.fromFunction3(value))
  }
}
