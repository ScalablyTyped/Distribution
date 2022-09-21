package typings.frctlFractal.anon

import typings.frctlFractal.mod.Adapter
import typings.frctlFractal.mod.fractal.core.entities.Entity
import typings.frctlFractal.mod.fractal.core.entities.EntitySource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Register[T /* <: Entity */, TEngine] extends StObject {
  
  def register(source: EntitySource[T, Any], app: Any): Adapter[TEngine]
}
object Register {
  
  inline def apply[T /* <: Entity */, TEngine](register: (EntitySource[T, Any], Any) => Adapter[TEngine]): Register[T, TEngine] = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction2(register))
    __obj.asInstanceOf[Register[T, TEngine]]
  }
  
  extension [Self <: Register[?, ?], T /* <: Entity */, TEngine](x: Self & (Register[T, TEngine])) {
    
    inline def setRegister(value: (EntitySource[T, Any], Any) => Adapter[TEngine]): Self = StObject.set(x, "register", js.Any.fromFunction2(value))
  }
}
