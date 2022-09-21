package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MorphNormals extends StObject {
  
  var name: String
  
  var normals: js.Array[Vector3]
}
object MorphNormals {
  
  inline def apply(name: String, normals: js.Array[Vector3]): MorphNormals = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], normals = normals.asInstanceOf[js.Any])
    __obj.asInstanceOf[MorphNormals]
  }
  
  extension [Self <: MorphNormals](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNormals(value: js.Array[Vector3]): Self = StObject.set(x, "normals", value.asInstanceOf[js.Any])
    
    inline def setNormalsVarargs(value: Vector3*): Self = StObject.set(x, "normals", js.Array(value*))
  }
}
