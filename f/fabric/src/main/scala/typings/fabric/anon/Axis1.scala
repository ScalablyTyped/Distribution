package typings.fabric.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Axis1 extends StObject {
  
  var axis1: js.Any
  
  var axis2: js.Any
  
  var dimension: js.Any
  
  var origin: Double
}
object Axis1 {
  
  @scala.inline
  def apply(axis1: js.Any, axis2: js.Any, dimension: js.Any, origin: Double): Axis1 = {
    val __obj = js.Dynamic.literal(axis1 = axis1.asInstanceOf[js.Any], axis2 = axis2.asInstanceOf[js.Any], dimension = dimension.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Axis1]
  }
  
  @scala.inline
  implicit class Axis1MutableBuilder[Self <: Axis1] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxis1(value: js.Any): Self = StObject.set(x, "axis1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxis2(value: js.Any): Self = StObject.set(x, "axis2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimension(value: js.Any): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: Double): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
  }
}
