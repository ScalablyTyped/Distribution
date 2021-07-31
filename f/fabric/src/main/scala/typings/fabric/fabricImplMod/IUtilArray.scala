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
  def invoke(array: js.Array[js.Any], method: String): js.Array[js.Any]
  
  /**
    * Finds maximum value in array (not necessarily "first" one)
    * @param array Array to iterate over
    */
  def max(array: js.Array[js.Any], byProperty: String): js.Any
  
  /**
    * Finds minimum value in array (not necessarily "first" one)
    * @param array Array to iterate over
    */
  def min(array: js.Array[js.Any], byProperty: String): js.Any
}
object IUtilArray {
  
  @scala.inline
  def apply(
    invoke: (js.Array[js.Any], String) => js.Array[js.Any],
    max: (js.Array[js.Any], String) => js.Any,
    min: (js.Array[js.Any], String) => js.Any
  ): IUtilArray = {
    val __obj = js.Dynamic.literal(invoke = js.Any.fromFunction2(invoke), max = js.Any.fromFunction2(max), min = js.Any.fromFunction2(min))
    __obj.asInstanceOf[IUtilArray]
  }
  
  @scala.inline
  implicit class IUtilArrayMutableBuilder[Self <: IUtilArray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvoke(value: (js.Array[js.Any], String) => js.Array[js.Any]): Self = StObject.set(x, "invoke", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMax(value: (js.Array[js.Any], String) => js.Any): Self = StObject.set(x, "max", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMin(value: (js.Array[js.Any], String) => js.Any): Self = StObject.set(x, "min", js.Any.fromFunction2(value))
  }
}
