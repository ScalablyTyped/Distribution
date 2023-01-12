package typings.egg.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayLimit extends StObject {
  
  var arrayLimit: Double
  
  var depth: Double
  
  var parameterLimit: Double
}
object ArrayLimit {
  
  inline def apply(arrayLimit: Double, depth: Double, parameterLimit: Double): ArrayLimit = {
    val __obj = js.Dynamic.literal(arrayLimit = arrayLimit.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], parameterLimit = parameterLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayLimit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArrayLimit] (val x: Self) extends AnyVal {
    
    inline def setArrayLimit(value: Double): Self = StObject.set(x, "arrayLimit", value.asInstanceOf[js.Any])
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setParameterLimit(value: Double): Self = StObject.set(x, "parameterLimit", value.asInstanceOf[js.Any])
  }
}
