package typings.forgeViewer.anon

import typings.forgeViewer.forgeViewerStrings.orthographic
import typings.forgeViewer.forgeViewerStrings.perspective
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AspectRatio extends StObject {
  
  var aspectRatio: Double
  
  var distanceToOrbit: Double
  
  var eye: js.Tuple3[Double, Double, Double]
  
  var fieldOfView: js.UndefOr[Double] = js.undefined
  
  var isOrthographic: Boolean
  
  var name: String
  
  var orthographicHeight: js.UndefOr[Double] = js.undefined
  
  var pivotPoint: js.Tuple3[Double, Double, Double]
  
  var projection: perspective | orthographic
  
  var target: js.Tuple3[Double, Double, Double]
  
  var up: js.Tuple3[Double, Double, Double]
  
  var worldUpVector: js.Tuple3[Double, Double, Double]
}
object AspectRatio {
  
  inline def apply(
    aspectRatio: Double,
    distanceToOrbit: Double,
    eye: js.Tuple3[Double, Double, Double],
    isOrthographic: Boolean,
    name: String,
    pivotPoint: js.Tuple3[Double, Double, Double],
    projection: perspective | orthographic,
    target: js.Tuple3[Double, Double, Double],
    up: js.Tuple3[Double, Double, Double],
    worldUpVector: js.Tuple3[Double, Double, Double]
  ): AspectRatio = {
    val __obj = js.Dynamic.literal(aspectRatio = aspectRatio.asInstanceOf[js.Any], distanceToOrbit = distanceToOrbit.asInstanceOf[js.Any], eye = eye.asInstanceOf[js.Any], isOrthographic = isOrthographic.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pivotPoint = pivotPoint.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any], worldUpVector = worldUpVector.asInstanceOf[js.Any])
    __obj.asInstanceOf[AspectRatio]
  }
  
  extension [Self <: AspectRatio](x: Self) {
    
    inline def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    inline def setDistanceToOrbit(value: Double): Self = StObject.set(x, "distanceToOrbit", value.asInstanceOf[js.Any])
    
    inline def setEye(value: js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "eye", value.asInstanceOf[js.Any])
    
    inline def setFieldOfView(value: Double): Self = StObject.set(x, "fieldOfView", value.asInstanceOf[js.Any])
    
    inline def setFieldOfViewUndefined: Self = StObject.set(x, "fieldOfView", js.undefined)
    
    inline def setIsOrthographic(value: Boolean): Self = StObject.set(x, "isOrthographic", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOrthographicHeight(value: Double): Self = StObject.set(x, "orthographicHeight", value.asInstanceOf[js.Any])
    
    inline def setOrthographicHeightUndefined: Self = StObject.set(x, "orthographicHeight", js.undefined)
    
    inline def setPivotPoint(value: js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "pivotPoint", value.asInstanceOf[js.Any])
    
    inline def setProjection(value: perspective | orthographic): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setUp(value: js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
    
    inline def setWorldUpVector(value: js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "worldUpVector", value.asInstanceOf[js.Any])
  }
}
