package typings.ejWebAll.anon

import typings.ejWebAll.ej.Widget_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofWidget_ extends StObject {
  
  /* static member */
  def extend(widget: Widget_): Any
  
  /* static member */
  var fn: Widget_
}
object TypeofWidget_ {
  
  inline def apply(extend: Widget_ => Any, fn: Widget_): TypeofWidget_ = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofWidget_]
  }
  
  extension [Self <: TypeofWidget_](x: Self) {
    
    inline def setExtend(value: Widget_ => Any): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Widget_): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
