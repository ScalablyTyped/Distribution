package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShaderMaterialParameters
  extends StObject
     with MaterialParameters {
  
  var attributes: js.UndefOr[Any] = js.undefined
  
  var clipping: js.UndefOr[Boolean] = js.undefined
  
  var defines: js.UndefOr[Any] = js.undefined
  
  var fragmentShader: js.UndefOr[String] = js.undefined
  
  var lineWidth: js.UndefOr[Double] = js.undefined
  
  var morphNormals: js.UndefOr[Boolean] = js.undefined
  
  var morphTargets: js.UndefOr[Boolean] = js.undefined
  
  var skinning: js.UndefOr[Boolean] = js.undefined
  
  var uniforms: js.UndefOr[Any] = js.undefined
  
  var vertexShader: js.UndefOr[String] = js.undefined
  
  var wireframe: js.UndefOr[Boolean] = js.undefined
  
  var wireframeLinewidth: js.UndefOr[Double] = js.undefined
}
object ShaderMaterialParameters {
  
  inline def apply(): ShaderMaterialParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShaderMaterialParameters]
  }
  
  extension [Self <: ShaderMaterialParameters](x: Self) {
    
    inline def setAttributes(value: Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setClipping(value: Boolean): Self = StObject.set(x, "clipping", value.asInstanceOf[js.Any])
    
    inline def setClippingUndefined: Self = StObject.set(x, "clipping", js.undefined)
    
    inline def setDefines(value: Any): Self = StObject.set(x, "defines", value.asInstanceOf[js.Any])
    
    inline def setDefinesUndefined: Self = StObject.set(x, "defines", js.undefined)
    
    inline def setFragmentShader(value: String): Self = StObject.set(x, "fragmentShader", value.asInstanceOf[js.Any])
    
    inline def setFragmentShaderUndefined: Self = StObject.set(x, "fragmentShader", js.undefined)
    
    inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    inline def setMorphNormals(value: Boolean): Self = StObject.set(x, "morphNormals", value.asInstanceOf[js.Any])
    
    inline def setMorphNormalsUndefined: Self = StObject.set(x, "morphNormals", js.undefined)
    
    inline def setMorphTargets(value: Boolean): Self = StObject.set(x, "morphTargets", value.asInstanceOf[js.Any])
    
    inline def setMorphTargetsUndefined: Self = StObject.set(x, "morphTargets", js.undefined)
    
    inline def setSkinning(value: Boolean): Self = StObject.set(x, "skinning", value.asInstanceOf[js.Any])
    
    inline def setSkinningUndefined: Self = StObject.set(x, "skinning", js.undefined)
    
    inline def setUniforms(value: Any): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
    
    inline def setUniformsUndefined: Self = StObject.set(x, "uniforms", js.undefined)
    
    inline def setVertexShader(value: String): Self = StObject.set(x, "vertexShader", value.asInstanceOf[js.Any])
    
    inline def setVertexShaderUndefined: Self = StObject.set(x, "vertexShader", js.undefined)
    
    inline def setWireframe(value: Boolean): Self = StObject.set(x, "wireframe", value.asInstanceOf[js.Any])
    
    inline def setWireframeLinewidth(value: Double): Self = StObject.set(x, "wireframeLinewidth", value.asInstanceOf[js.Any])
    
    inline def setWireframeLinewidthUndefined: Self = StObject.set(x, "wireframeLinewidth", js.undefined)
    
    inline def setWireframeUndefined: Self = StObject.set(x, "wireframe", js.undefined)
  }
}
