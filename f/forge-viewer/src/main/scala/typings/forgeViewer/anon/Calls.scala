package typings.forgeViewer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Calls extends StObject {
  
  var calls: Double
  
  var faces: Double
  
  var points: Double
  
  var vertices: Double
}
object Calls {
  
  inline def apply(calls: Double, faces: Double, points: Double, vertices: Double): Calls = {
    val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], faces = faces.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calls]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Calls] (val x: Self) extends AnyVal {
    
    inline def setCalls(value: Double): Self = StObject.set(x, "calls", value.asInstanceOf[js.Any])
    
    inline def setFaces(value: Double): Self = StObject.set(x, "faces", value.asInstanceOf[js.Any])
    
    inline def setPoints(value: Double): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setVertices(value: Double): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
  }
}
