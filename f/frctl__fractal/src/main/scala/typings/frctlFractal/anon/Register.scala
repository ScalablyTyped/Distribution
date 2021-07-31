package typings.frctlFractal.anon

import typings.frctlFractal.mod.Adapter
import typings.frctlFractal.mod.fractal.core.entities.Entity
import typings.frctlFractal.mod.fractal.core.entities.EntitySource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Register[T /* <: Entity */, TEngine] extends StObject {
  
  def register(source: EntitySource[T, js.Any], app: js.Any): Adapter[TEngine]
}
object Register {
  
  @scala.inline
  def apply[T /* <: Entity */, TEngine](register: (EntitySource[T, js.Any], js.Any) => Adapter[TEngine]): Register[T, TEngine] = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction2(register))
    __obj.asInstanceOf[Register[T, TEngine]]
  }
  
  @scala.inline
  implicit class RegisterMutableBuilder[Self <: Register[?, ?], T /* <: Entity */, TEngine] (val x: Self & (Register[T, TEngine])) extends AnyVal {
    
    @scala.inline
    def setRegister(value: (EntitySource[T, js.Any], js.Any) => Adapter[TEngine]): Self = StObject.set(x, "register", js.Any.fromFunction2(value))
  }
}
