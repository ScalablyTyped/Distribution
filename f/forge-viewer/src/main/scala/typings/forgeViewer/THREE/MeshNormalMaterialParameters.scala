package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeshNormalMaterialParameters
  extends StObject
     with MaterialParameters {
  
  var morphTargets: js.UndefOr[Boolean] = js.undefined
  
  /** Render geometry as wireframe. Default is false (i.e. render as smooth shaded). */
  var wireframe: js.UndefOr[Boolean] = js.undefined
  
  /** Controls wireframe thickness. Default is 1. */
  var wireframeLinewidth: js.UndefOr[Double] = js.undefined
}
object MeshNormalMaterialParameters {
  
  inline def apply(): MeshNormalMaterialParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshNormalMaterialParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MeshNormalMaterialParameters] (val x: Self) extends AnyVal {
    
    inline def setMorphTargets(value: Boolean): Self = StObject.set(x, "morphTargets", value.asInstanceOf[js.Any])
    
    inline def setMorphTargetsUndefined: Self = StObject.set(x, "morphTargets", js.undefined)
    
    inline def setWireframe(value: Boolean): Self = StObject.set(x, "wireframe", value.asInstanceOf[js.Any])
    
    inline def setWireframeLinewidth(value: Double): Self = StObject.set(x, "wireframeLinewidth", value.asInstanceOf[js.Any])
    
    inline def setWireframeLinewidthUndefined: Self = StObject.set(x, "wireframeLinewidth", js.undefined)
    
    inline def setWireframeUndefined: Self = StObject.set(x, "wireframe", js.undefined)
  }
}
