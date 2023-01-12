package typings.forgeViewer.anon

import typings.forgeViewer.THREE.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateSideWallUV extends StObject {
  
  def generateSideWallUV(
    geometry: typings.forgeViewer.THREE.Geometry,
    indexA: Double,
    indexB: Double,
    indexC: Double,
    indexD: Double
  ): js.Array[Vector2]
  
  def generateTopUV(geometry: typings.forgeViewer.THREE.Geometry, indexA: Double, indexB: Double, indexC: Double): js.Array[Vector2]
}
object GenerateSideWallUV {
  
  inline def apply(
    generateSideWallUV: (typings.forgeViewer.THREE.Geometry, Double, Double, Double, Double) => js.Array[Vector2],
    generateTopUV: (typings.forgeViewer.THREE.Geometry, Double, Double, Double) => js.Array[Vector2]
  ): GenerateSideWallUV = {
    val __obj = js.Dynamic.literal(generateSideWallUV = js.Any.fromFunction5(generateSideWallUV), generateTopUV = js.Any.fromFunction4(generateTopUV))
    __obj.asInstanceOf[GenerateSideWallUV]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GenerateSideWallUV] (val x: Self) extends AnyVal {
    
    inline def setGenerateSideWallUV(value: (typings.forgeViewer.THREE.Geometry, Double, Double, Double, Double) => js.Array[Vector2]): Self = StObject.set(x, "generateSideWallUV", js.Any.fromFunction5(value))
    
    inline def setGenerateTopUV(value: (typings.forgeViewer.THREE.Geometry, Double, Double, Double) => js.Array[Vector2]): Self = StObject.set(x, "generateTopUV", js.Any.fromFunction4(value))
  }
}
