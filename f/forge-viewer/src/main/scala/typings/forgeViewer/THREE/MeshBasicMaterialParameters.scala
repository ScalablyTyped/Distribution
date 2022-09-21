package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeshBasicMaterialParameters
  extends StObject
     with MaterialParameters {
  
  var alphaMap: js.UndefOr[Texture] = js.undefined
  
  var aoMap: js.UndefOr[Texture] = js.undefined
  
  var aoMapIntensity: js.UndefOr[Double] = js.undefined
  
  var color: js.UndefOr[Double | String | Color] = js.undefined
  
  var combine: js.UndefOr[Combine] = js.undefined
  
  var envMap: js.UndefOr[Texture] = js.undefined
  
  var map: js.UndefOr[Texture] = js.undefined
  
  var morphTargets: js.UndefOr[Boolean] = js.undefined
  
  var reflectivity: js.UndefOr[Double] = js.undefined
  
  var refractionRatio: js.UndefOr[Double] = js.undefined
  
  var skinning: js.UndefOr[Boolean] = js.undefined
  
  var specularMap: js.UndefOr[Texture] = js.undefined
  
  var wireframe: js.UndefOr[Boolean] = js.undefined
  
  var wireframeLinecap: js.UndefOr[String] = js.undefined
  
  var wireframeLinejoin: js.UndefOr[String] = js.undefined
  
  var wireframeLinewidth: js.UndefOr[Double] = js.undefined
}
object MeshBasicMaterialParameters {
  
  inline def apply(): MeshBasicMaterialParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshBasicMaterialParameters]
  }
  
  extension [Self <: MeshBasicMaterialParameters](x: Self) {
    
    inline def setAlphaMap(value: Texture): Self = StObject.set(x, "alphaMap", value.asInstanceOf[js.Any])
    
    inline def setAlphaMapUndefined: Self = StObject.set(x, "alphaMap", js.undefined)
    
    inline def setAoMap(value: Texture): Self = StObject.set(x, "aoMap", value.asInstanceOf[js.Any])
    
    inline def setAoMapIntensity(value: Double): Self = StObject.set(x, "aoMapIntensity", value.asInstanceOf[js.Any])
    
    inline def setAoMapIntensityUndefined: Self = StObject.set(x, "aoMapIntensity", js.undefined)
    
    inline def setAoMapUndefined: Self = StObject.set(x, "aoMap", js.undefined)
    
    inline def setColor(value: Double | String | Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setCombine(value: Combine): Self = StObject.set(x, "combine", value.asInstanceOf[js.Any])
    
    inline def setCombineUndefined: Self = StObject.set(x, "combine", js.undefined)
    
    inline def setEnvMap(value: Texture): Self = StObject.set(x, "envMap", value.asInstanceOf[js.Any])
    
    inline def setEnvMapUndefined: Self = StObject.set(x, "envMap", js.undefined)
    
    inline def setMap(value: Texture): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setMorphTargets(value: Boolean): Self = StObject.set(x, "morphTargets", value.asInstanceOf[js.Any])
    
    inline def setMorphTargetsUndefined: Self = StObject.set(x, "morphTargets", js.undefined)
    
    inline def setReflectivity(value: Double): Self = StObject.set(x, "reflectivity", value.asInstanceOf[js.Any])
    
    inline def setReflectivityUndefined: Self = StObject.set(x, "reflectivity", js.undefined)
    
    inline def setRefractionRatio(value: Double): Self = StObject.set(x, "refractionRatio", value.asInstanceOf[js.Any])
    
    inline def setRefractionRatioUndefined: Self = StObject.set(x, "refractionRatio", js.undefined)
    
    inline def setSkinning(value: Boolean): Self = StObject.set(x, "skinning", value.asInstanceOf[js.Any])
    
    inline def setSkinningUndefined: Self = StObject.set(x, "skinning", js.undefined)
    
    inline def setSpecularMap(value: Texture): Self = StObject.set(x, "specularMap", value.asInstanceOf[js.Any])
    
    inline def setSpecularMapUndefined: Self = StObject.set(x, "specularMap", js.undefined)
    
    inline def setWireframe(value: Boolean): Self = StObject.set(x, "wireframe", value.asInstanceOf[js.Any])
    
    inline def setWireframeLinecap(value: String): Self = StObject.set(x, "wireframeLinecap", value.asInstanceOf[js.Any])
    
    inline def setWireframeLinecapUndefined: Self = StObject.set(x, "wireframeLinecap", js.undefined)
    
    inline def setWireframeLinejoin(value: String): Self = StObject.set(x, "wireframeLinejoin", value.asInstanceOf[js.Any])
    
    inline def setWireframeLinejoinUndefined: Self = StObject.set(x, "wireframeLinejoin", js.undefined)
    
    inline def setWireframeLinewidth(value: Double): Self = StObject.set(x, "wireframeLinewidth", value.asInstanceOf[js.Any])
    
    inline def setWireframeLinewidthUndefined: Self = StObject.set(x, "wireframeLinewidth", js.undefined)
    
    inline def setWireframeUndefined: Self = StObject.set(x, "wireframe", js.undefined)
  }
}
