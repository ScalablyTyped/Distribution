package typings.framerMotion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @public
  */
trait CustomValueType extends StObject {
  
  def mix(from: Any, to: Any): js.Function1[/* p */ Double, Double | String]
  
  def toValue(): Double | String
}
object CustomValueType {
  
  inline def apply(mix: (Any, Any) => js.Function1[/* p */ Double, Double | String], toValue: () => Double | String): CustomValueType = {
    val __obj = js.Dynamic.literal(mix = js.Any.fromFunction2(mix), toValue = js.Any.fromFunction0(toValue))
    __obj.asInstanceOf[CustomValueType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomValueType] (val x: Self) extends AnyVal {
    
    inline def setMix(value: (Any, Any) => js.Function1[/* p */ Double, Double | String]): Self = StObject.set(x, "mix", js.Any.fromFunction2(value))
    
    inline def setToValue(value: () => Double | String): Self = StObject.set(x, "toValue", js.Any.fromFunction0(value))
  }
}
