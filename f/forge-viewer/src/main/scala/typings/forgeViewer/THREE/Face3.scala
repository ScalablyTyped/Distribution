package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Face3 extends StObject {
  
  var a: Double
  
  var b: Double
  
  var c: Double
  
  var color: Color
  
  var materialIndex: Double
  
  var normal: Vector3
  
  var vertexColors: js.Array[Color]
  
  var vertexNormals: js.Array[Vector3]
  
  var vertexTangents: js.Array[Double]
}
object Face3 {
  
  inline def apply(
    a: Double,
    b: Double,
    c: Double,
    color: Color,
    materialIndex: Double,
    normal: Vector3,
    vertexColors: js.Array[Color],
    vertexNormals: js.Array[Vector3],
    vertexTangents: js.Array[Double]
  ): Face3 = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], materialIndex = materialIndex.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], vertexColors = vertexColors.asInstanceOf[js.Any], vertexNormals = vertexNormals.asInstanceOf[js.Any], vertexTangents = vertexTangents.asInstanceOf[js.Any])
    __obj.asInstanceOf[Face3]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Face3] (val x: Self) extends AnyVal {
    
    inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setC(value: Double): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setMaterialIndex(value: Double): Self = StObject.set(x, "materialIndex", value.asInstanceOf[js.Any])
    
    inline def setNormal(value: Vector3): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    inline def setVertexColors(value: js.Array[Color]): Self = StObject.set(x, "vertexColors", value.asInstanceOf[js.Any])
    
    inline def setVertexColorsVarargs(value: Color*): Self = StObject.set(x, "vertexColors", js.Array(value*))
    
    inline def setVertexNormals(value: js.Array[Vector3]): Self = StObject.set(x, "vertexNormals", value.asInstanceOf[js.Any])
    
    inline def setVertexNormalsVarargs(value: Vector3*): Self = StObject.set(x, "vertexNormals", js.Array(value*))
    
    inline def setVertexTangents(value: js.Array[Double]): Self = StObject.set(x, "vertexTangents", value.asInstanceOf[js.Any])
    
    inline def setVertexTangentsVarargs(value: Double*): Self = StObject.set(x, "vertexTangents", js.Array(value*))
  }
}
