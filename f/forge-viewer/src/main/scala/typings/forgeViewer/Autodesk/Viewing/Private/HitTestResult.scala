package typings.forgeViewer.Autodesk.Viewing.Private

import typings.forgeViewer.Autodesk.Viewing.Model
import typings.forgeViewer.THREE.Face3
import typings.forgeViewer.THREE.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HitTestResult extends StObject {
  
  var dbId: Double
  
  var distance: Double
  
  var face: Face3
  
  var faceIndex: Double
  
  var fragId: Double
  
  var intersectPoint: Vector3
  
  var model: Model
  
  var `object`: Any
  
  var point: Vector3
}
object HitTestResult {
  
  inline def apply(
    dbId: Double,
    distance: Double,
    face: Face3,
    faceIndex: Double,
    fragId: Double,
    intersectPoint: Vector3,
    model: Model,
    `object`: Any,
    point: Vector3
  ): HitTestResult = {
    val __obj = js.Dynamic.literal(dbId = dbId.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], face = face.asInstanceOf[js.Any], faceIndex = faceIndex.asInstanceOf[js.Any], fragId = fragId.asInstanceOf[js.Any], intersectPoint = intersectPoint.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HitTestResult]
  }
  
  extension [Self <: HitTestResult](x: Self) {
    
    inline def setDbId(value: Double): Self = StObject.set(x, "dbId", value.asInstanceOf[js.Any])
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setFace(value: Face3): Self = StObject.set(x, "face", value.asInstanceOf[js.Any])
    
    inline def setFaceIndex(value: Double): Self = StObject.set(x, "faceIndex", value.asInstanceOf[js.Any])
    
    inline def setFragId(value: Double): Self = StObject.set(x, "fragId", value.asInstanceOf[js.Any])
    
    inline def setIntersectPoint(value: Vector3): Self = StObject.set(x, "intersectPoint", value.asInstanceOf[js.Any])
    
    inline def setModel(value: Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setObject(value: Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setPoint(value: Vector3): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
  }
}
