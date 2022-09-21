package typings.fullcalendarCommon.anon

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Destroy extends StObject {
  
  var destroy: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  
  def render(el: HTMLElement, contentVal: Any): scala.Unit
}
object Destroy {
  
  inline def apply(render: (HTMLElement, Any) => scala.Unit): Destroy = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction2(render))
    __obj.asInstanceOf[Destroy]
  }
  
  extension [Self <: Destroy](x: Self) {
    
    inline def setDestroy(value: () => scala.Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    inline def setRender(value: (HTMLElement, Any) => scala.Unit): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
  }
}
