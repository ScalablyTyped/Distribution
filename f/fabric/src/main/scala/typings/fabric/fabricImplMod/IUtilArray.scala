package typings.fabric.fabricImplMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUtilArray extends StObject {
  
  /**
    * Invokes method on all items in a given array
    * @param array Array to iterate over
    * @param method Name of a method to invoke
    */
  def invoke(array: js.Array[Any], method: String): js.Array[Any]
  
  /**
    * Finds maximum value in array (not necessarily "first" one)
    * @param array Array to iterate over
    */
  def max(array: js.Array[Any], byProperty: String): Any
  
  /**
    * Finds minimum value in array (not necessarily "first" one)
    * @param array Array to iterate over
    */
  def min(array: js.Array[Any], byProperty: String): Any
}
object IUtilArray {
  
  inline def apply(
    invoke: (js.Array[Any], String) => js.Array[Any],
    max: (js.Array[Any], String) => Any,
    min: (js.Array[Any], String) => Any
  ): IUtilArray = {
    val __obj = js.Dynamic.literal(invoke = js.Any.fromFunction2(invoke), max = js.Any.fromFunction2(max), min = js.Any.fromFunction2(min))
    __obj.asInstanceOf[IUtilArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IUtilArray] (val x: Self) extends AnyVal {
    
    inline def setInvoke(value: (js.Array[Any], String) => js.Array[Any]): Self = StObject.set(x, "invoke", js.Any.fromFunction2(value))
    
    inline def setMax(value: (js.Array[Any], String) => Any): Self = StObject.set(x, "max", js.Any.fromFunction2(value))
    
    inline def setMin(value: (js.Array[Any], String) => Any): Self = StObject.set(x, "min", js.Any.fromFunction2(value))
  }
}
