package typings.ejWebAll.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueFunction extends StObject {
  
  def valueFunction(`val`: String): Any
}
object ValueFunction {
  
  inline def apply(valueFunction: String => Any): ValueFunction = {
    val __obj = js.Dynamic.literal(valueFunction = js.Any.fromFunction1(valueFunction))
    __obj.asInstanceOf[ValueFunction]
  }
  
  extension [Self <: ValueFunction](x: Self) {
    
    inline def setValueFunction(value: String => Any): Self = StObject.set(x, "valueFunction", js.Any.fromFunction1(value))
  }
}
