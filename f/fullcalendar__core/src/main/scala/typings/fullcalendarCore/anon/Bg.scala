package typings.fullcalendarCore.anon

import typings.fullcalendarCore.internalCommonMod.EventRenderRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bg extends StObject {
  
  var bg: js.Array[EventRenderRange]
  
  var fg: js.Array[EventRenderRange]
}
object Bg {
  
  inline def apply(bg: js.Array[EventRenderRange], fg: js.Array[EventRenderRange]): Bg = {
    val __obj = js.Dynamic.literal(bg = bg.asInstanceOf[js.Any], fg = fg.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bg] (val x: Self) extends AnyVal {
    
    inline def setBg(value: js.Array[EventRenderRange]): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
    
    inline def setBgVarargs(value: EventRenderRange*): Self = StObject.set(x, "bg", js.Array(value*))
    
    inline def setFg(value: js.Array[EventRenderRange]): Self = StObject.set(x, "fg", value.asInstanceOf[js.Any])
    
    inline def setFgVarargs(value: EventRenderRange*): Self = StObject.set(x, "fg", js.Array(value*))
  }
}
