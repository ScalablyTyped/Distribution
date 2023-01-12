package typings.draco3d.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mesh
  extends StObject
     with PointCloud {
  
  def num_faces(): Double
  
  var ptr: Double
}
object Mesh {
  
  inline def apply(num_attributes: () => Double, num_faces: () => Double, num_points: () => Double, ptr: Double): Mesh = {
    val __obj = js.Dynamic.literal(num_attributes = js.Any.fromFunction0(num_attributes), num_faces = js.Any.fromFunction0(num_faces), num_points = js.Any.fromFunction0(num_points), ptr = ptr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mesh]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Mesh] (val x: Self) extends AnyVal {
    
    inline def setNum_faces(value: () => Double): Self = StObject.set(x, "num_faces", js.Any.fromFunction0(value))
    
    inline def setPtr(value: Double): Self = StObject.set(x, "ptr", value.asInstanceOf[js.Any])
  }
}
