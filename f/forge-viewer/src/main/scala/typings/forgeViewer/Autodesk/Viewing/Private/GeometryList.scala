package typings.forgeViewer.Autodesk.Viewing.Private

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeometryList extends StObject {
  
  var disableStreaming: Boolean
  
  var geomBoxes: js.typedarray.Float32Array
  
  var geomMemory: Double
  
  var geomPolyCount: Double
  
  var geoms: js.Array[Any]
  
  var gpuMeshMemory: Double
  
  var gpuNumMeshes: Double
  
  var instancePolyCount: Double
  
  var is2d: Boolean
  
  var numGeomsInMemory: Double
  
  var numObjects: Double
}
object GeometryList {
  
  inline def apply(
    disableStreaming: Boolean,
    geomBoxes: js.typedarray.Float32Array,
    geomMemory: Double,
    geomPolyCount: Double,
    geoms: js.Array[Any],
    gpuMeshMemory: Double,
    gpuNumMeshes: Double,
    instancePolyCount: Double,
    is2d: Boolean,
    numGeomsInMemory: Double,
    numObjects: Double
  ): GeometryList = {
    val __obj = js.Dynamic.literal(disableStreaming = disableStreaming.asInstanceOf[js.Any], geomBoxes = geomBoxes.asInstanceOf[js.Any], geomMemory = geomMemory.asInstanceOf[js.Any], geomPolyCount = geomPolyCount.asInstanceOf[js.Any], geoms = geoms.asInstanceOf[js.Any], gpuMeshMemory = gpuMeshMemory.asInstanceOf[js.Any], gpuNumMeshes = gpuNumMeshes.asInstanceOf[js.Any], instancePolyCount = instancePolyCount.asInstanceOf[js.Any], is2d = is2d.asInstanceOf[js.Any], numGeomsInMemory = numGeomsInMemory.asInstanceOf[js.Any], numObjects = numObjects.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryList]
  }
  
  extension [Self <: GeometryList](x: Self) {
    
    inline def setDisableStreaming(value: Boolean): Self = StObject.set(x, "disableStreaming", value.asInstanceOf[js.Any])
    
    inline def setGeomBoxes(value: js.typedarray.Float32Array): Self = StObject.set(x, "geomBoxes", value.asInstanceOf[js.Any])
    
    inline def setGeomMemory(value: Double): Self = StObject.set(x, "geomMemory", value.asInstanceOf[js.Any])
    
    inline def setGeomPolyCount(value: Double): Self = StObject.set(x, "geomPolyCount", value.asInstanceOf[js.Any])
    
    inline def setGeoms(value: js.Array[Any]): Self = StObject.set(x, "geoms", value.asInstanceOf[js.Any])
    
    inline def setGeomsVarargs(value: Any*): Self = StObject.set(x, "geoms", js.Array(value*))
    
    inline def setGpuMeshMemory(value: Double): Self = StObject.set(x, "gpuMeshMemory", value.asInstanceOf[js.Any])
    
    inline def setGpuNumMeshes(value: Double): Self = StObject.set(x, "gpuNumMeshes", value.asInstanceOf[js.Any])
    
    inline def setInstancePolyCount(value: Double): Self = StObject.set(x, "instancePolyCount", value.asInstanceOf[js.Any])
    
    inline def setIs2d(value: Boolean): Self = StObject.set(x, "is2d", value.asInstanceOf[js.Any])
    
    inline def setNumGeomsInMemory(value: Double): Self = StObject.set(x, "numGeomsInMemory", value.asInstanceOf[js.Any])
    
    inline def setNumObjects(value: Double): Self = StObject.set(x, "numObjects", value.asInstanceOf[js.Any])
  }
}
