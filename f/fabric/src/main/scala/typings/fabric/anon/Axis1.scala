package typings.fabric.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Axis1 extends StObject {
  
  var axis1: Any
  
  var axis2: Any
  
  var dimension: Any
  
  var origin: Double
}
object Axis1 {
  
  inline def apply(axis1: Any, axis2: Any, dimension: Any, origin: Double): Axis1 = {
    val __obj = js.Dynamic.literal(axis1 = axis1.asInstanceOf[js.Any], axis2 = axis2.asInstanceOf[js.Any], dimension = dimension.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Axis1]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Axis1] (val x: Self) extends AnyVal {
    
    inline def setAxis1(value: Any): Self = StObject.set(x, "axis1", value.asInstanceOf[js.Any])
    
    inline def setAxis2(value: Any): Self = StObject.set(x, "axis2", value.asInstanceOf[js.Any])
    
    inline def setDimension(value: Any): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: Double): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
  }
}
