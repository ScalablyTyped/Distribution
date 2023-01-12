package typings.draco3d.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointCloud extends StObject {
  
  def num_attributes(): Double
  
  def num_points(): Double
}
object PointCloud {
  
  inline def apply(num_attributes: () => Double, num_points: () => Double): PointCloud = {
    val __obj = js.Dynamic.literal(num_attributes = js.Any.fromFunction0(num_attributes), num_points = js.Any.fromFunction0(num_points))
    __obj.asInstanceOf[PointCloud]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PointCloud] (val x: Self) extends AnyVal {
    
    inline def setNum_attributes(value: () => Double): Self = StObject.set(x, "num_attributes", js.Any.fromFunction0(value))
    
    inline def setNum_points(value: () => Double): Self = StObject.set(x, "num_points", js.Any.fromFunction0(value))
  }
}
