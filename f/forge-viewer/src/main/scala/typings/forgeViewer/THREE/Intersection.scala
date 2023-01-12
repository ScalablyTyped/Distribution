package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Intersection extends StObject {
  
  var distance: Double
  
  var distanceToRay: Double
  
  var face: Face3
  
  var faceIndex: Double
  
  var index: Double
  
  var `object`: Object3D
  
  var point: Vector3
}
object Intersection {
  
  inline def apply(
    distance: Double,
    distanceToRay: Double,
    face: Face3,
    faceIndex: Double,
    index: Double,
    `object`: Object3D,
    point: Vector3
  ): Intersection = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], distanceToRay = distanceToRay.asInstanceOf[js.Any], face = face.asInstanceOf[js.Any], faceIndex = faceIndex.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Intersection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Intersection] (val x: Self) extends AnyVal {
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setDistanceToRay(value: Double): Self = StObject.set(x, "distanceToRay", value.asInstanceOf[js.Any])
    
    inline def setFace(value: Face3): Self = StObject.set(x, "face", value.asInstanceOf[js.Any])
    
    inline def setFaceIndex(value: Double): Self = StObject.set(x, "faceIndex", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setObject(value: Object3D): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setPoint(value: Vector3): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
  }
}
