package typings.ejWebAll.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueFunction extends StObject {
  
  def valueFunction(`val`: String): js.Any
}
object ValueFunction {
  
  @scala.inline
  def apply(valueFunction: String => js.Any): ValueFunction = {
    val __obj = js.Dynamic.literal(valueFunction = js.Any.fromFunction1(valueFunction))
    __obj.asInstanceOf[ValueFunction]
  }
  
  @scala.inline
  implicit class ValueFunctionMutableBuilder[Self <: ValueFunction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValueFunction(value: String => js.Any): Self = StObject.set(x, "valueFunction", js.Any.fromFunction1(value))
  }
}
