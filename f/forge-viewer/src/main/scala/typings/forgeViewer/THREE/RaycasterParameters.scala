package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RaycasterParameters extends StObject {
  
  var LOD: js.UndefOr[Any] = js.undefined
  
  var Line: js.UndefOr[Any] = js.undefined
  
  var Mesh: js.UndefOr[Any] = js.undefined
  
  var PointCloud: js.UndefOr[Any] = js.undefined
  
  var Sprite: js.UndefOr[Any] = js.undefined
}
object RaycasterParameters {
  
  inline def apply(): RaycasterParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RaycasterParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RaycasterParameters] (val x: Self) extends AnyVal {
    
    inline def setLOD(value: Any): Self = StObject.set(x, "LOD", value.asInstanceOf[js.Any])
    
    inline def setLODUndefined: Self = StObject.set(x, "LOD", js.undefined)
    
    inline def setLine(value: Any): Self = StObject.set(x, "Line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "Line", js.undefined)
    
    inline def setMesh(value: Any): Self = StObject.set(x, "Mesh", value.asInstanceOf[js.Any])
    
    inline def setMeshUndefined: Self = StObject.set(x, "Mesh", js.undefined)
    
    inline def setPointCloud(value: Any): Self = StObject.set(x, "PointCloud", value.asInstanceOf[js.Any])
    
    inline def setPointCloudUndefined: Self = StObject.set(x, "PointCloud", js.undefined)
    
    inline def setSprite(value: Any): Self = StObject.set(x, "Sprite", value.asInstanceOf[js.Any])
    
    inline def setSpriteUndefined: Self = StObject.set(x, "Sprite", js.undefined)
  }
}
