package typings.earcut

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dimensions extends StObject {
    
    var dimensions: Double
    
    var holes: js.Array[Double]
    
    var vertices: js.Array[Double]
  }
  object Dimensions {
    
    inline def apply(dimensions: Double, holes: js.Array[Double], vertices: js.Array[Double]): Dimensions = {
      val __obj = js.Dynamic.literal(dimensions = dimensions.asInstanceOf[js.Any], holes = holes.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dimensions]
    }
    
    extension [Self <: Dimensions](x: Self) {
      
      inline def setDimensions(value: Double): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
      
      inline def setHoles(value: js.Array[Double]): Self = StObject.set(x, "holes", value.asInstanceOf[js.Any])
      
      inline def setHolesVarargs(value: Double*): Self = StObject.set(x, "holes", js.Array(value*))
      
      inline def setVertices(value: js.Array[Double]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
      
      inline def setVerticesVarargs(value: Double*): Self = StObject.set(x, "vertices", js.Array(value*))
    }
  }
}
