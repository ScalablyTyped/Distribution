package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MorphTarget extends StObject {
  
  var name: String
  
  var vertices: js.Array[Vector3]
}
object MorphTarget {
  
  inline def apply(name: String, vertices: js.Array[Vector3]): MorphTarget = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[MorphTarget]
  }
  
  extension [Self <: MorphTarget](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setVertices(value: js.Array[Vector3]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    inline def setVerticesVarargs(value: Vector3*): Self = StObject.set(x, "vertices", js.Array(value*))
  }
}
