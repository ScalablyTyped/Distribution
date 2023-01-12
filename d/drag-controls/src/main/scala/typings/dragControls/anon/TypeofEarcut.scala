package typings.dragControls.anon

import typings.three.srcThreeMod.Triangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofEarcut extends StObject {
  
  def triangulate(data: js.Array[Double], holeIndices: js.Array[Double], dim: Double): js.Array[Triangle]
}
object TypeofEarcut {
  
  inline def apply(triangulate: (js.Array[Double], js.Array[Double], Double) => js.Array[Triangle]): TypeofEarcut = {
    val __obj = js.Dynamic.literal(triangulate = js.Any.fromFunction3(triangulate))
    __obj.asInstanceOf[TypeofEarcut]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofEarcut] (val x: Self) extends AnyVal {
    
    inline def setTriangulate(value: (js.Array[Double], js.Array[Double], Double) => js.Array[Triangle]): Self = StObject.set(x, "triangulate", js.Any.fromFunction3(value))
  }
}
