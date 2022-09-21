package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeshDepthMaterialParameters
  extends StObject
     with MaterialParameters {
  
  var wireframe: js.UndefOr[Boolean] = js.undefined
  
  var wireframeLinewidth: js.UndefOr[Double] = js.undefined
}
object MeshDepthMaterialParameters {
  
  inline def apply(): MeshDepthMaterialParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshDepthMaterialParameters]
  }
  
  extension [Self <: MeshDepthMaterialParameters](x: Self) {
    
    inline def setWireframe(value: Boolean): Self = StObject.set(x, "wireframe", value.asInstanceOf[js.Any])
    
    inline def setWireframeLinewidth(value: Double): Self = StObject.set(x, "wireframeLinewidth", value.asInstanceOf[js.Any])
    
    inline def setWireframeLinewidthUndefined: Self = StObject.set(x, "wireframeLinewidth", js.undefined)
    
    inline def setWireframeUndefined: Self = StObject.set(x, "wireframe", js.undefined)
  }
}
